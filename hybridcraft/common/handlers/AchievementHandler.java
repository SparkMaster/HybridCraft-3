package hybridcraft.common.handlers;

import net.minecraft.src.Achievement;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AchievementHandler implements ICraftingHandler{	
	
	// Achievement List
	static final Achievement achieveIngot = new Achievement(8000, "Metal Dirt", 0, 0, hybridcraft.common.mod.init.Ingots.dirtIngot, null).registerAchievement().setSpecial();
	
	//Achievement page
	public static AchievementPage hc1 = new AchievementPage("HybridCraft 3", achieveIngot /** achieveDirty */);
		
	
	public static void loadAchievements()
	{
	
	AchievementPage.registerAchievementPage(hc1);
    
	}
	
	private void addAchievementName(String ach, String name)
	{
	        LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private void addAchievementDesc(String ach, String desc)
	{
	        LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}


	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		// TODO Auto-generated method stub
		if (item.itemID == hybridcraft.common.mod.init.Ingots.dirtIngot.shiftedIndex)
        {
                player.addStat(achieveIngot, 1);
        }
	}


	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
		
	}
	
}
