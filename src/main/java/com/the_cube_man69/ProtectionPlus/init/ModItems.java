package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.item.*;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Bronze//
    public static Item.ToolMaterial enumToolMaterialBronze = EnumHelper.addToolMaterial("Bronze", 2, 200, 4.5F, 1.0F, 9);
    public static ItemArmor.ArmorMaterial enumArmorMaterialBronze = EnumHelper.addArmorMaterial("bronze", 12, new int[] {2, 6, 5, 2}, 9);

    //obsidian//
    public static ItemArmor.ArmorMaterial enumArmorMaterialObsidian = EnumHelper.addArmorMaterial("obsidian", 40, new int[] {3, 8, 6, 4}, 3);
    public static Item.ToolMaterial enumToolMaterialObsidian = EnumHelper.addToolMaterial("obsidian", 4, 4000, 19F, 4.5F, 30);

    //BADROCk//
    public static ItemArmor.ArmorMaterial enumArmorMaterialBADROCK = EnumHelper.addArmorMaterial("BADROCK", 60, new int[] {6, 9, 8, 6}, 99);
    public static Item.ToolMaterial enumToolMaterialBADROCK = EnumHelper.addToolMaterial("BADROCK", 5, 8000, 20F, 10F, 99);

    //Unobtainium//
    public static ItemArmor.ArmorMaterial enumArmorMaterialUnobtainium = EnumHelper.addArmorMaterial("unobtainium", 100, new int[]{7, 10, 9, 7}, 1);
    public static Item.ToolMaterial enumToolMaterialUnobtainium = EnumHelper.addToolMaterial("unobtainium", 5, 10000, 25F, 20F, 1);

    //paper//
    public static ItemArmor.ArmorMaterial enumArmorMaterialPaper = EnumHelper.addArmorMaterial("paper", 35, new int[]{3, 7, 5, 3}, 90);


    //dirt//
    public static ItemArmor.ArmorMaterial enumArmorMaterialDirt = EnumHelper.addArmorMaterial("dirt", 10, new int[]{1, 4, 3, 1}, 1);

    //emerald//
    public static ItemArmor.ArmorMaterial enumArmorMaterialEmerald = EnumHelper.addArmorMaterial("emerald", 45, new int[]{4, 8, 6, 4}, 15);
    public static Item.ToolMaterial enumToolMaterialEmerald = EnumHelper.addToolMaterial("emerald", 4, 1500, 7F, 10F, 15);

    //plank//
    public static ItemArmor.ArmorMaterial enumArmorMaterialPlank = EnumHelper.addArmorMaterial("plank", 10, new int[]{2, 4, 3, 2}, 10);

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
    public static Item badRockSword;
    public static Item badRockPickAxe;
    public static Item badRockShovel;
    public static Item badRockAxe;
    public static Item badRockHoe;
    public static Item unobtainiumIngot;
    public static Item unobtainiumSword;
    public static Item unobtainumPickAxe;
    public static Item unobtainumShovel;
    public static Item unobtainiumAxe;
    public static Item unobtainiumHoe;
    public static Item unobtainiumHelmet;
    public static Item unobtainiumChestPlate;
    public static Item unobtainiumLeggings;
    public static Item unobtainiumBoots;
    public static Item paperHelmet;
    public static Item paperChestPlate;
    public static Item paperLeggings;
    public static Item paperBoots;
    public static Item dirtHelmet;
    public static Item dirtChestPlate;
    public static Item dirtLeggings;
    public static Item dirtBoots;
    public static Item emeraldHelmet;
    public static Item emeraldChestPlate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;
    public static Item emeraldSword;
    public static Item emeraldPickAxe;
    public static Item emeraldShovel;
    public static Item emeraldAxe;
    public static Item emeraldHoe;
    public static Item plankHelmet;
    public static Item plankChestPlate;
    public static Item plankLeggings;
    public static Item plankBoots;

    public static void initItems()
    {
        RenderingRegistry.addNewArmourRendererPrefix("5");
        RenderingRegistry.addNewArmourRendererPrefix("6");
        RenderingRegistry.addNewArmourRendererPrefix("7");
        RenderingRegistry.addNewArmourRendererPrefix("8");
        RenderingRegistry.addNewArmourRendererPrefix("9");
        RenderingRegistry.addNewArmourRendererPrefix("10");
        RenderingRegistry.addNewArmourRendererPrefix("11");
        RenderingRegistry.addNewArmourRendererPrefix("12");
        RenderingRegistry.addNewArmourRendererPrefix("13");

        cactusLeather= new ItemProPlus().setUnlocalizedName("cactusLeather");
        copperIngot = new ItemProPlus().setUnlocalizedName("copperIngot");
        tinIngot = new ItemProPlus().setUnlocalizedName("tinIngot");
        bronzeIngot = new ItemProPlus().setUnlocalizedName("bronzeIngot");
        bronzeSword = new ItemProPlusSword(enumToolMaterialBronze).setUnlocalizedName("bronzeSword");
        bronzePickAxe = new ItemProPlusPickAxe(enumToolMaterialBronze).setUnlocalizedName("bronzePickAxe");
        bronzeAxe = new ItemProPlusAxe(enumToolMaterialBronze).setUnlocalizedName("bronzeAxe");
        bronzeShovel = new ItemProPlusShovel(enumToolMaterialBronze).setUnlocalizedName("bronzeShovel");
        bronzeHoe = new ItemProPlusHoe(enumToolMaterialBronze).setUnlocalizedName("bronzeHoe");
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
        obsidianSword = new ItemProPlusSword(enumToolMaterialObsidian).setUnlocalizedName("obsidianSword");
        obsidianPickAxe = new ItemProPlusPickAxe(enumToolMaterialObsidian).setUnlocalizedName("obsidianPickAxe");
        obsidianShovel = new ItemProPlusShovel(enumToolMaterialObsidian).setUnlocalizedName("obsidianShovel");
        obsidianAxe = new ItemProPlusAxe(enumToolMaterialObsidian).setUnlocalizedName("obsidianAxe");
        obsidianHoe = new ItemProPlusHoe(enumToolMaterialObsidian).setUnlocalizedName("obsidianHoe");
        badRockHelmet = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 0).setUnlocalizedName("badRockHelmet");
        badRockChestPlate = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 1).setUnlocalizedName("badRockChestPlate");
        badRockLeggings = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 2).setUnlocalizedName("badRockLeggings");
        badRockBoots = new ItemBadRockArmor(enumArmorMaterialBADROCK, 8, 3).setUnlocalizedName("badRockBoots");
        badRockSword = new ItemProPlusSword(enumToolMaterialBADROCK).setUnlocalizedName("badRockSword");
        badRockPickAxe = new ItemProPlusPickAxe(enumToolMaterialBADROCK).setUnlocalizedName("badRockPickAxe");
        badRockShovel = new ItemProPlusShovel(enumToolMaterialBADROCK).setUnlocalizedName("badRockShovel");
        badRockAxe = new ItemProPlusAxe(enumToolMaterialBADROCK).setUnlocalizedName("badRockAxe");
        badRockHoe = new ItemProPlusHoe(enumToolMaterialBADROCK).setUnlocalizedName("badRockHoe");
        unobtainiumIngot = new ItemProPlus().setUnlocalizedName("unobtainiumIngot");
        unobtainiumSword = new ItemProPlusSword(enumToolMaterialUnobtainium).setUnlocalizedName("unobtainiumSword");
        unobtainumPickAxe = new ItemProPlusPickAxe(enumToolMaterialUnobtainium).setUnlocalizedName("unobtainiumPickAxe");
        unobtainumShovel = new ItemProPlusShovel(enumToolMaterialUnobtainium).setUnlocalizedName("unobtainiumShovel");
        unobtainiumAxe = new ItemProPlusAxe(enumToolMaterialUnobtainium).setUnlocalizedName("unobtainiumAxe");
        unobtainiumHoe = new ItemProPlusHoe(enumToolMaterialUnobtainium).setUnlocalizedName("unobtainiumHoe");
        unobtainiumHelmet = new ItemUnobtainiumArmor(enumArmorMaterialUnobtainium, 9, 0).setUnlocalizedName("unobtainiumHelmet");
        unobtainiumChestPlate = new ItemUnobtainiumArmor(enumArmorMaterialUnobtainium, 9, 1).setUnlocalizedName("unobtainiumChestPlate");
        unobtainiumLeggings = new ItemUnobtainiumArmor(enumArmorMaterialUnobtainium, 9, 2).setUnlocalizedName("unobtainiumLeggings");
        unobtainiumBoots = new ItemUnobtainiumArmor(enumArmorMaterialUnobtainium, 9, 3).setUnlocalizedName("unobtainiumBoots");
        paperHelmet = new ItemPaperArmor(enumArmorMaterialPaper, 10, 0).setUnlocalizedName("paperHelmet");
        paperChestPlate = new ItemPaperArmor(enumArmorMaterialPaper, 10, 1).setUnlocalizedName("paperChestPlate");
        paperLeggings = new ItemPaperArmor(enumArmorMaterialPaper, 10, 2).setUnlocalizedName("paperLeggings");
        paperBoots = new ItemPaperArmor(enumArmorMaterialPaper, 10, 3).setUnlocalizedName("paperBoots");
        dirtHelmet = new ItemDirtArmor(enumArmorMaterialDirt, 11, 0).setUnlocalizedName("dirtHelmet");
        dirtChestPlate = new ItemDirtArmor(enumArmorMaterialDirt, 11, 1).setUnlocalizedName("dirtChestPlate");
        dirtLeggings = new ItemDirtArmor(enumArmorMaterialDirt, 11, 2).setUnlocalizedName("dirtLeggings");
        dirtBoots = new ItemDirtArmor(enumArmorMaterialDirt, 11, 3).setUnlocalizedName("dirtBoots");
        emeraldHelmet = new ItemEmeraldArmor(enumArmorMaterialEmerald, 12, 0).setUnlocalizedName("emeraldHelmet");
        emeraldChestPlate = new ItemEmeraldArmor(enumArmorMaterialEmerald, 12, 1).setUnlocalizedName("emeraldChestPlate");
        emeraldLeggings = new ItemEmeraldArmor(enumArmorMaterialEmerald, 12, 2).setUnlocalizedName("emeraldLeggings");
        emeraldBoots = new ItemEmeraldArmor(enumArmorMaterialEmerald, 12, 3).setUnlocalizedName("emeraldBoots");
        emeraldSword = new ItemProPlusSword(enumToolMaterialEmerald).setUnlocalizedName("emeraldSword");
        emeraldPickAxe = new ItemProPlusPickAxe(enumToolMaterialEmerald).setUnlocalizedName("emeraldPickAxe");
        emeraldShovel = new ItemProPlusShovel(enumToolMaterialEmerald).setUnlocalizedName("emeraldShovel");
        emeraldAxe = new ItemProPlusAxe(enumToolMaterialEmerald).setUnlocalizedName("emeraldAxe");
        emeraldHoe = new ItemProPlusHoe(enumToolMaterialEmerald).setUnlocalizedName("emeraldHoe");
        plankHelmet = new ItemPlankArmor(enumArmorMaterialPlank, 13, 0).setUnlocalizedName("plankHelmet");
        plankChestPlate = new ItemPlankArmor(enumArmorMaterialPlank, 13, 1).setUnlocalizedName("plankChestPlate");
        plankLeggings = new ItemPlankArmor(enumArmorMaterialPlank, 13, 2).setUnlocalizedName("plankLeggings");
        plankBoots = new ItemPlankArmor(enumArmorMaterialPlank, 13, 3).setUnlocalizedName("plankLeggings");
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
        GameRegistry.registerItem(badRockSword, "badRockSword");
        GameRegistry.registerItem(badRockPickAxe, "badRockPickAxe");
        GameRegistry.registerItem(badRockShovel, "badRockShovel");
        GameRegistry.registerItem(badRockAxe, "badRockAxe");
        GameRegistry.registerItem(badRockHoe, "badRockHoe");
        GameRegistry.registerItem(unobtainiumIngot, "unobtainiumIngot");
        GameRegistry.registerItem(unobtainiumSword, "unobtainiumSword");
        GameRegistry.registerItem(unobtainumPickAxe, "unobtainiumPickAxe");
        GameRegistry.registerItem(unobtainumShovel, "unobtainiumShovel");
        GameRegistry.registerItem(unobtainiumAxe, "unobtainiumAxe");
        GameRegistry.registerItem(unobtainiumHoe, "unobtainiumHoe");
        GameRegistry.registerItem(unobtainiumHelmet, "unobtainiumHelmet");
        GameRegistry.registerItem(unobtainiumChestPlate, "unobtainiumChestPlate");
        GameRegistry.registerItem(unobtainiumLeggings, "unobtainiumLeggings");
        GameRegistry.registerItem(unobtainiumBoots, "unobtainiumBoots");
        GameRegistry.registerItem(paperHelmet, "paperHelmet");
        GameRegistry.registerItem(paperChestPlate, "paperChestPlate");
        GameRegistry.registerItem(paperLeggings, "paperLeggings");
        GameRegistry.registerItem(paperBoots, "paperBoots");
        GameRegistry.registerItem(dirtHelmet, "dirtHelmet");
        GameRegistry.registerItem(dirtChestPlate, "dirtChsetPlate");
        GameRegistry.registerItem(dirtLeggings, "dirtLeggings");
        GameRegistry.registerItem(dirtBoots, "dirtBoots");
        GameRegistry.registerItem(emeraldHelmet, "emeraldHelmet");
        GameRegistry.registerItem(emeraldChestPlate, "emeraldChestPlate");
        GameRegistry.registerItem(emeraldLeggings, "emeraldLeggings");
        GameRegistry.registerItem(emeraldBoots, "emeraldBoots");
        GameRegistry.registerItem(emeraldSword, "emeraldSword");
        GameRegistry.registerItem(emeraldPickAxe, "emeraldPickAxe");
        GameRegistry.registerItem(emeraldShovel, "emeraldShovel");
        GameRegistry.registerItem(emeraldAxe, "emeraldAxe");
        GameRegistry.registerItem(emeraldHoe, "emeraldHoe");
        GameRegistry.registerItem(plankHelmet, "plankHelmet");
        GameRegistry.registerItem(plankChestPlate, "plankChestPlate");
        GameRegistry.registerItem(plankLeggings, "plankLeggings");
        GameRegistry.registerItem(plankBoots, "plankBoots");
    }
}