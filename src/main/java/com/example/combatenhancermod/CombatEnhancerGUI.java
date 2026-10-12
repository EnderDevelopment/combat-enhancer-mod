package com.example.combatenhancermod;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiConfig;

public class CombatEnhancerGUI extends GuiScreen {
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRendererObj, "Combat Enhancer Settings", this.width / 2, 20, 0xFFFFFF);
        this.drawString(this.fontRendererObj, "Knockback Multiplier: " + CombatEnhancerConfig.knockbackMultiplier, this.width / 2 - 100, 50, 0xFFFFFF);
        this.drawString(this.fontRendererObj, "Sprint Module: " + (CombatEnhancerConfig.sprintModuleEnabled ? "Enabled" : "Disabled"), this.width / 2 - 100, 70, 0xFFFFFF);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}