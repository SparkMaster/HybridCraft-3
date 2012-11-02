package hybridcraft.common.handlers;

import java.io.File;
import net.minecraftforge.common.Property;
import net.minecraftforge.common.Configuration;

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
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHARD = config.getItem("obsidianShard", hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHARD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_INGOT = config.getItem("obsidianIngot", hybridcraft.common.handlers.IDHandler.OBSIDIAN_INGOT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_INGOT = config.getItem("sandIngot", hybridcraft.common.handlers.IDHandler.SAND_INGOT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_INGOT = config.getItem("dirtIngot", hybridcraft.common.handlers.IDHandler.DIRT_INGOT_DEFAULT).getInt();
		
		/*Load all tool Ids */
		
		//dirt
		hybridcraft.common.handlers.IDHandler.DIRT_AXE = config.getItem("dirtAxe", hybridcraft.common.handlers.IDHandler.DIRT_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_HOE = config.getItem("dirtHoe", hybridcraft.common.handlers.IDHandler.DIRT_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_PICK = config.getItem("dirtPick", hybridcraft.common.handlers.IDHandler.DIRT_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_SHOVEL = config.getItem("dirtShovel", hybridcraft.common.handlers.IDHandler.DIRT_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_SWORD = config.getItem("dirtSword", hybridcraft.common.handlers.IDHandler.DIRT_SWORD_DEFAULT).getInt();		
		//Dirt and diamond
		hybridcraft.common.handlers.IDHandler.DIRMEND_AXE = config.getItem("dirmendAxe", hybridcraft.common.handlers.IDHandler.DIRMEND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_HOE = config.getItem("dirmendHoe", hybridcraft.common.handlers.IDHandler.DIRMEND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_PICK = config.getItem("dirmendPick", hybridcraft.common.handlers.IDHandler.DIRMEND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_SHOVEL = config.getItem("dirmendShovel", hybridcraft.common.handlers.IDHandler.DIRMEND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_SWORD = config.getItem("dirmendSword", hybridcraft.common.handlers.IDHandler.DIRMEND_SWORD_DEFAULT).getInt();		
		//dirt and gold
		hybridcraft.common.handlers.IDHandler.DIROLD_AXE = config.getItem("diroldAxe", hybridcraft.common.handlers.IDHandler.DIROLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_HOE = config.getItem("diroldHoe", hybridcraft.common.handlers.IDHandler.DIROLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_PICK = config.getItem("diroldPick", hybridcraft.common.handlers.IDHandler.DIROLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_SHOVEL = config.getItem("diroldShovel", hybridcraft.common.handlers.IDHandler.DIROLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_SWORD = config.getItem("diroldSword", hybridcraft.common.handlers.IDHandler.DIROLD_SWORD_DEFAULT).getInt();
		//dirt and iron
		hybridcraft.common.handlers.IDHandler.DIRON_AXE = config.getItem("dironAxe", hybridcraft.common.handlers.IDHandler.DIRON_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_HOE = config.getItem("dironHoe", hybridcraft.common.handlers.IDHandler.DIRON_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_PICK = config.getItem("dironPick", hybridcraft.common.handlers.IDHandler.DIRON_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_SHOVEL = config.getItem("dironShovel", hybridcraft.common.handlers.IDHandler.DIRON_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_SWORD = config.getItem("dironSword", hybridcraft.common.handlers.IDHandler.DIRON_SWORD_DEFAULT).getInt();
		//STORN
		hybridcraft.common.handlers.IDHandler.STORN_AXE = config.getItem("stornAxe", hybridcraft.common.handlers.IDHandler.STORN_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_HOE = config.getItem("stornHoe", hybridcraft.common.handlers.IDHandler.STORN_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_PICK = config.getItem("stornPick", hybridcraft.common.handlers.IDHandler.STORN_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_SHOVEL = config.getItem("stornShovel", hybridcraft.common.handlers.IDHandler.STORN_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_SWORD = config.getItem("stornSword", hybridcraft.common.handlers.IDHandler.STORN_SWORD_DEFAULT).getInt();
		//stold
		hybridcraft.common.handlers.IDHandler.STOLD_AXE = config.getItem("stoldAxe", hybridcraft.common.handlers.IDHandler.STOLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_HOE = config.getItem("stoldHoe", hybridcraft.common.handlers.IDHandler.STOLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_PICK = config.getItem("stoldPick", hybridcraft.common.handlers.IDHandler.STOLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_SHOVEL = config.getItem("stoldShovel", hybridcraft.common.handlers.IDHandler.STOLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_SWORD = config.getItem("stoldSword", hybridcraft.common.handlers.IDHandler.STOLD_SWORD_DEFAULT).getInt();
		//STOMEND
		hybridcraft.common.handlers.IDHandler.STOMEND_AXE = config.getItem("stomendAxe", hybridcraft.common.handlers.IDHandler.STOMEND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_HOE = config.getItem("stomendHoe", hybridcraft.common.handlers.IDHandler.STOMEND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_PICK = config.getItem("stomendPick", hybridcraft.common.handlers.IDHandler.STOMEND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_SHOVEL = config.getItem("stomendShovel", hybridcraft.common.handlers.IDHandler.STOMEND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_SWORD = config.getItem("stomendSword", hybridcraft.common.handlers.IDHandler.STOMEND_SWORD_DEFAULT).getInt();
		//IROLD
		hybridcraft.common.handlers.IDHandler.IROLD_AXE = config.getItem("iroldAxe", hybridcraft.common.handlers.IDHandler.IROLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_HOE = config.getItem("iroldHoe", hybridcraft.common.handlers.IDHandler.IROLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_PICK = config.getItem("iroldPick", hybridcraft.common.handlers.IDHandler.IROLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_SHOVEL = config.getItem("iroldShovel", hybridcraft.common.handlers.IDHandler.IROLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_SWORD = config.getItem("iroldSword", hybridcraft.common.handlers.IDHandler.IROLD_SWORD_DEFAULT).getInt();
		//IRMEND
		hybridcraft.common.handlers.IDHandler.IRMEND_AXE = config.getItem("irmendAxe", hybridcraft.common.handlers.IDHandler.IROLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_HOE = config.getItem("irmendHoe", hybridcraft.common.handlers.IDHandler.IROLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_PICK = config.getItem("irmendPick", hybridcraft.common.handlers.IDHandler.IROLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_SHOVEL = config.getItem("irmendShovel", hybridcraft.common.handlers.IDHandler.IROLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_SWORD = config.getItem("irmendSword", hybridcraft.common.handlers.IDHandler.IROLD_SWORD_DEFAULT).getInt();	
		//GOMEND
		hybridcraft.common.handlers.IDHandler.GOMEND_AXE = config.getItem("gomendAxe", hybridcraft.common.handlers.IDHandler.GOMEND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_HOE = config.getItem("gomendHoe", hybridcraft.common.handlers.IDHandler.GOMEND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_PICK = config.getItem("gomendPick", hybridcraft.common.handlers.IDHandler.GOMEND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_SHOVEL = config.getItem("gomendShovel", hybridcraft.common.handlers.IDHandler.GOMEND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_SWORD = config.getItem("gomendSword", hybridcraft.common.handlers.IDHandler.GOMEND_SWORD_DEFAULT).getInt();
		//sand
		hybridcraft.common.handlers.IDHandler.SAND_AXE = config.getItem("sandAxe", hybridcraft.common.handlers.IDHandler.SAND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_HOE = config.getItem("sandHoe", hybridcraft.common.handlers.IDHandler.SAND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_PICK = config.getItem("sandPick", hybridcraft.common.handlers.IDHandler.SAND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_SHOVEL = config.getItem("sandShovel", hybridcraft.common.handlers.IDHandler.SAND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_SWORD = config.getItem("sandSword", hybridcraft.common.handlers.IDHandler.SAND_SWORD_DEFAULT).getInt();		
		//obsidian
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_AXE = config.getItem("obsidianAxe", hybridcraft.common.handlers.IDHandler.OBSIDIAN_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_HOE = config.getItem("obsidianHoe", hybridcraft.common.handlers.IDHandler.OBSIDIAN_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_PICK = config.getItem("obsidianPick", hybridcraft.common.handlers.IDHandler.OBSIDIAN_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHOVEL = config.getItem("obsidianShovel", hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_SWORD = config.getItem("obsidianSword", hybridcraft.common.handlers.IDHandler.OBSIDIAN_SWORD_DEFAULT).getInt();
		//emerald
		hybridcraft.common.handlers.IDHandler.EMERALD_AXE = config.getItem("emeraldAxe", hybridcraft.common.handlers.IDHandler.EMERALD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_HOE = config.getItem("emeraldHoe", hybridcraft.common.handlers.IDHandler.EMERALD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_PICK = config.getItem("emeraldPick", hybridcraft.common.handlers.IDHandler.EMERALD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_SHOVEL = config.getItem("emeraldShovel", hybridcraft.common.handlers.IDHandler.EMERALD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_SWORD = config.getItem("emeraldSword", hybridcraft.common.handlers.IDHandler.EMERALD_SWORD_DEFAULT).getInt();
		
		//Food
		hybridcraft.common.handlers.IDHandler.breadSliceID = config.getItem("Slice of Bread", hybridcraft.common.handlers.IDHandler.BREAD_SLICE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.chickenStripsID = config.getItem("Chicken Tender", hybridcraft.common.handlers.IDHandler.CHICKEN_STRIPS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.beefSlicesID = config.getItem("Beef Slice", hybridcraft.common.handlers.IDHandler.BEEF_SLICES_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.baconID = config.getItem("Bacon", hybridcraft.common.handlers.IDHandler.BACON_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.chickenSandwichID = config.getItem("Chicken Sandwich", hybridcraft.common.handlers.IDHandler.CHICKEN_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.chickenSandwichBaconID = config.getItem("Chicken Sandwich with Bacon", hybridcraft.common.handlers.IDHandler.CHICKEN_BACON_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.beefSandwichID = config.getItem("Beef Sandwich", hybridcraft.common.handlers.IDHandler.BEEF_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.beefSandwichBaconID = config.getItem("Beef Sandwich with Bacon", hybridcraft.common.handlers.IDHandler.BEEF_BACON_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.meatSandwichID = config.getItem("Meat Sandwich", hybridcraft.common.handlers.IDHandler.MEAT_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.applePieID = config.getItem("Apple Pie", hybridcraft.common.handlers.IDHandler.APPLE_PIE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.fruitSaladID = config.getItem("Fruit Salad", hybridcraft.common.handlers.IDHandler.FRUIT_SALAD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.appleSliceID = config.getItem("Apple Slice", hybridcraft.common.handlers.IDHandler.APPLE_SLICE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.BaBID = config.getItem("Beef Bread", hybridcraft.common.handlers.IDHandler.BAB_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.PaBID = config.getItem("Pork Bread", hybridcraft.common.handlers.IDHandler.PAB_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.CaBID = config.getItem("Chicken Bread", hybridcraft.common.handlers.IDHandler.CAB_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DogBreadID = config.getItem("Dog Treat", hybridcraft.common.handlers.IDHandler.DOG_BREAD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.bowlChickenID = config.getItem("Bowl of Chicken", hybridcraft.common.handlers.IDHandler.BOWL_CHICKEN_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.bowlBeefID = config.getItem("Bowl of Beef", hybridcraft.common.handlers.IDHandler.BOWL_BEEF_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.bowlMeatID = config.getItem("Bowl of Meat", hybridcraft.common.handlers.IDHandler.BOWL_MEAT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.counterID = config.getItem("Counter", hybridcraft.common.handlers.IDHandler.COUNTER_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoveID = config.getItem("Stove", hybridcraft.common.handlers.IDHandler.STOVE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.potID = config.getItem("Cooking Pot", hybridcraft.common.handlers.IDHandler.POT_DEFAULT).getInt();
		
		config.save();
		
	}
	
	public Configuration getInstance()
	{
		return config;
		
	}
}
