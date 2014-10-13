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

public class ItemObsidianArmor extends ItemArmor
{
    private String [] armorTypes = new String [] {"BronzeHelmet", "BronzeChestPlate", "BronzeLeggings", "BronzeBoots"};

    public ItemObsidianArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
        this.setCreativeTab(CreativeTabProPlus.ProPlus_TAB);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.obsidianHelmet)|| stack.getItem().equals(ModItems.obsidianChestPlate)|| stack.getItem().equals(ModItems.obsidianBoots))
        {
            return "protectionplus:textures/armor/obsidian_1.png";
        }

        if(stack.getItem().equals(ModItems.obsidianLeggings));
        {
            return "protectionplus:textures/armor/obsidian_2.png";
        }
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if(this == ModItems.obsidianHelmet)
            this.itemIcon = reg.registerIcon("protectionplus:obsidianHelmet");
        if(this == ModItems.obsidianChestPlate)
            this.itemIcon = reg.registerIcon("protectionplus:obsidianChestPlate");
        if(this == ModItems.obsidianLeggings)
            this.itemIcon = reg.registerIcon("protectionplus:obsidianLeggings");
        if(this == ModItems.obsidianBoots)
            this.itemIcon = reg.registerIcon("protectionplus:obsidianBoots");
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null)
        {
            ItemStack helmet = player.getCurrentArmor(3);
            ItemStack plate = player.getCurrentArmor(2);
            ItemStack leggings = player.getCurrentArmor(1);
            ItemStack boots = player.getCurrentArmor(0);
            if (helmet.getItem() == ModItems.obsidianHelmet && plate.getItem() == ModItems.obsidianChestPlate && leggings.getItem() == ModItems.obsidianLeggings && boots.getItem() == ModItems.obsidianBoots)
            {
                player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 100, 2));
                player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 300, 0));
                player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 2));
            }
        }
    }
}

