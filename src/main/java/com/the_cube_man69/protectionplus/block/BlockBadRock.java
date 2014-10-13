package com.the_cube_man69.protectionplus.block;

public class BlockBadRock extends BlockProPlus
{
    public BlockBadRock()
    {
        super();
        this.setBlockName("badRock");
        this.setBlockTextureName("badRock");
        this.setHardness(80);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 4);
    }
}
