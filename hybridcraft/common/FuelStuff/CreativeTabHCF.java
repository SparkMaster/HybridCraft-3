package hybridcraft.common.FuelStuff;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class CreativeTabHCF extends CreativeTabs {

	public CreativeTabHCF(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return hybridcraft.common.FuelStuff.lib.OreCoal.emeraldCoal.shiftedIndex;
    }

}