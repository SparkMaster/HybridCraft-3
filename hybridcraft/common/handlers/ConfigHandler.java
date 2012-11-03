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
	
	public static final String CATEGORY_BLOCKS = "Blocks";
	public static final String CATEGORY_ITEMS = "Items";
	
	
	public static void loadConfig()
	{
		//config.load();
		
		/*Load all ingot Ids */
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHARD = config.get(CATEGORY_ITEMS, "obsidianShard", hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHARD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_INGOT = config.get(CATEGORY_ITEMS, "obsidianIngot", hybridcraft.common.handlers.IDHandler.OBSIDIAN_INGOT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_INGOT = config.get(CATEGORY_ITEMS, "sandIngot", hybridcraft.common.handlers.IDHandler.SAND_INGOT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_INGOT = config.get(CATEGORY_ITEMS, "dirtIngot", hybridcraft.common.handlers.IDHandler.DIRT_INGOT_DEFAULT).getInt();
		
		/*Load all tool Ids */
		
		//dirt
		hybridcraft.common.handlers.IDHandler.DIRT_AXE = config.get(CATEGORY_ITEMS, "dirtAxe", hybridcraft.common.handlers.IDHandler.DIRT_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_HOE = config.get(CATEGORY_ITEMS, "dirtHoe", hybridcraft.common.handlers.IDHandler.DIRT_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_PICK = config.get(CATEGORY_ITEMS, "dirtPick", hybridcraft.common.handlers.IDHandler.DIRT_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_SHOVEL = config.get(CATEGORY_ITEMS, "dirtShovel", hybridcraft.common.handlers.IDHandler.DIRT_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRT_SWORD = config.get(CATEGORY_ITEMS, "dirtSword", hybridcraft.common.handlers.IDHandler.DIRT_SWORD_DEFAULT).getInt();		
		//Dirt and diamond
		hybridcraft.common.handlers.IDHandler.DIRMEND_AXE = config.get(CATEGORY_ITEMS, "dirmendAxe", hybridcraft.common.handlers.IDHandler.DIRMEND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_HOE = config.get(CATEGORY_ITEMS, "dirmendHoe", hybridcraft.common.handlers.IDHandler.DIRMEND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_PICK = config.get(CATEGORY_ITEMS, "dirmendPick", hybridcraft.common.handlers.IDHandler.DIRMEND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_SHOVEL = config.get(CATEGORY_ITEMS, "dirmendShovel", hybridcraft.common.handlers.IDHandler.DIRMEND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRMEND_SWORD = config.get(CATEGORY_ITEMS, "dirmendSword", hybridcraft.common.handlers.IDHandler.DIRMEND_SWORD_DEFAULT).getInt();		
		//dirt and gold
		hybridcraft.common.handlers.IDHandler.DIROLD_AXE = config.get(CATEGORY_ITEMS, "diroldAxe", hybridcraft.common.handlers.IDHandler.DIROLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_HOE = config.get(CATEGORY_ITEMS, "diroldHoe", hybridcraft.common.handlers.IDHandler.DIROLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_PICK = config.get(CATEGORY_ITEMS, "diroldPick", hybridcraft.common.handlers.IDHandler.DIROLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_SHOVEL = config.get(CATEGORY_ITEMS, "diroldShovel", hybridcraft.common.handlers.IDHandler.DIROLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIROLD_SWORD = config.get(CATEGORY_ITEMS, "diroldSword", hybridcraft.common.handlers.IDHandler.DIROLD_SWORD_DEFAULT).getInt();
		//dirt and iron
		hybridcraft.common.handlers.IDHandler.DIRON_AXE = config.get(CATEGORY_ITEMS, "dironAxe", hybridcraft.common.handlers.IDHandler.DIRON_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_HOE = config.get(CATEGORY_ITEMS, "dironHoe", hybridcraft.common.handlers.IDHandler.DIRON_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_PICK = config.get(CATEGORY_ITEMS, "dironPick", hybridcraft.common.handlers.IDHandler.DIRON_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_SHOVEL = config.get(CATEGORY_ITEMS, "dironShovel", hybridcraft.common.handlers.IDHandler.DIRON_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DIRON_SWORD = config.get(CATEGORY_ITEMS, "dironSword", hybridcraft.common.handlers.IDHandler.DIRON_SWORD_DEFAULT).getInt();
		//STORN
		hybridcraft.common.handlers.IDHandler.STORN_AXE = config.get(CATEGORY_ITEMS, "stornAxe", hybridcraft.common.handlers.IDHandler.STORN_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_HOE = config.get(CATEGORY_ITEMS, "stornHoe", hybridcraft.common.handlers.IDHandler.STORN_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_PICK = config.get(CATEGORY_ITEMS, "stornPick", hybridcraft.common.handlers.IDHandler.STORN_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_SHOVEL = config.get(CATEGORY_ITEMS, "stornShovel", hybridcraft.common.handlers.IDHandler.STORN_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STORN_SWORD = config.get(CATEGORY_ITEMS, "stornSword", hybridcraft.common.handlers.IDHandler.STORN_SWORD_DEFAULT).getInt();
		//stold
		hybridcraft.common.handlers.IDHandler.STOLD_AXE = config.get(CATEGORY_ITEMS, "stoldAxe", hybridcraft.common.handlers.IDHandler.STOLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_HOE = config.get(CATEGORY_ITEMS, "stoldHoe", hybridcraft.common.handlers.IDHandler.STOLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_PICK = config.get(CATEGORY_ITEMS, "stoldPick", hybridcraft.common.handlers.IDHandler.STOLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_SHOVEL = config.get(CATEGORY_ITEMS, "stoldShovel", hybridcraft.common.handlers.IDHandler.STOLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOLD_SWORD = config.get(CATEGORY_ITEMS, "stoldSword", hybridcraft.common.handlers.IDHandler.STOLD_SWORD_DEFAULT).getInt();
		//STOMEND
		hybridcraft.common.handlers.IDHandler.STOMEND_AXE = config.get(CATEGORY_ITEMS, "stomendAxe", hybridcraft.common.handlers.IDHandler.STOMEND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_HOE = config.get(CATEGORY_ITEMS, "stomendHoe", hybridcraft.common.handlers.IDHandler.STOMEND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_PICK = config.get(CATEGORY_ITEMS, "stomendPick", hybridcraft.common.handlers.IDHandler.STOMEND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_SHOVEL = config.get(CATEGORY_ITEMS, "stomendShovel", hybridcraft.common.handlers.IDHandler.STOMEND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.STOMEND_SWORD = config.get(CATEGORY_ITEMS, "stomendSword", hybridcraft.common.handlers.IDHandler.STOMEND_SWORD_DEFAULT).getInt();
		//IROLD
		hybridcraft.common.handlers.IDHandler.IROLD_AXE = config.get(CATEGORY_ITEMS, "iroldAxe", hybridcraft.common.handlers.IDHandler.IROLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_HOE = config.get(CATEGORY_ITEMS, "iroldHoe", hybridcraft.common.handlers.IDHandler.IROLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_PICK = config.get(CATEGORY_ITEMS, "iroldPick", hybridcraft.common.handlers.IDHandler.IROLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_SHOVEL = config.get(CATEGORY_ITEMS, "iroldShovel", hybridcraft.common.handlers.IDHandler.IROLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IROLD_SWORD = config.get(CATEGORY_ITEMS, "iroldSword", hybridcraft.common.handlers.IDHandler.IROLD_SWORD_DEFAULT).getInt();
		//IRMEND
		hybridcraft.common.handlers.IDHandler.IRMEND_AXE = config.get(CATEGORY_ITEMS, "irmendAxe", hybridcraft.common.handlers.IDHandler.IROLD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_HOE = config.get(CATEGORY_ITEMS, "irmendHoe", hybridcraft.common.handlers.IDHandler.IROLD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_PICK = config.get(CATEGORY_ITEMS, "irmendPick", hybridcraft.common.handlers.IDHandler.IROLD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_SHOVEL = config.get(CATEGORY_ITEMS, "irmendShovel", hybridcraft.common.handlers.IDHandler.IROLD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.IRMEND_SWORD = config.get(CATEGORY_ITEMS, "irmendSword", hybridcraft.common.handlers.IDHandler.IROLD_SWORD_DEFAULT).getInt();	
		//GOMEND
		hybridcraft.common.handlers.IDHandler.GOMEND_AXE = config.get(CATEGORY_ITEMS, "gomendAxe", hybridcraft.common.handlers.IDHandler.GOMEND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_HOE = config.get(CATEGORY_ITEMS, "gomendHoe", hybridcraft.common.handlers.IDHandler.GOMEND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_PICK = config.get(CATEGORY_ITEMS, "gomendPick", hybridcraft.common.handlers.IDHandler.GOMEND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_SHOVEL = config.get(CATEGORY_ITEMS, "gomendShovel", hybridcraft.common.handlers.IDHandler.GOMEND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.GOMEND_SWORD = config.get(CATEGORY_ITEMS, "gomendSword", hybridcraft.common.handlers.IDHandler.GOMEND_SWORD_DEFAULT).getInt();
		//sand
		hybridcraft.common.handlers.IDHandler.SAND_AXE = config.get(CATEGORY_ITEMS, "sandAxe", hybridcraft.common.handlers.IDHandler.SAND_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_HOE = config.get(CATEGORY_ITEMS, "sandHoe", hybridcraft.common.handlers.IDHandler.SAND_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_PICK = config.get(CATEGORY_ITEMS, "sandPick", hybridcraft.common.handlers.IDHandler.SAND_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_SHOVEL = config.get(CATEGORY_ITEMS, "sandShovel", hybridcraft.common.handlers.IDHandler.SAND_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.SAND_SWORD = config.get(CATEGORY_ITEMS, "sandSword", hybridcraft.common.handlers.IDHandler.SAND_SWORD_DEFAULT).getInt();		
		//obsidian
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_AXE = config.get(CATEGORY_ITEMS, "obsidianAxe", hybridcraft.common.handlers.IDHandler.OBSIDIAN_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_HOE = config.get(CATEGORY_ITEMS, "obsidianHoe", hybridcraft.common.handlers.IDHandler.OBSIDIAN_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_PICK = config.get(CATEGORY_ITEMS, "obsidianPick", hybridcraft.common.handlers.IDHandler.OBSIDIAN_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHOVEL = config.get(CATEGORY_ITEMS, "obsidianShovel", hybridcraft.common.handlers.IDHandler.OBSIDIAN_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.OBSIDIAN_SWORD = config.get(CATEGORY_ITEMS, "obsidianSword", hybridcraft.common.handlers.IDHandler.OBSIDIAN_SWORD_DEFAULT).getInt();
		//emerald
		hybridcraft.common.handlers.IDHandler.EMERALD_AXE = config.get(CATEGORY_ITEMS, "emeraldAxe", hybridcraft.common.handlers.IDHandler.EMERALD_AXE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_HOE = config.get(CATEGORY_ITEMS, "emeraldHoe", hybridcraft.common.handlers.IDHandler.EMERALD_HOE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_PICK = config.get(CATEGORY_ITEMS, "emeraldPick", hybridcraft.common.handlers.IDHandler.EMERALD_PICK_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_SHOVEL = config.get(CATEGORY_ITEMS, "emeraldShovel", hybridcraft.common.handlers.IDHandler.EMERALD_SHOVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.EMERALD_SWORD = config.get(CATEGORY_ITEMS, "emeraldSword", hybridcraft.common.handlers.IDHandler.EMERALD_SWORD_DEFAULT).getInt();
		
		//Food
		hybridcraft.common.handlers.IDHandler.breadSliceID = config.get(CATEGORY_ITEMS, "Slice of Bread", hybridcraft.common.handlers.IDHandler.BREAD_SLICE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.chickenStripsID = config.get(CATEGORY_ITEMS, "Chicken Tender", hybridcraft.common.handlers.IDHandler.CHICKEN_STRIPS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.beefSlicesID = config.get(CATEGORY_ITEMS, "Beef Slice", hybridcraft.common.handlers.IDHandler.BEEF_SLICES_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.baconID = config.get(CATEGORY_ITEMS, "Bacon", hybridcraft.common.handlers.IDHandler.BACON_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.chickenSandwichID = config.get(CATEGORY_ITEMS, "Chicken Sandwich", hybridcraft.common.handlers.IDHandler.CHICKEN_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.chickenSandwichBaconID = config.get(CATEGORY_ITEMS, "Chicken Sandwich with Bacon", hybridcraft.common.handlers.IDHandler.CHICKEN_BACON_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.beefSandwichID = config.get(CATEGORY_ITEMS, "Beef Sandwich", hybridcraft.common.handlers.IDHandler.BEEF_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.beefSandwichBaconID = config.get(CATEGORY_ITEMS, "Beef Sandwich with Bacon", hybridcraft.common.handlers.IDHandler.BEEF_BACON_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.meatSandwichID = config.get(CATEGORY_ITEMS, "Meat Sandwich", hybridcraft.common.handlers.IDHandler.MEAT_SANDWICH_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.applePieID = config.get(CATEGORY_ITEMS, "Apple Pie", hybridcraft.common.handlers.IDHandler.APPLE_PIE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.fruitSaladID = config.get(CATEGORY_ITEMS, "Fruit Salad", hybridcraft.common.handlers.IDHandler.FRUIT_SALAD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.appleSliceID = config.get(CATEGORY_ITEMS, "Apple Slice", hybridcraft.common.handlers.IDHandler.APPLE_SLICE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.BaBID = config.get(CATEGORY_ITEMS, "Beef Bread", hybridcraft.common.handlers.IDHandler.BAB_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.PaBID = config.get(CATEGORY_ITEMS, "Pork Bread", hybridcraft.common.handlers.IDHandler.PAB_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.CaBID = config.get(CATEGORY_ITEMS, "Chicken Bread", hybridcraft.common.handlers.IDHandler.CAB_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.DogBreadID = config.get(CATEGORY_ITEMS, "Dog Treat", hybridcraft.common.handlers.IDHandler.DOG_BREAD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.bowlChickenID = config.get(CATEGORY_ITEMS, "Bowl of Chicken", hybridcraft.common.handlers.IDHandler.BOWL_CHICKEN_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.bowlBeefID = config.get(CATEGORY_ITEMS, "Bowl of Beef", hybridcraft.common.handlers.IDHandler.BOWL_BEEF_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.bowlMeatID = config.get(CATEGORY_ITEMS, "Bowl of Meat", hybridcraft.common.handlers.IDHandler.BOWL_MEAT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.counterID = config.get(CATEGORY_BLOCKS, "Counter", hybridcraft.common.handlers.IDHandler.COUNTER_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoveID = config.get(CATEGORY_BLOCKS, "Stove", hybridcraft.common.handlers.IDHandler.STOVE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.potID = config.get(CATEGORY_BLOCKS, "Cooking Pot", hybridcraft.common.handlers.IDHandler.POT_DEFAULT).getInt();
		//Armor
		hybridcraft.common.handlers.IDHandler.dirtHelmetID = config.get(CATEGORY_ITEMS, "Dirt Helmet ", hybridcraft.common.handlers.IDHandler.DIRT_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtPlateID = config.get(CATEGORY_ITEMS, "Dirt Chestplate", hybridcraft.common.handlers.IDHandler.DIRT_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtLegsID = config.get(CATEGORY_ITEMS, "Dirt Leggings", hybridcraft.common.handlers.IDHandler.DIRT_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtBootsID = config.get(CATEGORY_ITEMS, "Dirt Boots", hybridcraft.common.handlers.IDHandler.DIRT_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtoneHelmetID = config.get(CATEGORY_ITEMS, "Dirtone Helmet", hybridcraft.common.handlers.IDHandler.DIRTONE_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtonePlateID = config.get(CATEGORY_ITEMS, "Dirtone Chestplate", hybridcraft.common.handlers.IDHandler.DIRTONE_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtoneLegsID = config.get(CATEGORY_ITEMS, "Dirtone Leggings", hybridcraft.common.handlers.IDHandler.DIRTONE_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtoneBootsID = config.get(CATEGORY_ITEMS, "Dirtone Boots", hybridcraft.common.handlers.IDHandler.DIRTONE_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dironHelmetID = config.get(CATEGORY_ITEMS, "Diron Helmet", hybridcraft.common.handlers.IDHandler.DIRON_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dironPlateID = config.get(CATEGORY_ITEMS, "Diron Chestplate", hybridcraft.common.handlers.IDHandler.DIRON_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dironLegsID = config.get(CATEGORY_ITEMS, "Diron Leggings", hybridcraft.common.handlers.IDHandler.DIRON_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dironBootsID = config.get(CATEGORY_ITEMS, "Diron Boots", hybridcraft.common.handlers.IDHandler.DIRON_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.diroldHelmetID = config.get(CATEGORY_ITEMS, "Dirold Helmet", hybridcraft.common.handlers.IDHandler.DIROLD_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.diroldPlateID = config.get(CATEGORY_ITEMS, "Dirold Chestplate", hybridcraft.common.handlers.IDHandler.DIROLD_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.diroldLegsID = config.get(CATEGORY_ITEMS, "Dirold Leggings", hybridcraft.common.handlers.IDHandler.DIROLD_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.diroldBootsID = config.get(CATEGORY_ITEMS, "Dirold Boots", hybridcraft.common.handlers.IDHandler.DIROLD_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirmendHelmetID = config.get(CATEGORY_ITEMS, "Dirmend Helmet", hybridcraft.common.handlers.IDHandler.DIRMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirmendPlateID = config.get(CATEGORY_ITEMS, "Dirmend Chestplate", hybridcraft.common.handlers.IDHandler.DIRMEND_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirmendLegsID = config.get(CATEGORY_ITEMS, "Dirmend Leggings", hybridcraft.common.handlers.IDHandler.DIRMEND_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirmendBootsID = config.get(CATEGORY_ITEMS, "Dirmend Boots", hybridcraft.common.handlers.IDHandler.DIRMEND_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stornHelmetID = config.get(CATEGORY_ITEMS, "Storn Helmet", hybridcraft.common.handlers.IDHandler.STORN_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stornPlateID = config.get(CATEGORY_ITEMS, "Storn Chestplate", hybridcraft.common.handlers.IDHandler.STORN_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stornLegsID = config.get(CATEGORY_ITEMS, "Storn Leggings", hybridcraft.common.handlers.IDHandler.STORN_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stornBootsID = config.get(CATEGORY_ITEMS, "Storn Boots", hybridcraft.common.handlers.IDHandler.STORN_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoldHelmetID = config.get(CATEGORY_ITEMS, "Stold Helmet", hybridcraft.common.handlers.IDHandler.STOLD_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoldPlateID = config.get(CATEGORY_ITEMS, "Stold Chestplate", hybridcraft.common.handlers.IDHandler.STOLD_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoldLegsID = config.get(CATEGORY_ITEMS, "Stold Leggins", hybridcraft.common.handlers.IDHandler.STOLD_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoldBootsID = config.get(CATEGORY_ITEMS, "Stold Boots", hybridcraft.common.handlers.IDHandler.STOLD_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stomendHelmetID = config.get(CATEGORY_ITEMS, "Stomend Helmet", hybridcraft.common.handlers.IDHandler.STOMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stomendPlateID = config.get(CATEGORY_ITEMS, "Stomend Chestplate", hybridcraft.common.handlers.IDHandler.STOMEND_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stomendLegsID = config.get(CATEGORY_ITEMS, "Stomend Leggings", hybridcraft.common.handlers.IDHandler.STOMEND_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stomendBootsID = config.get(CATEGORY_ITEMS, "Stomend Boots", hybridcraft.common.handlers.IDHandler.STOMEND_BOOTS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.iroldHelmetID = config.get(CATEGORY_ITEMS, "Irold Helmet", hybridcraft.common.handlers.IDHandler.IROLD_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.iroldPlateID = config.get(CATEGORY_ITEMS, "Irold Chestplate", hybridcraft.common.handlers.IDHandler.IROLD_PLATE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.iroldLegsID = config.get(CATEGORY_ITEMS, "Irold Leggings", hybridcraft.common.handlers.IDHandler.IROLD_LEGS_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.iroldBootsID = config.get(CATEGORY_ITEMS, "Irold Boots", hybridcraft.common.handlers.IDHandler.IRMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.irmendHelmetID = config.get(CATEGORY_ITEMS, "Irmend Helmet", hybridcraft.common.handlers.IDHandler.IRMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.irmendPlateID = config.get(CATEGORY_ITEMS, "Irmend Chestplate", hybridcraft.common.handlers.IDHandler.IRMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.irmendLegsID = config.get(CATEGORY_ITEMS, "Irmend Leggings", hybridcraft.common.handlers.IDHandler.IRMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.irmendBootsID = config.get(CATEGORY_ITEMS, "Irmend Boots", hybridcraft.common.handlers.IDHandler.IRMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.gomendHelmetID = config.get(CATEGORY_ITEMS, "Gomend Helmet", hybridcraft.common.handlers.IDHandler.GOMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.gomendPlateID = config.get(CATEGORY_ITEMS, "Gomend Chestplate", hybridcraft.common.handlers.IDHandler.GOMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.gomendLegsID = config.get(CATEGORY_ITEMS, "Gomend Leggings", hybridcraft.common.handlers.IDHandler.GOMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.gomendBootsID = config.get(CATEGORY_ITEMS, "Gomend Boots", hybridcraft.common.handlers.IDHandler.GOMEND_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.obsidianHelmetID = config.get(CATEGORY_ITEMS, "Obsidian Helmet", hybridcraft.common.handlers.IDHandler.OBSIDIAN_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.obsidianPlateID = config.get(CATEGORY_ITEMS, "Obsidian Chestplate", hybridcraft.common.handlers.IDHandler.OBSIDIAN_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.obsidianLegsID = config.get(CATEGORY_ITEMS, "Obsidian Leggings", hybridcraft.common.handlers.IDHandler.OBSIDIAN_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.obsidianBootsID = config.get(CATEGORY_ITEMS, "Obsidian Boots", hybridcraft.common.handlers.IDHandler.OBSIDIAN_HELMET_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtBlockID = config.get(CATEGORY_BLOCKS, "Dirt Ingot Block", hybridcraft.common.handlers.IDHandler.DIRT_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirtoneBlockID = config.get(CATEGORY_BLOCKS, "Dirtone Ingot Block", hybridcraft.common.handlers.IDHandler.DIRTONE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dironBlockID = config.get(CATEGORY_BLOCKS, "Diron Ingot Block", hybridcraft.common.handlers.IDHandler.DIRON_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.diroldBlockID = config.get(CATEGORY_BLOCKS, "Dirold Ingot Block", hybridcraft.common.handlers.IDHandler.DIROLD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dirmendBlockID = config.get(CATEGORY_BLOCKS, "Dirmend Ingot Block", hybridcraft.common.handlers.IDHandler.DIRMEND_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoneBlockID = config.get(CATEGORY_BLOCKS, "Stone Ingot Block", hybridcraft.common.handlers.IDHandler.STONE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stornBlockID = config.get(CATEGORY_BLOCKS, "Storn Ingot Block", hybridcraft.common.handlers.IDHandler.STORN_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoldBlockID = config.get(CATEGORY_BLOCKS, "Stold Ingot Block", hybridcraft.common.handlers.IDHandler.STOLD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stomendBlockID = config.get(CATEGORY_BLOCKS, "Stomend Ingot Block", hybridcraft.common.handlers.IDHandler.STOMEND_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.iroldBlockID = config.get(CATEGORY_BLOCKS, "Irold Ingot Block", hybridcraft.common.handlers.IDHandler.IROLD_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.irmendBlockID = config.get(CATEGORY_BLOCKS, "Irmend Ingot Block", hybridcraft.common.handlers.IDHandler.IRMEND_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.gomendBlockID = config.get(CATEGORY_BLOCKS, "Gomend Ingot Block", hybridcraft.common.handlers.IDHandler.GOMEND_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.dandID = config.get(CATEGORY_BLOCKS, "Dirt/Sand Block", hybridcraft.common.handlers.IDHandler.DAND_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.davelID = config.get(CATEGORY_BLOCKS, "Dirt/Gravel Block",	hybridcraft.common.handlers.IDHandler.DAVEL_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.doneID = config.get(CATEGORY_BLOCKS, "Dirt/Stone Block", hybridcraft.common.handlers.IDHandler.DONE_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.sandBlockID = config.get(CATEGORY_BLOCKS, "Sand Ingot Block", hybridcraft.common.handlers.IDHandler.SAND_DEFAULT).getInt();
		hybridcraft.common.handlers.IDHandler.stoneHelmetID = config.get(CATEGORY_ITEMS, "Stone Helmet", 634).getInt();
		hybridcraft.common.handlers.IDHandler.stonePlateID = config.get(CATEGORY_ITEMS, "Stone Chestplate", 635).getInt();
		hybridcraft.common.handlers.IDHandler.stoneLegsID = config.get(CATEGORY_ITEMS, "Stone Leggings", 636).getInt();
		hybridcraft.common.handlers.IDHandler.stoneBootsID = config.get(CATEGORY_ITEMS, "Stone Boots", 637).getInt();
		hybridcraft.common.handlers.IDHandler.sandHelmetID = config.get(CATEGORY_ITEMS, "Sand Helmet", 638).getInt();
		hybridcraft.common.handlers.IDHandler.sandPlateID = config.get(CATEGORY_ITEMS, "Sand Chestplate", 639).getInt();
		hybridcraft.common.handlers.IDHandler.sandLegsID = config.get(CATEGORY_ITEMS, "Sand Leggings", 640).getInt();
		hybridcraft.common.handlers.IDHandler.sandBootsID = config.get(CATEGORY_ITEMS, "Sand Boots", 641).getInt();
		hybridcraft.common.handlers.IDHandler.emeraldhelmetID = config.get(CATEGORY_ITEMS, "Emerald Helmet", 659).getInt();
		hybridcraft.common.handlers.IDHandler.emeraldplateID = config.get(CATEGORY_ITEMS, "Emerald Chestplate", 660).getInt();
		hybridcraft.common.handlers.IDHandler.emeraldlegsID = config.get(CATEGORY_ITEMS, "Emerald Leggings", 661).getInt();
		hybridcraft.common.handlers.IDHandler.emeraldbootsID = config.get(CATEGORY_ITEMS, "Emerald Boots", 662).getInt();
		hybridcraft.common.handlers.IDHandler.combinerID = config.get(CATEGORY_BLOCKS, "Combiner", 663).getInt();
		
		config.save();
		
	}
	
	public Configuration getInstance()
	{
		return config;
		
	}
}
