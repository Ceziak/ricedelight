package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RiceDelight.MOD_ID);

    // Foods
    public static final DeferredItem<Item> PEPPER =
            ITEMS.register("bell_pepper", () -> new Item(new Item.Properties().food(ModFoodProperties.PEPPER)));

    public static final DeferredItem<Item> PEPPER_CHUNK =
            ITEMS.register("pepper_chunk", () -> new Item(new Item.Properties().food(ModFoodProperties.PEPPER_CHUNK)));

    // Tools
    public static final DeferredItem<Item> PIN = ITEMS.register("pin",
            () -> new Item(new Item.Properties()));

    // Meals


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
