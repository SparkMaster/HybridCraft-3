package hybridcraft.common.handlers;

import hybridcraft.common.mod.init.Blocks;
import hybridcraft.common.mod.init.Flowers;
import hybridcraft.common.mod.lib.ItemBlockFlowers;
import cpw.mods.fml.common.registry.GameRegistry;

public class GameRegHandler {

	public static void loadBlocks() {
	
	// Combiner
	GameRegistry.registerBlock(Blocks.blockHybridizer);
	
	// Flower Registry
	GameRegistry.registerBlock(Flowers.oreFlower, ItemBlockFlowers.class);
	
	}

	
}
