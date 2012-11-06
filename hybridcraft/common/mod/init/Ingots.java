package hybridcraft.common.mod.init;

import hybridcraft.common.handlers.ConfigHandler;
import hybridcraft.common.mod.lib.ItemIngot;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
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
		obsidianShard = new ItemIngot(ConfigHandler.obsidianShardID).setIconIndex(12).setItemName("obsidianShard");
		obsidianIngot = new ItemIngot(ConfigHandler.obsidianIngotID).setIconIndex(13).setItemName("obsidianIngot");
		sandIngot = new ItemIngot(ConfigHandler.sandIngotID).setIconIndex(14).setItemName("sandIngot");
		dirtIngot = new ItemIngot(ConfigHandler.dirtIngotID).setIconIndex(0).setItemName("dirtIngot");
	}
	
	

}
