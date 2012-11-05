package hybridcraft.common.mod.init;

import hybridcraft.common.handlers.ConfigHandler;
import hybridcraft.common.managers.HybridizingManager;
import hybridcraft.common.mod.lib.BlockHybridizer;
import hybridcraft.common.mod.lib.IngotBlock;
import hybridcraft.common.mod.lib.WorldBlockFall;
import hybridcraft.common.mod.lib.WorldBlockStay;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
	dirtBlock = new IngotBlock(ConfigHandler.dirtBlockID, 0).setStepSound(Block.soundMetalFootstep).setBlockName("dirtBlock").setHardness(3F).setResistance(4F);
	dirtoneBlock = new IngotBlock(ConfigHandler.dirtoneBlockID, 1).setStepSound(Block.soundMetalFootstep).setBlockName("dirtoneBlock").setHardness(3F).setResistance(4F);
	dironBlock = new IngotBlock(ConfigHandler.dironBlockID, 2).setStepSound(Block.soundMetalFootstep).setBlockName("dironBlock").setHardness(3F).setResistance(4F);
	diroldBlock = new IngotBlock(ConfigHandler.diroldBlockID, 3).setStepSound(Block.soundMetalFootstep).setBlockName("diroldBlock").setHardness(3F).setResistance(4F);
	dirmendBlock = new IngotBlock(ConfigHandler.dirmendBlockID, 4).setStepSound(Block.soundMetalFootstep).setBlockName("dirmendBlock").setHardness(3F).setResistance(4F);
	stoneBlock = new IngotBlock(ConfigHandler.stoneBlockID, 5).setStepSound(Block.soundMetalFootstep).setBlockName("stoneBlock").setHardness(3F).setResistance(4F);
	stornBlock = new IngotBlock(ConfigHandler.stornBlockID, 6).setStepSound(Block.soundMetalFootstep).setBlockName("stornBlock").setHardness(3F).setResistance(4F);
	stoldBlock = new IngotBlock(ConfigHandler.stoldBlockID, 7).setStepSound(Block.soundMetalFootstep).setBlockName("stoldBlock").setHardness(3F).setResistance(4F);
	stomendBlock = new IngotBlock(ConfigHandler.stomendBlockID, 8).setStepSound(Block.soundMetalFootstep).setBlockName("stomendBlock").setHardness(3F).setResistance(4F);
	iroldBlock = new IngotBlock(ConfigHandler.iroldBlockID, 9).setStepSound(Block.soundMetalFootstep).setBlockName("iroldBlock").setHardness(3F).setResistance(4F);
	irmendBlock = new IngotBlock(ConfigHandler.irmendBlockID, 10).setStepSound(Block.soundMetalFootstep).setBlockName("irmendBlock").setHardness(3F).setResistance(4F);
	gomendBlock = new IngotBlock(ConfigHandler.gomendBlockID, 11).setStepSound(Block.soundMetalFootstep).setBlockName("gomendBlock").setHardness(3F).setResistance(4F);
	sandBlock = new IngotBlock(ConfigHandler.sandID, 12).setStepSound(Block.soundSandFootstep).setBlockName("sandBlock").setHardness(3F).setResistance(4F);

	// World Blocks
	dand = new WorldBlockFall(ConfigHandler.dandID, 0).setStepSound(Block.soundSandFootstep).setBlockName("dandBlock").setHardness(1F).setResistance(2F);
	davel = new WorldBlockFall(ConfigHandler.davelID, 1).setStepSound(Block.soundGravelFootstep).setBlockName("davelBlock").setHardness(1F).setResistance(2F);
	done = new WorldBlockStay(ConfigHandler.doneID, 2).setStepSound(Block.soundGrassFootstep).setBlockName("doneBlock").setHardness(1F).setResistance(2F);

	// Combiner
	blockHybridizer = new BlockHybridizer(ConfigHandler.combinerBlockID).setBlockName("Hybridizer");
			
	}
}
