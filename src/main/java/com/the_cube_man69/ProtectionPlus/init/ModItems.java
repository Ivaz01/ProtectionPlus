package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.item.*;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static Item.ToolMaterial enumToolMaterialBronze = EnumHelper.addToolMaterial("Bronze", 2, 200, 4.5F, 1.0F, 9);
    public static ItemArmor.ArmorMaterial enumArmorMaterialBronze = EnumHelper.addArmorMaterial("bronze", 12, new int[] {2, 6, 5, 2}, 9);

    public static ItemArmor.ArmorMaterial enumArmorMaterialObsidian = EnumHelper.addArmorMaterial("obsidian", 40, new int[] {4, 10, 8, 4}, 3);
    public static Item.ToolMaterial enumToolMaterialObsidian = EnumHelper.addToolMaterial("obsidian", 4, 2000, 3F, 4.5F, 30);

    public static ItemArmor.ArmorMaterial enumArmorMaterialBADROCK = EnumHelper.addArmorMaterial("BADROCK", 60, new int[] {5, 9, 8, 5}, 99);

    public static void mainRegistry()
    {
        initItems();
        registerItems();
    }

    public static Item cactusLeather;
    public static Item copperIngot;
    public static Item tinIngot;
    public static Item bronzeIngot;
    public static Item bronzeSword;
    public static Item bronzePickAxe;
    public static Item bronzeAxe;
    public static Item bronzeShovel;
    public static Item bronzeHoe;
    public static Item bronzeHelmet;
    public static Item bronzeChestPlate;
    public static Item bronzeLeggings;
    public static Item bronzeBoots;
    public static Item cactusLeatherHelmet;
    public static Item cactusLeatherChestPlate;
    public static Item cactusLeatherLeggings;
    public static Item cactusLeatherBoots;
    public static Item obsidianHelmet;
    public static Item obsidianChestPlate;
    public static Item obsidianLeggings;
    public static Item obsidianBoots;
    public static Item obsidianSword;
    public static Item obsidianPickAxe;
    public static Item obsidianShovel;
    public static Item obsidianAxe;
    public static Item obsidianHoe;
    public static Item badRockHelmet;
    public static Item badRockChestPlate;
    public static Item badRockLeggings;
    public static Item badRockBoots;

    public static void initItems()
    {

        RenderingRegistry.addNewArmourRendererPrefix("5");
        RenderingRegistry.addNewArmourRendererPrefix("6");
        RenderingRegistry.addNewArmourRendererPrefix("7");
        RenderingRegistry.addNewArmourRendererPrefix("8");

        cactusLeather= new ItemCactusLeather();
        copperIngot = new ItemCopperIngot();
        tinIngot = new ItemTinIngot();
        bronzeIngot = new ItemBronzeIngot();
        bronzeSword = new ItemBronzeSword(enumToolMaterialBronze);
        bronzePickAxe = new ItemBronzePickAxe(enumToolMaterialBronze);
        bronzeAxe = new ItemBronzeAxe(enumToolMaterialBronze);
        bronzeShovel = new ItemBronzeShovel(enumToolMaterialBronze);
        bronzeHoe = new ItemBronzeHoe(enumToolMaterialBronze);
        bronzeHelmet = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 0).setUnlocalizedName("bronzeHelmet");
        bronzeChestPlate = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 1).setUnlocalizedName("bronzeChestPlate");
        bronzeLeggings = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 2).setUnlocalizedName("bronzeLeggings");
        bronzeBoots = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 3).setUnlocalizedName("bronzeBoots");
        cactusLeatherHelmet = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.CHAIN,6,0).setUnlocalizedName("cactusLeatherHelmet");
        cactusLeatherChestPlate = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.CHAIN,6,1).setUnlocalizedName("cactusLeatherChestPlate");
        cactusLeatherLeggings = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.CHAIN,6,2).setUnlocalizedName("cactusLeatherLeggings");
        cactusLeatherBoots = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.CHAIN,6,3).setUnlocalizedName("cactusLeatherBoots");
        obsidianHelmet = new ItemObsidianArmor(enumArmorMaterialObsidian,7,0).setUnlocalizedName("obsidianHelmet");
        obsidianChestPlate = new ItemObsidianArmor(enumArmorMaterialObsidian,7,1).setUnlocalizedName("obsidianChestPlate");
        obsidianLeggings = new ItemObsidianArmor(enumArmorMaterialObsidian,7,2).setUnlocalizedName("obsidianLeggings");
        obsidianBoots = new ItemObsidianArmor(enumArmorMaterialObsidian,7,3).setUnlocalizedName("obsidianBoots");
        obsidianSword = new ItemObsidianSword(enumToolMaterialObsidian);
        obsidianPickAxe = new ItemObsidianPickAxe(enumToolMaterialObsidian);
        obsidianShovel = new ItemObsidianShovel(enumToolMaterialObsidian);
        obsidianAxe = new ItemObsidianAxe(enumToolMaterialObsidian);
        obsidianHoe = new ItemObsidianHoe(enumToolMaterialObsidian);
        badRockHelmet = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 0).setUnlocalizedName("badRockHelmet");
        badRockChestPlate = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 1).setUnlocalizedName("badRockChestPlate");
        badRockLeggings = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 2).setUnlocalizedName("badRockLeggings");
        badRockBoots = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 3).setUnlocalizedName("badRockBoots");


    }

    public static void registerItems()
    {
        GameRegistry.registerItem(cactusLeather, "cactusLeather");
        GameRegistry.registerItem(copperIngot, "copperIngot");
        GameRegistry.registerItem(tinIngot, "tinIngot");
        GameRegistry.registerItem(bronzeIngot, "bronzeIngot");
        GameRegistry.registerItem(bronzeSword, "bronzeSword");
        GameRegistry.registerItem(bronzePickAxe, "bronzePickAxe");
        GameRegistry.registerItem(bronzeAxe, "bronzeAxe");
        GameRegistry.registerItem(bronzeShovel, "bronzeShovel");
        GameRegistry.registerItem(bronzeHoe, "bronzeHoe");
        GameRegistry.registerItem(bronzeHelmet, "bronzeHelmet");
        GameRegistry.registerItem(bronzeChestPlate, "bronzeChestPlate");
        GameRegistry.registerItem(bronzeLeggings, "bronzeLeggings");
        GameRegistry.registerItem(bronzeBoots, "bronzeBoots");
        GameRegistry.registerItem(cactusLeatherHelmet, "cactusLeatherHelmet");
        GameRegistry.registerItem(cactusLeatherChestPlate, "cactusLeatherChestPlate");
        GameRegistry.registerItem(cactusLeatherLeggings, "cactusLeatherLeggings");
        GameRegistry.registerItem(cactusLeatherBoots, "cactusLeatherBoots");
        GameRegistry.registerItem(obsidianHelmet, "obsidianHelmet");
        GameRegistry.registerItem(obsidianChestPlate, "obsidianChestPlate");
        GameRegistry.registerItem(obsidianLeggings, "obsidianLeggings");
        GameRegistry.registerItem(obsidianBoots, "obsidianBoots");
        GameRegistry.registerItem(obsidianSword, "obsidianSword");
        GameRegistry.registerItem(obsidianPickAxe, "obsidianPickAxe");
        GameRegistry.registerItem(obsidianShovel, "obsidianShovel");
        GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
        GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
        GameRegistry.registerItem(badRockHelmet, "badRockHelmet");
        GameRegistry.registerItem(badRockChestPlate, "badRockChestPlate");
        GameRegistry.registerItem(badRockLeggings, "badRockLeggings");
        GameRegistry.registerItem(badRockBoots, "badRockBoots");
    }
}