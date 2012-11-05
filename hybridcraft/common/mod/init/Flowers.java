package hybridcraft.common.mod.init;

import hybridcraft.common.handlers.ConfigHandler;
import hybridcraft.common.mod.lib.BlockFlowers;
import hybridcraft.common.mod.lib.ItemBlockFlowers;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Flowers {

	// Flowers
	public static Block oreFlower;
	
	@Init
	public static void initItems() {
	
	// Flowers
	oreFlower = new BlockFlowers(ConfigHandler.oreFlowerID, 0).setBlockName("oreFlower");

	
	}

}
