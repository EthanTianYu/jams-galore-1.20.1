package net.ethantianyu.jamsgalore.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DyspneaEffect extends StatusEffect {
    public DyspneaEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);

    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.getWorld().isClient()) {
            if(pLivingEntity.isAlive()){
                float air = pLivingEntity.getAir();
                int health = (int)pLivingEntity.getHealth();
                if(air > 1) if (health > 1) {
                    pLivingEntity.damage(pLivingEntity.getDamageSources().drown(), (float)0.1);
                    pLivingEntity.setAir(0);
                } else {
                    pLivingEntity.damageArmor(pLivingEntity.getDamageSources().drown(), (float)0.1);
                }
            }

        }

        super.applyUpdateEffect(pLivingEntity, pAmplifier);

    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }

}
