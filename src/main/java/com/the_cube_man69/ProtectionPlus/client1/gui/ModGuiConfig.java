package com.the_cube_man69.ProtectionPlus.client1.gui;

import com.the_cube_man69.ProtectionPlus.handler.ConfigurationHandler;
import com.the_cube_man69.ProtectionPlus.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
        Reference.Mod_ID,
        false,
        false,
        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
