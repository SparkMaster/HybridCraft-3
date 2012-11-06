package hybridcraft.common.mod;

import hybridcraft.common.core.CoreRef;
import hybridcraft.common.core.lib.BioCoal;
import hybridcraft.common.core.lib.OreCoal;
import hybridcraft.common.core.lib.OrganicCoal;
import hybridcraft.common.gui.GuiHandlerFood;
import hybridcraft.common.gui.GuiHandlerMix;
import hybridcraft.common.handlers.AchievementHandler;
import hybridcraft.common.handlers.ClientPacketHandler;
import hybridcraft.common.handlers.ConfigHandler;
import hybridcraft.common.handlers.CraftingHandler;
import hybridcraft.common.handlers.GameRegHandler;
import hybridcraft.common.handlers.HybridFuelHandler;
import hybridcraft.common.handlers.LanguageHandler;
import hybridcraft.common.handlers.RecipeHandler;
import hybridcraft.common.handlers.ServerPacketHandler;
import hybridcraft.common.managers.CookingPotManager;
import hybridcraft.common.managers.CounterManager;
import hybridcraft.common.managers.StoveManager;
import hybridcraft.common.mod.init.Armors;
import hybridcraft.common.mod.init.Blocks;
import hybridcraft.common.mod.init.Flowers;
import hybridcraft.common.mod.init.Ingots;
import hybridcraft.common.mod.init.Tools;
import hybridcraft.common.mod.init.Torches;
import hybridcraft.common.mod.lib.CreativeTabHCM;
import hybridcraft.common.mod.lib.WorldGeneratorHybrid;
import hybridcraft.common.proxies.CommonProxyHybrid;
import hybridcraft.common.tile.TileHybrid;
import net.minecraft.src.Achievement;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumCreatureType;
import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = CoreRef.HCM_MOD_ID, name = CoreRef.HCM_MOD_NAME, version = CoreRef.HCM_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, clientPacketHandlerSpec = @SidedPacketHandler(channels = { "HybridMod" }, packetHandler = ClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = { "HybridMod" }, packetHandler = ServerPacketHandler.class))
public class Hybridcraft {

	// Creative Tabs
	public static CreativeTabs tabsHCM = new CreativeTabHCM(CreativeTabs.getNextID(), CoreRef.HCM_MOD_ID);

	// Instance
	@Instance("hybridcraft.common.core.CoreRef.HCM_MOD_ID")
	public static Hybridcraft instance = new Hybridcraft();
	private GuiHandlerMix guiHandlerMix = new GuiHandlerMix();
	private GuiHandlerFood guiHandlerFood = new GuiHandlerFood();

	// Proxy
	@SidedProxy(clientSide = hybridcraft.common.core.CoreRef.CLIENT_PROXY_CLASS, serverSide = hybridcraft.common.core.CoreRef.SERVER_PROXY_CLASS)
	public static CommonProxyHybrid proxy;
	
	// Crafting handler
	private CraftingHandler craftingHandler = new CraftingHandler();
	
	
	// Item List
	public static Item bioCoal;
	public static Item organicCoal;
	
	//Sparkling Blocks
	public static Block sparkle;
	
	//Torches
	public static Block dirtTorch;
	public static Block stoneTorch;
	public static Block cobbleTorch;
	public static Block sandTorch;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		// TODO: Add all of this into config handler
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		ConfigHandler.loadConfig(config);
		
	}

	@Init
	public void load(FMLInitializationEvent event) {

		//Colors
		int greenColor = (0x00FF00);
	    int grayColor = (0x8E8E8E);
		
		// init mod items
		Ingots.initItems();
		Armors.initItems();
		Blocks.initItems();
		Tools.initItems();
		Flowers.initItems();
		OreCoal.initItems();
		CounterManager.getInstance();
		StoveManager.getInstance();
		CookingPotManager.getInstance();
		GameRegHandler.loadBlocks();
		LanguageHandler.loadNames();
		RecipeHandler.loadRecipes();
		AchievementHandler.loadAchievements();

		
		// Fuel
		bioCoal = new BioCoal(1507).setIconIndex(7).setItemName("bioCoal");
		organicCoal = new OrganicCoal(1508).setIconIndex(8).setItemName("organicCoal");

		//Sparkle
		sparkle = new BlockSparkle(2091, 1).setBlockName("Sparklez");
		
		//Torches
		dirtTorch = new Torches(823, 80).setHardness(0.0F).setLightValue(0.1736F).setStepSound(Block.soundWoodFootstep).setBlockName("torch").setRequiresSelfNotify();
		stoneTorch = new Torches(824, 80).setHardness(0.0F).setLightValue(0.2604F).setStepSound(Block.soundWoodFootstep).setBlockName("torch").setRequiresSelfNotify();
		cobbleTorch = new Torches(825, 80).setHardness(0.0F).setLightValue(0.2174F).setStepSound(Block.soundWoodFootstep).setBlockName("torch").setRequiresSelfNotify();
		sandTorch = new Torches(826, 80).setHardness(0.0F).setLightValue(0.2405F).setStepSound(Block.soundWoodFootstep).setBlockName("torch").setRequiresSelfNotify();
		
		/** Mobs 
		 * Entries for Mobs move later...
		 * */
		
		 //Register mob
	    ModLoader.registerEntityID(EntityCreleton.class,"Creleton",ModLoader.getUniqueEntityId(), grayColor,greenColor);

	    //Localize mob name
	    LanguageRegistry.instance().addStringLocalization("entity.Creleton.name", "en_US", "Creleton");

	    //Add mob spawn
	    ModLoader.addSpawn(EntityCreleton.class, 2, 1, 2, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.desert, BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.taiga);
		
	    
		// Register combiner GUI
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerMix);
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerFood);
		GameRegistry.registerTileEntity(TileHybrid.class, "tileEntityHybridM");

		// register the crafting listener
		GameRegistry.registerCraftingHandler(craftingHandler);

		// World Generator
		GameRegistry.registerWorldGenerator(new WorldGeneratorHybrid());

		// Fuel
		GameRegistry.registerFuelHandler(new HybridFuelHandler());
		
		//Sparkle
		GameRegistry.registerBlock(sparkle);
		LanguageRegistry.addName(sparkle, "Sparkz");
		
		//Torches
		GameRegistry.registerBlock(dirtTorch);
		GameRegistry.registerBlock(cobbleTorch);
		GameRegistry.registerBlock(sandTorch);
		GameRegistry.registerBlock(stoneTorch);
		LanguageRegistry.addName(dirtTorch, "Dirt Torch");
		LanguageRegistry.addName(sandTorch, "Sand Torch");
		LanguageRegistry.addName(cobbleTorch, "Cobble Torch");
		LanguageRegistry.addName(stoneTorch, "Stone Torch");
		
		proxy.registerRenderThings();
	}
}