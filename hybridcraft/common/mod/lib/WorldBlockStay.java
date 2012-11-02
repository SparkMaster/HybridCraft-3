package hybridcraft.common.mod.lib;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class WorldBlockStay extends Block
{
    public WorldBlockStay(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
    }
    
    public int idBlock(int par1, Random par2Random, int par3)
    {
    	return par2Random.nextInt(10 - par3 * 3) == 0 ? Block.cobblestone.blockID : this.blockID;
    }
    
    public String getTextureFile()
    {
            return "/hc/worldblocks.png";
    }
    
}
