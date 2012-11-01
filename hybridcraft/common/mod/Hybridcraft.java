package hybridcraft.common.mod;

import hybridcraft.common.IngotStuff.BlockFlowers;
import hybridcraft.common.IngotStuff.CreativeTabHCM;
import hybridcraft.common.IngotStuff.IngotBlock;
import hybridcraft.common.IngotStuff.Testing;
import hybridcraft.common.IngotStuff.WorldBlockFall;
import hybridcraft.common.IngotStuff.WorldBlockStay;
import hybridcraft.common.IngotStuff.WorldGeneratorHybrid;
import hybridcraft.common.IngotStuff.armor.Dirmend;
import hybridcraft.common.IngotStuff.armor.Dirold;
import hybridcraft.common.IngotStuff.armor.Diron;
import hybridcraft.common.IngotStuff.armor.Dirt;
import hybridcraft.common.IngotStuff.armor.Dirtone;
import hybridcraft.common.IngotStuff.armor.Emerald;
import hybridcraft.common.IngotStuff.armor.Gomend;
import hybridcraft.common.IngotStuff.armor.Irmend;
import hybridcraft.common.IngotStuff.armor.Irold;
import hybridcraft.common.IngotStuff.armor.Obsidian;
import hybridcraft.common.IngotStuff.armor.Sand;
import hybridcraft.common.IngotStuff.armor.Stold;
import hybridcraft.common.IngotStuff.armor.Stomend;
import hybridcraft.common.IngotStuff.armor.Stone;
import hybridcraft.common.IngotStuff.armor.Storn;
import hybridcraft.common.IngotStuff.hybridizer.BlockHybridizer;
import hybridcraft.common.IngotStuff.hybridizer.HybridizingManager;
import hybridcraft.common.IngotStuff.lib.HybridArmorMaterials;
import hybridcraft.common.core.CoreRef;
import hybridcraft.common.core.lib.BioCoal;
import hybridcraft.common.core.lib.OreCoal;
import hybridcraft.common.core.lib.OrganicCoal;
import hybridcraft.common.gui.GuiHandlerFood;
import hybridcraft.common.gui.GuiHandlerMix;
import hybridcraft.common.handlers.ClientPacketHandler;
import hybridcraft.common.handlers.ConfigHandler;
import hybridcraft.common.handlers.CraftingHandler;
import hybridcraft.common.handlers.HybridFuelHandler;
import hybridcraft.common.handlers.ServerPacketHandler;
import hybridcraft.common.mod.init.Ingots;
import hybridcraft.common.mod.init.Tools;
import hybridcraft.common.mod.lib.ItemBlockFlowers;
import hybridcraft.common.proxies.CommonProxyHybrid;
import hybridcraft.common.tile.TileHybrid;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
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

@NetworkMod(clientSideRequired=true, serverSideRequired=false, clientPacketHandlerSpec = @SidedPacketHandler(channels = {"HybridMod" }, packetHandler = ClientPacketHandler.class),
serverPacketHandlerSpec =@SidedPacketHandler(channels = {"HybridMod" }, packetHandler = ServerPacketHandler.class))

public class Hybridcraft
{
	
	// Creative Tabs
	public static CreativeTabs tabsHCM = new CreativeTabHCM(CreativeTabs.getNextID(), CoreRef.HCM_MOD_ID);
	
	// Instance
	@Instance("HybridCraft 3 Materials")
	public static Hybridcraft instance = new Hybridcraft();
	private GuiHandlerMix guiHandlerMix = new GuiHandlerMix();
	private GuiHandlerFood guiHandlerFood = new GuiHandlerFood();

	// Special Block
	public static Block hidden;

	// Proxy
	@SidedProxy(clientSide = hybridcraft.common.core.CoreRef.CLIENT_PROXY_CLASS , serverSide = hybridcraft.common.core.CoreRef.SERVER_PROXY_CLASS)
	public static CommonProxyHybrid proxy;	
	
	//Crafting handler
	private CraftingHandler craftingHandler = new CraftingHandler();
	
	// Armors
	

	// Ingot Blocks
	public static Block dirtBlock;
	public static Block dirtoneBlock;
	public static Block dironBlock;
	public static Block diroldBlock;
	public static Block dirmendBlock;
	public static Block stoneBlock;
	public static Block stornBlock;
	public static Block stoldBlock;
	public static Block stomendBlock;
	public static Block iroldBlock;
	public static Block irmendBlock;
	public static Block gomendBlock;
	public static Block sandBlock;

	// World Blocks
	public static Block dand;
	public static Block davel;
	public static Block done;

	// Flowers
	public static Block oreFlower;
	
	// Crafting
	public static Block blockHybridizer;
	
	// Item List
	public static Item bioCoal;
	public static Item organicCoal;
	
	// Kitchen
	public static Block stove;
	public static Block counter;
	public static Block cookingPot;
	
	// Counter/Stove GUIs
	
	
	// Config
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		//TODO:  Add all of this into config handler
		ConfigHandler config =  new ConfigHandler(event.getSuggestedConfigurationFile());
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		//init mod items
		Tools.initItems();
		Ingots.initItems();
		OreCoal.initItems();
		
		// Special Block
		hidden = new Testing(800).setBlockName("blockHidden");
		GameRegistry.registerBlock(hidden);
		 GameRegistry.addRecipe(new ItemStack(this.hidden, 1), new Object[]{
             "   ", " X ", "   ", Character.valueOf('X'), Block.obsidian
         });
		 
		 // Fuel
		 bioCoal = new BioCoal(1507).setIconIndex(7).setItemName("bioCoal");
		 organicCoal = new OrganicCoal(1508).setIconIndex(8).setItemName("organicCoal");
		 

		// Armors
		
		// Ingot Blocks
		dirtBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.dirtBlockID, 0).setStepSound(Block.soundMetalFootstep).setBlockName("dirtBlock").setHardness(3F).setResistance(4F);
		dirtoneBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.dirtoneBlockID, 1).setStepSound(Block.soundMetalFootstep).setBlockName("dirtoneBlock").setHardness(3F).setResistance(4F);
		dironBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.dironBlockID, 2).setStepSound(Block.soundMetalFootstep).setBlockName("dironBlock").setHardness(3F).setResistance(4F);
		diroldBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.diroldBlockID, 3).setStepSound(Block.soundMetalFootstep).setBlockName("diroldBlock").setHardness(3F).setResistance(4F);
		dirmendBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.dirmendBlockID, 4).setStepSound(Block.soundMetalFootstep).setBlockName("dirmendBlock").setHardness(3F).setResistance(4F);
		stoneBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.stoneBlockID, 5).setStepSound(Block.soundMetalFootstep).setBlockName("stoneBlock").setHardness(3F).setResistance(4F);
		stornBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.stornBlockID, 6).setStepSound(Block.soundMetalFootstep).setBlockName("stornBlock").setHardness(3F).setResistance(4F);
		stoldBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.stoldBlockID, 7).setStepSound(Block.soundMetalFootstep).setBlockName("stoldBlock").setHardness(3F).setResistance(4F);
		stomendBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.stomendBlockID, 8).setStepSound(Block.soundMetalFootstep).setBlockName("stomendBlock").setHardness(3F).setResistance(4F);
		iroldBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.iroldBlockID, 9).setStepSound(Block.soundMetalFootstep).setBlockName("iroldBlock").setHardness(3F).setResistance(4F);
		irmendBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.irmendBlockID, 10).setStepSound(Block.soundMetalFootstep).setBlockName("irmendBlock").setHardness(3F).setResistance(4F);
		gomendBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.gomendBlockID, 11).setStepSound(Block.soundMetalFootstep).setBlockName("gomendBlock").setHardness(3F).setResistance(4F);
		sandBlock = new IngotBlock(hybridcraft.common.mod.lib.Configuration.sandBlockID, 12).setStepSound(Block.soundSandFootstep).setBlockName("sandBlock").setHardness(3F).setResistance(4F);

		// World Blocks
		dand = new WorldBlockFall(hybridcraft.common.mod.lib.Configuration.dandID, 0).setStepSound(Block.soundSandFootstep).setBlockName("dandBlock").setHardness(1F).setResistance(2F);
		davel = new WorldBlockFall(hybridcraft.common.mod.lib.Configuration.davelID, 1).setStepSound(Block.soundGravelFootstep).setBlockName("davelBlock").setHardness(1F).setResistance(2F);
		done = new WorldBlockStay(hybridcraft.common.mod.lib.Configuration.doneID, 2).setStepSound(Block.soundGrassFootstep).setBlockName("doneBlock").setHardness(1F).setResistance(2F);

		// Flowers
		oreFlower = new BlockFlowers(627, 1).setBlockName("oreFlower");

		// Combiner
		blockHybridizer = new BlockHybridizer(hybridcraft.common.mod.lib.Configuration.combinerID).setBlockName("Hybridizer");

		// Register combiner GUI
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerMix);
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerFood);
		GameRegistry.registerTileEntity(TileHybrid.class, "tileEntityHybridM");

		// register the crafting listener
		GameRegistry.registerCraftingHandler(craftingHandler);		

		// Armor Registry
		
		// Ingot Block Registry
		GameRegistry.registerBlock(dirtBlock);
		GameRegistry.registerBlock(dirtoneBlock);
		GameRegistry.registerBlock(dironBlock);
		GameRegistry.registerBlock(diroldBlock);
		GameRegistry.registerBlock(dirmendBlock);
		GameRegistry.registerBlock(stoneBlock);
		GameRegistry.registerBlock(stornBlock);
		GameRegistry.registerBlock(stoldBlock);
		GameRegistry.registerBlock(stomendBlock);
		GameRegistry.registerBlock(iroldBlock);
		GameRegistry.registerBlock(irmendBlock);
		GameRegistry.registerBlock(gomendBlock);
		GameRegistry.registerBlock(sandBlock);
		LanguageRegistry.addName(dirtBlock, "Dirt Ingot Block");
		LanguageRegistry.addName(dirtoneBlock, "Dirtone Ingot Block");
		LanguageRegistry.addName(dironBlock, "Diron Ingot Block");
		LanguageRegistry.addName(diroldBlock, "Dirold Ingot Block");
		LanguageRegistry.addName(dirmendBlock, "Dirmend Ingot Block");
		LanguageRegistry.addName(stoneBlock, "Stone Ingot Block");
		LanguageRegistry.addName(stornBlock, "Storn Ingot Block");
		LanguageRegistry.addName(stoldBlock, "Stold Ingot Block");
		LanguageRegistry.addName(stomendBlock, "Stomend Ingot Block");
		LanguageRegistry.addName(iroldBlock, "Irold Ingot Block");
		LanguageRegistry.addName(irmendBlock, "Irmend Ingot Block");
		LanguageRegistry.addName(gomendBlock, "Gomend Ingot Block");
		LanguageRegistry.addName(sandBlock, "Sand Ingot Block");

		// World Blocks
		GameRegistry.registerBlock(dand);
		GameRegistry.registerBlock(davel);
		GameRegistry.registerBlock(done);
		LanguageRegistry.addName(dand, "Dirt/Sand Block");
		LanguageRegistry.addName(davel, "Dirt/Gravel Block");
		LanguageRegistry.addName(done, "Dirt/Stone Block");

		// World Generator
		GameRegistry.registerWorldGenerator(new WorldGeneratorHybrid());

		// Flower Registry
		GameRegistry.registerBlock(oreFlower, ItemBlockFlowers.class);
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 0), "Dirt Flower");
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 1), "Stone Flower");
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 2), "Iron Flower");
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 3), "Gold Flower");
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 4), "Diamond Flower");
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 5), "Obsidian Flower");
		LanguageRegistry.addName(new ItemStack(oreFlower, 1, 6), "Emerald Flower");

		// Combiner
		GameRegistry.registerBlock(blockHybridizer);
		LanguageRegistry.addName(blockHybridizer, "Hybridizer");

		//Tool Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.obsidianShard, 12), new Object[] { new ItemStack(Block.obsidian), new ItemStack(Item.pickaxeDiamond) });
		GameRegistry.addRecipe(new ItemStack(Ingots.sandIngot), new Object[] { "SSS", "SSS", "SSS", 'S', Block.sand });
		GameRegistry.addRecipe(new ItemStack(Ingots.dirtIngot), new Object[] { "XXX", "XXX", "XXX", 'X', Block.dirt });		
		
		//Armor Recipes
		
		// Block Recipes
		GameRegistry.addRecipe(new ItemStack(dirtBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', Ingots.dirtIngot, });
		GameRegistry.addRecipe(new ItemStack(dirtoneBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dironBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(stornBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(sandBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', Ingots.sandIngot, });

		// Block -> Ingot Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().dirtoneIngot, 9), new Object[] { new ItemStack(dirtoneBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().dironIngot, 9), new Object[] { new ItemStack(dironBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().diroldIngot, 9), new Object[] { new ItemStack(diroldBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().dirmendIngot, 9), new Object[] { new ItemStack(dirmendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().stornIngot, 9), new Object[] { new ItemStack(stornBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().stoldIngot, 9), new Object[] { new ItemStack(stoldBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().stomendIngot, 9), new Object[] { new ItemStack(stomendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().iroldIngot, 9), new Object[] { new ItemStack(iroldBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().irmendIngot, 9), new Object[] { new ItemStack(irmendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().gomendIngot, 9), new Object[] { new ItemStack(gomendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.sandIngot, 9), new Object[] { new ItemStack(sandBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.dirtIngot, 9), new Object[] { new ItemStack(dirtBlock) });

		// Flowers
		GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 1), new Object[] { new ItemStack(oreFlower, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Block.stone, 1), new Object[] { new ItemStack(oreFlower, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 1), new Object[] { new ItemStack(oreFlower, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 1), new Object[] { new ItemStack(oreFlower, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 1), new Object[] { new ItemStack(oreFlower,1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.obsidianIngot, 1), new Object[] { new ItemStack(oreFlower, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.emerald, 1), new Object[] { new ItemStack(oreFlower,1 , 6) });

		// Hybridizer
		GameRegistry.addRecipe(new ItemStack(blockHybridizer, 1), new Object[] { "XDX", "DSD", "XDX", 'X', Block.sand, 'D', Block.dirt, 'S', Block.cobblestone});
		
		// Smelting
		GameRegistry.addSmelting(Ingots.obsidianShard.shiftedIndex, new ItemStack(Ingots.obsidianIngot, 1), 2F);

		// Fuel
		GameRegistry.registerFuelHandler(new HybridFuelHandler());
		
		proxy.registerRenderThings();
		
		
	}
}