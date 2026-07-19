package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public final class ModFoodProperties {

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
    public static final FoodProperties WRAP =
            new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationModifier(0.25F)
                    .build();
    public static final FoodProperties COOKED_WRAP =
            new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationModifier(0.25F)
                    .build();

    // COUGHING
    public static final FoodProperties COUGHING =
            new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.5F)
                    .fast()
                    .effect(() -> new MobEffectInstance(ModEffects.COUGHING, 20 * 5, 0), 1.0F)
                    .alwaysEdible()
                    .build();

    // BURRITOS

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

    // DRINKS

    public static final FoodProperties HORCHATA =
            new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationModifier(0.5F)
                    .alwaysEdible()
                    .usingConvertsTo(Items.GLASS_BOTTLE)
                    .build();

    private ModFoodProperties() {
    }
}