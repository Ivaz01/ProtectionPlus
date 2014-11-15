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
        //Cactus Leather//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cactusLeather, 2),"lsc", "lsc", "lsc", 'l', new ItemStack(Items.leather), 's', Items.slime_ball, 'c', Blocks.cactus);

        //Bronze//
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronzeIngot, 4), new ItemStack(ModItems.tinIngot), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.copperIngot), new ItemStack(ModItems.copperIngot));

        //Bronze Tools//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzePickAxe), "bbb", " s ", " s ", 'b', new ItemStack(ModItems.bronzeIngot), 's', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzeAxe), "bb ", "bs ", " s ", 'b', new ItemStack(ModItems.bronzeIngot), 's', Items.stick);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeShovel), "b", "s", "s", 'b', new ItemStack(ModItems.bronzeIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeSword), "b", "b", "s", 'b', new ItemStack(ModItems.bronzeIngot), 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeHoe), "mm ", " d ", " d ", 'm', new ItemStack(ModItems.bronzeIngot), 'd', "stickWood"));

        //Bronze Armor//
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeHelmet), "bbb", "b b", "   ", 'b', new ItemStack(ModItems.bronzeIngot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeChestPlate), "b b", "bbb", "bbb", 'b', new ItemStack(ModItems.bronzeIngot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeLeggings), "bbb", "b b", "b b", 'b', new ItemStack(ModItems.bronzeIngot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronzeBoots), "b b", "b b", "   ", 'b', new ItemStack(ModItems.bronzeIngot)));

        //Cactus Leather Armor//
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

        //Obsidian Tools//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), "o", "o", "s", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickAxe), "ooo", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianShovel), "o", "s", "s", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe), "oo ", "os ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHoe), "oo ", " s ", " s ", 'o', new ItemStack(Blocks.obsidian), 's', new ItemStack(Items.stick));

        //Obsidian Armor//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelmet), "ooo", "o o", "   ", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChestPlate), "o o", "ooo", "ooo", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianLeggings), "ooo", "o o ", "o o", 'o', new ItemStack(Blocks.obsidian));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianBoots), "o o", "o o", "   ", 'o', new ItemStack(Blocks.obsidian));

        //BadRock Tools//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockSword), "b", "b", "d", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.bronzePickAxe), "bbb", " d ", " d ", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockShovel), "b", "d", "d", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockAxe), "bb ", "bd ", " d ", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockHoe), "bb ", " d ", " d ", 'b', new ItemStack(ModBlocks.badRock), 'd', new ItemStack(Items.diamond));

        //BadRock Armor//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockHelmet), "bbb", "b b", "   ", 'b', new ItemStack(ModBlocks.badRock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockChestPlate), "b b", "bbb", "bbb", 'b', new ItemStack(ModBlocks.badRock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockLeggings), "bbb", "b b", "b b", 'b', new ItemStack(ModBlocks.badRock));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.badRockBoots), "b b", "b b", "   ", 'b', new ItemStack(ModBlocks.badRock));

        //Unobtainium Ore//
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.unobtainium, 2), new ItemStack(Blocks.lapis_ore), new ItemStack(Blocks.redstone_ore), new ItemStack(Blocks.diamond_ore), new ItemStack(Blocks.iron_ore), new ItemStack(Blocks.coal_ore), new ItemStack(Blocks.emerald_ore), new ItemStack(Blocks.gold_ore), new ItemStack(Blocks.quartz_ore), new ItemStack(ModBlocks.unobtainium));

        //Unobtainium Armor//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumHelmet), "uuu", "u u", "   ", 'u', new ItemStack(ModItems.unobtainiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumChestPlate), "u u", "uuu", "uuu", 'u', new ItemStack(ModItems.unobtainiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumLeggings), "uuu", "u u ", "u u", 'u', new ItemStack(ModItems.unobtainiumIngot));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumBoots), "u u", "u u", "   ", 'u', new ItemStack(ModItems.unobtainiumIngot));

        //Unobtainium Tools//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumSword), "u", "u", "s", 'u', new ItemStack(ModItems.unobtainiumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainumPickAxe), "uuu", " s ", " s ", 'u', new ItemStack(ModItems.unobtainiumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainumShovel), "u", "s", "s", 'u', new ItemStack(ModItems.unobtainiumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumAxe), "uu ", "us ", " s ", 'u', new ItemStack(ModItems.unobtainiumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.unobtainiumHoe), "uu ", " s ", " s ", 'u', new ItemStack(ModItems.unobtainiumIngot), 's', new ItemStack(Items.stick));

        //Paper Armor//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.paperHelmet), "ppp", "p p", "   ", 'p', new ItemStack(Items.paper));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.paperChestPlate), "p p", "ppp", "ppp", 'p', new ItemStack(Items.paper));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.paperLeggings), "ppp", "p p", "p p", 'p', new ItemStack(Items.paper));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.paperBoots), "b b", "b b", "   " ,'b', new ItemStack(Items.paper));

        //Dirt Armor//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dirtHelmet), "ddd", "d d", "   ",'d', new ItemStack(Blocks.dirt));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dirtChestPlate), "d d", "ddd", "ddd", 'd', new ItemStack(Blocks.dirt));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dirtLeggings), "ddd", "d d", "d d", 'd', new ItemStack(Blocks.dirt));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.dirtBoots), "d d", "d d", "   ",'d', new ItemStack(Blocks.dirt));

        //Emerald Armor//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldHelmet), "eee", "e e", "   ", 'e' ,new ItemStack(Items.emerald));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldChestPlate), "e e", "eee", "eee", 'e', new ItemStack(Items.emerald));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldLeggings), "eee", "e e", "e e", 'e', new ItemStack(Items.emerald));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldBoots), "e e", "e e", "   ", 'e', new ItemStack(Items.emerald));

        //Emerald Tools//
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldSword), "e", "e", "s", 'e', new ItemStack(Items.emerald), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldPickAxe), "eee", " s ", " s ", 'e', new ItemStack(Items.emerald), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldShovel), "e", "s", "s", 'e', new ItemStack(Items.emerald), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldAxe), "ee ", "es ", " s ", 'e', new ItemStack(Items.emerald), 's' ,new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldHoe), "ee ", " s ", " s ", 'e', new ItemStack(Items.emerald), 's', new ItemStack(Items.stick));

        //Smelting Recipe//
        GameRegistry.addSmelting(new ItemStack(ModBlocks.copperOre), new ItemStack(ModItems.copperIngot), (float) 0.3);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.tinOre), new ItemStack(ModItems.tinIngot), (float) 0.3);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.unobtainium), new ItemStack(ModItems.unobtainiumIngot), (float) 0.7);
    }
}