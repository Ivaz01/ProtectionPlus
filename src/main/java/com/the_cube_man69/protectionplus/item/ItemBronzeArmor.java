package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class ItemBronzeArmor extends ItemArmor
{
    private String [] armorTypes = new String [] {"BronzeHelmet", "BronzeChestPlate", "BronzeLeggings", "BronzeBoots"};

    public ItemBronzeArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.bronzeHelmet)|| stack.getItem().equals(ModItems.bronzeChestPlate)|| stack.getItem().equals(ModItems.bronzeBoots))
        {
            return "protectionplus:textures/armor/bronze_1.png";
        }

        if(stack.getItem().equals(ModItems.bronzeLeggings));
        {
            return "protectionplus:textures/armor/bronze_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.bronzeHelmet)
                this.itemIcon = reg.registerIcon("protectionplus:bronzeHelmet");
        if(this == ModItems.bronzeChestPlate)
                this.itemIcon = reg.registerIcon("protectionplus:bronzeChestPlate");
        if(this == ModItems.bronzeLeggings)
                this.itemIcon = reg.registerIcon("protectionplus:bronzeLeggings");
        if(this == ModItems.bronzeBoots)
                this.itemIcon = reg.registerIcon("protectionplus:bronzeBoots");
    }
}
