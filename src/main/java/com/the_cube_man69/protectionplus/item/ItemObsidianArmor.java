package com.the_cube_man69.protectionplus.item;

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
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        if(stack.getItem() == ModItems.obsidianBoots)
        if(stack.getItem() == ModItems.obsidianLeggings)
        if(stack.getItem() == ModItems.obsidianChestPlate)
        if(stack.getItem() == ModItems.obsidianHelmet)
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 10));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 1));
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 10));
    }   }
}

