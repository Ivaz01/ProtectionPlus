package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEmeraldArmor extends ItemArmor
{
    public String[] armorTypes = new String[] {"emeraldHelmet", "emeraldChestPlate", "emeraldLeggings", "emeraldBoots"};

    public ItemEmeraldArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.emeraldHelmet)|| stack.getItem().equals(ModItems.emeraldChestPlate)|| stack.getItem().equals(ModItems.emeraldBoots))
        {
            return "protectionplus:textures/armor/emerald_1.png";
        }

        if(stack.getItem().equals(ModItems.emeraldLeggings));
        {
            return "protectionplus:textures/armor/emerald_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.emeraldHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:emeraldHelmet");
        if(this == ModItems.emeraldChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:emeraldChestPlate");
        if(this == ModItems.emeraldLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:emeraldLeggings");
        if(this == ModItems.emeraldBoots)
            this.itemIcon = reg.registerIcon("protectionplus:emeraldBoots");
    }
}
