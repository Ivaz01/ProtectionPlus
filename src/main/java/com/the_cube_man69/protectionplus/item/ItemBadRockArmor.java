package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBadRockArmor extends ItemArmor
{
    private String [] armorTypes = new String [] {"badRockHelmet", "badRockChestPlate", "badRockLeggings", "badRockBoots"};

    public ItemBadRockArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.badRockHelmet)|| stack.getItem().equals(ModItems.badRockChestPlate)|| stack.getItem().equals(ModItems.badRockBoots))
        {
            return "protectionplus:textures/armor/badRock_1.png";
        }

        if(stack.getItem().equals(ModItems.badRockLeggings));
        {
            return "protectionplus:textures/armor/badRock_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.badRockHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:badRockHelmet");
        if(this == ModItems.badRockChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:badRockChestPlate");
        if(this == ModItems.badRockLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:badRockLeggings");
        if(this == ModItems.badRockBoots)
            this.itemIcon = reg.registerIcon("protectionplus:badRockBoots");
    }
}
