package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.block.*;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockProPlus potatoOre = new BlockPotatoOre();
    public static final BlockProPlus copperOre = new BlockCopperOre();
    public static final BlockProPlus tinOre = new BlockTinOre();
    public static final BlockProPlus badRock = new BlockBadRock();

    public static void init()
    {
        GameRegistry.registerBlock(potatoOre, "potatoOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(tinOre, "tinOre");
        GameRegistry.registerBlock(badRock, "badRock");
    }
}
