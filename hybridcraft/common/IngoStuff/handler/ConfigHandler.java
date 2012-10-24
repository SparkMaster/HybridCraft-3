package hybridcraft.common.IngoStuff.handler;

import java.io.File;
import net.minecraftforge.common.Property;
import net.minecraftforge.common.Configuration;
import hybridcraft.common.IngotStuff.lib.ItemIDs;

class ConfigHandler
{
	
	private static Configuration config;
	
	public ConfigHandler(String fileLocation)
	{
		config =  new Configuration(new File(fileLocation));
	}
	
	public static void loadConfig()
	{
		config.load();
		
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
		ItemIDs.DIRON_AXE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_HOE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_PICK = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_SHOVEL = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_SWORD = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		//dirt
		ItemIDs.DIRT_AXE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_HOE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_PICK = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_SHOVEL = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_SWORD = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		
	}
}
