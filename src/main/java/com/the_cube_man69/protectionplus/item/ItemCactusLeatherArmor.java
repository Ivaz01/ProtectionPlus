package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCactusLeatherArmor extends ItemArmor
{
    private String [] armorTypes = new String [] {"CactusLeatherHelmet", "CactusLeatherChestPlate", "CactusLeatherLeggings", "CactusLeatherBoots"};

    public ItemCactusLeatherArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.cactusLeatherHelmet)|| stack.getItem().equals(ModItems.cactusLeatherChestPlate)|| stack.getItem().equals(ModItems.cactusLeatherBoots))
        {
            return "protectionplus:textures/armor/cactusLeather_1.png";
        }

        if(stack.getItem().equals(ModItems.cactusLeatherLeggings));
        {
            return "protectionplus:textures/armor/cactusLeather_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.cactusLeatherHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:cactusLeatherHelmet");
        if(this == ModItems.cactusLeatherChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:cactusLeatherChestPlate");
        if(this == ModItems.cactusLeatherLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:cactusLeatherLeggings");
        if(this == ModItems.cactusLeatherBoots)
            this.itemIcon = reg.registerIcon("protectionplus:cactusLeatherBoots");
    }
}
