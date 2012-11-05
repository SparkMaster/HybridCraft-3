package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemIngot extends Item {
	public ItemIngot(int i) {
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
	}
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

	
	public String getTextureFile() {
		return "/hc/ingots.png";
	}
}