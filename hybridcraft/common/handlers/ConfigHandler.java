package hybridcraft.common.handlers;

import java.io.File;
import net.minecraftforge.common.Property;
import net.minecraftforge.common.Configuration;
import hybridcraft.common.IngotStuff.lib.ItemIDs;

public class ConfigHandler
{
	
	private static Configuration config;
	
	public ConfigHandler(String fileLocation)
	{
		config =  new Configuration(new File(fileLocation));
	}
	public ConfigHandler(File file)
	{
		config =  new Configuration(file);
	}
	
	public static void loadConfig()
	{
		config.load();
		
		/*Load all ingot Ids */
		ItemIDs.OBSIDIAN_SHARD = config.getItem("obsidianShard", ItemIDs.OBSIDIAN_SHARD_DEFAULT).getInt();
		ItemIDs.OBSIDIAN_INGOT = config.getItem("obsidianIngot", ItemIDs.OBSIDIAN_INGOT_DEFAULT).getInt();
		ItemIDs.SAND_INGOT = config.getItem("sandIngot", ItemIDs.SAND_INGOT_DEFAULT).getInt();
		ItemIDs.DIRT_INGOT = config.getItem("dirtIngot", ItemIDs.DIRT_INGOT_DEFAULT).getInt();
		
		/*Load all tool Ids */
		
		//dirt
		ItemIDs.DIRT_AXE = config.getItem("dirtAxe", ItemIDs.DIRT_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_HOE = config.getItem("dirtHoe", ItemIDs.DIRT_HOE_DEFAULT).getInt();
		ItemIDs.DIRT_PICK = config.getItem("dirtPick", ItemIDs.DIRT_PICK_DEFAULT).getInt();
		ItemIDs.DIRT_SHOVEL = config.getItem("dirtShovel", ItemIDs.DIRT_SHOVEL_DEFAULT).getInt();
		ItemIDs.DIRT_SWORD = config.getItem("dirtSword", ItemIDs.DIRT_SWORD_DEFAULT).getInt();		
		//Dirt and diamond
		ItemIDs.DIRMEND_AXE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRMEND_HOE = config.getItem("dirmendHoe", ItemIDs.DIRMEND_HOE_DEFAULT).getInt();
		ItemIDs.DIRMEND_PICK = config.getItem("dirmendPick", ItemIDs.DIRMEND_PICK_DEFAULT).getInt();
		ItemIDs.DIRMEND_SHOVEL = config.getItem("dirmendShovel", ItemIDs.DIRMEND_SHOVEL_DEFAULT).getInt();
		ItemIDs.DIRMEND_SWORD = config.getItem("dirmendSword", ItemIDs.DIRMEND_SWORD_DEFAULT).getInt();		
		//dirt and gold
		ItemIDs.DIROLD_AXE = config.getItem("diroldAxe", ItemIDs.DIROLD_AXE_DEFAULT).getInt();
		ItemIDs.DIROLD_HOE = config.getItem("diroldHoe", ItemIDs.DIROLD_HOE_DEFAULT).getInt();
		ItemIDs.DIROLD_PICK = config.getItem("diroldPick", ItemIDs.DIROLD_PICK_DEFAULT).getInt();
		ItemIDs.DIROLD_SHOVEL = config.getItem("diroldShovel", ItemIDs.DIROLD_SHOVEL_DEFAULT).getInt();
		ItemIDs.DIROLD_SWORD = config.getItem("diroldSword", ItemIDs.DIROLD_SWORD_DEFAULT).getInt();
		//dirt and iron
		ItemIDs.DIRON_AXE = config.getItem("dironAxe", ItemIDs.DIRON_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_HOE = config.getItem("dironHoe", ItemIDs.DIRON_HOE_DEFAULT).getInt();
		ItemIDs.DIRON_PICK = config.getItem("dironPick", ItemIDs.DIRON_PICK_DEFAULT).getInt();
		ItemIDs.DIRON_SHOVEL = config.getItem("dironShovel", ItemIDs.DIRON_SHOVEL_DEFAULT).getInt();
		ItemIDs.DIRON_SWORD = config.getItem("dironSword", ItemIDs.DIRON_SWORD_DEFAULT).getInt();
		//STORN
		ItemIDs.STORN_AXE = config.getItem("stornAxe", ItemIDs.STORN_AXE_DEFAULT).getInt();
		ItemIDs.STORN_HOE = config.getItem("stornHoe", ItemIDs.STORN_HOE_DEFAULT).getInt();
		ItemIDs.STORN_PICK = config.getItem("stornPick", ItemIDs.STORN_PICK_DEFAULT).getInt();
		ItemIDs.STORN_SHOVEL = config.getItem("stornShovel", ItemIDs.STORN_SHOVEL_DEFAULT).getInt();
		ItemIDs.STORN_SWORD = config.getItem("stornSword", ItemIDs.STORN_SWORD_DEFAULT).getInt();
		//stold
		ItemIDs.STOLD_AXE = config.getItem("stoldAxe", ItemIDs.STOLD_AXE_DEFAULT).getInt();
		ItemIDs.STOLD_HOE = config.getItem("stoldHoe", ItemIDs.STOLD_HOE_DEFAULT).getInt();
		ItemIDs.STOLD_PICK = config.getItem("stoldPick", ItemIDs.STOLD_PICK_DEFAULT).getInt();
		ItemIDs.STOLD_SHOVEL = config.getItem("stoldShovel", ItemIDs.STOLD_SHOVEL_DEFAULT).getInt();
		ItemIDs.STOLD_SWORD = config.getItem("stoldSword", ItemIDs.STOLD_SWORD_DEFAULT).getInt();
		//STOMEND
		ItemIDs.STOMEND_AXE = config.getItem("stomendAxe", ItemIDs.STOMEND_AXE_DEFAULT).getInt();
		ItemIDs.STOMEND_HOE = config.getItem("stomendHoe", ItemIDs.STOMEND_HOE_DEFAULT).getInt();
		ItemIDs.STOMEND_PICK = config.getItem("stomendPick", ItemIDs.STOMEND_PICK_DEFAULT).getInt();
		ItemIDs.STOMEND_SHOVEL = config.getItem("stomendShovel", ItemIDs.STOMEND_SHOVEL_DEFAULT).getInt();
		ItemIDs.STOMEND_SWORD = config.getItem("stomendSword", ItemIDs.STOMEND_SWORD_DEFAULT).getInt();
		//IROLD
		ItemIDs.IROLD_AXE = config.getItem("iroldAxe", ItemIDs.IROLD_AXE_DEFAULT).getInt();
		ItemIDs.IROLD_HOE = config.getItem("iroldHoe", ItemIDs.IROLD_HOE_DEFAULT).getInt();
		ItemIDs.IROLD_PICK = config.getItem("iroldPick", ItemIDs.IROLD_PICK_DEFAULT).getInt();
		ItemIDs.IROLD_SHOVEL = config.getItem("iroldShovel", ItemIDs.IROLD_SHOVEL_DEFAULT).getInt();
		ItemIDs.IROLD_SWORD = config.getItem("iroldSword", ItemIDs.IROLD_SWORD_DEFAULT).getInt();
		//IRMEND
		ItemIDs.IRMEND_AXE = config.getItem("irmendAxe", ItemIDs.IROLD_AXE_DEFAULT).getInt();
		ItemIDs.IRMEND_HOE = config.getItem("irmendHoe", ItemIDs.IROLD_HOE_DEFAULT).getInt();
		ItemIDs.IRMEND_PICK = config.getItem("irmendPick", ItemIDs.IROLD_PICK_DEFAULT).getInt();
		ItemIDs.IRMEND_SHOVEL = config.getItem("irmendShovel", ItemIDs.IROLD_SHOVEL_DEFAULT).getInt();
		ItemIDs.IRMEND_SWORD = config.getItem("irmendSword", ItemIDs.IROLD_SWORD_DEFAULT).getInt();	
		//GOMEND
		ItemIDs.GOMEND_AXE = config.getItem("gomendAxe", ItemIDs.GOMEND_AXE_DEFAULT).getInt();
		ItemIDs.GOMEND_HOE = config.getItem("gomendHoe", ItemIDs.GOMEND_HOE_DEFAULT).getInt();
		ItemIDs.GOMEND_PICK = config.getItem("gomendPick", ItemIDs.GOMEND_PICK_DEFAULT).getInt();
		ItemIDs.GOMEND_SHOVEL = config.getItem("gomendShovel", ItemIDs.GOMEND_SHOVEL_DEFAULT).getInt();
		ItemIDs.GOMEND_SWORD = config.getItem("gomendSword", ItemIDs.GOMEND_SWORD_DEFAULT).getInt();
		//sand
		ItemIDs.SAND_AXE = config.getItem("sandAxe", ItemIDs.SAND_AXE_DEFAULT).getInt();
		ItemIDs.SAND_HOE = config.getItem("sandHoe", ItemIDs.SAND_HOE_DEFAULT).getInt();
		ItemIDs.SAND_PICK = config.getItem("sandPick", ItemIDs.SAND_PICK_DEFAULT).getInt();
		ItemIDs.SAND_SHOVEL = config.getItem("sandShovel", ItemIDs.SAND_SHOVEL_DEFAULT).getInt();
		ItemIDs.SAND_SWORD = config.getItem("sandSword", ItemIDs.SAND_SWORD_DEFAULT).getInt();		
		//obsidian
		ItemIDs.OBSIDIAN_AXE = config.getItem("obsidianAxe", ItemIDs.OBSIDIAN_AXE_DEFAULT).getInt();
		ItemIDs.OBSIDIAN_HOE = config.getItem("obsidianHoe", ItemIDs.OBSIDIAN_HOE_DEFAULT).getInt();
		ItemIDs.OBSIDIAN_PICK = config.getItem("obsidianPick", ItemIDs.OBSIDIAN_PICK_DEFAULT).getInt();
		ItemIDs.OBSIDIAN_SHOVEL = config.getItem("obsidianShovel", ItemIDs.OBSIDIAN_SHOVEL_DEFAULT).getInt();
		ItemIDs.OBSIDIAN_SWORD = config.getItem("obsidianSword", ItemIDs.OBSIDIAN_SWORD_DEFAULT).getInt();
		//emerald
		ItemIDs.EMERALD_AXE = config.getItem("emeraldAxe", ItemIDs.EMERALD_AXE_DEFAULT).getInt();
		ItemIDs.EMERALD_HOE = config.getItem("emeraldHoe", ItemIDs.EMERALD_HOE_DEFAULT).getInt();
		ItemIDs.EMERALD_PICK = config.getItem("emeraldPick", ItemIDs.EMERALD_PICK_DEFAULT).getInt();
		ItemIDs.EMERALD_SHOVEL = config.getItem("emeraldShovel", ItemIDs.EMERALD_SHOVEL_DEFAULT).getInt();
		ItemIDs.EMERALD_SWORD = config.getItem("emeraldSword", ItemIDs.EMERALD_SWORD_DEFAULT).getInt();
		
		config.save();
		
	}
	
	public Configuration getInstance()
	{
		return config;
		
	}
}
