package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.item.ItemCactusLeather;
import com.the_cube_man69.protectionplus.item.ItemCopperIngot;
import com.the_cube_man69.protectionplus.item.ItemProPlus;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemProPlus cactusLeather = new ItemCactusLeather();
    public static final ItemProPlus copperIngot = new ItemCopperIngot();

    public static void init()
    {
        GameRegistry.registerItem(cactusLeather, "cactusLeather");
        GameRegistry.registerItem(copperIngot, "copperIngot");
    }

}
