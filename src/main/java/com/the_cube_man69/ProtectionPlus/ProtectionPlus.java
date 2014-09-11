package com.the_cube_man69.ProtectionPlus;

import com.the_cube_man69.ProtectionPlus.Configuration.ConfigurationHandler;
import com.the_cube_man69.ProtectionPlus.proxy.IProxy;
import com.the_cube_man69.ProtectionPlus.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.Mod_ID, name= Reference.Mod_Name, version= Reference.Version)
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
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
