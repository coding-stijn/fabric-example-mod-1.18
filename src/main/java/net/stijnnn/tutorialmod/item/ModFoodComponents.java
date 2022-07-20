package net.stijnnn.tutorialmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GRAPE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.2F).build();
    public static final FoodComponent PANCAKE = (new FoodComponent.Builder()).hunger(9).saturationModifier(0.5F).build();
}
