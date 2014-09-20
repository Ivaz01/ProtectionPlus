package com.the_cube_man69.protectionplus.block;

public class BlockCopperOre extends BlockProPlus
{
    public BlockCopperOre()
    {
        super();
        this.setBlockName("copperOre");
        this.setBlockTextureName("copperOre");
        this.setHardness(2);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 1);
    }
}
