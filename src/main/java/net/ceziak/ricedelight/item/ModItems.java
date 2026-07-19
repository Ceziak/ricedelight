package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ForgeRegistries.ITEMS,
                    RiceDelight.MOD_ID
            );

    // Block items
    public static final RegistryObject<Item> WILD_BASIL_ITEM =
            ITEMS.register("wild_basil",
                    () -> new BlockItem(
                            ModBlocks.WILD_BASIL.get(),
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> WILD_BELL_PEPPERS_ITEM =
            ITEMS.register("wild_bell_peppers",
                    () -> new BlockItem(
                            ModBlocks.WILD_BELL_PEPPERS.get(),
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> PEPPER_CRATE_ITEM =
            ITEMS.register("pepper_crate",
                    () -> new BlockItem(
                            ModBlocks.PEPPER_CRATE.get(),
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> BASIL_CRATE_ITEM =
            ITEMS.register("basil_crate",
                    () -> new BlockItem(
                            ModBlocks.BASIL_CRATE.get(),
                            new Item.Properties()
                    ));

    // Crops and ingredients
    public static final RegistryObject<Item> PEPPER =
            food("bell_pepper", ModFoodProperties.PEPPER);
    public static final RegistryObject<Item> PEPPER_CHUNK =
            food("pepper_chunk", ModFoodProperties.PEPPER_CHUNK);
    public static final RegistryObject<Item> BASIL =
            food("basil", ModFoodProperties.BASIL);
    public static final RegistryObject<Item> CINNAMON =
            food("cinnamon", ModFoodProperties.COUGHING);
    public static final RegistryObject<Item> SCALLION =
            food("scallion", ModFoodProperties.SCALLION);
    public static final RegistryObject<Item> CHOPPED_SCALLIONS =
            food("chopped_scallions",
                    ModFoodProperties.CHOPPED_SCALLIONS);
    public static final RegistryObject<Item> ONION_HEAD =
            food("onion_head", ModFoodProperties.ONION_HEAD);
    public static final RegistryObject<Item> RICE_DOUGH =
            simple("rice_dough");
    public static final RegistryObject<Item> RICE_WAFER =
            food("rice_wafer", ModFoodProperties.RICE_WAFER);
    public static final RegistryObject<Item> WRAP =
            food("raw_wrap", ModFoodProperties.WRAP);
    public static final RegistryObject<Item> COOKED_WRAP =
            food("cooked_wrap", ModFoodProperties.COOKED_WRAP);

    public static final RegistryObject<Item> BASIL_SEEDS =
            ITEMS.register("basil_seeds",
                    () -> new ItemNameBlockItem(
                            ModBlocks.BASIL_CROP.get(),
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> PEPPER_SEEDS =
            ITEMS.register("bell_pepper_seeds",
                    () -> new ItemNameBlockItem(
                            ModBlocks.PEPPER_CROP.get(),
                            new Item.Properties()
                    ));

    // Whole burritos with translated lore
    public static final RegistryObject<Item> BT_BURRITO =
            burrito("bt_burrito", ModFoodProperties.BT_BURRITO);
    public static final RegistryObject<Item> CBC_BURRITO =
            burrito("cbc_burrito", ModFoodProperties.CBC_BURRITO);
    public static final RegistryObject<Item> FV_BURRITO =
            burrito("fv_burrito", ModFoodProperties.FV_BURRITO);
    public static final RegistryObject<Item> BE_BURRITO =
            burrito("be_burrito", ModFoodProperties.BE_BURRITO);
    public static final RegistryObject<Item> V_BURRITO =
            burrito("v_burrito", ModFoodProperties.V_BURRITO);
    public static final RegistryObject<Item> BC_BURRITO =
            burrito("bc_burrito", ModFoodProperties.BC_BURRITO);

    // Burrito slices
    public static final RegistryObject<Item> SLICED_BT_BURRITO =
            food("sliced_bt_burrito",
                    ModFoodProperties.SLICED_BT_BURRITO);
    public static final RegistryObject<Item> SLICED_CBC_BURRITO =
            food("sliced_cbc_burrito",
                    ModFoodProperties.SLICED_CBC_BURRITO);
    public static final RegistryObject<Item> SLICED_FV_BURRITO =
            food("sliced_fv_burrito",
                    ModFoodProperties.SLICED_FV_BURRITO);
    public static final RegistryObject<Item> SLICED_BE_BURRITO =
            food("sliced_be_burrito",
                    ModFoodProperties.SLICED_BE_BURRITO);
    public static final RegistryObject<Item> SLICED_V_BURRITO =
            food("sliced_v_burrito",
                    ModFoodProperties.SLICED_V_BURRITO);
    public static final RegistryObject<Item> SLICED_BC_BURRITO =
            food("sliced_bc_burrito",
                    ModFoodProperties.SLICED_BC_BURRITO);

    // Burnt food
    public static final RegistryObject<Item> BURNT_WRAP =
            food("burnt_wrap", ModFoodProperties.COUGHING);
    public static final RegistryObject<Item> BURNT_BURRITO =
            food("burnt_burrito", ModFoodProperties.COUGHING);
    public static final RegistryObject<Item> SLICED_BURNT_BURRITO =
            food("sliced_burnt_burrito",
                    ModFoodProperties.COUGHING);

    // Rice meals
    public static final RegistryObject<Item> OMELETTE =
            food("omelette", ModFoodProperties.OMELETTE);
    public static final RegistryObject<Item> OMELETTE_ROLL =
            food("omelette_roll", ModFoodProperties.OMELETTE_ROLL);
    public static final RegistryObject<Item> OMURICE =
            stack16Food("omurice", ModFoodProperties.OMURICE);
    public static final RegistryObject<Item> ONIGIRI =
            food("onigiri", ModFoodProperties.ONIGIRI);
    public static final RegistryObject<Item> RICE_BALLS =
            food("rice_balls", ModFoodProperties.RICE_BALLS);
    public static final RegistryObject<Item> RICE_FILLED_BELL_PEPPER =
            stack16Food(
                    "rice_filled_bell_pepper",
                    ModFoodProperties.RICE_FILLED_BELL_PEPPER
            );

    public static final RegistryObject<Item> BOWL_OF_JOLLOF_RICE =
            bowlFood(
                    "bowl_of_jollof_rice",
                    ModFoodProperties.BOWL_OF_JOLLOF_RICE
            );
    public static final RegistryObject<Item> BOWL_OF_RISOTTO =
            bowlFood(
                    "bowl_of_risotto",
                    ModFoodProperties.BOWL_OF_RISOTTO
            );
    public static final RegistryObject<Item> CINNAMON_APPLE_RICE_BOWL =
            bowlFood(
                    "cinnamon_apple_rice_bowl",
                    ModFoodProperties.CINNAMON_APPLE_RICE_BOWL
            );

    // Mochi bowls
    public static final RegistryObject<Item> BOWL_OF_APPLE_MOCHI =
            bowlFood(
                    "bowl_of_apple_mochi",
                    ModFoodProperties.BOWL_OF_APPLE_MOCHI
            );
    public static final RegistryObject<Item> BOWL_OF_CHOCOLATE_MOCHI =
            bowlFood(
                    "bowl_of_chocolate_mochi",
                    ModFoodProperties.BOWL_OF_CHOCOLATE_MOCHI
            );
    public static final RegistryObject<Item> BOWL_OF_GLOW_BERRY_MOCHI =
            bowlFood(
                    "bowl_of_glow_berry_mochi",
                    ModFoodProperties.BOWL_OF_GLOW_BERRY_MOCHI
            );
    public static final RegistryObject<Item> BOWL_OF_MELON_MOCHI =
            bowlFood(
                    "bowl_of_melon_mochi",
                    ModFoodProperties.BOWL_OF_MELON_MOCHI
            );
    public static final RegistryObject<Item> BOWL_OF_SWEET_BERRY_MOCHI =
            bowlFood(
                    "bowl_of_sweet_berry_mochi",
                    ModFoodProperties.BOWL_OF_SWEET_BERRY_MOCHI
            );

    public static final RegistryObject<Item> HORCHATA =
            ITEMS.register("horchata",
                    () -> new DrinkItem(
                            new Item.Properties()
                                    .food(ModFoodProperties.HORCHATA)
                                    .stacksTo(16),
                            Items.GLASS_BOTTLE
                    ));

    // Tools
    public static final RegistryObject<Item> PIN =
            simple("pin");
    public static final RegistryObject<Item> WOODEN_HAMMER =
            simple("wooden_hammer");

    private static RegistryObject<Item> simple(String name) {
        return ITEMS.register(
                name,
                () -> new Item(new Item.Properties())
        );
    }

    private static RegistryObject<Item> food(
            String name,
            net.minecraft.world.food.FoodProperties food
    ) {
        return ITEMS.register(
                name,
                () -> new Item(
                        new Item.Properties().food(food)
                )
        );
    }

    private static RegistryObject<Item> stack16Food(
            String name,
            net.minecraft.world.food.FoodProperties food
    ) {
        return ITEMS.register(
                name,
                () -> new Item(
                        new Item.Properties()
                                .food(food)
                                .stacksTo(16)
                )
        );
    }

    private static RegistryObject<Item> bowlFood(
            String name,
            net.minecraft.world.food.FoodProperties food
    ) {
        return ITEMS.register(
                name,
                () -> new ContainerFoodItem(
                        new Item.Properties()
                                .food(food)
                                .stacksTo(16),
                        Items.BOWL
                )
        );
    }

    private static RegistryObject<Item> burrito(
            String name,
            net.minecraft.world.food.FoodProperties food
    ) {
        return ITEMS.register(
                name,
                () -> new LoreItem(
                        new Item.Properties()
                                .food(food)
                                .stacksTo(16),
                        "lore.rice_delight." + name + ".0",
                        "lore.rice_delight." + name + ".1",
                        "lore.rice_delight." + name + ".2",
                        "lore.rice_delight." + name + ".3"
                )
        );
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private ModItems() {
    }
}
