package net.ethantianyu.jamsgalore.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.stat.Stat;

public class TestEffect extends StatusEffect {
    public TestEffect(StatusEffectCategory statusEffectCategory, int color){
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntitiy, int pAmplifier){
        if(!pLivingEntitiy.getWorld().isClient()){
            double x = pLivingEntitiy.getX();
            double y = pLivingEntitiy.getY();
            double z = pLivingEntitiy.getZ();

            pLivingEntitiy.teleport(x , y, z);
            pLivingEntitiy.setVelocity(0,0,0);
        }

        super.applyUpdateEffect(pLivingEntitiy, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }

}
