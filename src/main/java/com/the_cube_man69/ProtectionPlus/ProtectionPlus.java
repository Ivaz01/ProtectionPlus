package com.the_cube_man69.ProtectionPlus;

import com.the_cube_man69.ProtectionPlus.handler.ConfigurationHandler;
import com.the_cube_man69.ProtectionPlus.init.ModItems;
import com.the_cube_man69.ProtectionPlus.proxy.IProxy;
import com.the_cube_man69.ProtectionPlus.reference.Reference;
import com.the_cube_man69.ProtectionPlus.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.Mod_ID, name= Reference.Mod_Name, version= Reference.Version, guiFactory =  Reference.GUI_FACTORY_CLASS)
public class ProtectionPlus
{
    @Mod.Instance(Reference.Mod_ID)
    public static ProtectionPlus instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
