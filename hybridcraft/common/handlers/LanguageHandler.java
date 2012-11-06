package hybridcraft.common.handlers;

import hybridcraft.common.managers.HybridizingManager;
import hybridcraft.common.mod.init.Armors;
import hybridcraft.common.mod.init.Blocks;
import hybridcraft.common.mod.init.Flowers;
import hybridcraft.common.mod.init.Ingots;
import hybridcraft.common.mod.init.Tools;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageHandler {
	

	public static void loadNames(){
		
		// Tool Registry
		LanguageRegistry.addName(Tools.dirtSword, "Dirt Sword");
		LanguageRegistry.addName(Tools.dirtPick, "Dirt Pickaxe");
		LanguageRegistry.addName(Tools.dirtAxe, "Dirt Axe");
		LanguageRegistry.addName(Tools.dirtShovel, "Dirt Shovel");
		LanguageRegistry.addName(Tools.dirtHoe, "Dirt Hoe");
		LanguageRegistry.addName(Tools.dirtoneSword, "Dirtone Sword");
		LanguageRegistry.addName(Tools.dirtonePick, "Dirtone Pickaxe");
		LanguageRegistry.addName(Tools.dirtoneAxe, "Dirtone Axe");
		LanguageRegistry.addName(Tools.dirtoneShovel, "Dirtone Shovel");
		LanguageRegistry.addName(Tools.dirtoneHoe, "Dirtone Hoe");
		LanguageRegistry.addName(Tools.dironSword, "Diron Sword");
		LanguageRegistry.addName(Tools.dironPick, "Diron Pickaxe");
		LanguageRegistry.addName(Tools.dironAxe, "Diron Axe");
		LanguageRegistry.addName(Tools.dironShovel, "Diron Shovel");
		LanguageRegistry.addName(Tools.dironHoe, "Diron Hoe");
		LanguageRegistry.addName(Tools.diroldSword, "Dirold Sword");
		LanguageRegistry.addName(Tools.diroldPick, "Dirold Pickaxe");
		LanguageRegistry.addName(Tools.diroldAxe, "Dirold Axe");
		LanguageRegistry.addName(Tools.diroldShovel, "Dirold Shovel");
		LanguageRegistry.addName(Tools.diroldHoe, "Dirold Hoe");
		LanguageRegistry.addName(Tools.dirmendSword, "Dirmend Sword");
		LanguageRegistry.addName(Tools.dirmendPick, "Dirmend Pickaxe");
		LanguageRegistry.addName(Tools.dirmendAxe, "Dirmend Axe");
		LanguageRegistry.addName(Tools.dirmendShovel, "Dirmend Shovel");
		LanguageRegistry.addName(Tools.dirmendHoe, "Dirmend Hoe");
		LanguageRegistry.addName(Tools.stornSword, "Storn Sword");
		LanguageRegistry.addName(Tools.stornPick, "Storn Pickaxe");
		LanguageRegistry.addName(Tools.stornAxe, "Storn Axe");
		LanguageRegistry.addName(Tools.stornShovel, "Storn Shovel");
		LanguageRegistry.addName(Tools.stornHoe, "Storn Hoe");
		LanguageRegistry.addName(Tools.stoldSword, "Stold Sword");
		LanguageRegistry.addName(Tools.stoldPick, "Stold Pickaxe");
		LanguageRegistry.addName(Tools.stoldAxe, "Stold Axe");
		LanguageRegistry.addName(Tools.stoldShovel, "Stold Shovel");
		LanguageRegistry.addName(Tools.stoldHoe, "Stold Hoe");
		LanguageRegistry.addName(Tools.stomendSword, "Stomend Sword");
		LanguageRegistry.addName(Tools.stomendPick, "Stomend Pickaxe");
		LanguageRegistry.addName(Tools.stomendAxe, "Stomend Axe");
		LanguageRegistry.addName(Tools.stomendShovel, "Stomend Shovel");
		LanguageRegistry.addName(Tools.stomendHoe, "Stomend Hoe");
		LanguageRegistry.addName(Tools.iroldSword, "Irold Sword");
		LanguageRegistry.addName(Tools.iroldPick, "Irold Pickaxe");
		LanguageRegistry.addName(Tools.iroldAxe, "Irold Axe");
		LanguageRegistry.addName(Tools.iroldShovel, "Irold Shovel");
		LanguageRegistry.addName(Tools.iroldHoe, "Irold Hoe");
		LanguageRegistry.addName(Tools.irmendSword, "Irmend Sword");
		LanguageRegistry.addName(Tools.irmendPick, "Irmend Pickaxe");
		LanguageRegistry.addName(Tools.irmendAxe, "Irmend Axe");
		LanguageRegistry.addName(Tools.irmendShovel, "Irmend Shovel");
		LanguageRegistry.addName(Tools.irmendHoe, "Irmend Hoe");
		LanguageRegistry.addName(Tools.gomendSword, "Gomend Sword");
		LanguageRegistry.addName(Tools.gomendPick, "Gomend Pickaxe");
		LanguageRegistry.addName(Tools.gomendAxe, "Gomend Axe");
		LanguageRegistry.addName(Tools.gomendShovel, "Gomend Shovel");
		LanguageRegistry.addName(Tools.gomendHoe, "Gomend Hoe");
		LanguageRegistry.addName(Tools.obsidianSword, "Obsidian Sword");
		LanguageRegistry.addName(Tools.obsidianPick, "Obsidian Pickaxe");
		LanguageRegistry.addName(Tools.obsidianAxe, "Obsidian Axe");
		LanguageRegistry.addName(Tools.obsidianShovel, "Obsidian Shovel");
		LanguageRegistry.addName(Tools.obsidianHoe, "Obsidian Hoe");
		LanguageRegistry.addName(Tools.sandSword, "Sand Sword");
		LanguageRegistry.addName(Tools.sandPick, "Sand Pickaxe");
		LanguageRegistry.addName(Tools.sandAxe, "Sand Axe");
		LanguageRegistry.addName(Tools.sandShovel, "Sand Shovel");
		LanguageRegistry.addName(Tools.sandHoe, "Sand Hoe");
		LanguageRegistry.addName(Tools.emeraldSword, "Emerald Sword");
		LanguageRegistry.addName(Tools.emeraldPick, "Emerald Pickaxe");
		LanguageRegistry.addName(Tools.emeraldAxe, "Emerald Axe");
		LanguageRegistry.addName(Tools.emeraldShovel, "Emerald Shovel");
		LanguageRegistry.addName(Tools.emeraldHoe, "Emerald Hoe");

		
		LanguageRegistry.addName(Ingots.obsidianShard, "Shard o' Obsidian");
		LanguageRegistry.addName(Ingots.obsidianIngot, "Obsidian Ingot");
		LanguageRegistry.addName(Ingots.sandIngot, "Sand Ingot");
		LanguageRegistry.addName(Ingots.dirtIngot, "Dirt Ingot");

		LanguageRegistry.addName(Blocks.dirtBlock, "Dirt Ingot Block");
		LanguageRegistry.addName(Blocks.dirtoneBlock, "Dirtone Ingot Block");
		LanguageRegistry.addName(Blocks.dironBlock, "Diron Ingot Block");
		LanguageRegistry.addName(Blocks.diroldBlock, "Dirold Ingot Block");
		LanguageRegistry.addName(Blocks.dirmendBlock, "Dirmend Ingot Block");
		LanguageRegistry.addName(Blocks.stoneBlock, "Stone Ingot Block");
		LanguageRegistry.addName(Blocks.stornBlock, "Storn Ingot Block");
		LanguageRegistry.addName(Blocks.stoldBlock, "Stold Ingot Block");
		LanguageRegistry.addName(Blocks.stomendBlock, "Stomend Ingot Block");
		LanguageRegistry.addName(Blocks.iroldBlock, "Irold Ingot Block");
		LanguageRegistry.addName(Blocks.irmendBlock, "Irmend Ingot Block");
		LanguageRegistry.addName(Blocks.gomendBlock, "Gomend Ingot Block");
		LanguageRegistry.addName(Blocks.sandBlock, "Sand Ingot Block");
		LanguageRegistry.addName(Blocks.blockHybridizer, "Hybridizer");
		LanguageRegistry.addName(Blocks.dand, "Dirt/Sand Block");
		LanguageRegistry.addName(Blocks.davel, "Dirt/Gravel Block");
		LanguageRegistry.addName(Blocks.done, "Dirt/Stone Block");

		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 0), "Dirt Flower");
		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 1), "Stone Flower");
		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 2), "Iron Flower");
		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 3), "Gold Flower");
		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 4), "Diamond Flower");
		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 5), "Obsidian Flower");
		LanguageRegistry.addName(new ItemStack(Flowers.oreFlower, 1, 6), "Emerald Flower");

		
		// Ingot Registry
		LanguageRegistry.addName(HybridizingManager.dirtoneIngot, "Dirtone Ingot");
		LanguageRegistry.addName(HybridizingManager.dironIngot, "Diron Ingot");
		LanguageRegistry.addName(HybridizingManager.diroldIngot, "Dirold Ingot");
		LanguageRegistry.addName(HybridizingManager.dirmendIngot, "Dirmend Ingot");
		LanguageRegistry.addName(HybridizingManager.stornIngot, "Storn Ingot");
		LanguageRegistry.addName(HybridizingManager.stoldIngot, "Stold Ingot");
		LanguageRegistry.addName(HybridizingManager.stomendIngot, "Stomend Ingot");
		LanguageRegistry.addName(HybridizingManager.iroldIngot, "Irold Ingot");
		LanguageRegistry.addName(HybridizingManager.irmendIngot, "Irmend Ingot");
		LanguageRegistry.addName(HybridizingManager.gomendIngot, "Gomend Ingot");

		LanguageRegistry.addName(Armors.dirtHelmet, "Dirt Helmet");
		LanguageRegistry.addName(Armors.dirtPlate, "Dirt Chestplate");
		LanguageRegistry.addName(Armors.dirtLegs, "Dirt Legs");
		LanguageRegistry.addName(Armors.dirtBoots, "Dirt Boots");
		LanguageRegistry.addName(Armors.dirtoneHelmet, "Dirtone Helmet");
		LanguageRegistry.addName(Armors.dirtonePlate, "Dirtone Chestplate");
		LanguageRegistry.addName(Armors.dirtoneLegs, "Dirtone Legs");
		LanguageRegistry.addName(Armors.dirtoneBoots, "Dirtone Boots");
		LanguageRegistry.addName(Armors.dironHelmet, "Diron Helmet");
		LanguageRegistry.addName(Armors.dironPlate, "Diron Chestplate");
		LanguageRegistry.addName(Armors.dironLegs, "Diron Legs");
		LanguageRegistry.addName(Armors.dironBoots, "Diron Boots");
		LanguageRegistry.addName(Armors.diroldHelmet, "Dirold Helmet");
		LanguageRegistry.addName(Armors.diroldPlate, "Dirold Chestplate");
		LanguageRegistry.addName(Armors.diroldLegs, "Dirold Legs");
		LanguageRegistry.addName(Armors.diroldBoots, "Dirold Boots");
		LanguageRegistry.addName(Armors.dirmendHelmet, "Dirmend Helmet");
		LanguageRegistry.addName(Armors.dirmendPlate, "Dirmend Chestplate");
		LanguageRegistry.addName(Armors.dirmendLegs, "Dirmend Legs");
		LanguageRegistry.addName(Armors.dirmendBoots, "Dirmend Boots");
		LanguageRegistry.addName(Armors.stornHelmet, "Storn Helmet");
		LanguageRegistry.addName(Armors.stornPlate, "Storn Chestplate");
		LanguageRegistry.addName(Armors.stornLegs, "Storn Legs");
		LanguageRegistry.addName(Armors.stornBoots, "Storn Boots");
		LanguageRegistry.addName(Armors.stoldHelmet, "Stold Helmet");
		LanguageRegistry.addName(Armors.stoldPlate, "Stold Chestplate");
		LanguageRegistry.addName(Armors.stoldLegs, "Stold Legs");
		LanguageRegistry.addName(Armors.stoldBoots, "Stold Boots");
		LanguageRegistry.addName(Armors.stomendHelmet, "Stomend Helmet");
		LanguageRegistry.addName(Armors.stomendPlate, "Stomend Chestplate");
		LanguageRegistry.addName(Armors.stomendLegs, "Stomend Legs");
		LanguageRegistry.addName(Armors.stomendBoots, "Stomend Boots");
		LanguageRegistry.addName(Armors.iroldHelmet, "Irold Helmet");
		LanguageRegistry.addName(Armors.iroldPlate, "Irold Chestplate");
		LanguageRegistry.addName(Armors.iroldLegs, "Irold Legs");
		LanguageRegistry.addName(Armors.iroldBoots, "Irold Boots");
		LanguageRegistry.addName(Armors.irmendHelmet, "Irmend Helmet");
		LanguageRegistry.addName(Armors.irmendPlate, "Irmend Chestplate");
		LanguageRegistry.addName(Armors.irmendLegs, "Irmend Legs");
		LanguageRegistry.addName(Armors.irmendBoots, "Irmend Boots");
		LanguageRegistry.addName(Armors.gomendHelmet, "Gomend Helmet");
		LanguageRegistry.addName(Armors.gomendPlate, "Gomend Chestplate");
		LanguageRegistry.addName(Armors.gomendLegs, "Gomend Legs");
		LanguageRegistry.addName(Armors.gomendBoots, "Gomend Boots");
		LanguageRegistry.addName(Armors.obsidianHelmet, "Obsidian Helmet");
		LanguageRegistry.addName(Armors.obsidianPlate, "Obsidian Chestplate");
		LanguageRegistry.addName(Armors.obsidianLegs, "Obsidian Legs");
		LanguageRegistry.addName(Armors.obsidianBoots, "Obsidian Boots");
		LanguageRegistry.addName(Armors.stoneHelmet, "Stone Helmet");
		LanguageRegistry.addName(Armors.stonePlate, "Stone Chestplate");
		LanguageRegistry.addName(Armors.stoneLegs, "Stone Legs");
		LanguageRegistry.addName(Armors.stoneBoots, "Stone Boots");
		LanguageRegistry.addName(Armors.sandHelmet, "Sand Helmet");
		LanguageRegistry.addName(Armors.sandPlate, "Sand Chestplate");
		LanguageRegistry.addName(Armors.sandLegs, "Sand Legs");
		LanguageRegistry.addName(Armors.sandBoots, "Sand Boots");
		LanguageRegistry.addName(Armors.emeraldHelmet, "Emerald Helmet");
		LanguageRegistry.addName(Armors.emeraldPlate, "Emerald Chestplate");
		LanguageRegistry.addName(Armors.emeraldLegs, "Emerald Legs");
		LanguageRegistry.addName(Armors.emeraldBoots, "Emerald Boots");
		
		LanguageRegistry.instance().addStringLocalization("entity.Creleton.name", "Creleton");
	}

}
