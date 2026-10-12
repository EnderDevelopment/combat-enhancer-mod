package com.example.combatenhancermod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CombatEvents {
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if (event.source.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.source.getEntity();
            float knockbackMultiplier = CombatEnhancerConfig.knockbackMultiplier;
            event.knockBackStrength *= knockbackMultiplier;
            
            if (CombatEnhancerConfig.sprintModuleEnabled) {
                player.setSprinting(true);
            }
        }
    }
}