package hybridcraft.common.IngotStuff;

import java.util.Random;
import hybridcraft.common.IngotStuff.armor.*;
import hybridcraft.common.IngotStuff.handler.CraftingHandler;
import hybridcraft.common.IngotStuff.hybridizer.BlockHybridizer;
import hybridcraft.common.IngotStuff.hybridizer.GuiHandler;
import hybridcraft.common.IngotStuff.hybridizer.HybridizingManager;
import hybridcraft.common.IngotStuff.items.HybridItems;
import hybridcraft.common.IngotStuff.items.ItemIngot;
import hybridcraft.common.IngotStuff.items.ItemBlockFlowers;
import hybridcraft.common.IngotStuff.items.HybridTools;
import hybridcraft.common.IngotStuff.lib.Reference;
import hybridcraft.common.IngotStuff.lib.HybridToolMaterials;
import hybridcraft.common.IngotStuff.lib.HybridArmorMaterials;
import hybridcraft.common.IngotStuff.handler.ConfigHandler;
import hybridcraft.common.core.*;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.Achievement;
import net.minecraft.src.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class HybridModIngotStuff
{

	// Instance
	@Instance("HybridCraft 3 Materials")
	public static HybridModIngotStuff instance = new HybridModIngotStuff();

	// Proxy
	@SidedProxy(clientSide = "hybridcraft.client.ClientProxyHybrid", serverSide = "hybridcraft.common.core.CommonProxyHybrid")
	public static CommonProxyHybrid proxy;
	
	// Combiner GUI
	private GuiHandler guiHandler = new GuiHandler();
	
	//Crafting handler
	private CraftingHandler craftingHandler = new CraftingHandler();

	// Armors
	public static Item dirtHelmet;
	public static Item dirtPlate;
	public static Item dirtLegs;
	public static Item dirtBoots;
	public static Item dirtoneHelmet;
	public static Item dirtonePlate;
	public static Item dirtoneLegs;
	public static Item dirtoneBoots;
	public static Item dironHelmet;
	public static Item dironPlate;
	public static Item dironLegs;
	public static Item dironBoots;
	public static Item diroldHelmet;
	public static Item diroldPlate;
	public static Item diroldLegs;
	public static Item diroldBoots;
	public static Item dirmendHelmet;
	public static Item dirmendPlate;
	public static Item dirmendLegs;
	public static Item dirmendBoots;
	public static Item stornHelmet;
	public static Item stornPlate;
	public static Item stornLegs;
	public static Item stornBoots;
	public static Item stoldHelmet;
	public static Item stoldPlate;
	public static Item stoldLegs;
	public static Item stoldBoots;
	public static Item stomendHelmet;
	public static Item stomendPlate;
	public static Item stomendLegs;
	public static Item stomendBoots;
	public static Item iroldHelmet;
	public static Item iroldPlate;
	public static Item iroldLegs;
	public static Item iroldBoots;
	public static Item irmendHelmet;
	public static Item irmendPlate;
	public static Item irmendLegs;
	public static Item irmendBoots;
	public static Item gomendHelmet;
	public static Item gomendPlate;
	public static Item gomendLegs;
	public static Item gomendBoots;
	public static Item obsidianHelmet;
	public static Item obsidianPlate;
	public static Item obsidianLegs;
	public static Item obsidianBoots;
	public static Item stoneHelmet;
	public static Item stonePlate;
	public static Item stoneLegs;
	public static Item stoneBoots;
	public static Item sandHelmet;
	public static Item sandPlate;
	public static Item sandLegs;
	public static Item sandBoots;
	public static Item emeraldHelmet;
	public static Item emeraldPlate;
	public static Item emeraldLegs;
	public static Item emeraldBoots;

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
	
	// Achievement
	public static final Achievement DirtAchieve = new Achievement(2000, "DirtAchieve", 0, 0, Block.dirt, null).setIndependent().registerAchievement();
	
	public static AchievementPage HC1 = new AchievementPage("HybridCraft2", DirtAchieve);
	
	// Crafting
	public static Block blockHybridizer;
	
	// Config
	public static final String CATEGORY_TOOL = "tools";
	public static final String CATEGORY_INGOT = "ingots";
	public static final String CATEGORY_ARMOR = "armors";
	public static final String CATEGORY_FLOWER = "flowers";

	
	public static int  dirtHelmetID;
	public static int  dirtPlateID;
	public static int  dirtLegsID;
	public static int  dirtBootsID;
	public static int  dirtoneHelmetID;
	public static int  dirtonePlateID;
	public static int  dirtoneLegsID;
	public static int  dirtoneBootsID;
	public static int  dironHelmetID;
	public static int  dironPlateID;
	public static int  dironLegsID;
	public static int  dironBootsID;
	public static int  diroldHelmetID;
	public static int  diroldPlateID;
	public static int  diroldLegsID;
	public static int  diroldBootsID;
	public static int  dirmendHelmetID;
	public static int  dirmendPlateID;
	public static int  dirmendLegsID;
	public static int  dirmendBootsID;
	public static int  stornHelmetID;
	public static int  stornPlateID;
	public static int  stornLegsID;
	public static int  stornBootsID;
	public static int  stoldHelmetID;
	public static int  stoldPlateID;
	public static int  stoldLegsID;
	public static int  stoldBootsID;
	public static int  stomendHelmetID;
	public static int  stomendPlateID;
	public static int  stomendLegsID;
	public static int  stomendBootsID;
	public static int  iroldHelmetID;
	public static int  iroldPlateID;
	public static int  iroldLegsID;
	public static int  iroldBootsID;
	public static int  irmendHelmetID;
	public static int  irmendPlateID;
	public static int  irmendLegsID;
	public static int  irmendBootsID;
	public static int  gomendHelmetID;
	public static int  gomendPlateID;
	public static int  gomendLegsID;
	public static int  gomendBootsID;
	public static int  obsidianHelmetID;
	public static int  obsidianPlateID;
	public static int  obsidianLegsID;
	public static int  obsidianBootsID;
	public static int  dirtBlockID;
	public static int  dirtoneBlockID;
	public static int  dironBlockID;
	public static int  diroldBlockID;
	public static int  dirmendBlockID;
	public static int  stoneBlockID;
	public static int  stornBlockID;
	public static int  stoldBlockID;
	public static int  stomendBlockID;
	public static int  iroldBlockID;
	public static int  irmendBlockID;
	public static int  gomendBlockID;
	public static int  dandID;
	public static int  davelID;
	public static int  doneID;
	public static int  dirtFlowerID;
	public static int  stoneFlowerID;
	public static int  ironFlowerID;
	public static int  goldFlowerID;
	public static int  diamondFlowerID;
	public static int  obsidianFlowerID;
	public static int  sandBlockID;
	public static int  stoneHelmetID;
	public static int  stonePlateID;
	public static int  stoneLegsID;
	public static int  stoneBootsID;
	public static int  sandHelmetID;
	public static int  sandPlateID;
	public static int  sandLegsID;
	public static int  sandBootsID;
	public static int  emeraldhelmetID;
	public static int  emeraldplateID;
	public static int  emeraldlegsID;
	public static int  emeraldbootsID;
	public static int  combinerID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		//TODO:  Add all of this into config handler
		
		ConfigHandler config =  new ConfigHandler(event.getSuggestedConfigurationFile());
		
		config.loadConfig();
		config.getInstance().load();
		
		//armor
		dirtHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Dirt Helmet ", 564).getInt();
		dirtPlateID = config.getInstance().get(CATEGORY_ARMOR, "Dirt Chestplate", 565).getInt();
		dirtLegsID = config.getInstance().get(CATEGORY_ARMOR, "Dirt Leggings", 566).getInt();
		dirtBootsID = config.getInstance().get(CATEGORY_ARMOR, "Dirt Boots", 567).getInt();
		dirtoneHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Dirtone Helmet", 568).getInt();
		dirtonePlateID = config.getInstance().get(CATEGORY_ARMOR, "Dirtone Chestplate", 569).getInt();
		dirtoneLegsID = config.getInstance().get(CATEGORY_ARMOR, "Dirtone Leggings", 570).getInt();
		dirtoneBootsID = config.getInstance().get(CATEGORY_ARMOR, "Dirtone Boots", 571).getInt();
		dironHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Diron Helmet", 572).getInt();
		dironPlateID = config.getInstance().get(CATEGORY_ARMOR, "Diron Chestplate", 573).getInt();
		dironLegsID = config.getInstance().get(CATEGORY_ARMOR, "Diron Leggings", 574).getInt();
		dironBootsID = config.getInstance().get(CATEGORY_ARMOR, "Diron Boots", 575).getInt();
		diroldHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Dirold Helmet", 576).getInt();
		diroldPlateID = config.getInstance().get(CATEGORY_ARMOR, "Dirold Chestplate", 577).getInt();
		diroldLegsID = config.getInstance().get(CATEGORY_ARMOR, "Dirold Leggings", 578).getInt();
		diroldBootsID = config.getInstance().get(CATEGORY_ARMOR, "Dirold Boots", 579).getInt();
		dirmendHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Dirmend Helmet", 580).getInt();
		dirmendPlateID = config.getInstance().get(CATEGORY_ARMOR, "Dirmend Chestplate", 581).getInt();
		dirmendLegsID = config.getInstance().get(CATEGORY_ARMOR, "Dirmend Leggings", 582).getInt();
		dirmendBootsID = config.getInstance().get(CATEGORY_ARMOR, "Dirmend Boots", 583).getInt();
		stornHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Storn Helmet", 584).getInt();
		stornPlateID = config.getInstance().get(CATEGORY_ARMOR, "Storn Chestplate", 585).getInt();
		stornLegsID = config.getInstance().get(CATEGORY_ARMOR, "Storn Leggings", 586).getInt();
		stornBootsID = config.getInstance().get(CATEGORY_ARMOR, "Storn Boots", 587).getInt();
		stoldHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Stold Helmet", 588).getInt();
		stoldPlateID = config.getInstance().get(CATEGORY_ARMOR, "Stold Chestplate", 589).getInt();
		stoldLegsID = config.getInstance().get(CATEGORY_ARMOR, "Stold Leggings", 590).getInt();
		stoldBootsID = config.getInstance().get(CATEGORY_ARMOR, "Stold Boots", 591).getInt();
		stomendHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Stomend Helmet", 592).getInt();
		stomendPlateID = config.getInstance().get(CATEGORY_ARMOR, "Stomend Chestplate", 593).getInt();
		stomendLegsID = config.getInstance().get(CATEGORY_ARMOR, "Stomend Leggings", 594).getInt();
		stomendBootsID = config.getInstance().get(CATEGORY_ARMOR, "Stomend Boots", 595).getInt();
		iroldHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Irold Helmet", 596).getInt();
		iroldPlateID = config.getInstance().get(CATEGORY_ARMOR, "Irold Chestplate", 597).getInt();
		iroldLegsID = config.getInstance().get(CATEGORY_ARMOR, "Irold Leggings", 598).getInt();
		iroldBootsID = config.getInstance().get(CATEGORY_ARMOR, "Irold Boots", 599).getInt();
		irmendHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Irmend Helmet", 600).getInt();
		irmendPlateID = config.getInstance().get(CATEGORY_ARMOR, "Irmend Chestplate", 601).getInt();
		irmendLegsID = config.getInstance().get(CATEGORY_ARMOR, "Irmend Leggings", 602).getInt();
		irmendBootsID = config.getInstance().get(CATEGORY_ARMOR, "Irmend Boots", 603).getInt();
		gomendHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Gomend Helmet", 604).getInt();
		gomendPlateID = config.getInstance().get(CATEGORY_ARMOR, "Gomend Chestplate", 605).getInt();
		gomendLegsID = config.getInstance().get(CATEGORY_ARMOR, "Gomend Leggings", 606).getInt();
		gomendBootsID = config.getInstance().get(CATEGORY_ARMOR, "Gomend Boots", 607).getInt();
		obsidianHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Obsidian Helmet", 608).getInt();
		obsidianPlateID = config.getInstance().get(CATEGORY_ARMOR, "Obsidian Chestplate", 609).getInt();
		obsidianLegsID = config.getInstance().get(CATEGORY_ARMOR, "Obsidian Leggings", 610).getInt();
		obsidianBootsID = config.getInstance().get(CATEGORY_ARMOR, "Obsidian Boots", 611).getInt();
		
		//blocks
		dirtBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirt Ingot Block", 612).getInt();
		dirtoneBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirtone Ingot Block", 613).getInt();
		dironBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Diron Ingot Block", 614).getInt();
		diroldBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirold Ingot Block", 615).getInt();
		dirmendBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirmend Ingot Block", 616).getInt();
		stoneBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK,	"Stone Ingot Block", 617).getInt();
		stornBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK,	"Storn Ingot Block", 618).getInt();
		stoldBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK,	"Stold Ingot Block", 619).getInt();
		stomendBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Stomend Ingot Block", 620).getInt();
		iroldBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK,	"Irold Ingot Block", 621).getInt();
		irmendBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Irmend Ingot Block", 622).getInt();
		gomendBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Gomend Ingot Block", 623).getInt();
		dandID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirt/Sand Block", 624).getInt();
		davelID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirt/Gravel Block",	625).getInt();
		doneID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Dirt/Stone Block", 626).getInt();
		
		//flowers
		
		
		sandBlockID = config.getInstance().get(Configuration.CATEGORY_BLOCK, "Sand Ingot Block", 633).getInt();
		stoneHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Stone Helmet", 634).getInt();
		stonePlateID = config.getInstance().get(CATEGORY_ARMOR, "Stone Chestplate", 635).getInt();
		stoneLegsID = config.getInstance().get(CATEGORY_ARMOR, "Stone Leggings", 636).getInt();
		stoneBootsID = config.getInstance().get(CATEGORY_ARMOR, "Stone Boots", 637).getInt();
		sandHelmetID = config.getInstance().get(CATEGORY_ARMOR, "Sand Helmet", 638).getInt();
		sandPlateID = config.getInstance().get(CATEGORY_ARMOR, "Sand Chestplate", 639).getInt();
		sandLegsID = config.getInstance().get(CATEGORY_ARMOR, "Sand Leggings", 640).getInt();
		sandBootsID = config.getInstance().get(CATEGORY_ARMOR, "Sand Boots", 641).getInt();
		emeraldhelmetID = config.getInstance().get(CATEGORY_ARMOR, "Emerald Helmet", 659).getInt();
		emeraldplateID = config.getInstance().get(CATEGORY_ARMOR, "Emerald Chestplate", 660).getInt();
		emeraldlegsID = config.getInstance().get(CATEGORY_ARMOR, "Emerald Leggings", 661).getInt();
		emeraldbootsID = config.getInstance().get(CATEGORY_ARMOR, "Emerald Boots", 662).getInt();
		combinerID = config.getInstance().get(CATEGORY_ARMOR, "Combiner", 663).getInt();
		
		config.getInstance().save();
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		//init mod items
		HybridTools.initItems();
		HybridItems.initItems();

		// Armors
		dirtHelmet = new Dirt(dirtHelmetID, HybridArmorMaterials.dirta, proxy.addArmor("Dirt Helmet"), 0).setItemName("dirtHelm").setIconIndex(0);
		dirtPlate = new Dirt(dirtPlateID, HybridArmorMaterials.dirta, proxy.addArmor("Dirt Plate"), 1).setItemName("dirtPlate").setIconIndex(1);
		dirtLegs = new Dirt(dirtLegsID, HybridArmorMaterials.dirta, proxy.addArmor("Dirt Legs"), 2).setItemName("dirtLegs").setIconIndex(2);
		dirtBoots = new Dirt(dirtBootsID, HybridArmorMaterials.dirta, proxy.addArmor("Dirt Boots"), 3).setItemName("dirtBoots").setIconIndex(3);
		dirtoneHelmet = new Dirtone(dirtoneHelmetID, HybridArmorMaterials.dirtonea, proxy.addArmor("Dirtone Helmet"), 0).setItemName("dirtoneHelm").setIconIndex(4);
		dirtonePlate = new Dirtone(dirtonePlateID, HybridArmorMaterials.dirtonea, proxy.addArmor("Dirtone Plate"), 1).setItemName("dirtonePlate").setIconIndex(5);
		dirtoneLegs = new Dirtone(dirtoneLegsID, HybridArmorMaterials.dirtonea, proxy.addArmor("Dirtone Legs"), 2).setItemName("dirtoneLegs").setIconIndex(6);
		dirtoneBoots = new Dirtone(dirtoneBootsID, HybridArmorMaterials.dirtonea, proxy.addArmor("Dirtone Boots"), 3).setItemName("dirtoneBoots").setIconIndex(7);
		dironHelmet = new Diron(dironHelmetID, HybridArmorMaterials.dirona, proxy.addArmor("Diron Helmet"), 0).setItemName("dironHelm").setIconIndex(8);
		dironPlate = new Diron(dironPlateID, HybridArmorMaterials.dirona, proxy.addArmor("Diron Plate"), 1).setItemName("dironPlate").setIconIndex(9);
		dironLegs = new Diron(dironLegsID, HybridArmorMaterials.dirona, proxy.addArmor("Diron Legs"), 2).setItemName("dironLegs").setIconIndex(10);
		dironBoots = new Diron(dironBootsID, HybridArmorMaterials.dirona, proxy.addArmor("Diron Boots"), 3).setItemName("dironBoots").setIconIndex(11);
		diroldHelmet = new Dirold(diroldHelmetID, HybridArmorMaterials.dirolda, proxy.addArmor("Dirold Helmet"), 0).setItemName("diroldHelm").setIconIndex(12);
		diroldPlate = new Dirold(diroldPlateID, HybridArmorMaterials.dirolda, proxy.addArmor("Dirold Plate"), 1).setItemName("diroldPlate").setIconIndex(13);
		diroldLegs = new Dirold(diroldLegsID, HybridArmorMaterials.dirolda, proxy.addArmor("Dirold Legs"), 2).setItemName("diroldLegs").setIconIndex(14);
		diroldBoots = new Dirold(diroldBootsID, HybridArmorMaterials.dirolda, proxy.addArmor("Dirold Boots"), 3).setItemName("diroldBoots").setIconIndex(15);
		dirmendHelmet = new Dirmend(dirmendHelmetID, HybridArmorMaterials.dirmenda, proxy.addArmor("Dirmend Helmet"), 0).setItemName("DirmendHelm").setIconIndex(16);
		dirmendPlate = new Dirmend(dirmendPlateID, HybridArmorMaterials.dirmenda, proxy.addArmor("Dirmend Plate"), 1).setItemName("DirmendPlate").setIconIndex(17);
		dirmendLegs = new Dirmend(dirmendLegsID, HybridArmorMaterials.dirmenda, proxy.addArmor("Dirmend Legs"), 2).setItemName("DirmendLegs").setIconIndex(18);
		dirmendBoots = new Dirmend(dirmendBootsID, HybridArmorMaterials.dirmenda, proxy.addArmor("Dirmend Boots"), 3).setItemName("DirmendBoots").setIconIndex(19);
		stornHelmet = new Storn(stornHelmetID, HybridArmorMaterials.storna, proxy.addArmor("Storn Helmet"), 0).setItemName("StornHelm").setIconIndex(20);
		stornPlate = new Storn(stornPlateID, HybridArmorMaterials.storna, proxy.addArmor("Storn Plate"), 1).setItemName("StornPlate").setIconIndex(21);
		stornLegs = new Storn(stornLegsID, HybridArmorMaterials.storna, proxy.addArmor("Storn Legs"), 2).setItemName("StornLegs").setIconIndex(22);
		stornBoots = new Storn(stornBootsID, HybridArmorMaterials.storna, proxy.addArmor("Storn Boots"), 3).setItemName("StornBoots").setIconIndex(23);
		stoldHelmet = new Stold(stoldHelmetID,HybridArmorMaterials.stolda, proxy.addArmor("Stold Helmet"), 0).setItemName("StoldHelm").setIconIndex(24);
		stoldPlate = new Stold(stoldPlateID, HybridArmorMaterials.stolda, proxy.addArmor("Stold Plate"), 1).setItemName("StoldPlate").setIconIndex(25);
		stoldLegs = new Stold(stoldLegsID, HybridArmorMaterials.stolda, proxy.addArmor("Stold Legs"), 2).setItemName("StoldLegs").setIconIndex(26);
		stoldBoots = new Stold(stoldBootsID, HybridArmorMaterials.stolda, proxy.addArmor("Stold Boots"), 3).setItemName("StoldBoots").setIconIndex(27);
		stomendHelmet = new Stomend(stomendHelmetID, HybridArmorMaterials.stomenda, proxy.addArmor("Stomend Helmet"), 0).setItemName("StomendHelm").setIconIndex(28);
		stomendPlate = new Stomend(stomendPlateID, HybridArmorMaterials.stomenda, proxy.addArmor("Stomend Plate"), 1).setItemName("StomendPlate").setIconIndex(29);
		stomendLegs = new Stomend(stomendLegsID, HybridArmorMaterials.stomenda, proxy.addArmor("Stomend Legs"), 2).setItemName("StomendLegs").setIconIndex(30);
		stomendBoots = new Stomend(stomendBootsID, HybridArmorMaterials.stomenda, proxy.addArmor("Stomend Boots"), 3).setItemName("StomendBoots").setIconIndex(31);
		iroldHelmet = new Irold(iroldHelmetID, HybridArmorMaterials.irolda, proxy.addArmor("Irold Helmet"), 0).setItemName("IroldHelm").setIconIndex(32);
		iroldPlate = new Irold(iroldPlateID, HybridArmorMaterials.irolda, proxy.addArmor("Irold Plate"), 1).setItemName("IroldPlate").setIconIndex(33);
		iroldLegs = new Irold(iroldLegsID, HybridArmorMaterials.irolda, proxy.addArmor("Irold Legs"), 2).setItemName("IroldLegs").setIconIndex(34);
		iroldBoots = new Irold(iroldBootsID, HybridArmorMaterials.irolda, proxy.addArmor("Irold Boots"), 3).setItemName("IroldBoots").setIconIndex(35);
		irmendHelmet = new Irmend(irmendHelmetID, HybridArmorMaterials.irmenda, proxy.addArmor("Irmend Helmet"), 0).setItemName("IrmendHelm").setIconIndex(36);
		irmendPlate = new Irmend(irmendPlateID, HybridArmorMaterials.irmenda, proxy.addArmor("Irmend Plate"), 1).setItemName("IrmendPlate").setIconIndex(37);
		irmendLegs = new Irmend(irmendLegsID, HybridArmorMaterials.irmenda, proxy.addArmor("Irmend Legs"), 2).setItemName("IrmendLegs").setIconIndex(38);
		irmendBoots = new Irmend(irmendBootsID, HybridArmorMaterials.irmenda, proxy.addArmor("Irmend Boots"), 3).setItemName("IrmendBoots").setIconIndex(39);
		gomendHelmet = new Gomend(gomendHelmetID, HybridArmorMaterials.gomenda, proxy.addArmor("Gomend Helmet"), 0).setItemName("GomendHelm").setIconIndex(40);
		gomendPlate = new Gomend(gomendPlateID, HybridArmorMaterials.gomenda, proxy.addArmor("Gomend Plate"), 1).setItemName("GomendPlate").setIconIndex(41);
		gomendLegs = new Gomend(gomendLegsID, HybridArmorMaterials.gomenda, proxy.addArmor("Gomend Legs"), 2).setItemName("GomendLegs").setIconIndex(42);
		gomendBoots = new Gomend(gomendBootsID, HybridArmorMaterials.gomenda, proxy.addArmor("Gomend Boots"), 3).setItemName("GomendBoots").setIconIndex(43);
		obsidianHelmet = new Obsidian(obsidianHelmetID, HybridArmorMaterials.obsidiana, proxy.addArmor("Obsidian Helmet"), 0).setItemName("ObsidianHelm").setIconIndex(44);
		obsidianPlate = new Obsidian(obsidianPlateID, HybridArmorMaterials.obsidiana, proxy.addArmor("Obsidian Plate"), 1).setItemName("ObsidianPlate").setIconIndex(45);
		obsidianLegs = new Obsidian(obsidianLegsID, HybridArmorMaterials.obsidiana, proxy.addArmor("Obsidian Legs"), 2).setItemName("ObsidianLegs").setIconIndex(46);
		obsidianBoots = new Obsidian(obsidianBootsID, HybridArmorMaterials.obsidiana, proxy.addArmor("Obsidian Boots"), 3).setItemName("ObsidianBoots").setIconIndex(47);
		stoneHelmet = new Stone(stoneHelmetID, HybridArmorMaterials.stonea, proxy.addArmor("Stone Helmet"), 0).setItemName("stoneHelm").setIconIndex(48);
		stonePlate = new Stone(stonePlateID, HybridArmorMaterials.stonea, proxy.addArmor("Stone Plate"), 1).setItemName("stonePlate").setIconIndex(49);
		stoneLegs = new Stone(stoneLegsID, HybridArmorMaterials.stonea, proxy.addArmor("Stone Legs"), 2).setItemName("stoneLegs").setIconIndex(50);
		stoneBoots = new Stone(stoneBootsID, HybridArmorMaterials.stonea, proxy.addArmor("Stone Boots"), 3).setItemName("stoneBoots").setIconIndex(51);
		sandHelmet = new Sand(sandHelmetID, HybridArmorMaterials.sanda, proxy.addArmor("Sand Helmet"), 0).setItemName("sandHelm").setIconIndex(52);
		sandPlate = new Sand(sandPlateID, HybridArmorMaterials.sanda, proxy.addArmor("Sand Plate"), 1).setItemName("sandPlate").setIconIndex(53);
		sandLegs = new Sand(sandLegsID, HybridArmorMaterials.sanda, proxy.addArmor("Sand Legs"), 2).setItemName("sandLegs").setIconIndex(54);
		sandBoots = new Sand(sandBootsID, HybridArmorMaterials.sanda, proxy.addArmor("Sand Boots"), 3).setItemName("sandBoots").setIconIndex(55);
		emeraldHelmet = new Emerald(emeraldhelmetID, HybridArmorMaterials.emeralda, proxy.addArmor("emerald Helmet"), 0).setItemName("emeraldHelm").setIconIndex(56);
		emeraldPlate = new Emerald(emeraldplateID, HybridArmorMaterials.emeralda, proxy.addArmor("emerald Plate"), 1).setItemName("emeraldPlate").setIconIndex(57);
		emeraldLegs = new Emerald(emeraldlegsID, HybridArmorMaterials.emeralda, proxy.addArmor("emerald Legs"), 2).setItemName("emeraldLegs").setIconIndex(58);
		emeraldBoots = new Emerald(emeraldbootsID, HybridArmorMaterials.emeralda, proxy.addArmor("emerald Boots"), 3).setItemName("emeraldBoots").setIconIndex(59);

		// Ingot Blocks
		dirtBlock = new IngotBlock(dirtBlockID, 0).setStepSound(Block.soundMetalFootstep).setBlockName("dirtBlock").setHardness(3F).setResistance(4F);
		dirtoneBlock = new IngotBlock(dirtoneBlockID, 1).setStepSound(Block.soundMetalFootstep).setBlockName("dirtoneBlock").setHardness(3F).setResistance(4F);
		dironBlock = new IngotBlock(dironBlockID, 2).setStepSound(Block.soundMetalFootstep).setBlockName("dironBlock").setHardness(3F).setResistance(4F);
		diroldBlock = new IngotBlock(diroldBlockID, 3).setStepSound(Block.soundMetalFootstep).setBlockName("diroldBlock").setHardness(3F).setResistance(4F);
		dirmendBlock = new IngotBlock(dirmendBlockID, 4).setStepSound(Block.soundMetalFootstep).setBlockName("dirmendBlock").setHardness(3F).setResistance(4F);
		stoneBlock = new IngotBlock(stoneBlockID, 5).setStepSound(Block.soundMetalFootstep).setBlockName("stoneBlock").setHardness(3F).setResistance(4F);
		stornBlock = new IngotBlock(stornBlockID, 6).setStepSound(Block.soundMetalFootstep).setBlockName("stornBlock").setHardness(3F).setResistance(4F);
		stoldBlock = new IngotBlock(stoldBlockID, 7).setStepSound(Block.soundMetalFootstep).setBlockName("stoldBlock").setHardness(3F).setResistance(4F);
		stomendBlock = new IngotBlock(stomendBlockID, 8).setStepSound(Block.soundMetalFootstep).setBlockName("stomendBlock").setHardness(3F).setResistance(4F);
		iroldBlock = new IngotBlock(iroldBlockID, 9).setStepSound(Block.soundMetalFootstep).setBlockName("iroldBlock").setHardness(3F).setResistance(4F);
		irmendBlock = new IngotBlock(irmendBlockID, 10).setStepSound(Block.soundMetalFootstep).setBlockName("irmendBlock").setHardness(3F).setResistance(4F);
		gomendBlock = new IngotBlock(gomendBlockID, 11).setStepSound(Block.soundMetalFootstep).setBlockName("gomendBlock").setHardness(3F).setResistance(4F);
		sandBlock = new IngotBlock(sandBlockID, 12).setStepSound(Block.soundSandFootstep).setBlockName("sandBlock").setHardness(3F).setResistance(4F);

		// World Blocks
		dand = new WorldBlockFall(dandID, 0).setStepSound(Block.soundSandFootstep).setBlockName("dandBlock").setHardness(1F).setResistance(2F);
		davel = new WorldBlockFall(davelID, 1).setStepSound(Block.soundGravelFootstep).setBlockName("davelBlock").setHardness(1F).setResistance(2F);
		done = new WorldBlockStay(doneID, 2).setStepSound(Block.soundGrassFootstep).setBlockName("doneBlock").setHardness(1F).setResistance(2F);

		// Flowers
		oreFlower = new BlockFlowers(627, 1).setBlockName("oreFlower");

		// Combiner
		blockHybridizer = new BlockHybridizer(combinerID).setBlockName("Hybridizer");

		// Register combiner GUI
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);


		// register the crafting listener
		GameRegistry.registerCraftingHandler(craftingHandler);		

		// Armor Registry
		LanguageRegistry.addName(dirtHelmet, "Dirt Helmet");
		LanguageRegistry.addName(dirtPlate, "Dirt Chestplate");
		LanguageRegistry.addName(dirtLegs, "Dirt Legs");
		LanguageRegistry.addName(dirtBoots, "Dirt Boots");
		LanguageRegistry.addName(dirtoneHelmet, "Dirtone Helmet");
		LanguageRegistry.addName(dirtonePlate, "Dirtone Chestplate");
		LanguageRegistry.addName(dirtoneLegs, "Dirtone Legs");
		LanguageRegistry.addName(dirtoneBoots, "Dirtone Boots");
		LanguageRegistry.addName(dironHelmet, "Diron Helmet");
		LanguageRegistry.addName(dironPlate, "Diron Chestplate");
		LanguageRegistry.addName(dironLegs, "Diron Legs");
		LanguageRegistry.addName(dironBoots, "Diron Boots");
		LanguageRegistry.addName(diroldHelmet, "Dirold Helmet");
		LanguageRegistry.addName(diroldPlate, "Dirold Chestplate");
		LanguageRegistry.addName(diroldLegs, "Dirold Legs");
		LanguageRegistry.addName(diroldBoots, "Dirold Boots");
		LanguageRegistry.addName(dirmendHelmet, "Dirmend Helmet");
		LanguageRegistry.addName(dirmendPlate, "Dirmend Chestplate");
		LanguageRegistry.addName(dirmendLegs, "Dirmend Legs");
		LanguageRegistry.addName(dirmendBoots, "Dirmend Boots");
		LanguageRegistry.addName(stornHelmet, "Storn Helmet");
		LanguageRegistry.addName(stornPlate, "Storn Chestplate");
		LanguageRegistry.addName(stornLegs, "Storn Legs");
		LanguageRegistry.addName(stornBoots, "Storn Boots");
		LanguageRegistry.addName(stoldHelmet, "Stold Helmet");
		LanguageRegistry.addName(stoldPlate, "Stold Chestplate");
		LanguageRegistry.addName(stoldLegs, "Stold Legs");
		LanguageRegistry.addName(stoldBoots, "Stold Boots");
		LanguageRegistry.addName(stomendHelmet, "Stomend Helmet");
		LanguageRegistry.addName(stomendPlate, "Stomend Chestplate");
		LanguageRegistry.addName(stomendLegs, "Stomend Legs");
		LanguageRegistry.addName(stomendBoots, "Stomend Boots");
		LanguageRegistry.addName(iroldHelmet, "Irold Helmet");
		LanguageRegistry.addName(iroldPlate, "Irold Chestplate");
		LanguageRegistry.addName(iroldLegs, "Irold Legs");
		LanguageRegistry.addName(iroldBoots, "Irold Boots");
		LanguageRegistry.addName(irmendHelmet, "Irmend Helmet");
		LanguageRegistry.addName(irmendPlate, "Irmend Chestplate");
		LanguageRegistry.addName(irmendLegs, "Irmend Legs");
		LanguageRegistry.addName(irmendBoots, "Irmend Boots");
		LanguageRegistry.addName(gomendHelmet, "Gomend Helmet");
		LanguageRegistry.addName(gomendPlate, "Gomend Chestplate");
		LanguageRegistry.addName(gomendLegs, "Gomend Legs");
		LanguageRegistry.addName(gomendBoots, "Gomend Boots");
		LanguageRegistry.addName(obsidianHelmet, "Obsidian Helmet");
		LanguageRegistry.addName(obsidianPlate, "Obsidian Chestplate");
		LanguageRegistry.addName(obsidianLegs, "Obsidian Legs");
		LanguageRegistry.addName(obsidianBoots, "Obsidian Boots");
		LanguageRegistry.addName(stoneHelmet, "Stone Helmet");
		LanguageRegistry.addName(stonePlate, "Stone Chestplate");
		LanguageRegistry.addName(stoneLegs, "Stone Legs");
		LanguageRegistry.addName(stoneBoots, "Stone Boots");
		LanguageRegistry.addName(sandHelmet, "Sand Helmet");
		LanguageRegistry.addName(sandPlate, "Sand Chestplate");
		LanguageRegistry.addName(sandLegs, "Sand Legs");
		LanguageRegistry.addName(sandBoots, "Sand Boots");
		LanguageRegistry.addName(emeraldHelmet, "Emerald Helmet");
		LanguageRegistry.addName(emeraldPlate, "Emerald Chestplate");
		LanguageRegistry.addName(emeraldLegs, "Emerald Legs");
		LanguageRegistry.addName(emeraldBoots, "Emerald Boots");

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

		// //Tool Recipes

		GameRegistry.addShapelessRecipe(new ItemStack(HybridItems.obsidianShard, 12), new Object[] { new ItemStack(Block.obsidian), new ItemStack(Item.pickaxeDiamond) });
		GameRegistry.addRecipe(new ItemStack(HybridItems.sandIngot), new Object[] { "SSS", "SSS", "SSS", 'S', Block.sand });
		GameRegistry.addRecipe(new ItemStack(HybridItems.dirtIngot), new Object[] { "XXX", "XXX", "XXX", 'X', Block.dirt });		
		

		// //Armor Recipes
		GameRegistry.addRecipe(new ItemStack(dirtHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridItems.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(dirtHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridItems.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(dirtPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridItems.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(dirtLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridItems.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(dirtBoots), new Object[] { "X X", "X X", "   ", 'X', HybridItems.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(dirtBoots), new Object[] { "   ", "X X", "X X", 'X', HybridItems.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(dirtoneHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dirtoneHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dirtonePlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dirtoneLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dirtoneBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dirtoneBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(dironHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(dironHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(dironPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(dironLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(dironBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(dironBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(diroldBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(dirmendBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(stornHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stornHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stornPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stornLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stornBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stornBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stoldBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(stomendBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(iroldBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(irmendBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendBoots), new Object[] { "X X", "X X", "   ", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(gomendBoots), new Object[] { "   ", "X X", "X X", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(obsidianHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridItems.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(obsidianHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridItems.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(obsidianPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridItems.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(obsidianLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridItems.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(obsidianBoots), new Object[] { "X X", "X X", "   ", 'X', HybridItems.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(obsidianBoots), new Object[] { "   ", "X X", "X X", 'X', HybridItems.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(sandHelmet), new Object[] { "XXX", "X X", "   ", 'X', HybridItems.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(sandHelmet), new Object[] { "   ", "XXX", "X X", 'X', HybridItems.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(sandPlate), new Object[] { "X X", "XXX", "XXX", 'X', HybridItems.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(sandLegs), new Object[] { "XXX", "X X", "X X", 'X', HybridItems.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(sandBoots), new Object[] { "X X", "X X", "   ", 'X', HybridItems.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(sandBoots), new Object[] { "   ", "X X", "X X", 'X', HybridItems.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(emeraldHelmet), new Object[] { "XXX", "X X", "   ", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(emeraldHelmet), new Object[] { "   ", "XXX", "X X", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(emeraldPlate), new Object[] { "X X", "XXX", "XXX", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(emeraldLegs), new Object[] { "XXX", "X X", "X X", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(emeraldBoots), new Object[] { "X X", "X X", "   ", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(emeraldBoots), new Object[] { "   ", "X X", "X X", 'X', Item.emerald, });

		// Block Recipes
		GameRegistry.addRecipe(new ItemStack(dirtBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridItems.dirtIngot, });
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
		GameRegistry.addRecipe(new ItemStack(sandBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridItems.sandIngot, });

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
		GameRegistry.addShapelessRecipe(new ItemStack(HybridItems.sandIngot, 9), new Object[] { new ItemStack(sandBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridItems.dirtIngot, 9), new Object[] { new ItemStack(dirtBlock) });

		// Flowers
		GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 1), new Object[] { new ItemStack(oreFlower, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Block.stone, 1), new Object[] { new ItemStack(oreFlower, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 1), new Object[] { new ItemStack(oreFlower, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 1), new Object[] { new ItemStack(oreFlower, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 1), new Object[] { new ItemStack(oreFlower,1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridItems.obsidianIngot, 1), new Object[] { new ItemStack(oreFlower, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.emerald, 1), new Object[] { new ItemStack(oreFlower,1 , 6) });

		// Hybridizer
		GameRegistry.addRecipe(new ItemStack(blockHybridizer, 1), new Object[] { "XDX", "DSD", "XDX", 'X', Block.sand, 'D', Block.dirt, 'S', Block.cobblestone});
		
		// Smelting
		GameRegistry.addSmelting(HybridItems.obsidianShard.shiftedIndex, new ItemStack(HybridItems.obsidianIngot, 1), 2F);

		proxy.registerRenderThings();
		
		
		HybridTools.initRecipies();
	
	
	
	
	}

	
	
	

}