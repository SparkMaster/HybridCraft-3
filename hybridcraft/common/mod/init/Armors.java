package hybridcraft.common.mod.init;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import hybridcraft.common.managers.HybridizingManager;
import hybridcraft.common.mod.init.Armor.*;
import hybridcraft.common.handlers.*;
//import hybridcraft.common.mod.init.Armor.Dirold;
//import hybridcraft.common.mod.init.Armor.Diron;
//import hybridcraft.common.mod.init.Armor.Dirt;
//import hybridcraft.common.mod.init.Armor.Dirtone;
//import hybridcraft.common.mod.init.Armor.Emerald;
//import hybridcraft.common.mod.init.Armor.Gomend;
//import hybridcraft.common.mod.init.Armor.Irmend;
//import hybridcraft.common.mod.init.Armor.Irold;
//import hybridcraft.common.mod.init.Armor.Obsidian;
//import hybridcraft.common.mod.init.Armor.Sand;
//import hybridcraft.common.mod.init.Armor.Stold;
//import hybridcraft.common.mod.init.Armor.Stomend;
//import hybridcraft.common.mod.init.Armor.Stone;
//import hybridcraft.common.mod.init.Armor.Storn;
import hybridcraft.common.proxies.CommonProxyHybrid;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class Armors {
	
	@SidedProxy(clientSide = hybridcraft.common.core.CoreRef.CLIENT_PROXY_CLASS , serverSide = hybridcraft.common.core.CoreRef.SERVER_PROXY_CLASS)
	public static CommonProxyHybrid proxy;	
	
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
	
	@Init
	public static void initItems() {
	
	dirtHelmet = new Dirt(ConfigHandler.dirtHelmetID, MaterialHandler.dirta, proxy.addArmor("Dirt Helmet"), 0).setItemName("dirtHelm").setIconIndex(0);
	dirtPlate = new Dirt(ConfigHandler.dirtPlateID, MaterialHandler.dirta, proxy.addArmor("Dirt Plate"), 1).setItemName("dirtPlate").setIconIndex(1);
	dirtLegs = new Dirt(ConfigHandler.dirtLegsID, MaterialHandler.dirta, proxy.addArmor("Dirt Legs"), 2).setItemName("dirtLegs").setIconIndex(2);
	dirtBoots = new Dirt(ConfigHandler.dirtBootsID, MaterialHandler.dirta, proxy.addArmor("Dirt Boots"), 3).setItemName("dirtBoots").setIconIndex(3);
	dirtoneHelmet = new Dirtone(ConfigHandler.dirtoneHelmetID, MaterialHandler.dirtonea, proxy.addArmor("Dirtone Helmet"), 0).setItemName("dirtoneHelm").setIconIndex(4);
	dirtonePlate = new Dirtone(ConfigHandler.dirtonePlateID, MaterialHandler.dirtonea, proxy.addArmor("Dirtone Plate"), 1).setItemName("dirtonePlate").setIconIndex(5);
	dirtoneLegs = new Dirtone(ConfigHandler.dirtoneLegsID, MaterialHandler.dirtonea, proxy.addArmor("Dirtone Legs"), 2).setItemName("dirtoneLegs").setIconIndex(6);
	dirtoneBoots = new Dirtone(ConfigHandler.dirtoneBootsID, MaterialHandler.dirtonea, proxy.addArmor("Dirtone Boots"), 3).setItemName("dirtoneBoots").setIconIndex(7);
	dironHelmet = new Diron(ConfigHandler.dironHelmetID, MaterialHandler.dirona, proxy.addArmor("Diron Helmet"), 0).setItemName("dironHelm").setIconIndex(8);
	dironPlate = new Diron(ConfigHandler.dironPlateID, MaterialHandler.dirona, proxy.addArmor("Diron Plate"), 1).setItemName("dironPlate").setIconIndex(9);
	dironLegs = new Diron(ConfigHandler.dironLegsID, MaterialHandler.dirona, proxy.addArmor("Diron Legs"), 2).setItemName("dironLegs").setIconIndex(10);
	dironBoots = new Diron(ConfigHandler.dironBootsID, MaterialHandler.dirona, proxy.addArmor("Diron Boots"), 3).setItemName("dironBoots").setIconIndex(11);
	diroldHelmet = new Dirold(ConfigHandler.diroldHelmetID, MaterialHandler.dirolda, proxy.addArmor("Dirold Helmet"), 0).setItemName("diroldHelm").setIconIndex(12);
	diroldPlate = new Dirold(ConfigHandler.diroldPlateID, MaterialHandler.dirolda, proxy.addArmor("Dirold Plate"), 1).setItemName("diroldPlate").setIconIndex(13);
	diroldLegs = new Dirold(ConfigHandler.diroldLegsID, MaterialHandler.dirolda, proxy.addArmor("Dirold Legs"), 2).setItemName("diroldLegs").setIconIndex(14);
	diroldBoots = new Dirold(ConfigHandler.diroldBootsID, MaterialHandler.dirolda, proxy.addArmor("Dirold Boots"), 3).setItemName("diroldBoots").setIconIndex(15);
	dirmendHelmet = new Dirmend(ConfigHandler.dirmendHelmetID, MaterialHandler.dirmenda, proxy.addArmor("Dirmend Helmet"), 0).setItemName("DirmendHelm").setIconIndex(16);
	dirmendPlate = new Dirmend(ConfigHandler.dirmendPlateID, MaterialHandler.dirmenda, proxy.addArmor("Dirmend Plate"), 1).setItemName("DirmendPlate").setIconIndex(17);
	dirmendLegs = new Dirmend(ConfigHandler.dirmendLegsID, MaterialHandler.dirmenda, proxy.addArmor("Dirmend Legs"), 2).setItemName("DirmendLegs").setIconIndex(18);
	dirmendBoots = new Dirmend(ConfigHandler.dirmendBootsID, MaterialHandler.dirmenda, proxy.addArmor("Dirmend Boots"), 3).setItemName("DirmendBoots").setIconIndex(19);
	stornHelmet = new Storn(ConfigHandler.stornHelmetID, MaterialHandler.storna, proxy.addArmor("Storn Helmet"), 0).setItemName("StornHelm").setIconIndex(20);
	stornPlate = new Storn(ConfigHandler.stornPlateID, MaterialHandler.storna, proxy.addArmor("Storn Plate"), 1).setItemName("StornPlate").setIconIndex(21);
	stornLegs = new Storn(ConfigHandler.stornLegsID, MaterialHandler.storna, proxy.addArmor("Storn Legs"), 2).setItemName("StornLegs").setIconIndex(22);
	stornBoots = new Storn(ConfigHandler.stornBootsID, MaterialHandler.storna, proxy.addArmor("Storn Boots"), 3).setItemName("StornBoots").setIconIndex(23);
	stoldHelmet = new Stold(ConfigHandler.stoldHelmetID,MaterialHandler.stolda, proxy.addArmor("Stold Helmet"), 0).setItemName("StoldHelm").setIconIndex(24);
	stoldPlate = new Stold(ConfigHandler.stoldPlateID, MaterialHandler.stolda, proxy.addArmor("Stold Plate"), 1).setItemName("StoldPlate").setIconIndex(25);
	stoldLegs = new Stold(ConfigHandler.stoldLegsID, MaterialHandler.stolda, proxy.addArmor("Stold Legs"), 2).setItemName("StoldLegs").setIconIndex(26);
	stoldBoots = new Stold(ConfigHandler.stoldBootsID, MaterialHandler.stolda, proxy.addArmor("Stold Boots"), 3).setItemName("StoldBoots").setIconIndex(27);
	stomendHelmet = new Stomend(ConfigHandler.stomendHelmetID, MaterialHandler.stomenda, proxy.addArmor("Stomend Helmet"), 0).setItemName("StomendHelm").setIconIndex(28);
	stomendPlate = new Stomend(ConfigHandler.stomendPlateID, MaterialHandler.stomenda, proxy.addArmor("Stomend Plate"), 1).setItemName("StomendPlate").setIconIndex(29);
	stomendLegs = new Stomend(ConfigHandler.stomendLegsID, MaterialHandler.stomenda, proxy.addArmor("Stomend Legs"), 2).setItemName("StomendLegs").setIconIndex(30);
	stomendBoots = new Stomend(ConfigHandler.stomendBootsID, MaterialHandler.stomenda, proxy.addArmor("Stomend Boots"), 3).setItemName("StomendBoots").setIconIndex(31);
	iroldHelmet = new Irold(ConfigHandler.iroldHelmetID, MaterialHandler.irolda, proxy.addArmor("Irold Helmet"), 0).setItemName("IroldHelm").setIconIndex(32);
	iroldPlate = new Irold(ConfigHandler.iroldPlateID, MaterialHandler.irolda, proxy.addArmor("Irold Plate"), 1).setItemName("IroldPlate").setIconIndex(33);
	iroldLegs = new Irold(ConfigHandler.iroldLegsID, MaterialHandler.irolda, proxy.addArmor("Irold Legs"), 2).setItemName("IroldLegs").setIconIndex(34);
	iroldBoots = new Irold(ConfigHandler.iroldBootsID, MaterialHandler.irolda, proxy.addArmor("Irold Boots"), 3).setItemName("IroldBoots").setIconIndex(35);
	irmendHelmet = new Irmend(ConfigHandler.irmendHelmetID, MaterialHandler.irmenda, proxy.addArmor("Irmend Helmet"), 0).setItemName("IrmendHelm").setIconIndex(36);
	irmendPlate = new Irmend(ConfigHandler.irmendPlateID, MaterialHandler.irmenda, proxy.addArmor("Irmend Plate"), 1).setItemName("IrmendPlate").setIconIndex(37);
	irmendLegs = new Irmend(ConfigHandler.irmendLegsID, MaterialHandler.irmenda, proxy.addArmor("Irmend Legs"), 2).setItemName("IrmendLegs").setIconIndex(38);
	irmendBoots = new Irmend(ConfigHandler.irmendBootsID, MaterialHandler.irmenda, proxy.addArmor("Irmend Boots"), 3).setItemName("IrmendBoots").setIconIndex(39);
	gomendHelmet = new Gomend(ConfigHandler.gomendHelmetID, MaterialHandler.gomenda, proxy.addArmor("Gomend Helmet"), 0).setItemName("GomendHelm").setIconIndex(40);
	gomendPlate = new Gomend(ConfigHandler.gomendPlateID, MaterialHandler.gomenda, proxy.addArmor("Gomend Plate"), 1).setItemName("GomendPlate").setIconIndex(41);
	gomendLegs = new Gomend(ConfigHandler.gomendLegsID, MaterialHandler.gomenda, proxy.addArmor("Gomend Legs"), 2).setItemName("GomendLegs").setIconIndex(42);
	gomendBoots = new Gomend(ConfigHandler.gomendBootsID, MaterialHandler.gomenda, proxy.addArmor("Gomend Boots"), 3).setItemName("GomendBoots").setIconIndex(43);
	obsidianHelmet = new Obsidian(ConfigHandler.obsidianHelmetID, MaterialHandler.obsidiana, proxy.addArmor("Obsidian Helmet"), 0).setItemName("ObsidianHelm").setIconIndex(44);
	obsidianPlate = new Obsidian(ConfigHandler.obsidianPlateID, MaterialHandler.obsidiana, proxy.addArmor("Obsidian Plate"), 1).setItemName("ObsidianPlate").setIconIndex(45);
	obsidianLegs = new Obsidian(ConfigHandler.obsidianLegsID, MaterialHandler.obsidiana, proxy.addArmor("Obsidian Legs"), 2).setItemName("ObsidianLegs").setIconIndex(46);
	obsidianBoots = new Obsidian(ConfigHandler.obsidianBootsID, MaterialHandler.obsidiana, proxy.addArmor("Obsidian Boots"), 3).setItemName("ObsidianBoots").setIconIndex(47);
	stoneHelmet = new Stone(ConfigHandler.stoneHelmetID, MaterialHandler.stonea, proxy.addArmor("Stone Helmet"), 0).setItemName("stoneHelm").setIconIndex(48);
	stonePlate = new Stone(ConfigHandler.stonePlateID, MaterialHandler.stonea, proxy.addArmor("Stone Plate"), 1).setItemName("stonePlate").setIconIndex(49);
	stoneLegs = new Stone(ConfigHandler.stoneLegsID, MaterialHandler.stonea, proxy.addArmor("Stone Legs"), 2).setItemName("stoneLegs").setIconIndex(50);
	stoneBoots = new Stone(ConfigHandler.stoneBootsID, MaterialHandler.stonea, proxy.addArmor("Stone Boots"), 3).setItemName("stoneBoots").setIconIndex(51);
	sandHelmet = new Sand(ConfigHandler.sandHelmetID, MaterialHandler.sanda, proxy.addArmor("Sand Helmet"), 0).setItemName("sandHelm").setIconIndex(52);
	sandPlate = new Sand(ConfigHandler.sandPlateID, MaterialHandler.sanda, proxy.addArmor("Sand Plate"), 1).setItemName("sandPlate").setIconIndex(53);
	sandLegs = new Sand(ConfigHandler.sandLegsID, MaterialHandler.sanda, proxy.addArmor("Sand Legs"), 2).setItemName("sandLegs").setIconIndex(54);
	sandBoots = new Sand(ConfigHandler.sandBootsID, MaterialHandler.sanda, proxy.addArmor("Sand Boots"), 3).setItemName("sandBoots").setIconIndex(55);
	emeraldHelmet = new Emerald(ConfigHandler.emeraldHelmetID, MaterialHandler.emeralda, proxy.addArmor("emerald Helmet"), 0).setItemName("emeraldHelm").setIconIndex(56);
	emeraldPlate = new Emerald(ConfigHandler.emeraldPlateID, MaterialHandler.emeralda, proxy.addArmor("emerald Plate"), 1).setItemName("emeraldPlate").setIconIndex(57);
	emeraldLegs = new Emerald(ConfigHandler.emeraldLegsID, MaterialHandler.emeralda, proxy.addArmor("emerald Legs"), 2).setItemName("emeraldLegs").setIconIndex(58);
	emeraldBoots = new Emerald(ConfigHandler.emeraldBootsID, MaterialHandler.emeralda, proxy.addArmor("emerald Boots"), 3).setItemName("emeraldBoots").setIconIndex(59);

	proxy.registerRenderThings();
	
	}

}

