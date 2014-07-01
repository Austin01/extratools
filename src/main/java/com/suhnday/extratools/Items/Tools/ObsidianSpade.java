package com.suhnday.extratools.Items.Tools;

import net.minecraft.item.ItemSpade;

/**
 * Created by Austin on 6/30/2014.
 */
public class ObsidianSpade extends ItemSpade {

    public ObsidianSpade(ToolMaterial toolMaterial) {
        super(toolMaterial);
        toolMaterial.customCraftingMaterial = getItemById(49);
    }

}