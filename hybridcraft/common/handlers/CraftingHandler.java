package hybridcraft.common.handlers;

import java.util.Random;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {

		// add enchantments
		// dirt = silkTouch
		// stone = efficiency
		// iron = sharpness
		// gold = looting
		// diamond = fortune

		net.minecraft.src.Enchantment[] i = new net.minecraft.src.Enchantment[] {net.minecraft.src.Enchantment.looting,net.minecraft.src.Enchantment.sharpness};
		
		if (item.getItem() instanceof hybridcraft.common.mod.lib.ItemHybridAxe) {
			item.addEnchantment(i[(int) (new Random().nextDouble()*2)], 1);
		} else if (item.getItem() instanceof hybridcraft.common.mod.lib.ItemHybridHoe) {
			item.addEnchantment(i[(int) (new Random().nextDouble()*2)], 1);
		} else if (item.getItem() instanceof hybridcraft.common.mod.lib.ItemHybridPickaxe) {
			item.addEnchantment(i[(int) (new Random().nextDouble()*2)], 1);
		} else if (item.getItem() instanceof hybridcraft.common.mod.lib.ItemHybridSpade) {
			item.addEnchantment(i[(int) (new Random().nextDouble()*2)], 1);
		} else if (item.getItem() instanceof hybridcraft.common.mod.lib.ItemHybridSword) {
			item.addEnchantment(i[(int) (new Random().nextDouble()*2)], 1);
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) 
	{
		
	}

}
