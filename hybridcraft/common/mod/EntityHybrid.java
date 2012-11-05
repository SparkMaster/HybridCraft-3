package hybridcraft.common.mod;

import net.minecraft.src.EntityMob;
import net.minecraft.src.EnumCreatureAttribute;
import net.minecraft.src.World;

public class EntityHybrid extends EntityMob
{
	public EntityHybrid(World par1World) 
	 {
	  super(par1World);
	  this.texture = "/hc/mobs/test.png";
	  this.moveSpeed = 0.25F;
	 }
	 
	 public int getMaxHealth() 
	 {
	  return 20;
	 }
	 public EnumCreatureAttribute getCreatureAttribute()
	    {
	        return EnumCreatureAttribute.UNDEAD;
	    }
}
