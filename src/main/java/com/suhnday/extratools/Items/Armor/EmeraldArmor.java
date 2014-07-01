package com.suhnday.extratools.Items.Armor;


import com.suhnday.extratools.Items.ModItems;
import com.suhnday.extratools.Utils.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EmeraldArmor extends ItemArmor {
    public final ArmorMaterial material;

    public EmeraldArmor(ArmorMaterial armorMaterial, int armorSlot,
                        int renderIndex) {
        super(armorMaterial, armorSlot, renderIndex);

        this.material = armorMaterial;
        armorMaterial.customCraftingMaterial = Items.emerald;
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  String stype) {
        if (stack.getItem() == ModItems.emeraldHelmet
                || stack.getItem() == ModItems.emeraldChestplate
                || stack.getItem() == ModItems.emeraldBoots) {
            return Strings.MOD_ID + ":textures/models/armor/"
                    + material.name().toLowerCase() + "_layer_1.png";
        }
        if (stack.getItem() == ModItems.emeraldLeggings) {
            return Strings.MOD_ID + ":textures/models/armor/"
                    + material.name().toLowerCase() + "_layer_2.png";
        } else {
            return null;
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world,
                                      EntityPlayer player) {
        int i = EntityLiving.getArmorPosition(stack) - 1;
        ItemStack currentArmor = player.getCurrentArmor(i);

        if (currentArmor == null) {
            player.setCurrentItemOrArmor(i + 1, stack.copy());
            stack.stackSize = 0;
        }

        return stack;
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack,
                                   ItemStack par2ItemStack) {
        return isRepairable();
    }

    @Override
    public boolean isRepairable() {
        return true;
    }


}