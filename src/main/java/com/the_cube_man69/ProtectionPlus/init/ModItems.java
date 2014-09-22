package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.item.ItemCactusLeather;
import com.the_cube_man69.protectionplus.item.ItemCopperIngot;
import com.the_cube_man69.protectionplus.item.ItemProPlus;
import com.the_cube_man69.protectionplus.item.ItemTinIngot;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemProPlus cactusLeather = new ItemCactusLeather();
    public static final ItemProPlus copperIngot = new ItemCopperIngot();
    public static final ItemProPlus tinIngot = new ItemTinIngot();

    public static void init()
    {
        GameRegistry.registerItem(cactusLeather, "cactusLeather");
        GameRegistry.registerItem(copperIngot, "copperIngot");
        GameRegistry.registerItem(tinIngot, "tinIngot");
    }

}
