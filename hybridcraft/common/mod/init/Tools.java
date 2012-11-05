package hybridcraft.common.mod.init;

import hybridcraft.common.managers.HybridizingManager;
import hybridcraft.common.mod.lib.*;
import hybridcraft.common.handlers.*;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Tools {
	
	public static Item dirtSword;
	public static Item dirtPick;
	public static Item dirtAxe;
	public static Item dirtShovel;
	public static Item dirtHoe;
	public static Item dirtoneSword;
	public static Item dirtonePick;
	public static Item dirtoneAxe;
	public static Item dirtoneShovel;
	public static Item dirtoneHoe;
	public static Item dironSword;
	public static Item dironPick;
	public static Item dironAxe;
	public static Item dironShovel;
	public static Item dironHoe;
	public static Item diroldSword;
	public static Item diroldPick;
	public static Item diroldAxe;
	public static Item diroldShovel;
	public static Item diroldHoe;
	public static Item dirmendSword;
	public static Item dirmendPick;
	public static Item dirmendAxe;
	public static Item dirmendShovel;
	public static Item dirmendHoe;
	public static Item stornSword;
	public static Item stornPick;
	public static Item stornAxe;
	public static Item stornShovel;
	public static Item stornHoe;
	public static Item stoldSword;
	public static Item stoldPick;
	public static Item stoldAxe;
	public static Item stoldShovel;
	public static Item stoldHoe;
	public static Item stomendSword;
	public static Item stomendPick;
	public static Item stomendAxe;
	public static Item stomendShovel;
	public static Item stomendHoe;
	public static Item iroldSword;
	public static Item iroldPick;
	public static Item iroldAxe;
	public static Item iroldShovel;
	public static Item iroldHoe;
	public static Item irmendSword;
	public static Item irmendPick;
	public static Item irmendAxe;
	public static Item irmendShovel;
	public static Item irmendHoe;
	public static Item gomendSword;
	public static Item gomendPick;
	public static Item gomendAxe;
	public static Item gomendShovel;
	public static Item gomendHoe;
	public static Item obsidianSword;
	public static Item obsidianPick;
	public static Item obsidianAxe;
	public static Item obsidianShovel;
	public static Item obsidianHoe;
	public static Item sandSword;
	public static Item sandPick;
	public static Item sandAxe;
	public static Item sandShovel;
	public static Item sandHoe;
	public static Item cobbleSword;
	public static Item cobblePick;
	public static Item cobbleAxe;
	public static Item cobbleShovel;
	public static Item cobbleHoe;
	public static Item emeraldSword;
	public static Item emeraldPick;
	public static Item emeraldAxe;
	public static Item emeraldShovel;
	public static Item emeraldHoe;
	
	
	public static void initItems()
	{
		// Tools
		dirtSword = new ItemHybridSword(ConfigHandler.dirtSwordID, MaterialHandler.dirt).setIconIndex(0).setItemName("dirtSword");
		dirtPick = new ItemHybridPickaxe(ConfigHandler.dirtPickID, MaterialHandler.dirt).setIconIndex(1).setItemName("dirtPick");
		dirtAxe = new ItemHybridAxe(ConfigHandler.dirtAxeID, MaterialHandler.dirt).setIconIndex(2).setItemName("dirtAxe");
		dirtShovel = new ItemHybridSpade(ConfigHandler.dirtShovelID, MaterialHandler.dirt).setIconIndex(3).setItemName("dirtShovel");
		dirtHoe = new ItemHybridHoe(ConfigHandler.dirtHoeID, MaterialHandler.dirt).setIconIndex(4).setItemName("dirtHoe");
		
		dirtoneSword = new ItemHybridSword(ConfigHandler.dirtOneSwordID, MaterialHandler.dirtone).setIconIndex(5).setItemName("dirtoneSword");
		dirtonePick = new ItemHybridPickaxe(ConfigHandler.dirtOnePickID, MaterialHandler.dirtone).setIconIndex(6).setItemName("dirtonePick");
		dirtoneAxe = new ItemHybridAxe(ConfigHandler.dirtOneAxeID, MaterialHandler.dirtone).setIconIndex(7).setItemName("dirtoneAxe");
		dirtoneShovel = new ItemHybridSpade(ConfigHandler.dirtOneShovelID, MaterialHandler.dirtone).setIconIndex(8).setItemName("dirtoneShovel");
		dirtoneHoe = new ItemHybridHoe(ConfigHandler.dirtOneHoeID, MaterialHandler.dirtone).setIconIndex(9).setItemName("dirtoneHoe");
		
		dironSword = new ItemHybridSword(ConfigHandler.dironSwordID, MaterialHandler.dirtone).setIconIndex(10).setItemName("dironSword");
		dironPick = new ItemHybridPickaxe(ConfigHandler.dironPickID, MaterialHandler.diron).setIconIndex(11).setItemName("dironPick");
		dironAxe = new ItemHybridAxe(ConfigHandler.dironAxeID, MaterialHandler.diron).setIconIndex(12).setItemName("dironAxe");
		dironShovel = new ItemHybridSpade(ConfigHandler.dironShovelID,MaterialHandler. diron).setIconIndex(13).setItemName("dironShovel");
		dironHoe = new ItemHybridHoe(ConfigHandler.dironHoeID, MaterialHandler.diron).setIconIndex(14).setItemName("dironHoe");
		
		diroldSword = new ItemHybridSword(ConfigHandler.diroldSwordID, MaterialHandler.dirold).setIconIndex(15).setItemName("diroldSword");
		diroldPick = new ItemHybridPickaxe(ConfigHandler.diroldPickID, MaterialHandler.dirold).setIconIndex(16).setItemName("diroldPick");
		diroldAxe = new ItemHybridAxe(ConfigHandler.diroldAxeID, MaterialHandler.dirold).setIconIndex(17).setItemName("diroldAxe");
		diroldShovel = new ItemHybridSpade(ConfigHandler.diroldShovelID, MaterialHandler.dirold).setIconIndex(18).setItemName("diroldShovel");
		diroldHoe = new ItemHybridHoe(ConfigHandler.diroldHoeID, MaterialHandler.dirold).setIconIndex(19).setItemName("diroldHoe");
		
		dirmendSword = new ItemHybridSword(ConfigHandler.dirmendSwordID, MaterialHandler.dirmend).setIconIndex(20).setItemName("dirmendSword");
		dirmendPick = new ItemHybridPickaxe(ConfigHandler.dirmendPickID, MaterialHandler.dirmend).setIconIndex(21).setItemName("dirmendPick");
		dirmendAxe = new ItemHybridAxe(ConfigHandler.dirmendAxeID, MaterialHandler.dirmend).setIconIndex(22).setItemName("dirmendAxe");
		dirmendShovel = new ItemHybridSpade(ConfigHandler.dirmendShovelID, MaterialHandler.dirmend).setIconIndex(23).setItemName("dirmendShovel");
		dirmendHoe = new ItemHybridHoe(ConfigHandler.dirmendHoeID, MaterialHandler.irmend).setIconIndex(24).setItemName("dirmendHoe");
		
		stornSword = new ItemHybridSword(ConfigHandler.stornSwordID, MaterialHandler.storn).setIconIndex(25).setItemName("stornSword");
		stornPick = new ItemHybridPickaxe(ConfigHandler.stornPickID, MaterialHandler.storn).setIconIndex(26).setItemName("stornPick");
		stornAxe = new ItemHybridAxe(ConfigHandler.stornAxeID, MaterialHandler.storn).setIconIndex(27).setItemName("stornAxe");
		stornShovel = new ItemHybridSpade(ConfigHandler.stornShovelID, MaterialHandler.storn).setIconIndex(28).setItemName("stornShovel");
		stornHoe = new ItemHybridHoe(ConfigHandler.stornHoeID, MaterialHandler.storn).setIconIndex(29).setItemName("stornHoe");
		
		stoldSword = new ItemHybridSword(ConfigHandler.stoldSwordID, MaterialHandler.stold).setIconIndex(30).setItemName("stoldSword");
		stoldPick = new ItemHybridPickaxe(ConfigHandler.stoldPickID, MaterialHandler.stold).setIconIndex(31).setItemName("stoldPick");
		stoldAxe = new ItemHybridAxe(ConfigHandler.stoldAxeID, MaterialHandler.stold).setIconIndex(32).setItemName("stoldAxe");
		stoldShovel = new ItemHybridSpade(ConfigHandler.stoldShovelID, MaterialHandler.stold).setIconIndex(33).setItemName("stoldShovel");
		stoldHoe = new ItemHybridHoe(ConfigHandler.stoldHoeID, MaterialHandler.stold).setIconIndex(34).setItemName("stoldHoe");
		
		stomendSword = new ItemHybridSword(ConfigHandler.stomendSwordID, MaterialHandler.stomend).setIconIndex(35).setItemName("stomendSword");
		stomendPick = new ItemHybridPickaxe(ConfigHandler.stomendPickID, MaterialHandler.stomend).setIconIndex(36).setItemName("stomendPick");
		stomendAxe = new ItemHybridAxe(ConfigHandler.stomendAxeID, MaterialHandler.stomend).setIconIndex(37).setItemName("stomendAxe");
		stomendShovel = new ItemHybridSpade(ConfigHandler.stomendShovelID, MaterialHandler.stomend).setIconIndex(38).setItemName("stomendShovel");
		stomendHoe = new ItemHybridHoe(ConfigHandler.stomendHoeID, MaterialHandler.stomend).setIconIndex(39).setItemName("stomendHoe");
		
		iroldSword = new ItemHybridSword(ConfigHandler.iroldSwordID, MaterialHandler.irold).setIconIndex(40).setItemName("iroldSword");
		iroldPick = new ItemHybridPickaxe(ConfigHandler.iroldPickID, MaterialHandler.irold).setIconIndex(41).setItemName("iroldPick");
		iroldAxe = new ItemHybridAxe(ConfigHandler.iroldAxeID, MaterialHandler.irold).setIconIndex(42).setItemName("iroldAxe");
		iroldShovel = new ItemHybridSpade(ConfigHandler.iroldShovelID, MaterialHandler.irold).setIconIndex(43).setItemName("iroldShovel");
		iroldHoe = new ItemHybridHoe(ConfigHandler.iroldHoeID, MaterialHandler.irold).setIconIndex(44).setItemName("iroldHoe");
		
		irmendSword = new ItemHybridSword(ConfigHandler.irmendSwordID, MaterialHandler.irmend).setIconIndex(45).setItemName("irmendSword");
		irmendPick = new ItemHybridPickaxe(ConfigHandler.irmendPickID, MaterialHandler.irmend).setIconIndex(46).setItemName("irmendPick");
		irmendAxe = new ItemHybridAxe(ConfigHandler.irmendAxeID, MaterialHandler.irmend).setIconIndex(47).setItemName("irmendAxe");
		irmendShovel = new ItemHybridSpade(ConfigHandler.irmendShovelID, MaterialHandler.irmend).setIconIndex(48).setItemName("irmendShovel");
		irmendHoe = new ItemHybridHoe(ConfigHandler.irmendHoeID, MaterialHandler.irmend).setIconIndex(49).setItemName("irmendHoe");
		
		gomendSword = new ItemHybridSword(ConfigHandler.gomendSwordID, MaterialHandler.gomend).setIconIndex(50).setItemName("gomendSword");
		gomendPick = new ItemHybridPickaxe(ConfigHandler.gomendPickID, MaterialHandler.gomend).setIconIndex(51).setItemName("gomendPick");
		gomendAxe = new ItemHybridAxe(ConfigHandler.gomendAxeID, MaterialHandler.gomend).setIconIndex(52).setItemName("gomendAxe");
		gomendShovel = new ItemHybridSpade(ConfigHandler.gomendShovelID, MaterialHandler.gomend).setIconIndex(53).setItemName("gomendShovel");
		gomendHoe = new ItemHybridHoe(ConfigHandler.gomendHoeID, MaterialHandler.gomend).setIconIndex(54).setItemName("gomendHoe");
		
		obsidianSword = new ItemHybridSword(ConfigHandler.obsidianSwordID, MaterialHandler.obsidian).setIconIndex(55).setItemName("obsidianSword");
		obsidianPick = new ItemHybridPickaxe(ConfigHandler.obsidianPickID, MaterialHandler.obsidian).setIconIndex(56).setItemName("obsidianPick");
		obsidianAxe = new ItemHybridAxe(ConfigHandler.obsidianAxeID, MaterialHandler.obsidian).setIconIndex(57).setItemName("obsidianAxe");
		obsidianShovel = new ItemHybridSpade(ConfigHandler.obsidianShovelID, MaterialHandler.obsidian).setIconIndex(58).setItemName("obsidianShovel");
		obsidianHoe = new ItemHybridHoe(ConfigHandler.obsidianHoeID, MaterialHandler.obsidian).setIconIndex(59).setItemName("obsidianHoe");
		
		sandSword = new ItemHybridSword(ConfigHandler.sandSwordID, MaterialHandler.sand).setIconIndex(60).setItemName("sandSword");
		sandPick = new ItemHybridPickaxe(ConfigHandler.sandPickID, MaterialHandler.sand).setIconIndex(61).setItemName("sandPick");
		sandAxe = new ItemHybridAxe(ConfigHandler.sandAxeID, MaterialHandler.sand).setIconIndex(62).setItemName("sandAxe");
		sandShovel = new ItemHybridSpade(ConfigHandler.sandShovelID, MaterialHandler.sand).setIconIndex(63).setItemName("sandShovel");
		sandHoe = new ItemHybridHoe(ConfigHandler.sandHoeID, MaterialHandler.sand).setIconIndex(64).setItemName("sandHoe");
		
		emeraldSword = new ItemHybridSword(ConfigHandler.emeraldSwordID, MaterialHandler.emerald).setIconIndex(70).setItemName("emeraldSword");
		emeraldPick = new ItemHybridPickaxe(ConfigHandler.emeraldPickID, MaterialHandler.emerald).setIconIndex(71).setItemName("emeraldPick");
		emeraldAxe = new ItemHybridAxe(ConfigHandler.emeraldAxeID, MaterialHandler.emerald).setIconIndex(72).setItemName("emeraldAxe");
		emeraldShovel = new ItemHybridSpade(ConfigHandler.emeraldShovelID, MaterialHandler.emerald).setIconIndex(73).setItemName("emeraldShovel");
		emeraldHoe = new ItemHybridHoe(ConfigHandler.emeraldHoeID, MaterialHandler.emerald).setIconIndex(74).setItemName("emeraldHoe");
	}
}
