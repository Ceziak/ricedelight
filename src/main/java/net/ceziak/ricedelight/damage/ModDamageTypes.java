package net.ceziak.ricedelight.damage;

import net.ceziak.ricedelight.RiceDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.level.Level;

public final class ModDamageTypes {
    public static final ResourceKey<DamageType> COUGHING =
            ResourceKey.create(
                    Registries.DAMAGE_TYPE,
                    new ResourceLocation(
                            RiceDelight.MOD_ID,
                            "coughing"
                    )
            );

    public static DamageSource coughing(Level level) {
        return new DamageSource(
                level.registryAccess()
                        .registryOrThrow(Registries.DAMAGE_TYPE)
                        .getHolderOrThrow(COUGHING)
        );
    }

    private ModDamageTypes() {
    }
}
