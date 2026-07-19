package net.ceziak.ricedelight.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class LoreItem extends Item {
    private final String[] loreKeys;

    public LoreItem(
            Properties properties,
            String... loreKeys
    ) {
        super(properties);
        this.loreKeys = loreKeys;
    }

    @Override
    public void appendHoverText(
            ItemStack stack,
            @Nullable Level level,
            List<Component> tooltip,
            TooltipFlag flag
    ) {
        ModItemLore.append(tooltip, loreKeys);
        super.appendHoverText(stack, level, tooltip, flag);
    }
}
