package hybridcraft.common.managers;

import net.minecraft.src.*;
import hybridcraft.common.core.AbstractCraftingManager;
import hybridcraft.common.mod.lib.ItemIngot;
import cpw.mods.fml.common.registry.*;

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
		dirtoneIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.dirtoneIngotID).setIconIndex(1).setItemName("dirtoneIngot");
		dironIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.dironIngotID).setIconIndex(2).setItemName("dironIngot");
		diroldIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.diroldIngotID).setIconIndex(3).setItemName("diroldIngot");
		dirmendIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.dirmendIngotID).setIconIndex(4).setItemName("dirmendIngot");
		stornIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.stornIngotID).setIconIndex(6).setItemName("stornIngot");
		stoldIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.stoldIngotID).setIconIndex(7).setItemName("stoldIngot");
		stomendIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.stomendIngotID).setIconIndex(8).setItemName("stormendIngot");
		iroldIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.iroldIngotID).setIconIndex(9).setItemName("iroldIngot");
		irmendIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.irmendIngotID).setIconIndex(10).setItemName("irmendIngot");
		gomendIngot = new ItemIngot(hybridcraft.common.handlers.ConfigHandler.gomendIngotID).setIconIndex(11).setItemName("gomendIngot");

		// Ingot Registry
		LanguageRegistry.addName(dirtoneIngot, "Dirtone Ingot");
		LanguageRegistry.addName(dironIngot, "Diron Ingot");
		LanguageRegistry.addName(diroldIngot, "Dirold Ingot");
		LanguageRegistry.addName(dirmendIngot, "Dirmend Ingot");
		LanguageRegistry.addName(stornIngot, "Storn Ingot");
		LanguageRegistry.addName(stoldIngot, "Stold Ingot");
		LanguageRegistry.addName(stomendIngot, "Stomend Ingot");
		LanguageRegistry.addName(iroldIngot, "Irold Ingot");
		LanguageRegistry.addName(irmendIngot, "Irmend Ingot");
		LanguageRegistry.addName(gomendIngot, "Gomend Ingot");

		// Ingot Recipes
		this.addRecipe(new ItemStack(dirtoneIngot), new Object[] { "XXX", "SSS", "XXX", 'X', Block.dirt, 'S', Block.stone, });
		this.addRecipe(new ItemStack(dironIngot), new Object[] { "XXX", "XIX", "XXX", 'X', Block.dirt, 'I', Item.ingotIron, });
		this.addRecipe(new ItemStack(diroldIngot), new Object[] { "XXX", "XGX", "XXX", 'X', Block.dirt, 'G', Item.ingotGold, });
		this.addRecipe(new ItemStack(dirmendIngot), new Object[] { "XXX", "XDX", "XXX", 'X', Block.dirt, 'D', Item.diamond, });
		this.addRecipe(new ItemStack(stornIngot), new Object[] { "XXX", "XIX", "XXX", 'X', Block.stone, 'I', Item.ingotIron, });
		this.addRecipe(new ItemStack(stoldIngot), new Object[] { "XXX", "XGX", "XXX", 'X', Block.stone, 'G', Item.ingotGold, });
		this.addRecipe(new ItemStack(stomendIngot), new Object[] { "XXX", "XDX", "XXX", 'X', Block.stone, 'D', Item.diamond, });
		this.addRecipe(new ItemStack(iroldIngot), new Object[] { "GXG", "XGX", "GXG", 'X', Item.ingotIron, 'G', Item.ingotGold, });
		this.addRecipe(new ItemStack(irmendIngot), new Object[] { "XXX", "XDX", "XXX", 'X', Item.ingotIron, 'D', Item.diamond, });
		this.addRecipe(new ItemStack(gomendIngot), new Object[] { "GGG", "GDG", "GGG", 'D', Item.diamond, 'G', Item.ingotGold, });
		System.out.println(this.recipes.size() + " recipes");
	}
}
