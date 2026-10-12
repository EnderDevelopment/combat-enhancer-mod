package com.example.combatenhancermod;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    public static KeyBinding openGui;

    public static void init() {
        openGui = new KeyBinding("key.combatenhancermod.openGui", Keyboard.KEY_K, "key.categories.combatenhancermod");
        ClientRegistry.registerKeyBinding(openGui);
    }
}