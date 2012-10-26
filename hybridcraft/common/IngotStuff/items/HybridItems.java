package hybridcraft.common.IngotStuff.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Item;
import hybridcraft.common.IngotStuff.lib.ItemIDs;

public class HybridItems 
{
	// Ingots
	public static Item dirtIngot;
	public static Item obsidianShard;
	public static Item obsidianIngot;
	public static Item sandIngot;
	
	public static void initItems()
	{
		// Ingots
		obsidianShard = new ItemIngot(ItemIDs.OBSIDIAN_SHARD).setIconIndex(12).setItemName("obsidianShard");
		obsidianIngot = new ItemIngot(ItemIDs.OBSIDIAN_INGOT).setIconIndex(13).setItemName("obsidianIngot");
		sandIngot = new ItemIngot(ItemIDs.SAND_INGOT).setIconIndex(14).setItemName("sandIngot");
		dirtIngot = new ItemIngot(ItemIDs.DIRT_INGOT).setIconIndex(0).setItemName("dirtIngot");
		
		// ingot
		LanguageRegistry.addName(obsidianShard, "Shard 'o Obsidian");
		LanguageRegistry.addName(obsidianIngot, "Obsidian Ingot");
		LanguageRegistry.addName(sandIngot, "Sand Ingot");
		LanguageRegistry.addName(dirtIngot, "Dirt Ingot");
	}
}
