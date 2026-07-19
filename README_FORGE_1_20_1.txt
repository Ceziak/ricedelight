RICE DELIGHT - FORGE 1.20.1 PORT

1. Switch to your forge/1.20.1 branch.

2. Extract this ZIP over the repository root and replace matching files.

3. Run:
   .\APPLY_FORGE_1_20_1.ps1

4. Download Farmer's Delight 1.20.1 Forge version 1.3.2 and place:
   FarmersDelight-1.20.1-1.3.2.jar
   inside the project's ./libs folder.

5. Set the Gradle JVM / Project SDK to Java 17.

6. Reload Gradle, then run:
   .\gradlew.bat --refresh-dependencies
   .\gradlew.bat runClient

WHAT WAS PORTED

- Forge registries and main mod bootstrap
- every current item and food property
- bowl/glass container returns
- burrito lore without 1.21 data components
- both cultivated crops
- both wild crops and their dedicated textures/models
- creative tab
- Coughing effect and custom armor-bypassing/no-knockback damage
- 1.20.1 recipe folder and result syntax
- Farmer's Delight cutting/cooking syntax
- item tags under tags/items
- block loot tables under loot_tables
- wild-crop world generation moved to Forge biome modifiers

KNOWN DIFFERENCE

The NeoForge custom-heart system is disabled in this Forge 1.20.1 port.
NeoForge's PlayerHeartTypeEvent / enum-extension implementation does not
have a direct Forge 1.20.1 equivalent. The effect and damage still work.

This is a source port generated from the current project state and needs
a normal local compile/run test with Forge and Farmer's Delight installed.
