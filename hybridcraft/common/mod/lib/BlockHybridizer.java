package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.*;

public class BlockHybridizer extends BlockWorkbench {

	public BlockHybridizer(int par1) {
		super(par1);
		this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		if (par1World.isRemote) {
			return true;
		} else {
			par5EntityPlayer.openGui(Hybridcraft.instance, 0, par1World, par2, par3, par4);
			return true;
		}
	}

	@Override
	public int getBlockTextureFromSide(int par1) {
		switch (par1) {
		case 0:
		case 1:
			return 14;
		default:
			return 13;
		}
	}

	public String getTextureFile() {
		return "/hc/blocks.png";
	}

}
