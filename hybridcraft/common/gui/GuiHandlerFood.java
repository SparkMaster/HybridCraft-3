package hybridcraft.common.gui;

import hybridcraft.common.FoodStuff.kitchen.ContainerCookingPot;
import hybridcraft.common.FoodStuff.kitchen.ContainerCounter;
import hybridcraft.common.FoodStuff.kitchen.ContainerStove;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.src.*;

public class GuiHandlerFood implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (world.getBlockId(x, y, z) == hybridcraft.common.FoodStuff.HybridModFoodStuff.stove.blockID) {
			return new ContainerStove(player.inventory, world, x, y, z);
		} else if (world.getBlockId(x, y, z) == hybridcraft.common.FoodStuff.HybridModFoodStuff.counter.blockID) {
			return new ContainerCounter(player.inventory, world, x, y, z);
		}else if (world.getBlockId(x, y, z) == hybridcraft.common.FoodStuff.HybridModFoodStuff.cookingPot.blockID) {
			return new ContainerCookingPot(player.inventory, world, x, y, z);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (world.getBlockId(x, y, z) == hybridcraft.common.FoodStuff.HybridModFoodStuff.stove.blockID) {
			return new GuiStove(player.inventory, world, x, y, z);
		} else if (world.getBlockId(x, y, z) == hybridcraft.common.FoodStuff.HybridModFoodStuff.counter.blockID) {
				return new GuiCounter(player.inventory, world, x, y, z);
		} else if (world.getBlockId(x, y, z) == hybridcraft.common.FoodStuff.HybridModFoodStuff.cookingPot.blockID) {
			return new GuiCookingPot(player.inventory, world, x, y, z);
		}
		return null;
	}
}