package hybridcraft.common.mod.init.Armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Storn extends ItemArmor implements IArmorTextureProvider{

 public Storn(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==hybridcraft.common.mod.init.Armors.stornHelmet.shiftedIndex|| par1.itemID==hybridcraft.common.mod.init.Armors.stornPlate.shiftedIndex||
 par1.itemID==hybridcraft.common.mod.init.Armors.stornBoots.shiftedIndex){
 return "/hc/armor/storn_1.png";
 }if(par1.itemID==hybridcraft.common.mod.init.Armors.stornLegs.shiftedIndex){
 return "/hc/armor/storn_2.png";
 }return "/hc/armor/storn_2.png";
 }
 
}