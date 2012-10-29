package hybridcraft.common.FoodStuff;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class Decor extends Block
{
    public Decor(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(hybridcraft.common.FoodStuff.HybridModFoodStuff.tabsFood);
    }
    public String getTextureFile()
    {
            return "/hc/kitchen.png";
    }
}