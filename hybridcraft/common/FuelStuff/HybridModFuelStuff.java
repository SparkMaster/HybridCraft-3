package hybridcraft.common.FuelStuff;

import hybridcraft.common.FuelStuff.items.BioCoal;
import hybridcraft.common.FuelStuff.items.OrganicCoal;
import hybridcraft.common.FuelStuff.lib.OreCoal;
import hybridcraft.common.IngotStuff.CreativeTabHCM;
import hybridcraft.common.core.ClientPacketHandler;
import hybridcraft.common.core.CommonProxyHybrid;
import hybridcraft.common.core.CoreRef;
import hybridcraft.common.core.ServerPacketHandler;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CoreRef.HCFuel_MOD_ID, name = CoreRef.HCFuel_MOD_NAME, version = CoreRef.HCFuel_VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false, clientPacketHandlerSpec = @SidedPacketHandler(channels = {"HybridMod" }, packetHandler = ClientPacketHandler.class),
serverPacketHandlerSpec =@SidedPacketHandler(channels = {"HybridMod" }, packetHandler = ServerPacketHandler.class))

public class HybridModFuelStuff 
{
	// Creative Tab
	public static CreativeTabs tabsFuel = new CreativeTabHCF(CreativeTabs.getNextID(), CoreRef.HCFuel_MOD_ID);
	
	// Instance
	@Instance("HybridCraft 3 Fuels")
	public static HybridModFuelStuff instance = new HybridModFuelStuff();

	// Proxy
	@SidedProxy(clientSide = hybridcraft.common.core.CoreRef.CLIENT_PROXY_CLASS , serverSide = hybridcraft.common.core.CoreRef.SERVER_PROXY_CLASS)
	public static CommonProxyHybrid proxy;
	
	// Item List
	public static Item bioCoal;
	public static Item organicCoal;
	
	 @Init
	 public void load(FMLInitializationEvent event) 
	 {
		 OreCoal.initItems();
				 
		 bioCoal = new BioCoal(1507).setIconIndex(7).setItemName("bioCoal");
		 organicCoal = new OrganicCoal(1508).setIconIndex(8).setItemName("organicCoal");
		 
		 GameRegistry.registerFuelHandler(new HybridFuel());
		 
		 proxy.registerRenderThings();
	 }
}
