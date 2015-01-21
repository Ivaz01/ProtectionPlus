package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemPlankArmor extends ItemArmor
{
    private String [] armorTypes = new String [] {"plankHelmet", "plankChestPlate", "plankLeggings", "plankBoots"};

    public ItemPlankArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.plankHelmet)|| stack.getItem().equals(ModItems.plankChestPlate)|| stack.getItem().equals(ModItems.plankBoots))
        {
            return "protectionplus:textures/armor/plank_1.png";
        }

        if(stack.getItem().equals(ModItems.plankLeggings));
        {
            return "protectionplus:textures/armor/plank_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.plankHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:plankHelmet");
        if(this == ModItems.plankChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:plankChestPlate");
        if(this == ModItems.plankLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:plankLeggings");
        if(this == ModItems.plankBoots)
            this.itemIcon = reg.registerIcon("protectionplus:plankBoots");
    }
}
