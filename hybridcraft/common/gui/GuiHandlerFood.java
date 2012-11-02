package hybridcraft.common.gui;

import hybridcraft.common.containers.ContainerCookingPot;
import hybridcraft.common.containers.ContainerCounter;
import hybridcraft.common.containers.ContainerStove;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.src.*;

public class GuiHandlerFood implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (world.getBlockId(x, y, z) == hybridcraft.common.mod.init.Blocks.stove.blockID) {
			return new ContainerStove(player.inventory, world, x, y, z);
		} else if (world.getBlockId(x, y, z) == hybridcraft.common.mod.init.Blocks.counter.blockID) {
			return new ContainerCounter(player.inventory, world, x, y, z);
		}else if (world.getBlockId(x, y, z) == hybridcraft.common.mod.init.Blocks.cookingPot.blockID) {
			return new ContainerCookingPot(player.inventory, world, x, y, z);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (world.getBlockId(x, y, z) == hybridcraft.common.mod.init.Blocks.stove.blockID) {
			return new GuiStove(player.inventory, world, x, y, z);
		} else if (world.getBlockId(x, y, z) == hybridcraft.common.mod.init.Blocks.counter.blockID) {
				return new GuiCounter(player.inventory, world, x, y, z);
		} else if (world.getBlockId(x, y, z) == hybridcraft.common.mod.init.Blocks.cookingPot.blockID) {
			return new GuiCookingPot(player.inventory, world, x, y, z);
		}
		return null;
	}
}