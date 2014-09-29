package com.the_cube_man69.protectionplus.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemBronzeAxe extends ItemAxe
{

    public ItemBronzeAxe(Item.ToolMaterial mat)
    {
        super(mat);
        this.setUnlocalizedName("BronzeAxe");
        this.setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg)
    {
        this.itemIcon = reg.registerIcon("protectionplus:ItemBronzeAxe");
    }
}
