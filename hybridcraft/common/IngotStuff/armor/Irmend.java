package hybridcraft.common.IngotStuff.armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Irmend extends ItemArmor implements IArmorTextureProvider{

 public Irmend(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==Hybridcraft.irmendHelmet.shiftedIndex|| par1.itemID==Hybridcraft.irmendPlate.shiftedIndex||
 par1.itemID==Hybridcraft.irmendBoots.shiftedIndex){
 return "/hc/armor/irmend_1.png";
 }if(par1.itemID==Hybridcraft.irmendLegs.shiftedIndex){
 return "/hc/armor/irmend_2.png";
 }return "/hc/armor/irmend_2.png";
 }

}