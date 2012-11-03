package hybridcraft.common.mod;

import hybridcraft.common.core.CoreRef;
import hybridcraft.common.core.lib.BioCoal;
import hybridcraft.common.core.lib.OreCoal;
import hybridcraft.common.core.lib.OrganicCoal;
import hybridcraft.common.gui.GuiHandlerFood;
import hybridcraft.common.gui.GuiHandlerMix;
import hybridcraft.common.handlers.ClientPacketHandler;
import hybridcraft.common.handlers.CraftingHandler;
import hybridcraft.common.handlers.HybridFuelHandler;
import hybridcraft.common.handlers.ServerPacketHandler;
import hybridcraft.common.managers.CookingPotManager;
import hybridcraft.common.managers.CounterManager;
import hybridcraft.common.managers.StoveManager;
import hybridcraft.common.mod.init.Armors;
import hybridcraft.common.mod.init.Blocks;
import hybridcraft.common.mod.init.Flowers;
import hybridcraft.common.mod.init.Ingots;
import hybridcraft.common.mod.init.Tools;
import hybridcraft.common.mod.lib.CreativeTabHCM;
import hybridcraft.common.mod.lib.WorldGeneratorHybrid;
import hybridcraft.common.proxies.CommonProxyHybrid;
import hybridcraft.common.tile.TileHybrid;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
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

@Mod(modid = CoreRef.HCM_MOD_ID, name = CoreRef.HCM_MOD_NAME, version = CoreRef.HCM_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, clientPacketHandlerSpec = @SidedPacketHandler(channels = { "HybridMod" }, packetHandler = ClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = { "HybridMod" }, packetHandler = ServerPacketHandler.class))
public class Hybridcraft {

	// Creative Tabs
	public static CreativeTabs tabsHCM = new CreativeTabHCM(CreativeTabs.getNextID(), CoreRef.HCM_MOD_ID);

	// Instance
	@Instance("HybridCraft 3 Materials")
	public static Hybridcraft instance = new Hybridcraft();
	private GuiHandlerMix guiHandlerMix = new GuiHandlerMix();
	private GuiHandlerFood guiHandlerFood = new GuiHandlerFood();

	// Proxy
	@SidedProxy(clientSide = hybridcraft.common.core.CoreRef.CLIENT_PROXY_CLASS, serverSide = hybridcraft.common.core.CoreRef.SERVER_PROXY_CLASS)
	public static CommonProxyHybrid proxy;

	// Crafting handler
	private CraftingHandler craftingHandler = new CraftingHandler();

	// Armors

	// Item List
	public static Item bioCoal;
	public static Item organicCoal;

	// Counter/Stove GUIs

	// Config

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		// TODO: Add all of this into config handler
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		Property vernum = config.get("general", "Version", "0.5");
	
	}

	@Init
	public void load(FMLInitializationEvent event) {

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
		
		// Fuel
		bioCoal = new BioCoal(1507).setIconIndex(7).setItemName("bioCoal");
		organicCoal = new OrganicCoal(1508).setIconIndex(8).setItemName("organicCoal");

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

		proxy.registerRenderThings();

	}
}