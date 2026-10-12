package com.example.combatenhancermod.client;

import com.example.combatenhancermod.CombatEnhancerGUI;
import com.example.combatenhancermod.KeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class ClientProxy {
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.openGui.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new CombatEnhancerGUI());
        }
    }
}