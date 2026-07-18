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
            ITEMS.register("bell_pepper",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.PEPPER)));
    public static final DeferredItem<Item> PEPPER_CHUNK =
            ITEMS.register("pepper_chunk",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.PEPPER_CHUNK)));
    public static final DeferredItem<Item> BASIL =
            ITEMS.register("basil",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.BASIL)));
    public static final DeferredItem<Item> CINNAMON =
            ITEMS.register("cinnamon",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.COUGHING)));
    public static final DeferredItem<Item> WRAP =
            ITEMS.register("raw_wrap",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.WRAP)));

    // Burritos
    public static final DeferredItem<Item> BT_BURRITO =
            ITEMS.register("bt_burrito",
                    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CBC_BURRITO =
            ITEMS.register("cbc_burrito",
                    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FV_BURRITO =
            ITEMS.register("fv_burrito",
                    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BE_BURRITO =
            ITEMS.register("be_burrito",
                    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> V_BURRITO =
            ITEMS.register("v_burrito",
                    () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BC_BURRITO =
            ITEMS.register("bc_burrito",
                    () -> new Item(new Item.Properties()));

    // SLICED
    public static final DeferredItem<Item> SLICED_BT_BURRITO =
            ITEMS.register("sliced_bt_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.SLICED_BT_BURRITO)));
    public static final DeferredItem<Item> SLICED_CBC_BURRITO =
            ITEMS.register("sliced_cbc_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.SLICED_CBC_BURRITO)));
    public static final DeferredItem<Item> SLICED_FV_BURRITO =
            ITEMS.register("sliced_fv_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.SLICED_FV_BURRITO)));
    public static final DeferredItem<Item> SLICED_BE_BURRITO =
            ITEMS.register("sliced_be_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.SLICED_BE_BURRITO)));
    public static final DeferredItem<Item> SLICED_V_BURRITO =
            ITEMS.register("sliced_v_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.SLICED_V_BURRITO)));
    public static final DeferredItem<Item> SLICED_BC_BURRITO =
            ITEMS.register("sliced_bc_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.SLICED_BC_BURRITO)));

    // Tools
    public static final DeferredItem<Item> PIN =
            ITEMS.register("pin",
                    () -> new Item(new Item.Properties()));

    // Burnt
    public static final DeferredItem<Item> BURNT_BURRITO =
            ITEMS.register("burnt_burrito",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.COUGHING)));
    public static final DeferredItem<Item> BURNT_WRAP =
            ITEMS.register("burnt_wrap",
                    () -> new Item(new Item.Properties().food(ModFoodProperties.COUGHING)));

    // Meals

    // Drinks
    public static final DeferredItem<DrinkItem> HORCHATA =
            ITEMS.register("horchata",
                    () -> new DrinkItem(new Item.Properties().food(ModFoodProperties.HORCHATA).stacksTo(16)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
