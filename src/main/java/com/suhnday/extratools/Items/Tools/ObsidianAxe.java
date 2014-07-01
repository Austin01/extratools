package com.suhnday.extratools.Items.Tools;


import net.minecraft.item.ItemAxe;

/**
 * Created by Austin on 6/30/2014.
 */
public class ObsidianAxe extends ItemAxe {

    public ObsidianAxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
        toolMaterial.customCraftingMaterial = getItemById(49);
    }

}