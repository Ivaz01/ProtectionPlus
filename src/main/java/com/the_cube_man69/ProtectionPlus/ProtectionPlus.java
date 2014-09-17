package com.the_cube_man69.protectionplus;

import com.the_cube_man69.protectionplus.handler.ConfigurationHandler;
import com.the_cube_man69.protectionplus.init.ModBlocks;
import com.the_cube_man69.protectionplus.init.ModItems;
import com.the_cube_man69.protectionplus.init.Recipes;
import com.the_cube_man69.protectionplus.proxy.IProxy;
import com.the_cube_man69.protectionplus.reference.Reference;
import com.the_cube_man69.protectionplus.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_Name, version= Reference.Version, guiFactory =  Reference.GUI_FACTORY_CLASS)
public class ProtectionPlus
{
    @Mod.Instance(Reference.MOD_ID)
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

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
