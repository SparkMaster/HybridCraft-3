package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockStove extends Block {

	public BlockStove(int par1) {
		super(par1,Material.wood);
        this.blockIndexInTexture = 0;
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		
	
	
	@SideOnly(Side.CLIENT)

	// Display gui if next to counter
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
		if ((par1World.getBlockId(par2, par3, par4) != hybridcraft.common.mod.init.Blocks.stove.blockID ? false : par5EntityPlayer.getDistanceSq((double) par2 + 0.5D, (double) par3 + 0.5D, (double) par4 + 0.5D) <= 64.0D  && (par1World.getBlockId(par2 + 1, par3, par4) == hybridcraft.common.mod.init.Blocks.counter.blockID || par1World.getBlockId(par2 - 1, par3, par4) == hybridcraft.common.mod.init.Blocks.counter.blockID || par1World.getBlockId(par2, par3, par4 + 1) == hybridcraft.common.mod.init.Blocks.counter.blockID || par1World.getBlockId(par2, par3, par4 - 1) == hybridcraft.common.mod.init.Blocks.counter.blockID))) {
			par5EntityPlayer.openGui(hybridcraft.common.mod.Hybridcraft.instance, 0, par1World, par2, par3, par4);
			return true;
		}
		return false;
	}
	
	@Override
	public int getBlockTextureFromSide(int par1) {
		switch (par1) {
		case 1:
			return 6;
		default:
			return 0;
		}
	}

    public String getTextureFile()  {
            return "/hc/kitchen.png";
    }
}
