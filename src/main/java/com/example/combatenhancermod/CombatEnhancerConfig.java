package com.example.combatenhancermod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class CombatEnhancerConfig {
    public static Configuration config;
    public static float knockbackMultiplier;
    public static boolean sprintModuleEnabled;

    public static void loadConfig() {
        config = new Configuration(new File("config/CombatEnhancerMod.cfg"));
        config.load();

        Property knockbackProp = config.get("combat", "knockbackMultiplier", 1.5f);
        knockbackMultiplier = knockbackProp.getFloat();

        Property sprintProp = config.get("combat", "sprintModuleEnabled", true);
        sprintModuleEnabled = sprintProp.getBoolean();

        config.save();
    }
}