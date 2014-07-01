package com.suhnday.extratools.CreativeTabs;

import com.suhnday.extratools.Items.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabTools extends CreativeTabs {
    public TabTools(int id, String name) {
        super(id, name);
    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModItems.emeraldSword;
    }
}
