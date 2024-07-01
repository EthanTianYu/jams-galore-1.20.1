package net.ethantianyu.jamsgalore.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class PhotosensitivityEffect extends StatusEffect {
    public PhotosensitivityEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);

    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.getWorld().isClient()) {
            if(pLivingEntity.getWorld().isDay()){
                if(pLivingEntity.getWorld().isSkyVisible(pLivingEntity.getBlockPos())){
                    if(!pLivingEntity.isTouchingWater()){
                        pLivingEntity.setOnFire(true);
                        pLivingEntity.damage(pLivingEntity.getDamageSources().inFire(), (float)0.5);

                    }

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
