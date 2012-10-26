package hybridcraft.common.IngotStuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import hybridcraft.common.IngotStuff.HybridModIngotStuff;
import hybridcraft.common.IngotStuff.hybridizer.HybridizingManager;
import hybridcraft.common.IngotStuff.lib.HybridToolMaterials;
import hybridcraft.common.IngotStuff.lib.ItemIDs;

public class ModItems 
{
	// Tools
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
	
	
	public static void initItems()
	{
		// Tools
		dirtSword = new ItemHybridSword(ItemIDs.DIRT_SWORD, HybridToolMaterials.dirt).setIconIndex(0).setItemName("dirtSword");
		dirtPick = new ItemHybridPickaxe(ItemIDs.DIRT_PICK, HybridToolMaterials.dirt).setIconIndex(1).setItemName("dirtPick");
		dirtAxe = new ItemHybridAxe(ItemIDs.DIRT_AXE, HybridToolMaterials.dirt).setIconIndex(2).setItemName("dirtAxe");
		dirtShovel = new ItemHybridSpade(ItemIDs.DIRT_SHOVEL, HybridToolMaterials.dirt).setIconIndex(3).setItemName("dirtShovel");
		dirtHoe = new ItemHybridHoe(ItemIDs.DIRT_HOE, HybridToolMaterials.dirt).setIconIndex(4).setItemName("dirtHoe");
		dirtoneSword = new ItemHybridSword(ItemIDs.DIRTONE_SWORD, HybridToolMaterials.dirtone).setIconIndex(5).setItemName("dirtoneSword");
		dirtonePick = new ItemHybridPickaxe(ItemIDs.DIRTONE_PICK, HybridToolMaterials.dirtone).setIconIndex(6).setItemName("dirtonePick");
		dirtoneAxe = new ItemHybridAxe(ItemIDs.DIRTONE_AXE, HybridToolMaterials.dirtone).setIconIndex(7).setItemName("dirtoneAxe");
		dirtoneShovel = new ItemHybridSpade(ItemIDs.DIRTONE_SHOVEL, HybridToolMaterials.dirtone).setIconIndex(8).setItemName("dirtoneShovel");
		dirtoneHoe = new ItemHybridHoe(ItemIDs.DIRTONE_HOE, HybridToolMaterials.dirtone).setIconIndex(9).setItemName("dirtoneHoe");
		dironSword = new ItemHybridSword(ItemIDs.DIRTONE_SWORD, HybridToolMaterials.dirtone).setIconIndex(10).setItemName("dironSword");
		dironPick = new ItemHybridPickaxe(ItemIDs.DIRON_PICK, HybridToolMaterials.diron).setIconIndex(11).setItemName("dironPick");
		dironAxe = new ItemHybridAxe(ItemIDs.DIRON_AXE, HybridToolMaterials.diron).setIconIndex(12).setItemName("dironAxe");
		dironShovel = new ItemHybridSpade(ItemIDs.DIRON_SHOVEL,HybridToolMaterials. diron).setIconIndex(13).setItemName("dironShovel");
		dironHoe = new ItemHybridHoe(ItemIDs.DIRON_HOE, HybridToolMaterials.diron).setIconIndex(14).setItemName("dironHoe");
		diroldSword = new ItemHybridSword(ItemIDs.DIROLD_SWORD, HybridToolMaterials.dirold).setIconIndex(15).setItemName("diroldSword");
		diroldPick = new ItemHybridPickaxe(ItemIDs.DIROLD_PICK, HybridToolMaterials.dirold).setIconIndex(16).setItemName("diroldPick");
		diroldAxe = new ItemHybridAxe(ItemIDs.DIROLD_AXE, HybridToolMaterials.dirold).setIconIndex(17).setItemName("diroldAxe");
		diroldShovel = new ItemHybridSpade(ItemIDs.DIROLD_SHOVEL, HybridToolMaterials.dirold).setIconIndex(18).setItemName("diroldShovel");
		diroldHoe = new ItemHybridHoe(ItemIDs.DIROLD_HOE, HybridToolMaterials.dirold).setIconIndex(19).setItemName("diroldHoe");
		dirmendSword = new ItemHybridSword(ItemIDs.DIRMEND_SWORD, HybridToolMaterials.dirmend).setIconIndex(20).setItemName("dirmendSword");
		dirmendPick = new ItemHybridPickaxe(ItemIDs.DIRMEND_PICK, HybridToolMaterials.dirmend).setIconIndex(21).setItemName("dirmendPick");
		dirmendAxe = new ItemHybridAxe(ItemIDs.DIRMEND_AXE, HybridToolMaterials.dirmend).setIconIndex(22).setItemName("dirmendAxe");
		dirmendShovel = new ItemHybridSpade(ItemIDs.DIRMEND_SHOVEL, HybridToolMaterials.dirmend).setIconIndex(23).setItemName("dirmendShovel");
		dirmendHoe = new ItemHybridHoe(ItemIDs.DIRMEND_HOE, HybridToolMaterials.irmend).setIconIndex(24).setItemName("dirmendHoe");
		stornSword = new ItemHybridSword(ItemIDs.STORN_SWORD, HybridToolMaterials.storn).setIconIndex(25).setItemName("stornSword");
		stornPick = new ItemHybridPickaxe(ItemIDs.STORN_PICK, HybridToolMaterials.storn).setIconIndex(26).setItemName("stornPick");
		stornAxe = new ItemHybridAxe(ItemIDs.STORN_AXE, HybridToolMaterials.storn).setIconIndex(27).setItemName("stornAxe");
		stornShovel = new ItemHybridSpade(ItemIDs.STORN_SHOVEL, HybridToolMaterials.storn).setIconIndex(28).setItemName("stornShovel");
		stornHoe = new ItemHybridHoe(ItemIDs.STORN_HOE, HybridToolMaterials.storn).setIconIndex(29).setItemName("stornHoe");
		stoldSword = new ItemHybridSword(ItemIDs.STOLD_SWORD, HybridToolMaterials.stold).setIconIndex(30).setItemName("stoldSword");
		stoldPick = new ItemHybridPickaxe(ItemIDs.STOLD_PICK, HybridToolMaterials.stold).setIconIndex(31).setItemName("stoldPick");
		stoldAxe = new ItemHybridAxe(ItemIDs.STOLD_AXE, HybridToolMaterials.stold).setIconIndex(32).setItemName("stoldAxe");
		stoldShovel = new ItemHybridSpade(ItemIDs.STOLD_SHOVEL, HybridToolMaterials.stold).setIconIndex(33).setItemName("stoldShovel");
		stoldHoe = new ItemHybridHoe(ItemIDs.STOLD_HOE, HybridToolMaterials.stold).setIconIndex(34).setItemName("stoldHoe");
		stomendSword = new ItemHybridSword(ItemIDs.STOMEND_SWORD, HybridToolMaterials.stomend).setIconIndex(35).setItemName("stomendSword");
		stomendPick = new ItemHybridPickaxe(ItemIDs.STOMEND_PICK, HybridToolMaterials.stomend).setIconIndex(36).setItemName("stomendPick");
		stomendAxe = new ItemHybridAxe(ItemIDs.STOMEND_AXE, HybridToolMaterials.stomend).setIconIndex(37).setItemName("stomendAxe");
		stomendShovel = new ItemHybridSpade(ItemIDs.STOMEND_SHOVEL, HybridToolMaterials.stomend).setIconIndex(38).setItemName("stomendShovel");
		stomendHoe = new ItemHybridHoe(ItemIDs.STOMEND_HOE, HybridToolMaterials.stomend).setIconIndex(39).setItemName("stomendHoe");
		iroldSword = new ItemHybridSword(ItemIDs.IROLD_SWORD, HybridToolMaterials.irold).setIconIndex(40).setItemName("iroldSword");
		iroldPick = new ItemHybridPickaxe(ItemIDs.IROLD_PICK, HybridToolMaterials.irold).setIconIndex(41).setItemName("iroldPick");
		iroldAxe = new ItemHybridAxe(ItemIDs.IROLD_AXE, HybridToolMaterials.irold).setIconIndex(42).setItemName("iroldAxe");
		iroldShovel = new ItemHybridSpade(ItemIDs.IROLD_SHOVEL, HybridToolMaterials.irold).setIconIndex(43).setItemName("iroldShovel");
		iroldHoe = new ItemHybridHoe(ItemIDs.IROLD_HOE, HybridToolMaterials.irold).setIconIndex(44).setItemName("iroldHoe");
		irmendSword = new ItemHybridSword(ItemIDs.IRMEND_SWORD, HybridToolMaterials.irmend).setIconIndex(45).setItemName("irmendSword");
		irmendPick = new ItemHybridPickaxe(ItemIDs.IRMEND_PICK, HybridToolMaterials.irmend).setIconIndex(46).setItemName("irmendPick");
		irmendAxe = new ItemHybridAxe(ItemIDs.IRMEND_AXE, HybridToolMaterials.irmend).setIconIndex(47).setItemName("irmendAxe");
		irmendShovel = new ItemHybridSpade(ItemIDs.IRMEND_SHOVEL, HybridToolMaterials.irmend).setIconIndex(48).setItemName("irmendShovel");
		irmendHoe = new ItemHybridHoe(ItemIDs.IRMEND_HOE, HybridToolMaterials.irmend).setIconIndex(49).setItemName("irmendHoe");
		gomendSword = new ItemHybridSword(ItemIDs.GOMEND_SWORD, HybridToolMaterials.gomend).setIconIndex(50).setItemName("gomendSword");
		gomendPick = new ItemHybridPickaxe(ItemIDs.GOMEND_PICK, HybridToolMaterials.gomend).setIconIndex(51).setItemName("gomendPick");
		gomendAxe = new ItemHybridAxe(ItemIDs.GOMEND_AXE, HybridToolMaterials.gomend).setIconIndex(52).setItemName("gomendAxe");
		gomendShovel = new ItemHybridSpade(ItemIDs.GOMEND_SHOVEL, HybridToolMaterials.gomend).setIconIndex(53).setItemName("gomendShovel");
		gomendHoe = new ItemHybridHoe(ItemIDs.GOMEND_HOE, HybridToolMaterials.gomend).setIconIndex(54).setItemName("gomendHoe");
		
		// Tool Registry
		LanguageRegistry.addName(dirtSword, "Dirt Sword");
		LanguageRegistry.addName(dirtPick, "Dirt Pickaxe");
		LanguageRegistry.addName(dirtAxe, "Dirt Axe");
		LanguageRegistry.addName(dirtShovel, "Dirt Shovel");
		LanguageRegistry.addName(dirtHoe, "Dirt Hoe");
		LanguageRegistry.addName(dirtoneSword, "Dirtone Sword");
		LanguageRegistry.addName(dirtonePick, "Dirtone Pickaxe");
		LanguageRegistry.addName(dirtoneAxe, "Dirtone Axe");
		LanguageRegistry.addName(dirtoneShovel, "Dirtone Shovel");
		LanguageRegistry.addName(dirtoneHoe, "Dirtone Hoe");
		LanguageRegistry.addName(dironSword, "Diron Sword");
		LanguageRegistry.addName(dironPick, "Diron Pickaxe");
		LanguageRegistry.addName(dironAxe, "Diron Axe");
		LanguageRegistry.addName(dironShovel, "Diron Shovel");
		LanguageRegistry.addName(dironHoe, "Diron Hoe");
		LanguageRegistry.addName(diroldSword, "Dirold Sword");
		LanguageRegistry.addName(diroldPick, "Dirold Pickaxe");
		LanguageRegistry.addName(diroldAxe, "Dirold Axe");
		LanguageRegistry.addName(diroldShovel, "Dirold Shovel");
		LanguageRegistry.addName(diroldHoe, "Dirold Hoe");
		LanguageRegistry.addName(dirmendSword, "Dirmend Sword");
		LanguageRegistry.addName(dirmendPick, "Dirmend Pickaxe");
		LanguageRegistry.addName(dirmendAxe, "Dirmend Axe");
		LanguageRegistry.addName(dirmendShovel, "Dirmend Shovel");
		LanguageRegistry.addName(dirmendHoe, "Dirmend Hoe");
		LanguageRegistry.addName(stornSword, "Storn Sword");
		LanguageRegistry.addName(stornPick, "Storn Pickaxe");
		LanguageRegistry.addName(stornAxe, "Storn Axe");
		LanguageRegistry.addName(stornShovel, "Storn Shovel");
		LanguageRegistry.addName(stornHoe, "Storn Hoe");
		LanguageRegistry.addName(stoldSword, "Stold Sword");
		LanguageRegistry.addName(stoldPick, "Stold Pickaxe");
		LanguageRegistry.addName(stoldAxe, "Stold Axe");
		LanguageRegistry.addName(stoldShovel, "Stold Shovel");
		LanguageRegistry.addName(stoldHoe, "Stold Hoe");
		LanguageRegistry.addName(stomendSword, "Stomend Sword");
		LanguageRegistry.addName(stomendPick, "Stomend Pickaxe");
		LanguageRegistry.addName(stomendAxe, "Stomend Axe");
		LanguageRegistry.addName(stomendShovel, "Stomend Shovel");
		LanguageRegistry.addName(stomendHoe, "Stomend Hoe");
		LanguageRegistry.addName(iroldSword, "Irold Sword");
		LanguageRegistry.addName(iroldPick, "Irold Pickaxe");
		LanguageRegistry.addName(iroldAxe, "Irold Axe");
		LanguageRegistry.addName(iroldShovel, "Irold Shovel");
		LanguageRegistry.addName(iroldHoe, "Irold Hoe");
		LanguageRegistry.addName(irmendSword, "Irmend Sword");
		LanguageRegistry.addName(irmendPick, "Irmend Pickaxe");
		LanguageRegistry.addName(irmendAxe, "Irmend Axe");
		LanguageRegistry.addName(irmendShovel, "Irmend Shovel");
		LanguageRegistry.addName(irmendHoe, "Irmend Hoe");
		LanguageRegistry.addName(gomendSword, "Gomend Sword");
		LanguageRegistry.addName(gomendPick, "Gomend Pickaxe");
		LanguageRegistry.addName(gomendAxe, "Gomend Axe");
		LanguageRegistry.addName(gomendShovel, "Gomend Shovel");
		LanguageRegistry.addName(gomendHoe, "Gomend Hoe");
	}
	
	public static void initRecipies()
	{
		GameRegistry.addRecipe(new ItemStack(dirtSword), new Object[] { "X", "X", "Z", 'X', HybridItems.dirtIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtPick), new Object[] { "XXX", " S ", " S ", 'X', HybridItems.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridItems.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtShovel), new Object[] { "X", "S", "S", 'X', HybridItems.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridItems.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtoneSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().dirtoneIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtonePick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtoneAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtoneShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirtoneHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dironSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().dironIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dironPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dironAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dironShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dironHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(diroldSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().diroldIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(diroldPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(diroldAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(diroldShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(diroldHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirmendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().dirmendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirmendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirmendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirmendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(dirmendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stornSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().stornIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stornPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stornAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stornShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stornHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stoldSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().stoldIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stoldPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stoldAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stoldShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stoldHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stomendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().stomendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stomendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stomendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stomendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(stomendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(iroldSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().iroldIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(iroldPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(iroldAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(iroldShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(iroldHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(irmendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().irmendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(irmendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(irmendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(irmendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(irmendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(gomendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().gomendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(gomendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(gomendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(gomendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(gomendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
	}
}
