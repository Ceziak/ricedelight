package net.ceziak.ricedelight;

import com.mojang.logging.LogUtils;
import net.ceziak.ricedelight.block.ModBlocks;
import net.ceziak.ricedelight.effect.ModEffects;
import net.ceziak.ricedelight.item.ModCreativeModeTabs;
import net.ceziak.ricedelight.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RiceDelight.MOD_ID)
public final class RiceDelight {
    public static final String MOD_ID = "rice_delight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RiceDelight() {
        IEventBus modEventBus =
                FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModEffects.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
    }
}
