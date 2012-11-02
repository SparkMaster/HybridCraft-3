package hybridcraft.common.mod.init;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import hybridcraft.common.managers.HybridizingManager;
import hybridcraft.common.mod.lib.BlockHybridizer;
import hybridcraft.common.mod.lib.IngotBlock;
import hybridcraft.common.mod.lib.WorldBlockFall;
import hybridcraft.common.mod.lib.WorldBlockStay;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;

public class Blocks {

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

	// Kitchen
	public static Block stove;
	public static Block counter;
	public static Block cookingPot;
	
	// Crafting
	public static Block blockHybridizer;
	
	@Init
	public static void initItems() {
	
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

	// Combiner
	blockHybridizer = new BlockHybridizer(hybridcraft.common.mod.lib.Configuration.combinerID).setBlockName("Hybridizer");

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

	// Combiner
	GameRegistry.registerBlock(blockHybridizer);
	LanguageRegistry.addName(blockHybridizer, "Hybridizer");
			
	// Hybridizer
	GameRegistry.addRecipe(new ItemStack(blockHybridizer, 1), new Object[] {"XDX", "DSD", "XDX", 'X', Block.sand, 'D', Block.dirt, 'S',Block.cobblestone });
			
	}
}
