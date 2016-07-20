package com.IceMerman.PowerGems.client.gui;

import com.IceMerman.PowerGems.handler.ConfigHandler;
import com.IceMerman.PowerGems.references.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class ModGuiConfig extends GuiConfig{
    //TODO: implement the GuiFactory

    public ModGuiConfig(GuiScreen parentScreen, List<IConfigElement> configElements, String modID, boolean allRequireWorldRestart, boolean allRequireMcRestart, String title) {
        super(parentScreen, configElements, modID, allRequireWorldRestart, allRequireMcRestart, title);
    }
}
//.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements()