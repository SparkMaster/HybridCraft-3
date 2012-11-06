package hybridcraft.common.mod.lib;

import hybridcraft.common.mod.Hybridcraft;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenFlowers;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import hybridcraft.common.mod.init.*;

public class WorldGeneratorHybrid implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1: generateNether(world, random,chunkX*16,chunkZ*16);
		case 0: generateSurface(world, random,chunkX*16,chunkZ*16);
		}

	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for(int i =0; i<7;i++){
		int Xcoord = BlockX+random.nextInt(16);
		int Zcoord = BlockZ+random.nextInt(16);
		int Ycoord = 60+random.nextInt(16);
		(new WorldGenMinable(Blocks.dand.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(Blocks.davel.blockID, 15)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		//generate flowers
		
		//Dirt Flower
		for(int df=0; df<1;df++)
		{
			int Xcoordf = BlockX+random.nextInt(16);
			int Zcoordf = BlockZ+random.nextInt(16);
			int Ycoordf = random.nextInt(256);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 0)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
		}
		//Stone Flower
		for(int sf=0; sf<1;sf++)
		{
			int Xcoordf = BlockX+random.nextInt(16);
			int Zcoordf = BlockZ+random.nextInt(16);
			int Ycoordf = random.nextInt(256);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 1)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 2)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 3)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 4)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 5)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
			(new WorldGenFlowersHybrid(Flowers.oreFlower.blockID, 6)).generate(world, random, Xcoordf, Ycoordf, Zcoordf);
		}
		
		for(int o =0; o<10;o++){
		int Xcoordo = BlockX+random.nextInt(16);
		int Zcoordo = BlockZ+random.nextInt(16);
		int Ycoordo = random.nextInt(16);
		(new WorldGenMinable(Blocks.done.blockID, 15)).generate(world, random, Xcoordo, Ycoordo, Zcoordo);
		}
	}
	
	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
