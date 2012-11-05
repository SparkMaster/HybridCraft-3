package hybridcraft.common.handlers;

import hybridcraft.common.core.lib.OreCoal;
import hybridcraft.common.managers.HybridizingManager;
import hybridcraft.common.mod.init.Armors;
import hybridcraft.common.mod.init.Blocks;
import hybridcraft.common.mod.init.Flowers;
import hybridcraft.common.mod.init.Ingots;
import hybridcraft.common.mod.init.Tools;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;




public class RecipeHandler {
	
	public static void loadRecipes() {
		
		//Ingot Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.obsidianShard, 12), new Object[] { new ItemStack(Block.obsidian), new ItemStack(Item.pickaxeDiamond) });
		GameRegistry.addRecipe(new ItemStack(Ingots.sandIngot), new Object[] { "SSS", "SSS", "SSS", 'S', Block.sand });
		GameRegistry.addRecipe(new ItemStack(Ingots.dirtIngot), new Object[] { "XXX", "XXX", "XXX", 'X', Block.dirt });		

		// Ingot Recipes
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().dirtoneIngot), new Object[] { "XXX", "SSS", "XXX", 'X', Block.dirt, 'S', Block.stone, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().dironIngot), new Object[] { "XXX", "XIX", "XXX", 'X', Block.dirt, 'I', Item.ingotIron, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().diroldIngot), new Object[] { "XXX", "XGX", "XXX", 'X', Block.dirt, 'G', Item.ingotGold, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().dirmendIngot), new Object[] { "XXX", "XDX", "XXX", 'X', Block.dirt, 'D', Item.diamond, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().stornIngot), new Object[] { "XXX", "XIX", "XXX", 'X', Block.stone, 'I', Item.ingotIron, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().stoldIngot), new Object[] { "XXX", "XGX", "XXX", 'X', Block.stone, 'G', Item.ingotGold, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().stomendIngot), new Object[] { "XXX", "XDX", "XXX", 'X', Block.stone, 'D', Item.diamond, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().iroldIngot), new Object[] { "GXG", "XGX", "GXG", 'X', Item.ingotIron, 'G', Item.ingotGold, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().irmendIngot), new Object[] { "XXX", "XDX", "XXX", 'X', Item.ingotIron, 'D', Item.diamond, });
		GameRegistry.addRecipe(new ItemStack(HybridizingManager.getInstance().gomendIngot), new Object[] { "GGG", "GDG", "GGG", 'D', Item.diamond, 'G', Item.ingotGold, });

		// Block -> Ingot Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().dirtoneIngot, 9), new Object[] { new ItemStack(Blocks.dirtoneBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().dironIngot, 9), new Object[] { new ItemStack(Blocks.dironBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().diroldIngot, 9), new Object[] { new ItemStack(Blocks.diroldBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().dirmendIngot, 9), new Object[] { new ItemStack(Blocks.dirmendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().stornIngot, 9), new Object[] { new ItemStack(Blocks.stornBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().stoldIngot, 9), new Object[] { new ItemStack(Blocks.stoldBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().stomendIngot, 9), new Object[] { new ItemStack(Blocks.stomendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().iroldIngot, 9), new Object[] { new ItemStack(Blocks.iroldBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().irmendIngot, 9), new Object[] { new ItemStack(Blocks.irmendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(HybridizingManager.getInstance().gomendIngot, 9), new Object[] { new ItemStack(Blocks.gomendBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.sandIngot, 9), new Object[] { new ItemStack(Blocks.sandBlock) });
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.dirtIngot, 9), new Object[] { new ItemStack(Blocks.dirtBlock) });

		// Block Recipes
		GameRegistry.addRecipe(new ItemStack(Blocks.dirtBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', Ingots.dirtIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.dirtoneBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.dironBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.diroldBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.dirmendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.stornBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.stoldBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.stomendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.iroldBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.irmendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.gomendBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Blocks.sandBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', Ingots.sandIngot, });
		// Hybridizer
		GameRegistry.addRecipe(new ItemStack(Blocks.blockHybridizer, 1), new Object[] {"XDX", "DSD", "XDX", 'X', Block.sand, 'D', Block.dirt, 'S',Block.cobblestone });

		// Flowers
		GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt, 1), new Object[] { new ItemStack(Flowers.oreFlower, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Block.stone, 1), new Object[] { new ItemStack(Flowers.oreFlower, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 1), new Object[] { new ItemStack(Flowers.oreFlower, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 1), new Object[] { new ItemStack(Flowers.oreFlower, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 1), new Object[] { new ItemStack(Flowers.oreFlower,1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Ingots.obsidianIngot, 1), new Object[] { new ItemStack(Flowers.oreFlower, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.emerald, 1), new Object[] { new ItemStack(Flowers.oreFlower,1 , 6) });

		// Armors
		GameRegistry.addRecipe(new ItemStack(Armors.dirtHelmet), new Object[]{"XXX", "X X", "   ", 'X', Ingots.dirtIngot});
		GameRegistry.addRecipe(new ItemStack(Armors.dirtHelmet), new Object[] {"   ", "XXX", "X X", 'X', Ingots.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtPlate), new Object[] {"X X", "XXX", "XXX", 'X', Ingots.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtLegs), new Object[] {"XXX", "X X", "X X", 'X', Ingots.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtBoots), new Object[] {"X X", "X X", "   ", 'X', Ingots.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtBoots), new Object[] {"   ", "X X", "X X", 'X', Ingots.dirtIngot });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtoneHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtoneHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtonePlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtoneLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtoneBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirtoneBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().dirtoneIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dironHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dironHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dironPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dironLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dironBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dironBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().dironIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.diroldHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.diroldHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.diroldPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.diroldLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.diroldBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.diroldBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().diroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirmendHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirmendHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirmendPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirmendLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirmendBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.dirmendBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().dirmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stornHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stornHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stornPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stornLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stornBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stornBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().stornIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stoldHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stoldHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stoldPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stoldLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stoldBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stoldBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().stoldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stomendHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stomendHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stomendPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stomendLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stomendBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.stomendBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().stomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.iroldHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.iroldHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.iroldPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.iroldLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.iroldBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.iroldBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().iroldIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.irmendHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.irmendHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.irmendPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.irmendLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.irmendBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.irmendBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().irmendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.gomendHelmet), new Object[] {"XXX", "X X", "   ", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.gomendHelmet), new Object[] {"   ", "XXX", "X X", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.gomendPlate), new Object[] {"X X", "XXX", "XXX", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.gomendLegs), new Object[] {"XXX", "X X", "X X", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.gomendBoots), new Object[] {"X X", "X X", "   ", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.gomendBoots), new Object[] {"   ", "X X", "X X", 'X', HybridizingManager.getInstance().gomendIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.obsidianHelmet), new Object[] {"XXX", "X X", "   ", 'X', Ingots.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.obsidianHelmet), new Object[] {"   ", "XXX", "X X", 'X', Ingots.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.obsidianPlate), new Object[] {"X X", "XXX", "XXX", 'X', Ingots.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.obsidianLegs), new Object[] {"XXX", "X X", "X X", 'X', Ingots.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.obsidianBoots), new Object[] {"X X", "X X", "   ", 'X', Ingots.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.obsidianBoots), new Object[] {"   ", "X X", "X X", 'X', Ingots.obsidianIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.sandHelmet), new Object[] {"XXX", "X X", "   ", 'X', Ingots.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.sandHelmet), new Object[] {"   ", "XXX", "X X", 'X', Ingots.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.sandPlate), new Object[] {"X X", "XXX", "XXX", 'X', Ingots.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.sandLegs), new Object[] {"XXX", "X X", "X X", 'X', Ingots.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.sandBoots), new Object[] {"X X", "X X", "   ", 'X', Ingots.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.sandBoots), new Object[] {"   ", "X X", "X X", 'X', Ingots.sandIngot, });
		GameRegistry.addRecipe(new ItemStack(Armors.emeraldHelmet), new Object[] {"XXX", "X X", "   ", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(Armors.emeraldHelmet), new Object[] {"   ", "XXX", "X X", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(Armors.emeraldPlate), new Object[] {"X X", "XXX", "XXX", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(Armors.emeraldLegs), new Object[] {"XXX", "X X", "X X", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(Armors.emeraldBoots), new Object[] {"X X", "X X", "   ", 'X', Item.emerald, });
		GameRegistry.addRecipe(new ItemStack(Armors.emeraldBoots), new Object[] {"   ", "X X", "X X", 'X', Item.emerald, });

		// Smelting Recipes
		GameRegistry.addSmelting(Ingots.obsidianShard.shiftedIndex,new ItemStack(Ingots.obsidianIngot, 1), 2F);

		GameRegistry.addRecipe(new ItemStack(Tools.dirtSword), new Object[] { "X", "X", "Z", 'X', Ingots.dirtIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtPick), new Object[] { "XXX", " S ", " S ", 'X', Ingots.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtAxe), new Object[] { "XX ", "XS ", " S ", 'X', Ingots.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtShovel), new Object[] { "X", "S", "S", 'X', Ingots.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtHoe), new Object[] { "XX ", " S ", " S ", 'X', Ingots.dirtIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtoneSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().dirtoneIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtonePick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtoneAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtoneShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirtoneHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().dirtoneIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dironSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().dironIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dironPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dironAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dironShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dironHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().dironIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.diroldSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().diroldIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.diroldPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.diroldAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.diroldShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.diroldHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().diroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirmendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().dirmendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirmendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirmendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirmendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.dirmendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().dirmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stornSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().stornIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stornPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stornAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stornShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stornHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().stornIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stoldSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().stoldIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stoldPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stoldAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stoldShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stoldHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().stoldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stomendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().stomendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stomendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stomendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stomendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.stomendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().stomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.iroldSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().iroldIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.iroldPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.iroldAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.iroldShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.iroldHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().iroldIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.irmendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().irmendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.irmendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.irmendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.irmendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.irmendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().irmendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.gomendSword), new Object[] { "X", "X", "Z", 'X', HybridizingManager.getInstance().gomendIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.gomendPick), new Object[] { "XXX", " S ", " S ", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.gomendAxe), new Object[] { "XX ", "XS ", " S ", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.gomendShovel), new Object[] { "X", "S", "S", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.gomendHoe), new Object[] { "XX ", " S ", " S ", 'X', HybridizingManager.getInstance().gomendIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.obsidianSword), new Object[] { "X", "X", "Z", 'X', Ingots.obsidianIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.obsidianPick), new Object[] { "XXX", " S ", " S ", 'X', Ingots.obsidianIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.obsidianAxe), new Object[] { "XX ", "XS ", " S ", 'X', Ingots.obsidianIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.obsidianShovel), new Object[] { "X", "S", "S", 'X', Ingots.obsidianIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.obsidianHoe), new Object[] { "XX ", " S ", " S ", 'X', Ingots.obsidianIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.sandSword), new Object[] { "X", "X", "Z", 'X', Ingots.sandIngot, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.sandPick), new Object[] { "XXX", " S ", " S ", 'X', Ingots.sandIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.sandAxe), new Object[] { "XX ", "XS ", " S ", 'X', Ingots.sandIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.sandShovel), new Object[] { "X", "S", "S", 'X', Ingots.sandIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.sandHoe), new Object[] { "XX ", " S ", " S ", 'X', Ingots.sandIngot, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.emeraldSword), new Object[] { "X", "X", "Z", 'X', Item.emerald, 'Z', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.emeraldPick), new Object[] { "XXX", " S ", " S ", 'X', Item.emerald, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.emeraldAxe), new Object[] { "XX ", "XS ", " S ", 'X', Item.emerald, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.emeraldShovel), new Object[] { "X", "S", "S", 'X', Item.emerald, 'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Tools.emeraldHoe), new Object[] { "XX ", " S ", " S ", 'X', Item.emerald, 'S', Item.stick });
	
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.dirtCoal, 3), new Object[] { new ItemStack(Block.dirt), (Item.coal) });
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.cobbleCoal, 3), new Object[] { new ItemStack(Block.cobblestone), (Item.coal) });
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.ironCoal, 3), new Object[] { new ItemStack(Item.ingotIron), (Item.coal) });
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.goldCoal, 3), new Object[] { new ItemStack(Item.ingotGold), (Item.coal) });
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.diamondCoal, 3), new Object[] { new ItemStack(Item.diamond), (Item.coal) });
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.emeraldCoal, 3), new Object[] { new ItemStack(Item.emerald), (Item.coal) });
		GameRegistry.addShapelessRecipe(new ItemStack(OreCoal.obsidianCoal, 3), new Object[] { new ItemStack(Block.obsidian), (Item.coal) });
		 

	}
}
