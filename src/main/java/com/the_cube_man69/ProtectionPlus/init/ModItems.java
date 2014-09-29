package com.the_cube_man69.protectionplus.init;

import com.the_cube_man69.protectionplus.item.*;
import com.the_cube_man69.protectionplus.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemProPlus cactusLeather = new ItemCactusLeather();
    public static final ItemProPlus copperIngot = new ItemCopperIngot();
    public static final ItemProPlus tinIngot = new ItemTinIngot();
    public static final ItemProPlus bronzeIngot = new ItemBronzeIngot();
    public static final ItemBronzeSword bronzeSword = new ItemBronzeSword(Item.ToolMaterial.IRON);
    public static final ItemBronzePickAxe bronzePickAxe = new ItemBronzePickAxe(Item.ToolMaterial.IRON);
    public static final ItemBronzeAxe bronzeAxe = new ItemBronzeAxe(Item.ToolMaterial.IRON);
    public static final ItemBronzeShovel bronzeShovel = new ItemBronzeShovel(Item.ToolMaterial.IRON);
    public static final ItemBronzeHoe bronzeHoe = new ItemBronzeHoe(Item.ToolMaterial.IRON);

    public static void init()
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
    }

}
