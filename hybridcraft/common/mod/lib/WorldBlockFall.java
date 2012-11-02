package hybridcraft.common.mod.lib;

import net.minecraft.src.Block;
import net.minecraft.src.BlockSand;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class WorldBlockFall extends BlockSand
{
	public static boolean fallInstantly = false;
	
    public WorldBlockFall(int par1, int par2)
    {
        super(par1, par2);
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
    }
    
    public String getTextureFile()
    {
            return "/hc/worldblocks.png";
    }
}
