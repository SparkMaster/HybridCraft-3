package hybridcraft.common.FuelStuff;

import hybridcraft.common.FuelStuff.lib.OreCoal;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class HybridFuel implements IFuelHandler {
	public int getBurnTime(ItemStack fuel) {
		if (fuel.itemID == OreCoal.dirtCoal.shiftedIndex| fuel.itemID == OreCoal.cobbleCoal.shiftedIndex| fuel.itemID == HybridModFuelStuff.organicCoal.shiftedIndex) 
			return 500;
		if (fuel.itemID == OreCoal.ironCoal.shiftedIndex| fuel.itemID == OreCoal.goldCoal.shiftedIndex| fuel.itemID == OreCoal.diamondCoal.shiftedIndex) 
			return 1500;
		if (fuel.itemID == OreCoal.obsidianCoal.shiftedIndex| fuel.itemID == OreCoal.emeraldCoal.shiftedIndex) 
			return 3000;
		if (fuel.itemID == HybridModFuelStuff.bioCoal.shiftedIndex)
			return 15000;
		else 
			return 0;
	}
}