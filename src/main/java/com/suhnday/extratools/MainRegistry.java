package com.suhnday.extratools;

import com.suhnday.extratools.Blocks.ModBlocks;
import com.suhnday.extratools.CreativeTabs.Tabs;
import com.suhnday.extratools.Items.ModItems;
import com.suhnday.extratools.Proxy.ClientProxy;
import com.suhnday.extratools.Proxy.IProxy;
import com.suhnday.extratools.Recipes.CraftingManager;
import com.suhnday.extratools.Utils.Strings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;


@Mod(modid = Strings.MOD_ID, version = Strings.MOD_VERSION, name = Strings.MOD_NAME, modLanguage = Strings.MOD_LANG, acceptedMinecraftVersions = Strings.MC_VERSION)
//@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MainRegistry {

    @SidedProxy(clientSide = Strings.CLIENT_PROXY_CLASS, serverSide = Strings.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler //Loads While Minecraft Starts
    public void load(FMLInitializationEvent event) {
        Tabs.createTabs();
    }

    @EventHandler //Loads When World Loads
    public void postLoad(FMLPostInitializationEvent event) {

    }

    @EventHandler //Loads First
    public void preLoad(FMLPostInitializationEvent event) {
        ModBlocks.createBlocks();
        ModItems.createItems();

        CraftingManager.registerArmorRecipes();
        CraftingManager.registerToolRecipes();
        CraftingManager.registerWeaponRecipes();
        CraftingManager.registerBlockRecipes();
    }
}
