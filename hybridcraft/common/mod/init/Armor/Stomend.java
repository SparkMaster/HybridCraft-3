package hybridcraft.common.mod.init.Armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Stomend extends ItemArmor implements IArmorTextureProvider{

 public Stomend(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==hybridcraft.common.mod.init.Armors.stomendHelmet.shiftedIndex|| par1.itemID==hybridcraft.common.mod.init.Armors.stomendPlate.shiftedIndex||
 par1.itemID==hybridcraft.common.mod.init.Armors.stomendBoots.shiftedIndex){
 return "/hc/armor/stomend_1.png";
 }if(par1.itemID==hybridcraft.common.mod.init.Armors.stomendLegs.shiftedIndex){
 return "/hc/armor/stomend_2.png";
 }return "/hc/armor/stomend_2.png";
 }

}