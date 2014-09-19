package com.the_cube_man69.protectionplus.block;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockPotatoOre extends BlockProPlus
{
    public BlockPotatoOre()
    {
        super();
        this.setBlockName("potatoOre");
        this.setBlockTextureName("potatoOre");
        this.setHardness(2);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 1);
    }
    public Item getItemDropped(int par1, Random rand, int par2){
        return Items.potato;
    }
    public int quantityDropped(Random rand){
        return rand.nextInt(3) + 1;
    }
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_){
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            return 1 + rand.nextInt(5);
        }
        return 0;
    }
}
