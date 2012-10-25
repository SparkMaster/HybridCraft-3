package hybridcraft.common.IngotStuff.items;

import net.minecraft.src.*;

public class ItemIngot extends Item {
	public ItemIngot(int i) {
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	public String getTextureFile() {
		return "/hc/ingots.png";
	}
}