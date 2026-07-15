package net.ceziak.ricedelight.effect;

import net.ceziak.ricedelight.damage.ModDamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class CoughingEffect extends MobEffect {

    public CoughingEffect() {
        // The second value is the particle colour.
        super(MobEffectCategory.HARMFUL, 0x8B8B72);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.level().isClientSide()) {
            // 1.0 damage = half a heart.
            livingEntity.hurt(
                    ModDamageTypes.coughing(livingEntity),
                    1.0F
            );
        }

        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(
            int duration,
            int amplifier
    ) {
        // 10 ticks = normally twice per second.
        return duration % 10 == 0;
    }
}