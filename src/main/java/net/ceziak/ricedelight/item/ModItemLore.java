package net.ceziak.ricedelight.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemLore;

import java.util.ArrayList;
import java.util.List;

public final class ModItemLore {

    public static Item.Properties add(
            Item.Properties properties,
            String... translationKeys
    ) {
        List<Component> lines = new ArrayList<>();

        for (String translationKey : translationKeys) {
            lines.add(
                    Component.translatable(translationKey)
                            .withStyle(style -> style
                                    .withColor(ChatFormatting.GRAY)
                                    .withItalic(false)
                            )
            );
        }

        return properties.component(
                DataComponents.LORE,
                new ItemLore(lines)
        );
    }

    private ModItemLore() {
    }
}