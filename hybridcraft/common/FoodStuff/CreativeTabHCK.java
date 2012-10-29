package hybridcraft.common.FoodStuff;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class CreativeTabHCK extends CreativeTabs {

	public CreativeTabHCK(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {
        return hybridcraft.common.FoodStuff.HybridModFoodStuff.counter.blockID;
    }

}