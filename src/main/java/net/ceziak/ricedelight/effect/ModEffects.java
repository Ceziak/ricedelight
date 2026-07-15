package net.ceziak.ricedelight.effect;

import net.ceziak.ricedelight.RiceDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(
                    Registries.MOB_EFFECT,
                    RiceDelight.MOD_ID
            );

    public static final DeferredHolder<MobEffect, CoughingEffect> COUGHING =
            MOB_EFFECTS.register(
                    "coughing",
                    CoughingEffect::new
            );

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

    private ModEffects() {
    }
}