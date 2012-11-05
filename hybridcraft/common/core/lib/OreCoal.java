package hybridcraft.common.core.lib;

import hybridcraft.common.handlers.ConfigHandler;
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
		 dirtCoal = new DirtCoal(ConfigHandler.dirtCoalID).setIconIndex(0).setItemName("dirtCoal");
		 cobbleCoal = new CobbleCoal(ConfigHandler.cobbleCoalID).setIconIndex(1).setItemName("cobbleCoal");
		 ironCoal = new IronCoal(ConfigHandler.ironCoalID).setIconIndex(2).setItemName("ironCoal");
		 goldCoal = new GoldCoal(ConfigHandler.goldCoalID).setIconIndex(3).setItemName("goldCoal");
		 diamondCoal = new DiamondCoal(ConfigHandler.diamondCoalID).setIconIndex(4).setItemName("diamondCoal");
		 emeraldCoal = new EmeraldCoal(ConfigHandler.emeraldCoalID).setIconIndex(5).setItemName("emeraldCoal");
		 obsidianCoal = new ObsidianCoal(ConfigHandler.obsidianCoalID).setIconIndex(6).setItemName("obsidianCoa;");
	}
}

