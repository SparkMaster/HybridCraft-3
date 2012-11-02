package hybridcraft.common.mod.init;

import hybridcraft.common.mod.lib.ItemIngot;
import hybridcraft.common.handlers.IDHandler;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Ingots {
	
	public static Item dirtIngot;
	public static Item obsidianShard;
	public static Item obsidianIngot;
	public static Item sandIngot;
	
	public static void initItems()
	{
		// Ingots
		obsidianShard = new ItemIngot(hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHARD).setIconIndex(12).setItemName("obsidianShard");
		obsidianIngot = new ItemIngot(hybridcraft.common.handlers.IDHandler.OBSIDIAN_INGOT).setIconIndex(13).setItemName("obsidianIngot");
		sandIngot = new ItemIngot(hybridcraft.common.handlers.IDHandler.SAND_INGOT).setIconIndex(14).setItemName("sandIngot");
		dirtIngot = new ItemIngot(hybridcraft.common.handlers.IDHandler.DIRT_INGOT).setIconIndex(0).setItemName("dirtIngot");
		
		// ingot
		LanguageRegistry.addName(obsidianShard, "Shard 'o Obsidian");
		LanguageRegistry.addName(obsidianIngot, "Obsidian Ingot");
		LanguageRegistry.addName(sandIngot, "Sand Ingot");
		LanguageRegistry.addName(dirtIngot, "Dirt Ingot");
		
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.obsidianShard, 12), new Object[] { new ItemStack(Block.obsidian), new ItemStack(Item.pickaxeDiamond) });
		GameRegistry.addRecipe(new ItemStack(Ingots.sandIngot), new Object[] { "SSS", "SSS", "SSS", 'S', Block.sand });
		GameRegistry.addRecipe(new ItemStack(Ingots.dirtIngot), new Object[] { "XXX", "XXX", "XXX", 'X', Block.dirt });		
		GameRegistry.addSmelting(Ingots.obsidianShard.shiftedIndex,new ItemStack(Ingots.obsidianIngot, 1), 2F);

	}

}
