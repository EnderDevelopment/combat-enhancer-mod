package com.example.combatenhancermod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CombatEnhancerMod.MODID, version = CombatEnhancerMod.VERSION)
public class CombatEnhancerMod {
    public static final String MODID = "combatenhancermod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        CombatEnhancerConfig.loadConfig();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new CombatEvents());
        KeyBindings.init();
    }
}