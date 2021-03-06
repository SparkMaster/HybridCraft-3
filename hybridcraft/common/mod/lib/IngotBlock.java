package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class IngotBlock extends Block
{
    public IngotBlock(int par1, int par2)
    {
        super(par1, par2, Material.iron);
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
    }
    

    @SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

    
    public String getTextureFile()
    {
            return "/hc/blocks.png";
    }
}