package hybridcraft.common.IngotStuff.armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Dirtone extends ItemArmor implements IArmorTextureProvider{

 public Dirtone(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==Hybridcraft.dirtoneHelmet.shiftedIndex|| par1.itemID==Hybridcraft.dirtonePlate.shiftedIndex||
 par1.itemID==Hybridcraft.dirtoneBoots.shiftedIndex){
 return "/hc/armor/dirtone_1.png";
 }if(par1.itemID==Hybridcraft.dirtoneLegs.shiftedIndex){
 return "/hc/armor/dirtone_2.png";
 }return "/hc/armor/dirtone_2.png";
 }

}