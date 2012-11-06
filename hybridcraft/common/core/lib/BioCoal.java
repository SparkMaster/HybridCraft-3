package hybridcraft.common.core.lib;

import java.util.List;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class BioCoal extends Item
{
    public BioCoal(int par1)
    {
        super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
    }
    @SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}
    
    public int getBurnTime(ItemStack fuel) {

            if(fuel.itemID==hybridcraft.common.mod.Hybridcraft.bioCoal.shiftedIndex){

                    return 1000;

            }else

            return 0;
    }
    public String getTextureFile(){
    	 return "/hc/coal.png";
    }
}
