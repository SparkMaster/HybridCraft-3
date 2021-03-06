package hybridcraft.common.mod.lib;


import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class DecorCounter extends Block
{
    public DecorCounter(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
    }

    @SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

    
    public int getBlockTextureFromSide(int i){
    	switch(i){
    	case 0: return 4;
    	case 1: return 5;
    	default: return 3;
    	}
    	/*
    	 * default = side
    	 * 1 = top
    	 * 0 = bottom
    	 */
    }

    
    public String getTextureFile()
    {
            return "/hc/kitchen.png";
    }
}
