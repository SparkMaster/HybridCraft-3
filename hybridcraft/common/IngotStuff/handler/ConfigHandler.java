package hybridcraft.common.IngotStuff.handler;

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
		ItemIDs.DIRON_AXE = config.getItem("dirmendAxe", ItemIDs.DIRON_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_HOE = config.getItem("dirmendAxe", ItemIDs.DIRON_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_PICK = config.getItem("dirmendAxe", ItemIDs.DIRON_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_SHOVEL = config.getItem("dirmendAxe", ItemIDs.DIRON_AXE_DEFAULT).getInt();
		ItemIDs.DIRON_SWORD = config.getItem("dirmendAxe", ItemIDs.DIRON_AXE_DEFAULT).getInt();
		//STORN
		ItemIDs.STORN_AXE = config.getItem("stornAxe", ItemIDs.STORN_AXE_DEFAULT).getInt();
		ItemIDs.STORN_HOE = config.getItem("stornAxe", ItemIDs.STORN_AXE_DEFAULT).getInt();
		ItemIDs.STORN_PICK = config.getItem("stornAxe", ItemIDs.STORN_AXE_DEFAULT).getInt();
		ItemIDs.STORN_SHOVEL = config.getItem("stornAxe", ItemIDs.STORN_AXE_DEFAULT).getInt();
		ItemIDs.STORN_SWORD = config.getItem("stornAxe", ItemIDs.STORN_AXE_DEFAULT).getInt();
		//Dirt
		ItemIDs.STOLD_AXE = config.getItem("dirmendAxe", ItemIDs.STOLD_AXE_DEFAULT).getInt();
		ItemIDs.STOLD_HOE = config.getItem("dirmendAxe", ItemIDs.STOLD_AXE_DEFAULT).getInt();
		ItemIDs.STOLD_PICK = config.getItem("dirmendAxe", ItemIDs.STOLD_AXE_DEFAULT).getInt();
		ItemIDs.STOLD_SHOVEL = config.getItem("dirmendAxe", ItemIDs.STOLD_AXE_DEFAULT).getInt();
		ItemIDs.STOLD_SWORD = config.getItem("dirmendAxe", ItemIDs.STOLD_AXE_DEFAULT).getInt();
		
		ItemIDs.DIRT_AXE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_HOE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_PICK = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_SHOVEL = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_SWORD = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		
		ItemIDs.DIRT_AXE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_HOE = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_PICK = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_SHOVEL = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();
		ItemIDs.DIRT_SWORD = config.getItem("dirmendAxe", ItemIDs.DIRMEND_AXE_DEFAULT).getInt();		
		
		config.save();
		
	}
	
	public Configuration getInstance()
	{
		return config;
		
	}
}
