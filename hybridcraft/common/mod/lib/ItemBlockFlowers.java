package hybridcraft.common.mod.lib;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemBlockFlowers extends ItemBlock {

	public ItemBlockFlowers(int blockID) {
		super(blockID);
		this.setHasSubtypes(true);
		this.setCreativeTab(hybridcraft.common.mod.Hybridcraft.tabsHCM);
	}
	
	public ItemBlockFlowers(Block block)
	{
		this(block.blockID);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1){
		return EnumRarity.uncommon;
	}		

	@Override
    public int getIconFromDamage(int metadata)
	{
		return metadata;
	}
	
	@Override
	public String getItemNameIS(ItemStack itemStack) 
	{
		switch(itemStack.getItemDamage())
		{
		case 0:
			return "flowerDirt";
		case 1:
			return "flowerStone";
		case 2:
			return "flowerIron";
		case 3:
			return "flowerGold";
		case 4:
			return "flowerDiamond";
		case 5:
			return "flowerObsidian";
		case 6:
			return "flowerEmerald";
		default:
			return "flowerDiamond";
		}
	}
	
	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}
}
