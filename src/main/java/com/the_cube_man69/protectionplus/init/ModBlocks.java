package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.block.BlockCopperOre;
import com.the_cube_man69.protectionplus.block.BlockPotatoOre;
import com.the_cube_man69.protectionplus.block.BlockProPlus;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockProPlus potatoOre = new BlockPotatoOre();
    public static final BlockProPlus copperOre = new BlockCopperOre();

    public static void init()
    {
        GameRegistry.registerBlock(potatoOre, "potatoOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
    }
}
