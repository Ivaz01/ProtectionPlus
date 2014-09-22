package com.the_cube_man69.protectionplus.block;

public class BlockTinOre extends BlockProPlus
{
    public BlockTinOre()
    {
        super();
        this.setBlockName("tinOre");
        this.setBlockTextureName("tinOre");
        this.setHardness(2);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 1);
    }
}
