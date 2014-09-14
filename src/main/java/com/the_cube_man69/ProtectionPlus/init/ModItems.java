package com.the_cube_man69.ProtectionPlus.init;

import com.the_cube_man69.ProtectionPlus.item.ItemCactusLeather;
import com.the_cube_man69.ProtectionPlus.item.ItemProPlus;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemProPlus CactusLeather = new ItemCactusLeather();

    public static void init()
    {
        GameRegistry.registerItem(CactusLeather, "CactusLeather");
    }
}
