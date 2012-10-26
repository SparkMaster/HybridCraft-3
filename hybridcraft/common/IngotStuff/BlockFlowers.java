package hybridcraft.common.IngotStuff;

import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockFlowers extends Block implements IPlantable
{
	
	/* Metadata key
	 * Dirt
	 * Stone
	 * Iron
	 * Gold
	 * Diamond
	 * Obsidian
	 * Emerald
	 */

	public BlockFlowers(int id, int index) 
	{
		super(id, index, Material.plants);
		this.setRequiresSelfNotify();
	}
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        Block soil = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        return (par1World.getFullBlockLightValue(par2, par3, par4) >= 8 || par1World.canBlockSeeTheSky(par2, par3, par4)) && 
                (soil != null && soil.canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
    }
	
	public int getBlockTextureFromSideAndMetadata(int side, int metadata)
	{	
		//if its one of the seven flowers return the right textures
		if (metadata < 7)
			return metadata;
		//else just return 0;
		else
			return 0;
	}
	
	@Override
	public int damageDropped(int damageValue)
	{
		return damageValue;
	}
		
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
	
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	@Override
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	public int getRenderType()
	{
		//render type used by flowers
		return 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int blockID, CreativeTabs tab, List itemList)
	{
		//dirt flower
		itemList.add(new ItemStack(this, 1, 0));
		//tin ore
		itemList.add(new ItemStack(this, 1, 1));
		//silver ore
		itemList.add(new ItemStack(this, 1, 2));
		//titanium ore
		itemList.add(new ItemStack(this, 1, 3));
		//Lead ore
		itemList.add(new ItemStack(this, 1, 4));
		
		itemList.add(new ItemStack(this, 1, 5));
		
		itemList.add(new ItemStack(this, 1, 6));
	}
	
	public String getTextureFile(){
		return "/hc/flowers.png";
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return Plains;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z) {
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z);
	}

}
