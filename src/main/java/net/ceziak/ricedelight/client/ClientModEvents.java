package net.ceziak.ricedelight.client;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(
        modid = RiceDelight.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public final class ClientModEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(
                    ModBlocks.BASIL_CROP.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    ModBlocks.PEPPER_CROP.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    ModBlocks.WILD_BASIL.get(),
                    RenderType.cutout()
            );
            ItemBlockRenderTypes.setRenderLayer(
                    ModBlocks.WILD_BELL_PEPPERS.get(),
                    RenderType.cutout()
            );
        });
    }

    private ClientModEvents() {
    }
}
