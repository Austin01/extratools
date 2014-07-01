package com.suhnday.extratools.Items.Tools;

import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe {

    public EmeraldPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        toolMaterial.customCraftingMaterial = Items.emerald;
    }

    @Deprecated
    public EmeraldPickaxe(int id, ToolMaterial toolMaterial) {
        super(toolMaterial);
        toolMaterial.customCraftingMaterial = Items.emerald;
    }
}
