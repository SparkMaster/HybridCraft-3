package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class Sandwich extends ItemFood {

	public Sandwich(int par1, int healAmount, float par3, boolean par4) {
		super(par1, healAmount, par3, false);
		this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

	public String getTextureFile() {
		return "/hc/sandwich.png";
	}

	public Sandwich(int itemID, int healAmount) {
		this(itemID, healAmount, 0.6F, false);
	}
}