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
    public static Item.ToolMaterial enumToolMaterialBronze = EnumHelper.addToolMaterial("Bronze", 2, 150, 4.5F, 1.0F, 9);
    public static ItemArmor.ArmorMaterial enumArmorMaterialBronze = EnumHelper.addArmorMaterial("bronze", 12, new int[] {2, 6, 5, 2}, 9);

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

    public static void initItems()
    {

        RenderingRegistry.addNewArmourRendererPrefix("5");
        RenderingRegistry.addNewArmourRendererPrefix("6");

        cactusLeather= new ItemCactusLeather();
        copperIngot = new ItemCopperIngot();
        tinIngot = new ItemTinIngot();
        bronzeIngot = new ItemBronzeIngot();
        bronzeSword = new ItemBronzeSword(enumToolMaterialBronze);
        bronzePickAxe = new ItemBronzePickAxe(enumToolMaterialBronze);
        bronzeAxe = new ItemBronzeAxe(enumToolMaterialBronze);
        bronzeShovel = new ItemBronzeShovel(enumToolMaterialBronze);
        bronzeHoe = new ItemBronzeHoe(enumToolMaterialBronze);
        bronzeHelmet = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 0).setUnlocalizedName("bronzeHelmet").setTextureName("protectionplus:bronzeHelmet").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        bronzeChestPlate = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 1).setUnlocalizedName("bronzeChestPlate").setTextureName("protectionplus:bronzeChestPlate").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        bronzeLeggings = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 2).setUnlocalizedName("bronzeLeggings").setTextureName("protectionplus:bronzeLeggings").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        bronzeBoots = new ItemBronzeArmor(enumArmorMaterialBronze, 5, 3).setUnlocalizedName("bronzeBoots").setTextureName("portectionplus:bronzeBoots").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        cactusLeatherHelmet = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.IRON,6,0).setUnlocalizedName("cactusLeatherHelmet").setTextureName("protectionplus:cactusLeatherHelmet").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        cactusLeatherChestPlate = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.IRON,6,1).setUnlocalizedName("cactusLeatherChestPlate").setTextureName("protectionplus:cactusLeatherChestPlate").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        cactusLeatherLeggings = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.IRON,6,2).setUnlocalizedName("cactusLeatherLeggings").setTextureName("protectionplus:cactusLeatherLeggings").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
        cactusLeatherBoots = new ItemCactusLeatherArmor(ItemArmor.ArmorMaterial.IRON,6,3).setUnlocalizedName("cactusLeatherBoots").setTextureName("protectionplus:cactusLeatherBoots").setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
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
    }
}