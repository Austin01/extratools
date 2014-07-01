package com.suhnday.extratools.Items.Tools;

import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;

public class EmeraldAxe extends ItemAxe {

    public EmeraldAxe(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        par2EnumToolMaterial.customCraftingMaterial = Items.emerald;
    }

    @Deprecated
    public EmeraldAxe(int par1, ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        par2EnumToolMaterial.customCraftingMaterial = Items.emerald;
    }
}
