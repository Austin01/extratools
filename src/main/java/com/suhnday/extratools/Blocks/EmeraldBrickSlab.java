package com.suhnday.extratools.Blocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.Random;

public class EmeraldBrickSlab extends BlockSlab {

    public static final String[] slabType = new String[]{"emerald"};

    private boolean isDouble;

    public EmeraldBrickSlab(boolean isDouble, Material material) {
        super(isDouble, material);

        this.isDouble = isDouble;
    }

    @Override
    public String func_150002_b(int var1) {
        if (var1 < 0 || var1 >= slabType.length) {
            var1 = 0;
        }

        return super.getUnlocalizedName() + "." + slabType[var1];
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(ModBlocks.emeraldBrickSlab);
    }

    @Override
    public boolean getUseNeighborBrightness() {
        return isDouble == false ? true : false;
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        boolean isCreative = Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode;

        if (isCreative) {
            if (isDouble) {
                return new ItemStack(ModBlocks.emeraldBrickSlabDouble);
            } else {
                return new ItemStack(ModBlocks.emeraldBrickSlab);
            }
        } else {
            return new ItemStack(ModBlocks.emeraldBrickSlab);
        }
    }

    public ItemStack createStackedBlock(int subType) {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.emeraldBrickSlab), 2, subType & 7);
    }
}
