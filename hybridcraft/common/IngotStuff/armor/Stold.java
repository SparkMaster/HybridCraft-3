package hybridcraft.common.IngotStuff.armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Stold extends ItemArmor implements IArmorTextureProvider{

 public Stold(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==Hybridcraft.stoldHelmet.shiftedIndex|| par1.itemID==Hybridcraft.stoldPlate.shiftedIndex||
 par1.itemID==Hybridcraft.stoldBoots.shiftedIndex){
 return "/hc/armor/stold_1.png";
 }if(par1.itemID==Hybridcraft.stoldLegs.shiftedIndex){
 return "/hc/armor/stold_2.png";
 }return "/hc/armor/stold_2.png";
 }

}