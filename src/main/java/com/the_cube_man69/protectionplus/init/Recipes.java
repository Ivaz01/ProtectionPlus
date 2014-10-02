package com.the_cube_man69.protectionplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cactusLeather, 2),"lsc", "lsc", "lsc", 'l', new ItemStack(Items.leather), 's', Items.slime_ball, 'c', Blocks.cactus);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.bronzeIngot, 4), new ItemStack(ModItems.tinIngot), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.copperIngot)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzeSword),"bbb", "s", "s", 'b', new ItemStack(ModItems.bronzeIngot), 's', Items.stick);

        GameRegistry.addSmelting(new ItemStack(ModBlocks.copperOre), new ItemStack(ModItems.copperIngot), (float) 0.3);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.tinOre), new ItemStack(ModItems.tinIngot), (float) 0.3);
    }
}