package net.ceziak.ricedelight.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ContainerFoodItem extends Item {
    private final Item container;

    public ContainerFoodItem(
            Properties properties,
            Item container
    ) {
        super(properties);
        this.container = container;
    }

    @Override
    public ItemStack finishUsingItem(
            ItemStack stack,
            Level level,
            LivingEntity entity
    ) {
        ItemStack result = super.finishUsingItem(stack, level, entity);

        if (entity instanceof Player player
                && player.getAbilities().instabuild) {
            return result;
        }

        ItemStack containerStack = new ItemStack(container);

        if (result.isEmpty()) {
            return containerStack;
        }

        if (entity instanceof Player player
                && !player.getInventory().add(containerStack)) {
            player.drop(containerStack, false);
        }

        return result;
    }
}
