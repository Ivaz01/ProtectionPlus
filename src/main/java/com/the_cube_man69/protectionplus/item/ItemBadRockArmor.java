package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.creativetab.CreativeTabProPlus;
import com.the_cube_man69.protectionplus.init.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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

    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null)
        {
            ItemStack helmet = player.getCurrentArmor(3);
            ItemStack plate = player.getCurrentArmor(2);
            ItemStack leggings = player.getCurrentArmor(1);
            ItemStack boots = player.getCurrentArmor(0);
            if (helmet.getItem() == ModItems.badRockHelmet && plate.getItem() == ModItems.badRockChestPlate && leggings.getItem() == ModItems.badRockLeggings && boots.getItem() == ModItems.badRockBoots)
            {
                player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 100, 3));
                player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 300, 3));
                player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 4));
                player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 30, 1));
            }
        }
    }
}
