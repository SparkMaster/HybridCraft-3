package hybridcraft.common.mod.init;

import hybridcraft.common.mod.lib.BlockFlowers;
import hybridcraft.common.mod.lib.ItemBlockFlowers;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class Flowers {

	// Flowers
	public static Block oreFlower;
	
	@Init
	public static void initItems() {
		
	// Flowers
	oreFlower = new BlockFlowers(627, 1).setBlockName("oreFlower");
	
	// Flower Registry
	GameRegistry.registerBlock(oreFlower, ItemBlockFlowers.class);
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 0), "Dirt Flower");
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 1), "Stone Flower");
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 2), "Iron Flower");
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 3), "Gold Flower");
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 4), "Diamond Flower");
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 5), "Obsidian Flower");
	LanguageRegistry.addName(new ItemStack(oreFlower, 1, 6), "Emerald Flower");

	// Flowers
	GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 1), new Object[] { new ItemStack(oreFlower, 1, 0) });
	GameRegistry.addShapelessRecipe(new ItemStack(Block.stone, 1), new Object[] { new ItemStack(oreFlower, 1, 1) });
	GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 1), new Object[] { new ItemStack(oreFlower, 1, 2) });
	GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 1), new Object[] { new ItemStack(oreFlower, 1, 3) });
	GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 1), new Object[] { new ItemStack(oreFlower,1, 4) });
	GameRegistry.addShapelessRecipe(new ItemStack(Ingots.obsidianIngot, 1), new Object[] { new ItemStack(oreFlower, 1, 5) });
	GameRegistry.addShapelessRecipe(new ItemStack(Item.emerald, 1), new Object[] { new ItemStack(oreFlower,1 , 6) });


	}

}
