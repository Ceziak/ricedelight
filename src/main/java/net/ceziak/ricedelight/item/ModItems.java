package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(RiceDelight.MOD_ID);

    // Crops and basic ingredients

    public static final DeferredItem<Item> PEPPER =
            ITEMS.register("bell_pepper",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.PEPPER)));

    public static final DeferredItem<Item> PEPPER_CHUNK =
            ITEMS.register("pepper_chunk",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.PEPPER_CHUNK)));

    public static final DeferredItem<Item> BASIL =
            ITEMS.register("basil",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BASIL)));

    public static final DeferredItem<Item> CINNAMON =
            ITEMS.register("cinnamon",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.COUGHING)));

    public static final DeferredItem<Item> SCALLION =
            ITEMS.register("scallion",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SCALLION)));

    public static final DeferredItem<Item> CHOPPED_SCALLIONS =
            ITEMS.register("chopped_scallions",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.CHOPPED_SCALLIONS)));

    public static final DeferredItem<Item> ONION_HEAD =
            ITEMS.register("onion_head",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.ONION_HEAD)));

    public static final DeferredItem<Item> RICE_DOUGH =
            ITEMS.register("rice_dough",
                    () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RICE_WAFER =
            ITEMS.register("rice_wafer",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.RICE_WAFER)));

    public static final DeferredItem<Item> WRAP =
            ITEMS.register("raw_wrap",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.WRAP)));

    public static final DeferredItem<Item> COOKED_WRAP =
            ITEMS.register("cooked_wrap",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.COOKED_WRAP)));

    // Plantable seeds

    public static final DeferredItem<ItemNameBlockItem> BASIL_SEEDS =
            ITEMS.register("basil_seeds",
                    () -> new ItemNameBlockItem(
                            ModBlocks.BASIL_CROP.get(),
                            new Item.Properties()
                    ));

    public static final DeferredItem<ItemNameBlockItem> PEPPER_SEEDS =
            ITEMS.register("bell_pepper_seeds",
                    () -> new ItemNameBlockItem(
                            ModBlocks.PEPPER_CROP.get(),
                            new Item.Properties()
                    ));

    // Whole burritos

    public static final DeferredItem<Item> BT_BURRITO =
            ITEMS.register("bt_burrito",
                    () -> new Item(ModItemLore.add(
                            new Item.Properties()
                                    .food(ModFoodProperties.BT_BURRITO)
                                    .stacksTo(16),
                            "lore.rice_delight.bt_burrito.0",
                            "lore.rice_delight.bt_burrito.1",
                            "lore.rice_delight.bt_burrito.2",
                            "lore.rice_delight.bt_burrito.3"
                    )));

    public static final DeferredItem<Item> CBC_BURRITO =
            ITEMS.register("cbc_burrito",
                    () -> new Item(ModItemLore.add(
                            new Item.Properties()
                                    .food(ModFoodProperties.CBC_BURRITO)
                                    .stacksTo(16),
                            "lore.rice_delight.cbc_burrito.0",
                            "lore.rice_delight.cbc_burrito.1",
                            "lore.rice_delight.cbc_burrito.2",
                            "lore.rice_delight.cbc_burrito.3"
                    )));

    public static final DeferredItem<Item> FV_BURRITO =
            ITEMS.register("fv_burrito",
                    () -> new Item(ModItemLore.add(
                            new Item.Properties()
                                    .food(ModFoodProperties.FV_BURRITO)
                                    .stacksTo(16),
                            "lore.rice_delight.fv_burrito.0",
                            "lore.rice_delight.fv_burrito.1",
                            "lore.rice_delight.fv_burrito.2",
                            "lore.rice_delight.fv_burrito.3"
                    )));

    public static final DeferredItem<Item> BE_BURRITO =
            ITEMS.register("be_burrito",
                    () -> new Item(ModItemLore.add(
                            new Item.Properties()
                                    .food(ModFoodProperties.BE_BURRITO)
                                    .stacksTo(16),
                            "lore.rice_delight.be_burrito.0",
                            "lore.rice_delight.be_burrito.1",
                            "lore.rice_delight.be_burrito.2",
                            "lore.rice_delight.be_burrito.3"
                    )));

    public static final DeferredItem<Item> V_BURRITO =
            ITEMS.register("v_burrito",
                    () -> new Item(ModItemLore.add(
                            new Item.Properties()
                                    .food(ModFoodProperties.V_BURRITO)
                                    .stacksTo(16),
                            "lore.rice_delight.v_burrito.0",
                            "lore.rice_delight.v_burrito.1",
                            "lore.rice_delight.v_burrito.2",
                            "lore.rice_delight.v_burrito.3"
                    )));

    public static final DeferredItem<Item> BC_BURRITO =
            ITEMS.register("bc_burrito",
                    () -> new Item(ModItemLore.add(
                            new Item.Properties()
                                    .food(ModFoodProperties.BC_BURRITO)
                                    .stacksTo(16),
                            "lore.rice_delight.bc_burrito.0",
                            "lore.rice_delight.bc_burrito.1",
                            "lore.rice_delight.bc_burrito.2",
                            "lore.rice_delight.bc_burrito.3"
                    )));

    // Sliced burritos

    public static final DeferredItem<Item> SLICED_BT_BURRITO =
            ITEMS.register("sliced_bt_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SLICED_BT_BURRITO)));

    public static final DeferredItem<Item> SLICED_CBC_BURRITO =
            ITEMS.register("sliced_cbc_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SLICED_CBC_BURRITO)));

    public static final DeferredItem<Item> SLICED_FV_BURRITO =
            ITEMS.register("sliced_fv_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SLICED_FV_BURRITO)));

    public static final DeferredItem<Item> SLICED_BE_BURRITO =
            ITEMS.register("sliced_be_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SLICED_BE_BURRITO)));

    public static final DeferredItem<Item> SLICED_V_BURRITO =
            ITEMS.register("sliced_v_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SLICED_V_BURRITO)));

    public static final DeferredItem<Item> SLICED_BC_BURRITO =
            ITEMS.register("sliced_bc_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.SLICED_BC_BURRITO)));

    // Burnt foods

    public static final DeferredItem<Item> BURNT_WRAP =
            ITEMS.register("burnt_wrap",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.COUGHING)));

    public static final DeferredItem<Item> BURNT_BURRITO =
            ITEMS.register("burnt_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.COUGHING)));

    public static final DeferredItem<Item> SLICED_BURNT_BURRITO =
            ITEMS.register("sliced_burnt_burrito",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.COUGHING)));

    // Rice dishes and meals

    public static final DeferredItem<Item> OMELETTE =
            ITEMS.register("omelette",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.OMELETTE)));

    public static final DeferredItem<Item> OMELETTE_ROLL =
            ITEMS.register("omelette_roll",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.OMELETTE_ROLL)));

    public static final DeferredItem<Item> OMURICE =
            ITEMS.register("omurice",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.OMURICE)
                            .stacksTo(16)));

    public static final DeferredItem<Item> ONIGIRI =
            ITEMS.register("onigiri",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.ONIGIRI)));

    public static final DeferredItem<Item> RICE_BALLS =
            ITEMS.register("rice_balls",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.RICE_BALLS)));

    public static final DeferredItem<Item> RICE_FILLED_BELL_PEPPER =
            ITEMS.register("rice_filled_bell_pepper",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.RICE_FILLED_BELL_PEPPER)
                            .stacksTo(16)));

    public static final DeferredItem<Item> BOWL_OF_JOLLOF_RICE =
            ITEMS.register("bowl_of_jollof_rice",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_JOLLOF_RICE)
                            .stacksTo(16)));

    public static final DeferredItem<Item> BOWL_OF_RISOTTO =
            ITEMS.register("bowl_of_risotto",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_RISOTTO)
                            .stacksTo(16)));

    public static final DeferredItem<Item> CINNAMON_APPLE_RICE_BOWL =
            ITEMS.register("cinnamon_apple_rice_bowl",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.CINNAMON_APPLE_RICE_BOWL)
                            .stacksTo(16)));

    // Mochi bowls

    public static final DeferredItem<Item> BOWL_OF_APPLE_MOCHI =
            ITEMS.register("bowl_of_apple_mochi",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_APPLE_MOCHI)
                            .stacksTo(16)));

    public static final DeferredItem<Item> BOWL_OF_CHOCOLATE_MOCHI =
            ITEMS.register("bowl_of_chocolate_mochi",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_CHOCOLATE_MOCHI)
                            .stacksTo(16)));

    public static final DeferredItem<Item> BOWL_OF_GLOW_BERRY_MOCHI =
            ITEMS.register("bowl_of_glow_berry_mochi",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_GLOW_BERRY_MOCHI)
                            .stacksTo(16)));

    public static final DeferredItem<Item> BOWL_OF_MELON_MOCHI =
            ITEMS.register("bowl_of_melon_mochi",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_MELON_MOCHI)
                            .stacksTo(16)));

    public static final DeferredItem<Item> BOWL_OF_SWEET_BERRY_MOCHI =
            ITEMS.register("bowl_of_sweet_berry_mochi",
                    () -> new Item(new Item.Properties()
                            .food(ModFoodProperties.BOWL_OF_SWEET_BERRY_MOCHI)
                            .stacksTo(16)));

    // Drinks

    public static final DeferredItem<DrinkItem> HORCHATA =
            ITEMS.register("horchata",
                    () -> new DrinkItem(
                            new Item.Properties()
                                    .food(ModFoodProperties.HORCHATA)
                                    .stacksTo(16)
                    ));

    // Tools

    public static final DeferredItem<Item> PIN =
            ITEMS.register("pin",
                    () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_HAMMER =
            ITEMS.register("wooden_hammer",
                    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private ModItems() {
    }
}
