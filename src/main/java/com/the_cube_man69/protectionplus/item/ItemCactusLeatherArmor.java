package com.the_cube_man69.protectionplus.item;

import com.the_cube_man69.protectionplus.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCactusLeatherArmor extends ItemArmor
{
    private String [] armorTypes = new String [] {"CactusLeatherHelmet", "CactusLeatherChestPlate", "CactusLeatherLeggings", "CactusLeatherBoots"};

    public ItemCactusLeatherArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType)
    {
        super(armorMaterial, renderIndex, armourType);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if(stack.getItem().equals(ModItems.cactusLeatherHelmet)|| stack.getItem().equals(ModItems.cactusLeatherChestPlate)|| stack.getItem().equals(ModItems.cactusLeatherBoots))
        {
            return "protectionplus:textures/armor/CactusLeather_1.png";
        }

        if(stack.getItem().equals(ModItems.cactusLeatherLeggings));
        {
            return "protectionplus:textures/armor/CactusLeather_2.png";
        }
    }

    public void onCrafting(ItemStack itemStack)
    {
        ItemStack ChestPlate = new ItemStack(ModItems.cactusLeatherChestPlate);
        ChestPlate.addEnchantment(Enchantment.thorns, 5);
    }
}
