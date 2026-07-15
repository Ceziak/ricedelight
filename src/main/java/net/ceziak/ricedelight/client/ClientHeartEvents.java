package net.ceziak.ricedelight.client;

import net.ceziak.ricedelight.effect.ModEffects;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerHeartTypeEvent;

@EventBusSubscriber(
        modid = "rice_delight",
        value = Dist.CLIENT
)
public final class ClientHeartEvents {

    @SubscribeEvent
    public static void onPlayerHeartType(PlayerHeartTypeEvent event) {
        if (event.getEntity().hasEffect(ModEffects.COUGHING)) {
            event.setType(ClientHeartTypes.COUGHING.getValue());
        }
    }

    private ClientHeartEvents() {
    }
}