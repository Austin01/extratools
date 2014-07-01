package com.suhnday.extratools.Items.Tools;

import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;

public class EmeraldSpade extends ItemSpade {

    public EmeraldSpade(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        toolMaterial.customCraftingMaterial = Items.emerald;
    }

    @Deprecated
    public EmeraldSpade(int par1, ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        toolMaterial.customCraftingMaterial = Items.emerald;
    }
}