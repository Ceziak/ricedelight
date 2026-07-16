package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RiceDelight.MOD_ID);

    public static final Supplier<CreativeModeTab> RICE_DELIGHT = CREATIVE_MODE_TAB.register("rice_delight",() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIN.get()))
            .title(Component.translatable("creativetab.rice_delight.rice_delight"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.PEPPER);
                output.accept(ModItems.PEPPER_CHUNK);
                output.accept(ModBlocks.PEPPER_CRATE);

                output.accept(ModItems.BASIL);
                output.accept(ModBlocks.BASIL_CRATE);

                output.accept(ModItems.PIN);
            })

            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
