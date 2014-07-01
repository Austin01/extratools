package com.suhnday.extratools.Items.Weapons;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

/**
 * Created by Austin on 6/29/2014.
 */
public class ObsidianSword extends ItemSword {

    public ObsidianSword(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        par2EnumToolMaterial.customCraftingMaterial = Item.getItemFromBlock(Block.getBlockById(49));
    }


}