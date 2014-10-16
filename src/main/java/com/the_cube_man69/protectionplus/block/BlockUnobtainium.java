package com.the_cube_man69.protectionplus.block;

public class BlockUnobtainium extends BlockProPlus
{
    public BlockUnobtainium()
    {
        super();
        this.setBlockName("unobtainium");
        this.setBlockTextureName("unobtainium");
        this.setHardness(100);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickAxe", 5);
    }
}
