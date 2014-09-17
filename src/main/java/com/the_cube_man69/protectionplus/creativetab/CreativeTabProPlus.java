package com.the_cube_man69.protectionplus.creativetab;

import com.the_cube_man69.protectionplus.init.ModItems;
import com.the_cube_man69.protectionplus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabProPlus
{
    public static final CreativeTabs ProPlus_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.cactusLeather;
        }


    };
}
