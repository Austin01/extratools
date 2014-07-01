package com.suhnday.extratools.Recipes;

import com.suhnday.extratools.Blocks.ModBlocks;
import com.suhnday.extratools.Items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {

    public static void registerArmorRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldHelmet), new Object[]{"EEE", "E E", 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldChestplate), new Object[]{"E E", "EEE", "EEE", 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldLeggings), new Object[]{"EEE", "E E", "E E", 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldBoots), new Object[]{"E E", "E E", 'E', Items.emerald});

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelmet), new Object[]{"EEE", "E E", 'E', Block.getBlockById(49)});
    }

    public static void registerToolRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldPickaxe), new Object[]{"EEE", " S ", " S ", 'S', Items.stick, 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldAxe), new Object[]{"EE ", "ES ", " S ", 'S', Items.stick, 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldSpade), new Object[]{" E ", " S ", " S ", 'S', Items.stick, 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldHoe), new Object[]{"EE ", " S ", " S ", 'S', Items.stick, 'E', Items.emerald});
    }

    public static void registerBlockRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldBrick, 4), new Object[]{"##", "##", '#', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldBrickChiseled, 4), new Object[]{"##", "##", '#', ModBlocks.emeraldBrickMossy});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldBrickCracked, 4), new Object[]{"##", "##", '#', ModBlocks.emeraldBrick});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldBrickMossy, 4), new Object[]{"##", "##", '#', ModBlocks.emeraldBrickCracked});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldBrickSlab, 6), new Object[]{"###", '#', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.emeraldBrickStairs, 4), new Object[]{"#  ", "## ", "###", '#', Items.emerald});
    }

    public static void registerWeaponRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldSword), new Object[]{"E", "E", "S", 'S', Items.stick, 'E', Items.emerald});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), new Object[]{"O", "O", "S", 'S', Items.stick, 'O', Block.getBlockById(49)});
    }
}
