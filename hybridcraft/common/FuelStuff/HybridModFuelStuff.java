package hybridcraft.common.FuelStuff;

import net.minecraft.src.Item;
import hybridcraft.common.FuelStuff.items.OreCoal;
import hybridcraft.common.FuelStuff.lib.HybridCoal;
import hybridcraft.common.IngotStuff.HybridModIngotStuff;
import hybridcraft.common.IngotStuff.items.HybridItems;
import hybridcraft.common.IngotStuff.lib.Reference;
import hybridcraft.common.core.CommonProxyHybrid;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class HybridModFuelStuff 
{
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
		 
		 bioCoal = new HybridCoal(1507).setIconIndex(7).setItemName("bioCoal");
		 organicCoal = new HybridCoal(1508).setIconIndex(8).setItemName("organicCoal");
		 
		 GameRegistry.registerFuelHandler(new HybridFuel());
	 }
}
