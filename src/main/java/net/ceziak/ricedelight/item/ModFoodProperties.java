package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public final class ModFoodProperties {
    public static final FoodProperties PEPPER =
            food(3, 0.25F);
    public static final FoodProperties PEPPER_CHUNK =
            fastFood(1, 0.5F);
    public static final FoodProperties BASIL =
            fastFood(1, 0.5F);
    public static final FoodProperties SCALLION =
            food(2, 0.3F);
    public static final FoodProperties CHOPPED_SCALLIONS =
            fastFood(1, 0.2F);
    public static final FoodProperties ONION_HEAD =
            food(2, 0.3F);
    public static final FoodProperties RICE_WAFER =
            fastFood(2, 0.3F);
    public static final FoodProperties WRAP =
            food(3, 0.25F);
    public static final FoodProperties COOKED_WRAP =
            food(5, 0.4F);

    public static final FoodProperties COUGHING =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationMod(0.5F)
                    .fast()
                    .effect(
                            () -> new MobEffectInstance(
                                    ModEffects.COUGHING.get(),
                                    20 * 5,
                                    0
                            ),
                            1.0F
                    )
                    .alwaysEat()
                    .build();

    public static final FoodProperties BT_BURRITO =
            food(16, 0.25F);
    public static final FoodProperties CBC_BURRITO =
            food(12, 0.25F);
    public static final FoodProperties FV_BURRITO =
            food(14, 0.25F);
    public static final FoodProperties BE_BURRITO =
            food(20, 0.25F);
    public static final FoodProperties V_BURRITO =
            food(14, 0.25F);
    public static final FoodProperties BC_BURRITO =
            food(16, 0.25F);

    public static final FoodProperties SLICED_BT_BURRITO =
            food(8, 0.25F);
    public static final FoodProperties SLICED_CBC_BURRITO =
            food(6, 0.25F);
    public static final FoodProperties SLICED_FV_BURRITO =
            food(7, 0.25F);
    public static final FoodProperties SLICED_BE_BURRITO =
            food(10, 0.25F);
    public static final FoodProperties SLICED_V_BURRITO =
            food(7, 0.25F);
    public static final FoodProperties SLICED_BC_BURRITO =
            food(8, 0.25F);

    public static final FoodProperties OMELETTE =
            food(5, 0.4F);
    public static final FoodProperties OMELETTE_ROLL =
            food(6, 0.5F);
    public static final FoodProperties OMURICE =
            food(12, 0.6F);
    public static final FoodProperties ONIGIRI =
            food(5, 0.5F);
    public static final FoodProperties RICE_BALLS =
            food(6, 0.5F);
    public static final FoodProperties RICE_FILLED_BELL_PEPPER =
            food(8, 0.6F);
    public static final FoodProperties BOWL_OF_JOLLOF_RICE =
            food(14, 0.75F);
    public static final FoodProperties BOWL_OF_RISOTTO =
            food(12, 0.7F);
    public static final FoodProperties CINNAMON_APPLE_RICE_BOWL =
            food(10, 0.6F);

    public static final FoodProperties BOWL_OF_APPLE_MOCHI =
            food(8, 0.55F);
    public static final FoodProperties BOWL_OF_CHOCOLATE_MOCHI =
            food(9, 0.6F);
    public static final FoodProperties BOWL_OF_GLOW_BERRY_MOCHI =
            food(8, 0.55F);
    public static final FoodProperties BOWL_OF_MELON_MOCHI =
            food(7, 0.5F);
    public static final FoodProperties BOWL_OF_SWEET_BERRY_MOCHI =
            food(8, 0.55F);

    public static final FoodProperties HORCHATA =
            new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(0.5F)
                    .alwaysEat()
                    .build();

    private static FoodProperties food(int nutrition, float saturation) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation)
                .build();
    }

    private static FoodProperties fastFood(
            int nutrition,
            float saturation
    ) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation)
                .fast()
                .build();
    }

    private ModFoodProperties() {
    }
}
