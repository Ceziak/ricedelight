package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public final class ModFoodProperties {

    // Crops and small ingredients

    public static final FoodProperties PEPPER =
            new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties PEPPER_CHUNK =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.5F)
                    .fast()
                    .build();

    public static final FoodProperties BASIL =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.5F)
                    .fast()
                    .build();

    public static final FoodProperties SCALLION =
            new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3F)
                    .build();

    public static final FoodProperties CHOPPED_SCALLIONS =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.2F)
                    .fast()
                    .build();

    public static final FoodProperties ONION_HEAD =
            new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3F)
                    .build();

    public static final FoodProperties RICE_WAFER =
            new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3F)
                    .fast()
                    .build();

    public static final FoodProperties WRAP =
            new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties COOKED_WRAP =
            new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.4F)
                    .build();

    // Burnt foods and cinnamon

    public static final FoodProperties COUGHING =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.5F)
                    .fast()
                    .effect(
                            () -> new MobEffectInstance(
                                    ModEffects.COUGHING,
                                    20 * 5,
                                    0
                            ),
                            1.0F
                    )
                    .alwaysEdible()
                    .build();

    // Whole burritos
    // Each whole burrito is worth the same as the two slices it produces.

    public static final FoodProperties BT_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(16)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties CBC_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(12)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties FV_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(14)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties BE_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(20)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties V_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(14)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties BC_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(16)
                    .saturationModifier(0.25F)
                    .build();

    // Burrito slices

    public static final FoodProperties SLICED_BT_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties SLICED_CBC_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties SLICED_FV_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties SLICED_BE_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties SLICED_V_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationModifier(0.25F)
                    .build();

    public static final FoodProperties SLICED_BC_BURRITO =
            new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(0.25F)
                    .build();

    // Rice meals

    public static final FoodProperties OMELETTE =
            new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.4F)
                    .build();

    public static final FoodProperties OMELETTE_ROLL =
            new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationModifier(0.5F)
                    .build();

    public static final FoodProperties OMURICE =
            new FoodProperties.Builder()
                    .nutrition(12)
                    .saturationModifier(0.6F)
                    .build();

    public static final FoodProperties ONIGIRI =
            new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.5F)
                    .build();

    public static final FoodProperties RICE_BALLS =
            new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationModifier(0.5F)
                    .build();

    public static final FoodProperties RICE_FILLED_BELL_PEPPER =
            new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(0.6F)
                    .build();

    public static final FoodProperties BOWL_OF_JOLLOF_RICE =
            new FoodProperties.Builder()
                    .nutrition(14)
                    .saturationModifier(0.75F)
                    .usingConvertsTo(Items.BOWL)
                    .build();

    public static final FoodProperties BOWL_OF_RISOTTO =
            new FoodProperties.Builder()
                    .nutrition(12)
                    .saturationModifier(0.7F)
                    .usingConvertsTo(Items.BOWL)
                    .build();

    public static final FoodProperties CINNAMON_APPLE_RICE_BOWL =
            new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationModifier(0.6F)
                    .usingConvertsTo(Items.BOWL)
                    .build();

    // Mochi bowls

    public static final FoodProperties BOWL_OF_APPLE_MOCHI =
            mochiBowl(8, 0.55F);

    public static final FoodProperties BOWL_OF_CHOCOLATE_MOCHI =
            mochiBowl(9, 0.6F);

    public static final FoodProperties BOWL_OF_GLOW_BERRY_MOCHI =
            mochiBowl(8, 0.55F);

    public static final FoodProperties BOWL_OF_MELON_MOCHI =
            mochiBowl(7, 0.5F);

    public static final FoodProperties BOWL_OF_SWEET_BERRY_MOCHI =
            mochiBowl(8, 0.55F);

    // Drinks

    public static final FoodProperties HORCHATA =
            new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.5F)
                    .alwaysEdible()
                    .usingConvertsTo(Items.GLASS_BOTTLE)
                    .build();

    private static FoodProperties mochiBowl(
            int nutrition,
            float saturation
    ) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .usingConvertsTo(Items.BOWL)
                .build();
    }

    private ModFoodProperties() {
    }
}
