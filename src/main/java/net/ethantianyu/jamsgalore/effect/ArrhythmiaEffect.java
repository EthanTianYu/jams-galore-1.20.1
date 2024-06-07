package net.ethantianyu.jamsgalore.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ArrhythmiaEffect extends StatusEffect {
    public ArrhythmiaEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);

    }



    @Override

    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.getWorld().isClient()) {
            float health = pLivingEntity.getHealth();
            int newMaxHealth = (int)(pLivingEntity.getMaxHealth()*0.8);
            if (health > newMaxHealth) {
                pLivingEntity.setHealth(newMaxHealth);
            }


        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);

    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }

}
