package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPaperArmor extends ItemArmor
{
    public String[] armorTypes = new String[] {"paperHelmet", "paperChestPlate", "paperLeggings", "paperBoots"};

    public ItemPaperArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.paperHelmet)|| stack.getItem().equals(ModItems.paperChestPlate)|| stack.getItem().equals(ModItems.paperBoots))
        {
            return "protectionplus:textures/armor/paper_1.png";
        }

        if(stack.getItem().equals(ModItems.paperLeggings));
        {
            return "protectionplus:textures/armor/paper_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.paperHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:paperHelmet");
        if(this == ModItems.paperChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:paperChestPlate");
        if(this == ModItems.paperLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:paperLeggings");
        if(this == ModItems.paperBoots)
            this.itemIcon = reg.registerIcon("protectionplus:paperBoots");
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Stronger Than It Sounds");
    }
}
