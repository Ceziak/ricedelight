package net.ceziak.ricedelight.item;

import net.minecraft.world.food.FoodProperties;

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

    private ModFoodProperties() {
    }
}