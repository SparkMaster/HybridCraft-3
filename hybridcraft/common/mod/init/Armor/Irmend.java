package hybridcraft.common.mod.init.Armor;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Irmend extends ItemArmor implements IArmorTextureProvider{

 public Irmend(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==hybridcraft.common.mod.init.Armors.irmendHelmet.shiftedIndex|| par1.itemID==hybridcraft.common.mod.init.Armors.irmendPlate.shiftedIndex||
 par1.itemID==hybridcraft.common.mod.init.Armors.irmendBoots.shiftedIndex){
 return "/hc/armor/irmend_1.png";
 }if(par1.itemID==hybridcraft.common.mod.init.Armors.irmendLegs.shiftedIndex){
 return "/hc/armor/irmend_2.png";
 }return "/hc/armor/irmend_2.png";
 }

}