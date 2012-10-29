package hybridcraft.common.FuelStuff;

import hybridcraft.common.FuelStuff.items.BioCoal;
import hybridcraft.common.FuelStuff.items.OrganicCoal;
import hybridcraft.common.FuelStuff.lib.OreCoal;
import hybridcraft.common.FuelStuff.lib.Reference;
import hybridcraft.common.IngotStuff.CreativeTabHCM;
import hybridcraft.common.core.CommonProxyHybrid;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
//import hybridcraft.common.FuelStuff.items.OreCoal;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class HybridModFuelStuff 
{
	// Creative Tab
	public static CreativeTabs tabsFuel = new CreativeTabHCF(CreativeTabs.getNextID(), Reference.MOD_ID); 
	
	// Instance
	@Instance("HybridCraft 3 Fuels")
	public static HybridModFuelStuff instance = new HybridModFuelStuff();

	// Proxy
	@SidedProxy(clientSide = "hybridcraft.client.ClientProxyHybrid", serverSide = "hybridcraft.common.core.CommonProxyHybrid")
	public static CommonProxyHybrid proxy;
	
	public static Item bioCoal;
	public static Item organicCoal;
	
	 @Init
	 public void load(FMLInitializationEvent event) 
	 {
		 OreCoal.initItems();
				 
		 bioCoal = new BioCoal(1507).setIconIndex(7).setItemName("bioCoal");
		 organicCoal = new OrganicCoal(1508).setIconIndex(8).setItemName("organicCoal");
		 
		 GameRegistry.registerFuelHandler(new HybridFuel());
	 }
}
