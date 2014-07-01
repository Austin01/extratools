package com.suhnday.extratools.CreativeTabs;

import com.suhnday.extratools.Blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabBlock extends CreativeTabs {

    public TabBlock(int id, String name) {
        super(id, name);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ModBlocks.emeraldBrick);
    }

    @Override
    public Item getTabIconItem() {
        return getIconItemStack().getItem();
    }
}
