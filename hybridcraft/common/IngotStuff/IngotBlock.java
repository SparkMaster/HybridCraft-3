package hybridcraft.common.IngotStuff;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class IngotBlock extends Block
{
    public IngotBlock(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(hybridcraft.common.IngotStuff.HybridModIngotStuff.tabsHCM);
    }
    public String getTextureFile()
    {
            return "/hc/blocks.png";
    }
}