package hybridcraft.common.IngotStuff.items;

import net.minecraft.src.*;

public class ItemIngot extends Item {
	public ItemIngot(int i) {
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
	}

	public String getTextureFile() {
		return "/hc/ingots.png";
	}
}