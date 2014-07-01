package com.suhnday.extratools.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class EmereraldBrickStairs extends BlockStairs {

    public EmereraldBrickStairs(Block blockToLookLike, int UNKOWN) {
        super(blockToLookLike, UNKOWN);
    }

    @Override
    public boolean getUseNeighborBrightness() {
        return true;
    }
}