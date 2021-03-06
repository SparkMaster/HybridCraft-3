package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class CreativeTabHCM extends CreativeTabs {

	public CreativeTabHCM(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

	
	
	@SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return hybridcraft.common.managers.HybridizingManager.gomendIngot.shiftedIndex;
    }

}