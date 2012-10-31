package hybridcraft.common.IngotStuff.armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Diron extends ItemArmor implements IArmorTextureProvider{

 public Diron(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==Hybridcraft.dironHelmet.shiftedIndex|| par1.itemID==Hybridcraft.dironPlate.shiftedIndex||
 par1.itemID==Hybridcraft.dironBoots.shiftedIndex){
 return "/hc/armor/diron_1.png";
 }if(par1.itemID==Hybridcraft.dironLegs.shiftedIndex){
 return "/hc/armor/diron_2.png";
 }return "/hc/armor/diron_2.png";
 }

}