package net.ethantianyu.jamsgalore.effect;

import net.ethantianyu.jamsgalore.JamsGalore;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEffects {
    public static StatusEffect TEST;

    public static StatusEffect registerStatusEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(JamsGalore.MOD_ID, name),
                new TestEffect(StatusEffectCategory.HARMFUL, 312487));

    }
    public static void registerEffects(){
        TEST = registerStatusEffect("test");
    }
}
