package com.suhnday.extratools.Items.Tools;

import net.minecraft.item.ItemHoe;

/**
 * Created by Austin on 6/30/2014.
 */
public class ObsidianHoe extends ItemHoe {

    public ObsidianHoe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        toolMaterial.customCraftingMaterial = getItemById(49);
    }

}