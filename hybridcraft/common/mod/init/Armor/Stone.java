package hybridcraft.common.mod.init.Armor;

import hybridcraft.common.mod.Hybridcraft;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class Stone extends ItemArmor implements IArmorTextureProvider{

 public Stone(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
 super(par1, par2EnumArmorMaterial, par3, par4);
 this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);

 }

 public String getTextureFile(){
 return "/hc/armor.png";

 }

 public String getArmorTextureFile(ItemStack par1){
 if ( par1.itemID==hybridcraft.common.mod.init.Armors.stoneHelmet.shiftedIndex|| par1.itemID==hybridcraft.common.mod.init.Armors.stonePlate.shiftedIndex||
 par1.itemID==hybridcraft.common.mod.init.Armors.stoneBoots.shiftedIndex){
 return "/hc/armor/stone_1.png";
 }if(par1.itemID==hybridcraft.common.mod.init.Armors.stoneLegs.shiftedIndex){
 return "/hc/armor/stone_2.png";
 }return "/hc/armor/stone_2.png";
 }

}