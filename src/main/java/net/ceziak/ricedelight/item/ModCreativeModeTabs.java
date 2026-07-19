package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    RiceDelight.MOD_ID
            );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RICE_DELIGHT =
            CREATIVE_MODE_TABS.register(
                    "rice_delight",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.PEPPER.get()))
                            .title(Component.translatable(
                                    "creativetab.rice_delight.rice_delight"
                            ))
                            .displayItems((parameters, output) -> {
                                // Crops and harvested ingredients
                                output.accept(ModBlocks.WILD_BELL_PEPPERS.get());
                                output.accept(ModItems.PEPPER_SEEDS.get());
                                output.accept(ModItems.PEPPER.get());
                                output.accept(ModItems.PEPPER_CHUNK.get());
                                output.accept(ModBlocks.PEPPER_CRATE.get());

                                output.accept(ModBlocks.WILD_BASIL.get());
                                output.accept(ModItems.BASIL_SEEDS.get());
                                output.accept(ModItems.BASIL.get());
                                output.accept(ModBlocks.BASIL_CRATE.get());

                                output.accept(ModItems.SCALLION.get());
                                output.accept(ModItems.CHOPPED_SCALLIONS.get());
                                output.accept(ModItems.ONION_HEAD.get());

                                // Prepared ingredients
                                output.accept(ModItems.CINNAMON.get());
                                output.accept(ModItems.RICE_DOUGH.get());
                                output.accept(ModItems.RICE_WAFER.get());
                                output.accept(ModItems.WRAP.get());
                                output.accept(ModItems.COOKED_WRAP.get());

                                // Burritos, paired with their slices
                                output.accept(ModItems.BT_BURRITO.get());
                                output.accept(ModItems.SLICED_BT_BURRITO.get());

                                output.accept(ModItems.CBC_BURRITO.get());
                                output.accept(ModItems.SLICED_CBC_BURRITO.get());

                                output.accept(ModItems.FV_BURRITO.get());
                                output.accept(ModItems.SLICED_FV_BURRITO.get());

                                output.accept(ModItems.BE_BURRITO.get());
                                output.accept(ModItems.SLICED_BE_BURRITO.get());

                                output.accept(ModItems.V_BURRITO.get());
                                output.accept(ModItems.SLICED_V_BURRITO.get());

                                output.accept(ModItems.BC_BURRITO.get());
                                output.accept(ModItems.SLICED_BC_BURRITO.get());

                                output.accept(ModItems.BURNT_WRAP.get());
                                output.accept(ModItems.BURNT_BURRITO.get());
                                output.accept(ModItems.SLICED_BURNT_BURRITO.get());

                                // Rice meals
                                output.accept(ModItems.OMELETTE.get());
                                output.accept(ModItems.OMELETTE_ROLL.get());
                                output.accept(ModItems.OMURICE.get());
                                output.accept(ModItems.ONIGIRI.get());
                                output.accept(ModItems.RICE_BALLS.get());
                                output.accept(ModItems.RICE_FILLED_BELL_PEPPER.get());
                                output.accept(ModItems.BOWL_OF_JOLLOF_RICE.get());
                                output.accept(ModItems.BOWL_OF_RISOTTO.get());
                                output.accept(ModItems.CINNAMON_APPLE_RICE_BOWL.get());

                                // Mochi bowls
                                output.accept(ModItems.BOWL_OF_APPLE_MOCHI.get());
                                output.accept(ModItems.BOWL_OF_CHOCOLATE_MOCHI.get());
                                output.accept(ModItems.BOWL_OF_GLOW_BERRY_MOCHI.get());
                                output.accept(ModItems.BOWL_OF_MELON_MOCHI.get());
                                output.accept(ModItems.BOWL_OF_SWEET_BERRY_MOCHI.get());

                                // Drinks
                                output.accept(ModItems.HORCHATA.get());

                                // Tools
                                output.accept(ModItems.PIN.get());
                                output.accept(ModItems.WOODEN_HAMMER.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    private ModCreativeModeTabs() {
    }
}
