package net.ceziak.ricedelight.damage;

import net.ceziak.ricedelight.RiceDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.LivingEntity;

public final class ModDamageTypes {

    public static final ResourceKey<DamageType> COUGHING =
            ResourceKey.create(
                    Registries.DAMAGE_TYPE,
                    ResourceLocation.fromNamespaceAndPath(
                            RiceDelight.MOD_ID,
                            "coughing"
                    )
            );

    public static DamageSource coughing(LivingEntity entity) {
        return new DamageSource(
                entity.level()
                        .registryAccess()
                        .registryOrThrow(Registries.DAMAGE_TYPE)
                        .getHolderOrThrow(COUGHING)
        );
    }

    private ModDamageTypes() {
    }
}