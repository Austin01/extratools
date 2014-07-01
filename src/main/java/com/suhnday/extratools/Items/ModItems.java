package com.suhnday.extratools.Items;

import com.suhnday.extratools.CreativeTabs.Tabs;
import com.suhnday.extratools.Items.Armor.EmeraldArmor;
import com.suhnday.extratools.Items.Armor.ObsidianArmor;
import com.suhnday.extratools.Items.Tools.*;
import com.suhnday.extratools.Items.Weapons.EmeraldSword;
import com.suhnday.extratools.Items.Weapons.ObsidianSword;
import com.suhnday.extratools.MainRegistry;
import com.suhnday.extratools.Utils.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    //Item List
    public static final List<Item> itemList = new ArrayList<Item>();
    //Armor
    public static Item emeraldHelmet;
    public static Item emeraldChestplate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;
    public static Item obsidianHelmet;
    public static Item obsidianChestplate;
    public static Item obsidianLeggings;
    public static Item obsidianBoots;

    //Tools
    public static Item emeraldPickaxe;
    public static Item emeraldAxe;
    public static Item emeraldSpade;
    public static Item emeraldHoe;

    public static Item obsidianPickaxe;
    public static Item obsidianAxe;
    public static Item obsidianSpade;
    public static Item obsidianHoe;

    //Weapons
    public static Item emeraldSword;
    public static Item obsidianSword;

    //Material
    public static ArmorMaterial emeraldArmorSet = EnumHelper.addArmorMaterial("EMERALD", 46, new int[]{3, 8, 7, 3}, 1);
    public static ToolMaterial emeraldToolset = EnumHelper.addToolMaterial("EMERALD", 4, 450, 6.5F, 0, 1);
    public static ToolMaterial obsidianToolset = EnumHelper.addToolMaterial("OBSIDIAN", 4, 600, 2, 1, 1);
    public static ArmorMaterial obsidianArmorSet = EnumHelper.addArmorMaterial("OBSIDIAN", 56, new int[]{4, 10, 9, 4}, 0);
//Methods

    public static void createItems() {
//	Armor
        emeraldHelmet = new EmeraldArmor(emeraldArmorSet, MainRegistry.proxy.addArmor("EMERALD"), 0).setUnlocalizedName(emeraldArmorSet.name().toLowerCase() + "Helmet").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + emeraldArmorSet.name().toLowerCase() + "_helmet").setCreativeTab(Tabs.tabArmor);
        emeraldChestplate = new EmeraldArmor(emeraldArmorSet, MainRegistry.proxy.addArmor("EMERALD"), 1).setUnlocalizedName(emeraldArmorSet.name().toLowerCase() + "Chestplate").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + emeraldArmorSet.name().toLowerCase() + "_chestplate").setCreativeTab(Tabs.tabArmor);
        emeraldLeggings = new EmeraldArmor(emeraldArmorSet, MainRegistry.proxy.addArmor("EMERALD"), 2).setUnlocalizedName(emeraldArmorSet.name().toLowerCase() + "Leggings").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + emeraldArmorSet.name().toLowerCase() + "_leggings").setCreativeTab(Tabs.tabArmor);
        emeraldBoots = new EmeraldArmor(emeraldArmorSet, MainRegistry.proxy.addArmor("EMERALD"), 3).setUnlocalizedName(emeraldArmorSet.name().toLowerCase() + "Boots").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + emeraldArmorSet.name().toLowerCase() + "_boots").setCreativeTab(Tabs.tabArmor);

        obsidianHelmet = new ObsidianArmor(obsidianArmorSet, MainRegistry.proxy.addArmor("OBSIDIAN"), 0).setUnlocalizedName(obsidianArmorSet.name().toLowerCase() + "Helmet").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + obsidianArmorSet.name().toLowerCase() + "_helmet").setCreativeTab(Tabs.tabArmor);
        obsidianChestplate = new ObsidianArmor(obsidianArmorSet, MainRegistry.proxy.addArmor("OBSIDIAN"), 1).setUnlocalizedName(obsidianArmorSet.name().toLowerCase() + "Chestplate").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + obsidianArmorSet.name().toLowerCase() + "_chestplate").setCreativeTab(Tabs.tabArmor);
        obsidianLeggings = new ObsidianArmor(obsidianArmorSet, MainRegistry.proxy.addArmor("OBSIDIAN"), 2).setUnlocalizedName(obsidianArmorSet.name().toLowerCase() + "Leggings").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + obsidianArmorSet.name().toLowerCase() + "_leggings").setCreativeTab(Tabs.tabArmor);
        obsidianBoots = new ObsidianArmor(obsidianArmorSet, MainRegistry.proxy.addArmor("OBSIDIAN"), 3).setUnlocalizedName(obsidianArmorSet.name().toLowerCase() + "Boots").setMaxStackSize(1).setTextureName(Strings.MOD_ID + ":" + obsidianArmorSet.name().toLowerCase() + "_boots").setCreativeTab(Tabs.tabArmor);



// 	Tools
        emeraldPickaxe = new EmeraldPickaxe(emeraldToolset).setMaxStackSize(1).setUnlocalizedName(emeraldToolset.name().toLowerCase() + "Pickaxe").setTextureName(Strings.MOD_ID + ":" + emeraldToolset.name().toLowerCase() + "_pickaxe").setCreativeTab(Tabs.tabTool);
        emeraldAxe = new EmeraldAxe(emeraldToolset).setMaxStackSize(1).setUnlocalizedName(emeraldToolset.name().toLowerCase() + "Axe").setTextureName(Strings.MOD_ID + ":" + emeraldToolset.name().toLowerCase() + "_axe").setCreativeTab(Tabs.tabTool);
        emeraldSpade = new EmeraldSpade(emeraldToolset).setMaxStackSize(1).setUnlocalizedName(emeraldToolset.name().toLowerCase() + "Shovel").setTextureName(Strings.MOD_ID + ":" + emeraldToolset.name().toLowerCase() + "_shovel").setCreativeTab(Tabs.tabTool);
        emeraldHoe = new EmeraldHoe(emeraldToolset).setMaxStackSize(1).setUnlocalizedName(emeraldToolset.name().toLowerCase() + "Hoe").setTextureName(Strings.MOD_ID + ":" + emeraldToolset.name().toLowerCase() + "_hoe").setCreativeTab(Tabs.tabTool);

        obsidianPickaxe = new ObsidianPickaxe(obsidianToolset).setMaxStackSize(1).setUnlocalizedName(obsidianToolset.name().toLowerCase() + "Pickaxe").setTextureName(Strings.MOD_ID + ":" + obsidianToolset.name().toLowerCase() + "_pickaxe").setCreativeTab(Tabs.tabTool);
        obsidianAxe = new ObsidianAxe(obsidianToolset).setMaxStackSize(1).setUnlocalizedName(obsidianToolset.name().toLowerCase() + "Axe").setTextureName(Strings.MOD_ID + ":" + obsidianToolset.name().toLowerCase() + "_axe").setCreativeTab(Tabs.tabTool);
        obsidianSpade = new ObsidianSpade(obsidianToolset).setMaxStackSize(1).setUnlocalizedName(obsidianToolset.name().toLowerCase() + "Shovel").setTextureName(Strings.MOD_ID + ":" + obsidianToolset.name().toLowerCase() + "_shovel").setCreativeTab(Tabs.tabTool);
        obsidianHoe = new ObsidianHoe(obsidianToolset).setMaxStackSize(1).setUnlocalizedName(obsidianToolset.name().toLowerCase() + "Hoe").setTextureName(Strings.MOD_ID + ":" + obsidianToolset.name().toLowerCase() + "_hoe").setCreativeTab(Tabs.tabTool);

// 	Weapons
        emeraldSword = new EmeraldSword(emeraldToolset).setMaxStackSize(1).setUnlocalizedName(emeraldToolset.name().toLowerCase() + "Sword").setTextureName(Strings.MOD_ID + ":" + emeraldToolset.name().toLowerCase() + "_sword").setCreativeTab(Tabs.tabTool);
        obsidianSword = new ObsidianSword(obsidianToolset).setMaxStackSize(1).setUnlocalizedName(obsidianToolset.name().toLowerCase() + "Sword").setTextureName(Strings.MOD_ID + ":" + obsidianToolset.name().toLowerCase() + "_sword").setCreativeTab(Tabs.tabTool);

// 	List
        addItemsToList();
        registerItems();
    }

    public static void registerItems() {
        for (Item i : itemList) {
            GameRegistry.registerItem(i, i.getUnlocalizedName());
        }
    }

    private static void addItemsToList() {
// Armor
        itemList.add(emeraldHelmet);
        itemList.add(emeraldChestplate);
        itemList.add(emeraldLeggings);
        itemList.add(emeraldBoots);

        itemList.add(obsidianHelmet);
        itemList.add(obsidianChestplate);
        itemList.add(obsidianLeggings);
        itemList.add(obsidianBoots);

// Tools
        itemList.add(emeraldPickaxe);
        itemList.add(emeraldAxe);
        itemList.add(emeraldSpade);
        itemList.add(emeraldHoe);

        itemList.add(obsidianPickaxe);
        itemList.add(obsidianAxe);
        itemList.add(obsidianSpade);
        itemList.add(obsidianHoe);

// Weapons
        itemList.add(emeraldSword);
        itemList.add(obsidianSword);
    }
}
