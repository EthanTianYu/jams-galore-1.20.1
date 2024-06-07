package net.ethantianyu.jamsgalore.effect;

import net.ethantianyu.jamsgalore.JamsGalore;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEffects {

    public static final StatusEffect FREEZE = new FreezeEffect(StatusEffectCategory.HARMFUL, 312187);
    public static final StatusEffect ARRHYTHMIA = new ArrhythmiaEffect(StatusEffectCategory.HARMFUL, 312187);
    public static final StatusEffect DYSPNEA = new DyspneaEffect(StatusEffectCategory.HARMFUL, 312187);

    public static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(JamsGalore.MOD_ID, name), effect);

    }

    public static void registerEffects() {
       registerStatusEffect("freeze", FREEZE);
       registerStatusEffect("arrhythmia", ARRHYTHMIA);
       registerStatusEffect("dyspnea", DYSPNEA);
    }


}
