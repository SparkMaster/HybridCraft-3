package hybridcraft.common.managers;

import hybridcraft.common.core.AbstractCraftingManager;
import hybridcraft.common.mod.lib.ItemIngot;
import hybridcraft.common.handlers.*;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class HybridizingManager extends AbstractCraftingManager {

	private static final HybridizingManager instance = new HybridizingManager(true);

	public static HybridizingManager getInstance() {
		return instance;
	}

	public static Item dirtoneIngot;
	public static Item dironIngot;
	public static Item diroldIngot;
	public static Item dirmendIngot;
	public static Item stornIngot;
	public static Item stoldIngot;
	public static Item stomendIngot;
	public static Item iroldIngot;
	public static Item irmendIngot;
	public static Item gomendIngot;

	private HybridizingManager(boolean x) {

		// Ingot
		dirtoneIngot = new ItemIngot(ConfigHandler.dirtoneIngotID).setIconIndex(1).setItemName("dirtoneIngot");
		dironIngot = new ItemIngot(ConfigHandler.dironIngotID).setIconIndex(2).setItemName("dironIngot");
		diroldIngot = new ItemIngot(ConfigHandler.diroldIngotID).setIconIndex(3).setItemName("diroldIngot");
		dirmendIngot = new ItemIngot(ConfigHandler.dirmendIngotID).setIconIndex(4).setItemName("dirmendIngot");
		stornIngot = new ItemIngot(ConfigHandler.stornIngotID).setIconIndex(6).setItemName("stornIngot");
		stoldIngot = new ItemIngot(ConfigHandler.stoldIngotID).setIconIndex(7).setItemName("stoldIngot");
		stomendIngot = new ItemIngot(ConfigHandler.stomendIngotID).setIconIndex(8).setItemName("stormendIngot");
		iroldIngot = new ItemIngot(ConfigHandler.iroldIngotID).setIconIndex(9).setItemName("iroldIngot");
		irmendIngot = new ItemIngot(ConfigHandler.irmendIngotID).setIconIndex(10).setItemName("irmendIngot");
		gomendIngot = new ItemIngot(ConfigHandler.gomendIngotID).setIconIndex(11).setItemName("gomendIngot");


		System.out.println(this.recipes.size() + " recipes");
	}
}
