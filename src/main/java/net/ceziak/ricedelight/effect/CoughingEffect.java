package net.ceziak.ricedelight.effect;

import net.ceziak.ricedelight.damage.ModDamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class CoughingEffect extends MobEffect {
    public CoughingEffect() {
        super(MobEffectCategory.HARMFUL, 0x8B8B72);
    }

    @Override
    public void applyEffectTick(
            LivingEntity entity,
            int amplifier
    ) {
        if (!entity.level().isClientSide) {
            entity.hurt(
                    ModDamageTypes.coughing(entity.level()),
                    1.0F
            );
        }
    }

    @Override
    public boolean isDurationEffectTick(
            int duration,
            int amplifier
    ) {
        return duration % 10 == 0;
    }
}
