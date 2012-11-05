package hybridcraft.common.containers;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;
import hybridcraft.common.managers.StoveManager;

public class ContainerStove extends ContainerWorkbench {

	private World worldObj;
	private int posX;
	private int posY;
	private int posZ;

	public ContainerStove(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
		super(par1InventoryPlayer, par2World, par3, par4, par5);
		this.worldObj = par2World;
		this.posX = par3;
		this.posY = par4;
		this.posZ = par5;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		
	@Override
	public void onCraftMatrixChanged(IInventory par1IInventory) {
		this.craftResult.setInventorySlotContents(0, StoveManager.getInstance().findMatchingRecipe(this.craftMatrix));
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
		return this.worldObj.getBlockId(this.posX, this.posY, this.posZ) != hybridcraft.common.mod.init.Blocks.stove.blockID ? false : par1EntityPlayer.getDistanceSq((double) this.posX + 0.5D, (double) this.posY + 0.5D, (double) this.posZ + 0.5D) <= 64.0D && (this.worldObj.getBlockId(this.posX + 1, this.posY, this.posZ) == hybridcraft.common.mod.init.Blocks.counter.blockID || this.worldObj.getBlockId(this.posX - 1, this.posY, this.posZ) == hybridcraft.common.mod.init.Blocks.counter.blockID || this.worldObj.getBlockId(this.posX, this.posY, this.posZ + 1) == hybridcraft.common.mod.init.Blocks.counter.blockID || this.worldObj.getBlockId(this.posX, this.posY, this.posZ - 1) == hybridcraft.common.mod.init.Blocks.counter.blockID);
	}
}
