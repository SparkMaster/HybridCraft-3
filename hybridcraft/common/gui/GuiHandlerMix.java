package hybridcraft.common.gui;

import hybridcraft.common.IngotStuff.hybridizer.ContainerHybridizer;
import hybridcraft.common.mod.Hybridcraft;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.src.*;

public class GuiHandlerMix implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (world.getBlockId(x, y, z) == hybridcraft.common.mod.Hybridcraft.blockHybridizer.blockID) {
			return new ContainerHybridizer(player.inventory, world, x, y, z);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if (world.getBlockId(x, y, z) == hybridcraft.common.mod.Hybridcraft.blockHybridizer.blockID) {
			return new GuiHybridizing(player.inventory, world, x, y, z);
		}
		return null;
	}
}