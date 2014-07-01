package com.suhnday.extratools.Items.Tools;

import net.minecraft.item.ItemPickaxe;

public class ObsidianPickaxe extends ItemPickaxe {

    public ObsidianPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        toolMaterial.customCraftingMaterial = getItemById(49);
    }

}
