package com.the_cube_man69.protectionplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cactusLeather, 2),"lsc", "lsc", "lsc", 'l', new ItemStack(Items.leather), 's', Items.slime_ball, 'c', Blocks.cactus);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronzeIngot, 4), new ItemStack(ModItems.tinIngot), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.copperIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzePickAxe), "bbb", " s ", " s ", 'b', new ItemStack(ModItems.bronzeIngot), 's', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzeAxe), "bb ", "bs ", " s ", 'b', new ItemStack(ModItems.bronzeIngot), 's', Items.stick);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeShovel), "b", "s", "s", 'b', new ItemStack(ModItems.bronzeIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeSword), "b", "b", "s", 'b', new ItemStack(ModItems.bronzeIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeHoe), "mm ", " d ", " d ", 'm', new ItemStack(ModItems.bronzeIngot), 'd', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeHelmet), "bbb", "b b", "   ", 'b', new ItemStack(ModItems.bronzeIngot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeChestPlate), "b b", "bbb", "bbb", 'b', new ItemStack(ModItems.bronzeIngot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeLeggings), "bbb", "b b", "b b", 'b', new ItemStack(ModItems.bronzeIngot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeBoots), "b b", "b b", "   ", 'b', new ItemStack(ModItems.bronzeIngot)));

        GameRegistry.addSmelting(new ItemStack(ModBlocks.copperOre), new ItemStack(ModItems.copperIngot), (float) 0.3);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.tinOre), new ItemStack(ModItems.tinIngot), (float) 0.3);
    }
}