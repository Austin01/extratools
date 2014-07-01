package com.suhnday.extratools.Items.Weapons;

import net.minecraft.init.Items;
import net.minecraft.item.ItemSword;

public class EmeraldSword extends ItemSword {

    public EmeraldSword(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        par2EnumToolMaterial.customCraftingMaterial = Items.emerald;
    }

}
