$ErrorActionPreference = "Stop"

$projectDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$buildGradle = Join-Path $projectDir "build.gradle"

if (-not (Test-Path -LiteralPath $buildGradle)) {
    Write-Host ""
    Write-Host "ERROR: build.gradle was not found next to this script." -ForegroundColor Red
    Write-Host "Put both files in the ricedelelight-forge-1.20.1 project folder, next to gradlew.bat." -ForegroundColor Yellow
    Write-Host ""
    Read-Host "Press Enter to close"
    exit 1
}

$content = [System.IO.File]::ReadAllText($buildGradle)
$newLine = if ($content.Contains("`r`n")) { "`r`n" } else { "`n" }

$property1 = "property 'mixin.env.remapRefMap', 'true'"
$property2 = 'property ''mixin.env.refMapRemappingFile'', "${projectDir}/build/createSrgToMcp/output.srg"'

if ($content.Contains($property1) -and $content.Contains("mixin.env.refMapRemappingFile")) {
    Write-Host "The Farmer's Delight mixin remapping fix is already present." -ForegroundColor Green
} else {
    $backup = "$buildGradle.before-farmers-delight-fix"
    if (-not (Test-Path -LiteralPath $backup)) {
        Copy-Item -LiteralPath $buildGradle -Destination $backup
        Write-Host "Created backup: build.gradle.before-farmers-delight-fix" -ForegroundColor DarkGray
    }

    $lines = [System.Collections.Generic.List[string]]::new()
    foreach ($line in ($content -split "\r?\n", 0, "SimpleMatch")) {
        $lines.Add($line)
    }

    $configureIndex = -1
    for ($i = 0; $i -lt $lines.Count; $i++) {
        if ($lines[$i] -match '^(\s*)configureEach\s*\{') {
            $configureIndex = $i
            break
        }
    }

    if ($configureIndex -ge 0) {
        $baseIndent = ([regex]::Match($lines[$configureIndex], '^\s*')).Value
        $indent = $baseIndent + "    "

        $insert = [System.Collections.Generic.List[string]]::new()
        $insert.Add("")
        $insert.Add($indent + $property1)
        $insert.Add($indent + $property2)

        for ($j = $insert.Count - 1; $j -ge 0; $j--) {
            $lines.Insert($configureIndex + 1, $insert[$j])
        }
    } else {
        $runsIndex = -1
        for ($i = 0; $i -lt $lines.Count; $i++) {
            if ($lines[$i] -match '^(\s*)runs\s*\{') {
                $runsIndex = $i
                break
            }
        }

        if ($runsIndex -lt 0) {
            Write-Host ""
            Write-Host "ERROR: Could not find the 'runs {' section in build.gradle." -ForegroundColor Red
            Write-Host "Your original build.gradle was not changed." -ForegroundColor Yellow
            Write-Host ""
            Read-Host "Press Enter to close"
            exit 1
        }

        $baseIndent = ([regex]::Match($lines[$runsIndex], '^\s*')).Value
        $indent1 = $baseIndent + "    "
        $indent2 = $indent1 + "    "

        $insert = [System.Collections.Generic.List[string]]::new()
        $insert.Add($indent1 + "configureEach {")
        $insert.Add($indent2 + $property1)
        $insert.Add($indent2 + $property2)
        $insert.Add($indent1 + "}")
        $insert.Add("")

        for ($j = $insert.Count - 1; $j -ge 0; $j--) {
            $lines.Insert($runsIndex + 1, $insert[$j])
        }
    }

    $updated = [string]::Join($newLine, $lines)
    [System.IO.File]::WriteAllText(
        $buildGradle,
        $updated,
        [System.Text.UTF8Encoding]::new($false)
    )

    Write-Host "Patched build.gradle successfully." -ForegroundColor Green
}

$updatedContent = [System.IO.File]::ReadAllText($buildGradle)
$fdMatches = [regex]::Matches(
    $updatedContent,
    '(?im)^.*(?:farmers-delight-398521|farmersdelight|FarmersDelight).*$'
)

if ($fdMatches.Count -gt 1) {
    Write-Host ""
    Write-Host "NOTE: Multiple lines mentioning Farmer's Delight were found." -ForegroundColor Yellow
    Write-Host "This script did not remove them automatically, because some mentions may be repositories or configuration." -ForegroundColor Yellow
}

Write-Host ""
Write-Host "Stopping old Gradle daemons..." -ForegroundColor Cyan
& (Join-Path $projectDir "gradlew.bat") --stop
if ($LASTEXITCODE -ne 0) {
    throw "gradlew --stop failed with exit code $LASTEXITCODE"
}

Write-Host ""
Write-Host "Cleaning the project..." -ForegroundColor Cyan
& (Join-Path $projectDir "gradlew.bat") clean
if ($LASTEXITCODE -ne 0) {
    throw "gradlew clean failed with exit code $LASTEXITCODE"
}

Write-Host ""
Write-Host "Starting the Forge client..." -ForegroundColor Cyan
& (Join-Path $projectDir "gradlew.bat") runClient
$runExitCode = $LASTEXITCODE

Write-Host ""
if ($runExitCode -eq 0) {
    Write-Host "Finished successfully." -ForegroundColor Green
} else {
    Write-Host "runClient exited with code $runExitCode." -ForegroundColor Red
    Write-Host "The build.gradle backup is available as build.gradle.before-farmers-delight-fix" -ForegroundColor Yellow
}

Write-Host ""
Read-Host "Press Enter to close"
exit $runExitCode
