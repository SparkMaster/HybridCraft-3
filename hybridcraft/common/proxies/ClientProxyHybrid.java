package hybridcraft.common.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyHybrid extends hybridcraft.common.proxies.CommonProxyHybrid
{
	@Override
	public void registerRenderThings()
	{
	MinecraftForgeClient.preloadTexture("/hc/armor.png");
	MinecraftForgeClient.preloadTexture("/hc/blocks.png");
	MinecraftForgeClient.preloadTexture("/hc/flowers.png");
	MinecraftForgeClient.preloadTexture("/hc/foods.png");
	MinecraftForgeClient.preloadTexture("/hc/ingots.png");
	MinecraftForgeClient.preloadTexture("/hc/kitchen.png");
	MinecraftForgeClient.preloadTexture("/hc/sandwich.png");
	MinecraftForgeClient.preloadTexture("/hc/tools.png");
	MinecraftForgeClient.preloadTexture("/hc/worldblocks.png");
	}
	
	
	@Override
	public int addArmor(String name)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(name);
	}
}
