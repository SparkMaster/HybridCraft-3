package hybridcraft.common.mod.lib;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

public class WorldGenFlowersHybrid extends WorldGenerator 
{
    private int flowerMetadata;
    private int flowerBlockID;
    
	public WorldGenFlowersHybrid(int blockID, int metadata) {
		flowerBlockID = blockID;
		flowerMetadata = metadata;
	}
	
	public boolean generate(World par1World, Random par2Random, int chunkX, int chunkY, int chunkZ)
    {
        for (int var6 = 0; var6 < 64; ++var6)
        {
            int coordX = chunkX + par2Random.nextInt(8) - par2Random.nextInt(8);
            int coordY = chunkY + par2Random.nextInt(4) - par2Random.nextInt(4);
            int coordZ = chunkZ + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(coordX, coordY, coordZ) && Block.blocksList[this.flowerBlockID].canBlockStay(par1World, coordX, coordY, coordZ))
            {
                par1World.setBlockAndMetadata(coordX, coordY, coordZ, this.flowerBlockID, this.flowerMetadata);
            }
        }

        return true;
    }

}
