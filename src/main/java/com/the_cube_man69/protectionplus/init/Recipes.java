package com.the_cube_man69.protectionplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
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

        ItemStack enchanted = new ItemStack(ModItems.cactusLeatherHelmet);
        enchanted.addEnchantment(Enchantment.thorns, 3);

        GameRegistry.addShapedRecipe(enchanted, new Object[]{"ccc", "c c", "   ", 'c', new ItemStack(ModItems.cactusLeather)});

        ItemStack enchanted1 = new ItemStack(ModItems.cactusLeatherChestPlate);
        enchanted.addEnchantment(Enchantment.thorns, 3);

        GameRegistry.addShapedRecipe(enchanted1, new Object[]{"c c", "ccc", "ccc", 'c', new ItemStack(ModItems.cactusLeather)}
        );

        ItemStack enchanted2 = new ItemStack(ModItems.cactusLeatherLeggings);
        enchanted2.addEnchantment(Enchantment.thorns, 3);

        GameRegistry.addShapedRecipe(enchanted2, new Object[]{"ccc", "c c", "c c", 'c', new ItemStack(ModItems.cactusLeather)});

        ItemStack enchanted3 = new ItemStack(ModItems.cactusLeatherBoots);
        enchanted3.addEnchantment(Enchantment.thorns, 3);

        GameRegistry.addShapedRecipe(enchanted3, new Object[]{"c c", "c c", "   ", 'c', new ItemStack(ModItems.cactusLeather)});

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), "o", "o", "s", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickAxe), "ooo", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianShovel), "o", "s", "s", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe), "oo ", "os ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHoe), "oo ", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelmet), "ooo", "o o", "   ", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChestPlate), "o o", "ooo", "ooo", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianLeggings), "ooo", "o o ", "o o", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianBoots), "o o", "o o", "   ", 'o', new ItemStack(Blocks.obsidian));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockSword), "b", "b", "d", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzePickAxe), "bbb", " d ", " d ", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockShovel), "b", "d", "d", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockAxe), "bb ", "bd ", " d ", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockHoe), "bb ", " d ", " d ", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockHelmet), "bbb", "b b", "   ", 'b', new ItemStack(ModBlocks.badRock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockChestPlate), "b b", "bbb", "bbb", 'b', new ItemStack(ModBlocks.badRock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockLeggings), "bbb", "b b", "b b", 'b', new ItemStack(ModBlocks.badRock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockBoots), "b b", "b b", "   ", 'b', new ItemStack(ModBlocks.badRock));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.unobtainium, 2), new ItemStack(Blocks.lapis_ore), new ItemStack(Blocks.redstone_ore), new ItemStack(Blocks.diamond_ore), new ItemStack(Blocks.iron_ore), new ItemStack(Blocks.coal_ore), new ItemStack(Blocks.emerald_ore), new ItemStack(Blocks.gold_ore), new ItemStack(Blocks.quartz_ore), new ItemStack(ModBlocks.unobtainium));

        GameRegistry.addSmelting(new ItemStack(ModBlocks.copperOre), new ItemStack(ModItems.copperIngot), (float) 0.3);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.tinOre), new ItemStack(ModItems.tinIngot), (float) 0.3);
    }
}