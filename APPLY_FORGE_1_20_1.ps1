$ErrorActionPreference = "Stop"

Write-Host "Cleaning NeoForge-only 1.21.1 files..."

$paths = @(
    "src/main/templates",
    "src/main/resources/META-INF/neoforge.mods.toml",
    "src/main/resources/META-INF/enumextensions.json",
    "src/main/resources/data/rice_delight/recipe",
    "src/main/resources/data/rice_delight/loot_table",
    "src/main/resources/data/rice_delight/tags/item",
    "src/main/resources/data/rice_delight/neoforge",
    "src/generated/resources"
)

foreach ($path in $paths) {
    if (Test-Path $path) {
        Remove-Item $path -Recurse -Force
        Write-Host "Removed $path"
    }
}

New-Item -ItemType Directory -Force -Path "libs" | Out-Null

Write-Host ""
Write-Host "Done."
Write-Host "Now place FarmersDelight-1.20.1-1.3.2.jar in ./libs/"
Write-Host "Use Java 17, reload Gradle, then run:"
Write-Host ".\gradlew.bat --refresh-dependencies"
Write-Host ".\gradlew.bat runClient"
