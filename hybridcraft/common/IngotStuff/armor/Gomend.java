package hybridcraft.common.IngotStuff.armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Gomend extends ItemArmor implements IArmorTextureProvider{

 public Gomend(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==Hybridcraft.gomendHelmet.shiftedIndex|| par1.itemID==Hybridcraft.gomendPlate.shiftedIndex||
 par1.itemID==Hybridcraft.gomendBoots.shiftedIndex){
 return "/hc/armor/gomend_1.png";
 }if(par1.itemID==Hybridcraft.gomendLegs.shiftedIndex){
 return "/hc/armor/gomend_2.png";
 }return "/hc/armor/gomend_2.png";
 }

}