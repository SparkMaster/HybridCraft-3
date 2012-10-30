package hybridcraft.common.FoodStuff;

import hybridcraft.common.FoodStuff.kitchen.BlockCookingPot;
import hybridcraft.common.FoodStuff.kitchen.BlockCounter;
import hybridcraft.common.FoodStuff.kitchen.BlockStove;
import hybridcraft.common.FoodStuff.kitchen.CookingPotManager;
import hybridcraft.common.FoodStuff.kitchen.CounterManager;
import hybridcraft.common.FoodStuff.kitchen.GuiHandler;
import hybridcraft.common.FoodStuff.kitchen.StoveManager;
import hybridcraft.common.IngotStuff.CreativeTabHCM;
import hybridcraft.common.IngotStuff.handler.ConfigHandler;
import hybridcraft.common.core.ClientPacketHandler;
import hybridcraft.common.core.CommonProxyHybrid;
import hybridcraft.common.core.CoreRef;
import hybridcraft.common.core.ServerPacketHandler;
import hybridcraft.common.core.TileHybrid;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = CoreRef.HCF_MOD_ID, name = CoreRef.HCF_MOD_NAME, version = CoreRef.HCF_VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false, clientPacketHandlerSpec = @SidedPacketHandler(channels = {"HybridMod" }, packetHandler = ClientPacketHandler.class),
serverPacketHandlerSpec =@SidedPacketHandler(channels = {"HybridMod" }, packetHandler = ServerPacketHandler.class))

public class HybridModFoodStuff {
	
	// Creative Tab
	public static CreativeTabs tabsFood = new CreativeTabHCK(CreativeTabs.getNextID(), CoreRef.HCF_MOD_ID);

	@Instance("HybridCraft 3 Food")
	public static HybridModFoodStuff instance = new HybridModFoodStuff();

	@SidedProxy(clientSide = hybridcraft.common.core.CoreRef.CLIENT_PROXY_CLASS , serverSide = hybridcraft.common.core.CoreRef.SERVER_PROXY_CLASS)
	public static CommonProxyHybrid proxy;

	// Declare Blocks
	public static Block stove;
	public static Block counter;
	public static Block cookingPot;
	
	// Counter/Stove GUIs
	private GuiHandler guiHandler = new GuiHandler();
	
	// Config
	public static final String CATEGORY_KITCHEN = "kitchen";
	public static final String CATEGORY_FOOD = "food";
	
	public static int  breadSliceID;
	public static int  chickenStripsID;
	public static int  beefSlicesID;
	public static int  baconID;
	public static int  chickenSandwichID;
	public static int  chickenSandwichBaconID;
	public static int  beefSandwichID;
	public static int  beefSandwichBaconID;
	public static int  meatSandwichID;
	public static int  applePieID;
	public static int  fruitSaladID;
	public static int  appleSliceID;
	public static int  counterID;
	public static int  stoveID;
	public static int  potID;
	public static int  bowlChickenID;
	public static int  bowlBeefID;
	public static int  bowlMeatID;
	public static int  BaBID;
	public static int  PaBID;
	public static int  CaBID;
	public static int  DogBreadID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigHandler config =  new ConfigHandler(event.getSuggestedConfigurationFile());
		
		config.loadConfig();
		config.getInstance().load();

		breadSliceID = config.getInstance().get(CATEGORY_FOOD, "Slice of Bread", 1000).getInt();
		chickenStripsID = config.getInstance().get(CATEGORY_FOOD, "Chicken Tender", 1001).getInt();
		beefSlicesID = config.getInstance().get(CATEGORY_FOOD, "Beef Slice", 1002).getInt();
		baconID = config.getInstance().get(CATEGORY_FOOD, "Bacon", 1003).getInt();
		chickenSandwichID = config.getInstance().get(CATEGORY_FOOD, "Chicken Sandwich", 1004).getInt();
		chickenSandwichBaconID = config.getInstance().get(CATEGORY_FOOD, "Chicken Sandwich with Bacon", 1005).getInt();
		beefSandwichID = config.getInstance().get(CATEGORY_FOOD, "Beef Sandwich", 1006).getInt();
		beefSandwichBaconID = config.getInstance().get(CATEGORY_FOOD, "Beef Sandwich with Bacon", 1007).getInt();
		meatSandwichID = config.getInstance().get(CATEGORY_FOOD, "Meat Sandwich", 1008).getInt();
		applePieID = config.getInstance().get(CATEGORY_FOOD, "Apple Pie", 1009).getInt();
		fruitSaladID = config.getInstance().get(CATEGORY_FOOD, "Fruit Salad", 1010).getInt();
		appleSliceID = config.getInstance().get(CATEGORY_FOOD, "Apple Slice", 1011).getInt();
		BaBID = config.getInstance().get(CATEGORY_FOOD, "Beef Bread", 1012).getInt();
		PaBID = config.getInstance().get(CATEGORY_FOOD, "Pork Bread", 1013).getInt();
		CaBID = config.getInstance().get(CATEGORY_FOOD, "Chicken Bread", 1014).getInt();
		DogBreadID = config.getInstance().get(CATEGORY_FOOD, "Dog Treat", 1015).getInt();
		bowlChickenID = config.getInstance().get(CATEGORY_FOOD, "Bowl of Chicken", 1016).getInt();
		bowlBeefID = config.getInstance().get(CATEGORY_FOOD, "Bowl of Beef", 1017).getInt();
		bowlMeatID = config.getInstance().get(CATEGORY_FOOD, "Bowl of Meat", 1018).getInt();
		counterID = config.getInstance().get(CATEGORY_KITCHEN, "Counter", 1019).getInt();
		stoveID = config.getInstance().get(CATEGORY_KITCHEN, "Stove", 1020).getInt();
		potID = config.getInstance().get(CATEGORY_KITCHEN, "Cooking Pot", 1021).getInt();
		
		config.getInstance().save();
		
	}
	
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		// Initialize managers on startup
		CounterManager.getInstance();
		StoveManager.getInstance();
		CookingPotManager.getInstance();
		
		// Register GUIs
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
		GameRegistry.registerTileEntity(TileHybrid.class, "tileEntityHybridK");

		// Classify Blocks
		counter = new BlockCounter(counterID).setBlockName("Counter");
		stove = new BlockStove(stoveID).setBlockName("Stove");
		cookingPot = new BlockCookingPot(potID).setBlockName("Cooking Pot");

		// Register Blocks
		GameRegistry.registerBlock(stove);
		GameRegistry.registerBlock(counter);
		GameRegistry.registerBlock(cookingPot);
		
		LanguageRegistry.addName(stove, "Stove");
		LanguageRegistry.addName(counter, "Counter");
		LanguageRegistry.addName(cookingPot, "Cooking Pot");

		// Shaped Block Recipes
		GameRegistry.addRecipe(new ItemStack(stove, 1), new Object[] { "XXX", "XCX", "XXX", 'X', Item.ingotIron, 'C', Item.coal });
		GameRegistry.addRecipe(new ItemStack(counter, 1), new Object[] { "SSS", "XXX", "XXX", 'X', Block.wood, 'S', Block.stone });
		GameRegistry.addRecipe(new ItemStack(cookingPot, 1), new Object[] { "X X", "X X", "XWX", 'X', Item.ingotIron, 'W', Item.bucketWater });

		proxy.registerRenderThings();
		
	}
	
}