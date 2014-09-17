package com.the_cube_man69.protectionplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cactusLeather), "lsc", " ", " ", 'l', new ItemStack(Items.leather), 's', new ItemStack(Items.slime_ball), 'c', new ItemStack(Blocks.cactus));
    }
}