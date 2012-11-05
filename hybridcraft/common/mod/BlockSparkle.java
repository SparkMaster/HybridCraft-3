package hybridcraft.common.mod;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class BlockSparkle extends Block{

	public BlockSparkle(int par1, int par2)
    {
        super(par1, par2, Material.iron);
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
    }
    public String getTextureFile()
    {
            return "/hc/blocks.png";
    }	
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        {
            this.sparkle(par1World, par2, par3, par4);
        }
    }
    
    private void sparkle(World par1World, int par2, int par3, int par4)
    {
        Random var5 = par1World.rand;
        double var6 = 0.0625D;

        for (int var8 = 0; var8 < 6; ++var8)
        {
            double var9 = (double)((float)par2 + var5.nextFloat());
            double var11 = (double)((float)par3 + var5.nextFloat());
            double var13 = (double)((float)par4 + var5.nextFloat());

            if (var8 == 0 && !par1World.isBlockOpaqueCube(par2, par3 + 1, par4))
            {
                var11 = (double)(par3 + 1) + var6;
            }

            if (var8 == 1 && !par1World.isBlockOpaqueCube(par2, par3 - 1, par4))
            {
                var11 = (double)(par3 + 0) - var6;
            }

            if (var8 == 2 && !par1World.isBlockOpaqueCube(par2, par3, par4 + 1))
            {
                var13 = (double)(par4 + 1) + var6;
            }

            if (var8 == 3 && !par1World.isBlockOpaqueCube(par2, par3, par4 - 1))
            {
                var13 = (double)(par4 + 0) - var6;
            }

            if (var8 == 4 && !par1World.isBlockOpaqueCube(par2 + 1, par3, par4))
            {
                var9 = (double)(par2 + 1) + var6;
            }

            if (var8 == 5 && !par1World.isBlockOpaqueCube(par2 - 1, par3, par4))
            {
                var9 = (double)(par2 + 0) - var6;
            }

            if (var9 < (double)par2 || var9 > (double)(par2 + 1) || var11 < 0.0D || var11 > (double)(par3 + 1) || var13 < (double)par4 || var13 > (double)(par4 + 1))
            {
                par1World.spawnParticle("reddust", var9, var11, var13, 0.0D, 0.0D, 0.0D);
            }
        }
    }
    
}
