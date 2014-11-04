package com.the_cube_man69.protectionplus.block;

import net.minecraft.block.material.Material;

public class BlockBadRock extends BlockProPlus
{
    public BlockBadRock(Material iron)
    {
        super();
        this.setBlockName("badRock");
        this.setBlockTextureName("badRock");
        this.setHardness(80);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 4);
        this.setResistance(1000000000);
    }

    public BlockBadRock()
    {
        this(Material.iron);
    }
}
