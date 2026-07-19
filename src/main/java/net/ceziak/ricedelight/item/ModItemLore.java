package net.ceziak.ricedelight.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

import java.util.List;

public final class ModItemLore {
    public static void append(
            List<Component> tooltip,
            String... translationKeys
    ) {
        for (String key : translationKeys) {
            tooltip.add(
                    Component.translatable(key)
                            .withStyle(ChatFormatting.GRAY)
                            .withStyle(style -> style.withItalic(false))
            );
        }
    }

    private ModItemLore() {
    }
}
