package net.ceziak.ricedelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class DrinkItem extends ContainerFoodItem {
    public DrinkItem(
            Properties properties,
            Item container
    ) {
        super(properties, container);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
