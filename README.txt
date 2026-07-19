RICE DELIGHT – FARMER'S DELIGHT MIXIN FIX

1. Extract both RUN_FIX.bat and fix_build_gradle.ps1.
2. Put them in:
   ricedelelight-forge-1.20.1
   next to build.gradle and gradlew.bat.
3. Double-click RUN_FIX.bat.

The script:
- creates build.gradle.before-farmers-delight-fix
- adds the Mixin refmap remapping properties
- runs gradlew --stop
- runs gradlew clean
- runs gradlew runClient

It preserves the rest of your existing build.gradle.
