package com.suhnday.extratools.Items.Tools;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class EmeraldHoe extends Item {
    protected ToolMaterial theToolMaterial;

    public EmeraldHoe(ToolMaterial par2EnumToolMaterial) {
        super();
        this.theToolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        par2EnumToolMaterial.customCraftingMaterial = Items.emerald;
    }

    @Deprecated
    public EmeraldHoe(int par1, ToolMaterial par2EnumToolMaterial) {
        super();
        this.theToolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        par2EnumToolMaterial.customCraftingMaterial = Items.emerald;
    }

    /**
     * Callback for item usage. If the item does something special on right
     * clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not
     * BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack,
                             EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
                             int par6, int par7, float par8, float par9, float par10) {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7,
                par1ItemStack)) {
            return false;
        } else {
            UseHoeEvent event = new UseHoeEvent(par2EntityPlayer,
                    par1ItemStack, par3World, par4, par5, par6);
            if (MinecraftForge.EVENT_BUS.post(event)) {
                return false;
            }

            if (event.getResult() == Result.ALLOW) {
                par1ItemStack.damageItem(1, par2EntityPlayer);
                return true;
            }

            Block i1 = par3World.getBlock(par4, par5, par6);
            boolean air = par3World.isAirBlock(par4, par5 + 1, par6);

            if (par7 != 0 && air
                    && (i1 == Blocks.grass || i1 == Blocks.dirt)) {
                Block block = Blocks.farmland;
                par3World.playSoundEffect((double) ((float) par4 + 0.5F),
                        (double) ((float) par5 + 0.5F),
                        (double) ((float) par6 + 0.5F),
                        block.stepSound.getBreakSound(),
                        (block.stepSound.getVolume() + 1.0F) / 2.0F,
                        block.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote) {
                    return true;
                } else {
                    par3World.setBlock(par4, par5, par6, block);
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @SideOnly(Side.CLIENT)
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D() {
        return true;
    }

    /**
     * Returns the name of the material this tool is made from as it is declared
     * in EnumToolMaterial (meaning diamond
     * would return "EMERALD")
     */
    public String getMaterialName() {
        return this.theToolMaterial.toString();
    }
}