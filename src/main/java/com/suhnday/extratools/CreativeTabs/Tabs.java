package com.suhnday.extratools.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class Tabs {
    // List
    public static final List<CreativeTabs> tabList = new ArrayList<CreativeTabs>();
    // Tabs
    public static CreativeTabs tabTool;
    public static CreativeTabs tabArmor;
    public static CreativeTabs tabBlock;

    // Methods
    public static void createTabs() {
//	Tabs
        tabTool = new TabTools(CreativeTabs.getNextID(), "tabTools");
        tabArmor = new TabArmor(CreativeTabs.getNextID(), "tabArmor");
        tabBlock = new TabBlock(CreativeTabs.getNextID(), "tabBlock");
//	List
        addTabToList();
    }

    private static void addTabToList() {
//	Tabs
        tabList.add(tabTool);
        tabList.add(tabArmor);
        tabList.add(tabBlock);
    }
}
