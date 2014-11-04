package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemUnobtainiumArmor extends ItemArmor
{
    public String[] armorTypes = new String[] {"unobtainiumHelmet", "unobtainiumChestPlate", "unobtainiumLeggings", "unobtainiumBoots"};

    public ItemUnobtainiumArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.unobtainiumHelmet)|| stack.getItem().equals(ModItems.unobtainiumChestPlate)|| stack.getItem().equals(ModItems.unobtainiumBoots))
        {
            return "protectionplus:textures/armor/unobtainium_1.png";
        }

        if(stack.getItem().equals(ModItems.unobtainiumLeggings));
        {
            return "protectionplus:textures/armor/unobtainium_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.unobtainiumHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:unobtainiumHelmet");
        if(this == ModItems.unobtainiumChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:unobtainiumChestPlate");
        if(this == ModItems.unobtainiumLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:unobtainiumLeggings");
        if(this == ModItems.unobtainiumBoots)
            this.itemIcon = reg.registerIcon("protectionplus:unobtainiumBoots");
    }
}
