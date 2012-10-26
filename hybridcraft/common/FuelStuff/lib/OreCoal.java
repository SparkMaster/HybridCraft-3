package hybridcraft.common.FuelStuff.lib;

import hybridcraft.common.FuelStuff.items.CobbleCoal;
import hybridcraft.common.FuelStuff.items.DiamondCoal;
import hybridcraft.common.FuelStuff.items.DirtCoal;
import hybridcraft.common.FuelStuff.items.EmeraldCoal;
import hybridcraft.common.FuelStuff.items.GoldCoal;
import hybridcraft.common.FuelStuff.items.IronCoal;
import hybridcraft.common.FuelStuff.items.ObsidianCoal;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

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
		 dirtCoal = new DirtCoal(1500).setIconIndex(0).setItemName("dirtCoal");
		 cobbleCoal = new CobbleCoal(1501).setIconIndex(1).setItemName("cobbleCoal");
		 ironCoal = new IronCoal(1502).setIconIndex(2).setItemName("ironCoal");
		 goldCoal = new GoldCoal(1503).setIconIndex(3).setItemName("goldCoal");
		 diamondCoal = new DiamondCoal(1504).setIconIndex(4).setItemName("diamondCoal");
		 emeraldCoal = new EmeraldCoal(1505).setIconIndex(5).setItemName("emeraldCoal");
		 obsidianCoal = new ObsidianCoal(1506).setIconIndex(6).setItemName("obsidianCoa;");
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(dirtCoal, 3), new Object[] { new ItemStack(Block.dirt), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(cobbleCoal, 3), new Object[] { new ItemStack(Block.cobblestone), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(ironCoal, 3), new Object[] { new ItemStack(Item.ingotIron), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(goldCoal, 3), new Object[] { new ItemStack(Item.ingotGold), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(diamondCoal, 3), new Object[] { new ItemStack(Item.diamond), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(emeraldCoal, 3), new Object[] { new ItemStack(Item.emerald), (Item.coal) });
		 GameRegistry.addShapelessRecipe(new ItemStack(obsidianCoal, 3), new Object[] { new ItemStack(Block.obsidian), (Item.coal) });
		 
	}
}

