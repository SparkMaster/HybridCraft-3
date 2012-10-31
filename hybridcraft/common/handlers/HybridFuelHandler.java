package hybridcraft.common.handlers;

import hybridcraft.common.core.lib.OreCoal;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class HybridFuelHandler implements IFuelHandler {
	public int getBurnTime(ItemStack fuel) {
		if (fuel.itemID == OreCoal.dirtCoal.shiftedIndex| fuel.itemID == OreCoal.cobbleCoal.shiftedIndex| fuel.itemID == hybridcraft.common.mod.Hybridcraft.organicCoal.shiftedIndex) 
			return 500;
		if (fuel.itemID == OreCoal.ironCoal.shiftedIndex| fuel.itemID == OreCoal.goldCoal.shiftedIndex| fuel.itemID == OreCoal.diamondCoal.shiftedIndex) 
			return 1500;
		if (fuel.itemID == OreCoal.obsidianCoal.shiftedIndex| fuel.itemID == OreCoal.emeraldCoal.shiftedIndex) 
			return 3000;
		if (fuel.itemID == hybridcraft.common.mod.Hybridcraft.bioCoal.shiftedIndex)
			return 15000;
		else 
			return 0;
	}
}