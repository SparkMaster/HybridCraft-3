package hybridcraft.common.FuelStuff.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import hybridcraft.common.FuelStuff.lib.HybridCoal;
import hybridcraft.common.IngotStuff.hybridizer.HybridizingManager;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class OreCoal 
{
	public static Item dirtCoal;
	public static Item cobbleCoal;
	public static Item ironCoal;
	public static Item goldCoal;
	public static Item diamondCoal;
	public static Item emeraldCoal;
	public static Item obsidianCoal;
	
	public static void initItems()
	{

		 dirtCoal = new HybridCoal(1500).setIconIndex(0).setItemName("dirtCoal");
		 cobbleCoal = new HybridCoal(1501).setIconIndex(1).setItemName("cobbleCoal");
		 ironCoal = new HybridCoal(1502).setIconIndex(2).setItemName("ironCoal");
		 goldCoal = new HybridCoal(1503).setIconIndex(3).setItemName("goldCoal");
		 diamondCoal = new HybridCoal(1504).setIconIndex(4).setItemName("diamondCoal");
		 emeraldCoal = new HybridCoal(1505).setIconIndex(5).setItemName("emeraldCoal");
		 obsidianCoal = new HybridCoal(1506).setIconIndex(6).setItemName("obsidianCoa;");
		 
		 LanguageRegistry.addName(dirtCoal, "Dirt Coal");
		 LanguageRegistry.addName(cobbleCoal, "Cobble Coal");
		 LanguageRegistry.addName(ironCoal, "Iron Coal");
		 LanguageRegistry.addName(goldCoal, "Gold Coal");
		 LanguageRegistry.addName(diamondCoal, "Diamond Coal");
		 LanguageRegistry.addName(emeraldCoal, "Emerald Coal");
		 LanguageRegistry.addName(obsidianCoal, "Obsidian Coal");
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(dirtCoal, 3), new Object[] { new ItemStack(Block.dirt), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(cobbleCoal, 3), new Object[] { new ItemStack(Block.cobblestone), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(ironCoal, 3), new Object[] { new ItemStack(Item.ingotIron), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(goldCoal, 3), new Object[] { new ItemStack(Item.ingotGold), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(diamondCoal, 3), new Object[] { new ItemStack(Item.diamond), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(emeraldCoal, 3), new Object[] { new ItemStack(Item.emerald), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(obsidianCoal, 3), new Object[] { new ItemStack(Block.obsidian), (Item.coal) });
		 
	}
}
