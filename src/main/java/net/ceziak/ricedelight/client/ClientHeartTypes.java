package net.ceziak.ricedelight.client;

import net.minecraft.client.gui.Gui;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

public final class ClientHeartTypes {

    public static final EnumProxy<Gui.HeartType> COUGHING =
            new EnumProxy<>(
                    Gui.HeartType.class,
                    heartSprite("full"),
                    heartSprite("full_blinking"),
                    heartSprite("half"),
                    heartSprite("half_blinking"),
                    heartSprite("hardcore_full"),
                    heartSprite("hardcore_full_blinking"),
                    heartSprite("hardcore_half"),
                    heartSprite("hardcore_half_blinking")
            );

    private static ResourceLocation heartSprite(String name) {
        return ResourceLocation.fromNamespaceAndPath(
                "rice_delight",
                "hud/heart/coughing_" + name
        );
    }

    private ClientHeartTypes() {
    }
}