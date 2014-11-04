package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemDirtArmor extends ItemArmor
{
    public String[] armorTypes = new String[] {"dirtHelmet", "dirtChestPlate", "dirtLeggings", "dirtBoots"};

    public ItemDirtArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.dirtHelmet)|| stack.getItem().equals(ModItems.dirtChestPlate)|| stack.getItem().equals(ModItems.dirtBoots))
        {
            return "protectionplus:textures/armor/dirt_1.png";
        }

        if(stack.getItem().equals(ModItems.dirtLeggings));
        {
            return "protectionplus:textures/armor/dirt_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.dirtHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:dirtHelmet");
        if(this == ModItems.dirtChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:dirtChestPlate");
        if(this == ModItems.dirtLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:dirtLeggings");
        if(this == ModItems.dirtBoots)
            this.itemIcon = reg.registerIcon("protectionplus:dirtBoots");
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Great Starting Item");
    }
}
