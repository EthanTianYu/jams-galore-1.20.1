package net.ethantianyu.jamsgalore.item;

import net.ethantianyu.jamsgalore.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(3).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200), 0.25f).build();
    public static final FoodComponent RASPBERRY = new FoodComponent.Builder().hunger(4).saturationModifier(1f).build();
    public static final FoodComponent RHUBARB = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).build();
    public static final FoodComponent LEMON_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(10f)
            .statusEffect(new StatusEffectInstance(ModEffects.PHOTOSENSITIVITY, 500), 1f).build();
    public static final FoodComponent RASPBERRY_MUFFIN = new FoodComponent.Builder().hunger(6).saturationModifier(10f)
            .statusEffect(new StatusEffectInstance(ModEffects.DYSPNEA, 500), 1f).build();
    public static final FoodComponent MANCHINEEL_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1500, 3), 1f).build();

}
