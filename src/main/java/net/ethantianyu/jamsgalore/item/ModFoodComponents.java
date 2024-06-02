package net.ethantianyu.jamsgalore.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(3).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200), 0.25f).build();
    public static final FoodComponent LEMON_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(10f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 500), 1f).build();
}
