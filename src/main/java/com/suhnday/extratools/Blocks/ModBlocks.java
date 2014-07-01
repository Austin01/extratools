package com.suhnday.extratools.Blocks;

import com.suhnday.extratools.CreativeTabs.Tabs;
import com.suhnday.extratools.Utils.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    //Item List
    public static final List<Block> blockList = new ArrayList<Block>();
    //Brick
    public static Block emeraldBrick;
    public static Block emeraldBrickMossy;
    public static Block emeraldBrickCracked;
    public static Block emeraldBrickChiseled;
    //Stairs
    public static Block emeraldBrickStairs;
    //Slabs
    public static BlockSlab emeraldBrickSlab;
    public static BlockSlab emeraldBrickSlabDouble;

    //Methods
    public static void createBlocks() {
// 	Brick
        emeraldBrick = new EmeraldBrick(Material.rock).setBlockName("emeraldBrick").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick").setCreativeTab(Tabs.tabBlock);
        emeraldBrickChiseled = new EmeraldBrick(Material.rock).setBlockName("emeraldBrickChiseled").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick_carved").setCreativeTab(Tabs.tabBlock);
        emeraldBrickCracked = new EmeraldBrick(Material.rock).setBlockName("emeraldBrickCracked").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick_cracked").setCreativeTab(Tabs.tabBlock);
        emeraldBrickMossy = new EmeraldBrick(Material.rock).setBlockName("emeraldBrickMossy").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick_mossy").setCreativeTab(Tabs.tabBlock);
//	Stairs
        emeraldBrickStairs = new EmereraldBrickStairs(emeraldBrick, 0).setBlockName("emeraldBrickStairs").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick").setCreativeTab(Tabs.tabBlock);
//	Slabs
        emeraldBrickSlab = (BlockSlab) new EmeraldBrickSlab(false, Material.rock).setBlockName("emeraldBrickSlab").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick").setCreativeTab(Tabs.tabBlock);
        emeraldBrickSlabDouble = (BlockSlab) new EmeraldBrickSlab(true, Material.rock).setBlockName("emeraldBrickSlabDouble").setBlockTextureName(Strings.MOD_ID + ":" + "emerald_brick").setCreativeTab(Tabs.tabBlock);
// 	List
        addBlocksToList();
        registerBlocks();
    }

    public static void registerBlocks() {
        for (Block b : blockList) {
            GameRegistry.registerBlock(b, b.getUnlocalizedName());
        }
    }

    private static void addBlocksToList() {
// Brick
        blockList.add(emeraldBrick);
        blockList.add(emeraldBrickChiseled);
        blockList.add(emeraldBrickCracked);
        blockList.add(emeraldBrickMossy);
//	Slabs
        blockList.add(emeraldBrickSlab);
        blockList.add(emeraldBrickSlabDouble);
//	Stairs
        blockList.add(emeraldBrickStairs);
    }
}
