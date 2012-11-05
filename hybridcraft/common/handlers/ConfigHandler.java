package hybridcraft.common.handlers;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ConfigHandler
{
	
	public static final String CAT_BLOCKS = "Blocks";
	public static final String CAT_ITEMS = "Items";
	public static final String CAT_ARMOR = "Armor";
	public static final String CAT_TOOLS = "Tools";
	public static final String CAT_FOOD = "Food";

	//Blocks 800-899
	public static int dirtBlockID = 801;
	public static int dirtoneBlockID = 802;
	public static int dironBlockID = 804;
	public static int diroldBlockID = 805;
	public static int dirmendBlockID = 806;
	public static int stoneBlockID = 807;
	public static int stornBlockID = 808;
	public static int stoldBlockID = 809;
	public static int stomendBlockID = 810;
	public static int iroldBlockID = 811;
	public static int irmendBlockID = 812;
	public static int gomendBlockID = 813;
	public static int sandID = 814;
	public static int dandID = 815;
	public static int davelID = 816;
	public static int doneID = 817;
	public static int counterBlockID = 818;
	public static int stoveBlockID = 819;
	public static int potBlockID = 820;
	public static int combinerBlockID = 821;
	public static int oreFlowerID = 822; 
	
	//Armors 4100-4199
	public static int dirtHelmetID = 4100;
	public static int dirtPlateID = 4101;
	public static int dirtLegsID = 4102;
	public static int dirtBootsID = 4103;
	
	
	public static int dirtoneHelmetID = 4104;
	public static int dirtonePlateID = 4105;
	public static int dirtoneLegsID = 4106;
	public static int dirtoneBootsID = 4107;

	public static int dironHelmetID = 4108;
	public static int dironPlateID = 4109;
	public static int dironLegsID = 4110;
	public static int dironBootsID = 4111;
	
	public static int diroldHelmetID = 4112;
	public static int diroldPlateID = 4113;
	public static int diroldLegsID = 4114;
	public static int diroldBootsID = 4115;
	
	public static int dirmendHelmetID = 4116;
	public static int dirmendPlateID = 4117;
	public static int dirmendLegsID = 4118;
	public static int dirmendBootsID = 4119;
	
	public static int stornHelmetID = 4120;
	public static int stornPlateID = 4121;
	public static int stornLegsID = 4122;
	public static int stornBootsID = 4123;
	
	public static int stoldHelmetID = 4124;
	public static int stoldPlateID = 4125;
	public static int stoldLegsID = 4126;
	public static int stoldBootsID = 4127;
	
	public static int stomendHelmetID = 4128;
	public static int stomendPlateID = 4129;
	public static int stomendLegsID = 4130;
	public static int stomendBootsID = 4131;
	
	public static int iroldHelmetID = 4132;
	public static int iroldPlateID = 4133;
	public static int iroldLegsID = 4134;
	public static int iroldBootsID = 4135;
	
	public static int irmendHelmetID = 4136;
	public static int irmendPlateID = 4137;
	public static int irmendLegsID = 4138;
	public static int irmendBootsID = 4139;
	
	public static int gomendHelmetID = 4140;
	public static int gomendPlateID = 4141;
	public static int gomendLegsID = 4142;
	public static int gomendBootsID = 4143;
	
	public static int obsidianHelmetID = 4144;
	public static int obsidianPlateID = 4145;
	public static int obsidianLegsID = 4146;
	public static int obsidianBootsID = 4147;
	
	public static int stoneHelmetID = 4148;
	public static int stonePlateID = 4149;
	public static int stoneLegsID = 4150;
	public static int stoneBootsID = 4151;
	
	public static int sandHelmetID = 4152;
	public static int sandPlateID = 4153;
	public static int sandLegsID = 4154;
	public static int sandBootsID = 4155;
	
	public static int emeraldHelmetID = 4156;
	public static int emeraldPlateID = 4157;
	public static int emeraldLegsID = 4158;
	public static int emeraldBootsID = 4159;
	
	// Tools  4200-4299
	public static int dirtSwordID = 4200;
	public static int dirtPickID = 4201;
	public static int dirtAxeID = 4202;
	public static int dirtShovelID = 4203;
	public static int dirtHoeID = 4204;
	
	public static int dirtOneSwordID = 4205;
	public static int dirtOnePickID = 4206;
	public static int dirtOneAxeID = 4207;
	public static int dirtOneShovelID = 4208;
	public static int dirtOneHoeID = 4209;

	public static int dironSwordID = 4210;
	public static int dironPickID = 4211;
	public static int dironAxeID = 4212;
	public static int dironShovelID = 4213;
	public static int dironHoeID = 4214;
	
	public static int diroldSwordID = 4215;
	public static int diroldPickID = 4216;
	public static int diroldAxeID = 4217;
	public static int diroldShovelID = 4218;
	public static int diroldHoeID = 4219;
	
	public static int dirmendSwordID = 4220;
	public static int dirmendPickID = 4221;
	public static int dirmendAxeID = 4222;
	public static int dirmendShovelID = 4223;
	public static int dirmendHoeID = 4224;
	
	public static int stornSwordID = 4225;
	public static int stornPickID = 4226;
	public static int stornAxeID = 4227;
	public static int stornShovelID = 4228;
	public static int stornHoeID = 4229;
	
	public static int stoldSwordID = 4230;
	public static int stoldPickID = 4231;
	public static int stoldAxeID = 4232;
	public static int stoldShovelID = 4233;
	public static int stoldHoeID = 4234;
	
	public static int stomendSwordID = 4235;
	public static int stomendPickID = 4236;
	public static int stomendAxeID = 4237;
	public static int stomendShovelID = 4238;
	public static int stomendHoeID = 4239;
	
	public static int iroldSwordID = 4240;
	public static int iroldPickID = 4241;
	public static int iroldAxeID = 4242;
	public static int iroldShovelID = 4243;
	public static int iroldHoeID = 4244;
	
	public static int irmendSwordID = 4245;
	public static int irmendPickID = 4246;
	public static int irmendAxeID = 4247;
	public static int irmendShovelID = 4248;
	public static int irmendHoeID = 4249;
	
	public static int gomendSwordID = 4250;
	public static int gomendPickID = 4251;
	public static int gomendAxeID = 4252;
	public static int gomendShovelID = 4253;
	public static int gomendHoeID = 4254;
	
	public static int obsidianSwordID = 4255;
	public static int obsidianPickID = 4256;
	public static int obsidianAxeID = 4257;
	public static int obsidianShovelID = 4258;
	public static int obsidianHoeID = 4259;
	
	public static int stoneSwordID = 4260;
	public static int stonePickID = 4261;
	public static int stoneAxeID = 4262;
	public static int stoneShovelID = 4263;
	public static int stoneHoeID = 4264;
	
	public static int sandSwordID = 4265;
	public static int sandPickID = 4266;
	public static int sandAxeID = 4267;
	public static int sandShovelID = 4268;
	public static int sandHoeID = 4269;
	
	public static int emeraldSwordID = 4270;
	public static int emeraldPickID = 4271;
	public static int emeraldAxeID = 4272;
	public static int emeraldShovelID = 4273;
	public static int emeraldHoeID = 4274;

	//Ingots 4301-4320
	public static int obsidianShardID = 4301;
	public static int obsidianIngotID = 4302;
	public static int sandIngotID = 4303;
	public static int dirtIngotID = 4304;
	public static int dirtoneIngotID = 4305;
	public static int dironIngotID = 4306;
	public static int diroldIngotID = 4307;
	public static int dirmendIngotID = 4308;
	public static int stornIngotID = 4309;
	public static int stoldIngotID = 4310;
	public static int stomendIngotID = 4311;
	public static int iroldIngotID = 4312;
	public static int irmendIngotID = 4313;
	public static int gomendIngotID = 4314;
	
	//Flowers 4321-4340
	public static int dirtFlowerID = 4321;
	public static int stoneFlowerID = 4322;
	public static int ironFlowerID = 4323;
	public static int goldFlowerID = 4324;
	public static int diamondFlowerID = 4325;
	public static int obsidianFlowerID = 4326;

	//Foods 4341-4399
	public static int breadSliceID = 4341;
	public static int chickenStripsID = 4342;
	public static int beefSlicesID = 4343;
	public static int baconID = 4344;
	public static int chickenSandwichID = 4345;
	public static int chickenSandwichBaconID = 4346;
	public static int beefSandwichID = 4347;
	public static int beefSandwichBaconID = 4348;
	public static int meatSandwichID = 4349;
	public static int applePieID = 4350;
	public static int fruitSaladID = 4351;
	public static int appleSliceID = 4352;
	public static int bowlChickenID = 4353;
	public static int bowlBeefID = 4354;
	public static int bowlMeatID = 4355;
	public static int BaBID = 4356;
	public static int PaBID = 4357;
	public static int CaBID = 4368;
	public static int DogBreadID = 4369;
	
	public static int bioCoalID = 4370;
	public static int organicCoalID = 4371;
	public static int dirtCoalID = 4372;
	public static int cobbleCoalID = 4373;
	public static int ironCoalID = 4374;
	public static int goldCoalID = 4375;
	public static int diamondCoalID = 4376;
	public static int emeraldCoalID = 4377;
	public static int obsidianCoalID = 4378;
	
	public static final String commentPrefix = "************  ************\n\n";
	public static final String commentSuffix = "\n";
	
	public static void loadConfig(Configuration config)
	{
		config.load();
		
		Property bioCoalIDProperty = config.get(CAT_ITEMS, "bioCoalID", bioCoalID);
		bioCoalIDProperty.comment = commentPrefix + "Bio Coal Item ID default = " + bioCoalID + commentSuffix;
		
		Property organicCoalIDProperty = config.get(CAT_ITEMS, "organicCoalID", organicCoalID);
		organicCoalIDProperty.comment = commentPrefix + "Organic Coal Item ID default = " + organicCoalID + commentSuffix;
		
		Property dirtCoalIDProperty = config.get(CAT_ITEMS, "dirtCoalID", dirtCoalID);
		dirtCoalIDProperty.comment = commentPrefix + "Dirt Coal Item ID default = " + dirtCoalID + commentSuffix;
		
		Property cobbleCoalIDProperty = config.get(CAT_ITEMS, "cobbleCoalID", cobbleCoalID);
		cobbleCoalIDProperty.comment = commentPrefix + "Cobble Coal Item ID default = " + cobbleCoalID + commentSuffix;
		
		Property ironCoalIDProperty = config.get(CAT_ITEMS, "ironCoalID", ironCoalID);
		ironCoalIDProperty.comment = commentPrefix + "Iron Coal Item ID default = " + ironCoalID + commentSuffix;

		Property goldCoalIDProperty = config.get(CAT_ITEMS, "goldCoalID", goldCoalID);
		goldCoalIDProperty.comment = commentPrefix + "Gold Coal Item ID default = " + goldCoalID + commentSuffix;
		
		Property diamondCoalIDProperty = config.get(CAT_ITEMS, "diamondCoalID", diamondCoalID);
		diamondCoalIDProperty.comment = commentPrefix + "Diamond Coal Item ID default = " + diamondCoalID + commentSuffix;
		
		Property emeraldCoalIDProperty = config.get(CAT_ITEMS, "emeraldCoalID", emeraldCoalID);
		emeraldCoalIDProperty.comment = commentPrefix + "Emerald Coal Item ID default = " + emeraldCoalID + commentSuffix;
		
		Property obsidianCoalIDProperty = config.get(CAT_ITEMS, "obsidianCoalID", obsidianCoalID);
		obsidianCoalIDProperty.comment = commentPrefix + "Obsidian Coal Item ID default = " + obsidianCoalID + commentSuffix;

		Property dirtBlockIDProperty = config.get("blocks", "dirtBlockID", dirtBlockID);
		dirtBlockIDProperty.comment = commentPrefix + "Dirt Block ID default = " + dirtBlockID + commentSuffix;
		
		Property dirtoneBlockIDProperty = config.get(CAT_BLOCKS, "dirtOneBlockID", dirtoneBlockID);
		dirtoneBlockIDProperty.comment = commentPrefix + "Dirtone Block ID default = " + dirtoneBlockID + commentSuffix;
		
		Property dironBlockIDProperty = config.get(CAT_BLOCKS, "dironBlockID", dironBlockID);
		dironBlockIDProperty.comment = commentPrefix + "Diron Block ID default = " + dironBlockID + commentSuffix;
		
		Property diroldBlockIDProperty = config.get(CAT_BLOCKS, "diroldBlockID", diroldBlockID);
		diroldBlockIDProperty.comment = commentPrefix + "Dirold Block ID default = " + diroldBlockID + commentSuffix;
		
		Property dirmendBlockIDProperty = config.get(CAT_BLOCKS, "dirmendBlockID", dirmendBlockID);
		dirmendBlockIDProperty.comment = commentPrefix + "Dirmend Block ID default = " + dirmendBlockID + commentSuffix;
		
		Property stoneBlockIDProperty = config.get(CAT_BLOCKS, "stoneBlockID", stoneBlockID);
		stoneBlockIDProperty.comment = commentPrefix + "Stone Block ID default = " + stoneBlockID + commentSuffix;
		
		Property stornBlockIDProperty = config.get(CAT_BLOCKS, "stornBlockID", stornBlockID);
		stornBlockIDProperty.comment = commentPrefix + "Storn Block ID default = " + stornBlockID + commentSuffix;
		
		Property stoldBlockIDProperty = config.get(CAT_BLOCKS, "stoldBlockID", stoldBlockID);
		stoldBlockIDProperty.comment = commentPrefix + "Stold Block ID default = " + stoldBlockID + commentSuffix;
		
		Property stomendBlockIDProperty = config.get(CAT_BLOCKS, "stomendBlockID", stomendBlockID);
		stomendBlockIDProperty.comment = commentPrefix + "Stomend Block ID default = " + stomendBlockID + commentSuffix;
		
		Property iroldBlockIDProperty = config.get(CAT_BLOCKS, "iroldBlockID", iroldBlockID);
		iroldBlockIDProperty.comment = commentPrefix + "Irold Block ID default = " + iroldBlockID + commentSuffix;
		
		Property irmendBlockIDProperty  = config.get(CAT_BLOCKS, "irmendBlockID", irmendBlockID);
		irmendBlockIDProperty.comment = commentPrefix + "Irmend Block ID default = " + irmendBlockID + commentSuffix;
		
		Property gomendBlockIDProperty  = config.get(CAT_BLOCKS, "gomendBlockID", gomendBlockID);
		gomendBlockIDProperty.comment = commentPrefix + "Gomend Block ID default = " + gomendBlockID + commentSuffix;
		
		Property dandIDProperty  = config.get(CAT_BLOCKS, "dandID", dandID);
		dandIDProperty.comment = commentPrefix + "Dand Block ID default = " + dandID + commentSuffix;
		
		Property davelIDProperty  = config.get(CAT_BLOCKS, "davelID",	davelID);
		davelIDProperty.comment = commentPrefix + "Davel Block ID default = " + davelID + commentSuffix;
		
		Property doneIDProperty  = config.get(CAT_BLOCKS, "doneID", doneID);
		doneIDProperty.comment = commentPrefix + "Done Block ID default = " + doneID + commentSuffix;
		
		Property sandIDProperty  = config.get(CAT_BLOCKS, "sandID", sandID);
		sandIDProperty.comment = commentPrefix + "Sand Block ID default = " + sandID + commentSuffix;
		
		Property counterBlockIDProperty  = config.get(CAT_BLOCKS, "counterBlockID", counterBlockID);
		counterBlockIDProperty.comment = commentPrefix + "Counter Block ID default = " + counterBlockID + commentSuffix;
		
		Property stoveBlockIDProperty  = config.get(CAT_BLOCKS, "stoveBlockID", stoveBlockID);
		stoveBlockIDProperty.comment = commentPrefix + "Stove Block ID default = " + stoveBlockID + commentSuffix;
		
		Property potBlockIDProperty  = config.get(CAT_BLOCKS, "potBlockID", potBlockID);
		potBlockIDProperty.comment = commentPrefix + "Pot Block ID default = " + potBlockID + commentSuffix;
		
		Property combinerBlockIDProperty  = config.get(CAT_BLOCKS, "combinerBlockID", combinerBlockID);
		combinerBlockIDProperty.comment = commentPrefix + "Combiner Block ID default = " + combinerBlockID + commentSuffix;
	
		Property oreFlowerIDProperty  = config.get(CAT_BLOCKS, "oreFlowerID", oreFlowerID);
		oreFlowerIDProperty.comment = commentPrefix + "Ore Flower Block ID default = " + oreFlowerID + commentSuffix;
		
		/*Load all ingot Ids */
		Property obsidianShardIDProperty  = config.get(CAT_ITEMS, "obsidianShardID", obsidianShardID);
		obsidianShardIDProperty.comment = commentPrefix + "Obsidian Shard Item ID default = " + obsidianShardID + commentSuffix;
		
		Property obsidianIngotIDProperty  = config.get(CAT_ITEMS, "obsidianIngotID", obsidianIngotID);
		obsidianIngotIDProperty.comment = commentPrefix + "Obsidian Ingot Item ID default = " + obsidianIngotID + commentSuffix;
		
		Property sandIngotIDProperty  = config.get(CAT_ITEMS, "sandIngotID", sandIngotID);
		sandIngotIDProperty.comment = commentPrefix + "Sand Ingot Item ID default = " + sandIngotID + commentSuffix;
		
		Property dirtIngotIDProperty  = config.get(CAT_ITEMS, "dirtIngotID", dirtIngotID);
		dirtIngotIDProperty.comment = commentPrefix + "Dirt Ingot Item ID default = " + dirtIngotID + commentSuffix;
		
		Property dirtoneIngotIDProperty = config.get(CAT_ITEMS, "dirtoneIngotID", dirtoneIngotID);
		dirtoneIngotIDProperty.comment = commentPrefix + "Dirtone Ingot Item ID default = " + dirtoneIngotID + commentSuffix;
		
		Property dironIngotIDProperty  = config.get(CAT_ITEMS, "dironIngotID", dironIngotID);
		dironIngotIDProperty.comment = commentPrefix + "Diron Ingot Item ID default = " + dironIngotID + commentSuffix;
		
		Property diroldIngotIDProperty  = config.get(CAT_ITEMS, "diroldIngotID", diroldIngotID);
		diroldIngotIDProperty.comment = commentPrefix + "Dirold Ingot Item ID default = " + diroldIngotID + commentSuffix;
		
		Property dirmendIngotIDProperty  = config.get(CAT_ITEMS, "dirmendIngotID", dirmendIngotID);
		dirmendIngotIDProperty.comment = commentPrefix + "Dirmend Ingot ID default = " + dirmendIngotID + commentSuffix;
		
		Property stornIngotIDProperty  = config.get(CAT_ITEMS, "stornIngotID", stornIngotID);
		stornIngotIDProperty.comment = commentPrefix + "Storn Ingot Item ID default = " + stornIngotID + commentSuffix;
		
		Property stoldIngotIDProperty  = config.get(CAT_ITEMS, "stoldIngotID", stoldIngotID);
		stoldIngotIDProperty.comment = commentPrefix + "Stold Ingot Item ID default = " + stoldIngotID + commentSuffix;
		
		Property stomendIngotIDProperty  = config.get(CAT_ITEMS, "stomendIngotID", stomendIngotID);
		stomendIngotIDProperty.comment = commentPrefix + "Stomend Ingot Item ID default = " + stomendIngotID + commentSuffix;
		
		Property iroldIngotIDProperty  = config.get(CAT_ITEMS, "iroldIngotID", iroldIngotID);
		iroldIngotIDProperty.comment = commentPrefix + "Irold Ingot Item ID default = " + iroldIngotID + commentSuffix;
		
		Property irmendIngotIDProperty = config.get(CAT_ITEMS, "irmendIngotID", irmendIngotID);
		irmendIngotIDProperty.comment = commentPrefix + "Irmend Ingot Item ID default = " + irmendIngotID + commentSuffix;
		
		Property gomendIngotIDProperty = config.get(CAT_ITEMS, "gomendIngotID", gomendIngotID);
		gomendIngotIDProperty.comment = commentPrefix + "Gomend Ingot Item ID default = " + gomendIngotID + commentSuffix;

		/*Load all tool Ids */
		//dirt
		Property dirtAxeIDProperty = config.get(CAT_TOOLS, "dirtAxeID", dirtAxeID);
		dirtAxeIDProperty.comment = commentPrefix + "Dirt Axe Item ID default = " + dirtAxeID + commentSuffix;
		
		Property dirtHoeIDProperty = config.get(CAT_TOOLS, "dirtHoeID", dirtHoeID);
		dirtHoeIDProperty.comment = commentPrefix + "Dirt Hoe Item ID default = " + dirtHoeID + commentSuffix;
		
		Property dirtPickIDProperty = config.get(CAT_TOOLS, "dirtPickID", dirtHoeID);
		dirtPickIDProperty.comment = commentPrefix + "Dirt Pick Item ID default = " + dirtPickID + commentSuffix;
		
		Property dirtShovelIDProperty = config.get(CAT_TOOLS, "dirtShovelID", dirtShovelID);
		dirtShovelIDProperty.comment = commentPrefix + "Dirt Shovel Item ID default = " + dirtShovelID + commentSuffix;
		
		Property dirtSwordIDProperty = config.get(CAT_TOOLS, "dirtSwordID", dirtSwordID);		
		dirtSwordIDProperty.comment = commentPrefix + "Dirt Sword Item ID default = " + dirtSwordID + commentSuffix;

		//Dirt and diamond
		Property dirmendAxeIDProperty = config.get(CAT_TOOLS, "dirmendAxeID", dirmendAxeID);
		dirmendAxeIDProperty.comment = commentPrefix + "Dirmend Axe Item ID default = " + dirmendAxeID + commentSuffix;
		
		Property dirmendHoeIDProperty = config.get(CAT_TOOLS, "dirmendHoeID", dirmendHoeID);
		dirmendHoeIDProperty.comment = commentPrefix + "Dirmend Hoe Item ID default = " + dirmendHoeID + commentSuffix;
		
		Property dirmendPickIDProperty = config.get(CAT_TOOLS, "dirmendPickID", dirmendPickID);
		dirmendPickIDProperty.comment = commentPrefix + "Dirmend Pick Item ID default = " + dirmendPickID + commentSuffix;
		
		Property dirmendShovelIDProperty = config.get(CAT_TOOLS, "dirmendShovelID", dirmendShovelID);
		dirmendShovelIDProperty.comment = commentPrefix + "Dirmend Shovel Item ID default = " + dirmendShovelID + commentSuffix;
		
		Property dirmendSwordIDProperty = config.get(CAT_TOOLS, "dirmendSwordID", dirmendSwordID);		
		dirmendSwordIDProperty.comment = commentPrefix + "Dirmend Sword Item ID default = " + dirmendSwordID + commentSuffix;

		//dirt and gold
		Property diroldAxeIDProperty = config.get(CAT_TOOLS, "diroldAxeID", diroldAxeID);
		diroldAxeIDProperty.comment = commentPrefix + "Dirold Axe Item ID default = " + diroldAxeID + commentSuffix;
		
		Property diroldHoeIDProperty = config.get(CAT_TOOLS, "diroldHoeID", diroldHoeID);
		diroldHoeIDProperty.comment = commentPrefix + "Dirold Hoe Item ID default = " + diroldHoeID + commentSuffix;
		
		Property diroldPickIDProperty = config.get(CAT_TOOLS, "diroldPickID", diroldPickID);
		diroldPickIDProperty.comment = commentPrefix + "Dirold Pick Item ID default = " + diroldPickID + commentSuffix;
		
		Property diroldShovelIDProperty = config.get(CAT_TOOLS, "diroldShovelID", diroldShovelID);
		diroldShovelIDProperty.comment = commentPrefix + "Dirold Shovel Item ID default = " + diroldShovelID + commentSuffix;
		
		Property diroldSwordIDProperty = config.get(CAT_TOOLS, "diroldSwordID", diroldSwordID);
		diroldSwordIDProperty.comment = commentPrefix + "Dirold Sword Item ID default = " + diroldSwordID + commentSuffix;
		
		//dirt and iron
		Property dironAxeIDProperty = config.get(CAT_TOOLS, "dironAxeID", dironAxeID);
		dironAxeIDProperty.comment = commentPrefix + "Diron Axe Item ID default = " + dironAxeID + commentSuffix;
		
		Property dironHoeIDProperty = config.get(CAT_TOOLS, "dironHoeID", dironHoeID);
		dironHoeIDProperty.comment = commentPrefix + "Diron Hoe Item ID default = " + dironHoeID + commentSuffix;
		
		Property dironPickIDProperty = config.get(CAT_TOOLS, "dironPickID", dironPickID);
		dironPickIDProperty.comment = commentPrefix + "Diron Pick Item ID default = " + dironPickID + commentSuffix;
		
		Property dironShovelIDProperty = config.get(CAT_TOOLS, "dironShovelID", dironShovelID);
		dironShovelIDProperty.comment = commentPrefix + "Diron Shovel Item ID default = " + dironShovelID + commentSuffix;
		
		Property dironSwordIDProperty = config.get(CAT_TOOLS, "dironSwordID", dironSwordID);
		dironSwordIDProperty.comment = commentPrefix + "Diron Sword Item ID default = " + dironSwordID + commentSuffix;
		
		//STORN
		Property stornAxeIDProperty = config.get(CAT_TOOLS, "stornAxeID", stornAxeID);
		stornAxeIDProperty.comment = commentPrefix + "Storn Axe Item ID default = " + stornAxeID + commentSuffix;
		
		Property stornHoeIDProperty = config.get(CAT_TOOLS, "stornHoeID", stornHoeID);
		stornHoeIDProperty.comment = commentPrefix + "Storn Hoe Item ID default = " + stornHoeID + commentSuffix;
		
		Property stornPickIDProperty = config.get(CAT_TOOLS, "stornPickID", stornPickID);
		stornPickIDProperty.comment = commentPrefix + "Storn Pick Item ID default = " + stornPickID + commentSuffix;
		
		Property stornShovelIDProperty = config.get(CAT_TOOLS, "stornShovelID", stornShovelID);
		stornShovelIDProperty.comment = commentPrefix + "Storn Shovel Item ID default = " + stornShovelID + commentSuffix;
		
		Property stornSwordIDProperty = config.get(CAT_TOOLS, "stornSwordID", stornSwordID);
		stornSwordIDProperty.comment = commentPrefix + "Storn Sword Item ID default = " + stornSwordID + commentSuffix;
		
		//stold
		Property stoldAxeIDProperty = config.get(CAT_TOOLS, "stoldAxeID", stoldAxeID);
		stoldAxeIDProperty.comment = commentPrefix + "Stold Axe Item ID default = " + stoldAxeID + commentSuffix;
		
		Property stoldHoeIDProperty = config.get(CAT_TOOLS, "stoldHoeID", stoldHoeID);
		stoldHoeIDProperty.comment = commentPrefix + "Stold Hoe Item ID default = " + stoldHoeID + commentSuffix;
		stoldHoeIDProperty.comment = commentPrefix + "Stold Hoe Item ID default = " + stoldHoeID + commentSuffix;
		
		Property stoldPickIDProperty = config.get(CAT_TOOLS, "stoldPickID", stoldPickID);
		stoldPickIDProperty.comment = commentPrefix + "Stold Pick Item ID default = " + stoldPickID + commentSuffix;
		
		Property stoldShovelIDProperty = config.get(CAT_TOOLS, "stoldShovelID", stoldShovelID);
		stoldShovelIDProperty.comment = commentPrefix + "Stold Shovel Item ID default = " + stoldShovelID + commentSuffix;
		
		Property stoldSwordIDProperty = config.get(CAT_TOOLS, "stoldSwordID", stoldSwordID);
		stoldSwordIDProperty.comment = commentPrefix + "Stold Sword Item ID default = " + stoldSwordID + commentSuffix;
		
		
		//STOMEND
		Property stomendAxeIDProperty = config.get(CAT_TOOLS, "stomendAxeID", stomendAxeID);
		stomendAxeIDProperty.comment = commentPrefix + "Stomend Axe Item ID default = " + stomendAxeID + commentSuffix;
		
		Property stomendHoeIDProperty = config.get(CAT_TOOLS, "stomendHoeID", stomendHoeID);
		stomendHoeIDProperty.comment = commentPrefix + "Stomend Hoe Item ID default = " + stomendHoeID + commentSuffix;
		
		Property stomendPickIDProperty  = config.get(CAT_TOOLS, "stomendPickID", stomendPickID);
		stomendPickIDProperty.comment = commentPrefix + "Stomend Pick Item ID default = " + stomendPickID + commentSuffix;
		
		Property stomendShovelIDProperty  = config.get(CAT_TOOLS, "stomendShovelID", stomendShovelID);
		stomendShovelIDProperty.comment = commentPrefix + "Stomend Shovel Item ID default = " + stomendShovelID + commentSuffix;
		
		Property stomendSwordIDProperty  = config.get(CAT_TOOLS, "stomendSwordID", stomendSwordID);
		stomendSwordIDProperty.comment = commentPrefix + "Stomend Sword Item ID default = " + stomendSwordID + commentSuffix;
		
		//IROLD
		Property iroldAxeIDProperty  = config.get(CAT_TOOLS, "iroldAxeID", iroldAxeID);
		iroldAxeIDProperty.comment = commentPrefix + "Irold Axe Item ID default = " + iroldAxeID + commentSuffix;
		
		Property iroldHoeIDProperty  = config.get(CAT_TOOLS, "iroldHoeID", iroldHoeID);
		iroldHoeIDProperty.comment = commentPrefix + "Irold Hoe Item ID default = " + iroldHoeID + commentSuffix;
		
		Property iroldPickIDProperty  = config.get(CAT_TOOLS, "iroldPickID", iroldPickID);
		iroldPickIDProperty.comment = commentPrefix + "Irold Pick Item ID default = " + iroldPickID + commentSuffix;
		
		Property iroldShovelIDProperty  = config.get(CAT_TOOLS, "iroldShovelID", iroldShovelID);
		iroldShovelIDProperty.comment = commentPrefix + "Irold Shovel Item ID default = " + iroldShovelID + commentSuffix;
		
		Property iroldSwordIDProperty  = config.get(CAT_TOOLS, "iroldSwordID", iroldSwordID);
		iroldSwordIDProperty.comment = commentPrefix + "Irold Sword Item ID default = " + iroldSwordID + commentSuffix;
		
		//IRMEND
		Property irmendAxeIDProperty = config.get(CAT_TOOLS, "irmendAxeID", irmendAxeID);
		irmendAxeIDProperty.comment = commentPrefix + "Irmend Axe Item ID default = " + irmendAxeID + commentSuffix;
		
		Property irmendHoeIDProperty = config.get(CAT_TOOLS, "irmendHoeID", irmendHoeID);
		irmendHoeIDProperty.comment = commentPrefix + "Irmend Hoe Item ID default = " + irmendHoeID + commentSuffix;
		
		Property irmendPickIDProperty = config.get(CAT_TOOLS, "irmendPickID", irmendPickID);
		irmendPickIDProperty.comment = commentPrefix + "Irmend Pick Item ID default = " + irmendPickID + commentSuffix;
		
		Property irmendShovelIDProperty = config.get(CAT_TOOLS, "irmendShovelID", irmendShovelID);
		irmendShovelIDProperty.comment = commentPrefix + "Irmend Shovel Item ID default = " + irmendShovelID + commentSuffix;
		
		Property irmendSwordIDProperty = config.get(CAT_TOOLS, "irmendSwordID", irmendSwordID);	
		irmendSwordIDProperty.comment = commentPrefix + "Irmend Sword Item ID default = " + irmendSwordID + commentSuffix;
		
		//GOMEND
		Property gomendAxeIDProperty  = config.get(CAT_TOOLS, "gomendAxeID", gomendAxeID);
		gomendAxeIDProperty.comment = commentPrefix + "Gomend Axe Item ID default = " + gomendAxeID + commentSuffix;
		
		Property gomendHoeIDProperty  = config.get(CAT_TOOLS, "gomendHoeID", gomendHoeID);
		gomendHoeIDProperty.comment = commentPrefix + "Gomend Hoe Item ID default = " + gomendHoeID + commentSuffix;
		
		Property gomendPickIDProperty  = config.get(CAT_TOOLS, "gomendPickID", gomendPickID);
		gomendPickIDProperty.comment = commentPrefix + "Gomend Pick Item ID default = " + gomendPickID + commentSuffix;
		
		Property gomendShovelIDProperty  = config.get(CAT_TOOLS, "gomendShovelID", gomendShovelID);
		gomendShovelIDProperty.comment = commentPrefix + "Gomend Shovel Item ID default = " + gomendShovelID + commentSuffix;
		
		Property gomendSwordIDProperty  = config.get(CAT_TOOLS, "gomendSwordID", gomendSwordID);
		gomendSwordIDProperty.comment = commentPrefix + "Gomend Sword Item ID default = " + gomendSwordID + commentSuffix;
		
		//sand
		Property sandAxeIDProperty  = config.get(CAT_TOOLS, "sandAxeID", sandAxeID);
		sandAxeIDProperty.comment = commentPrefix + "Sand Axe Item ID default = " + sandAxeID + commentSuffix;
		
		Property sandHoeIDProperty  = config.get(CAT_TOOLS, "sandHoeID", sandHoeID);
		sandHoeIDProperty.comment = commentPrefix + "Sand Hoe Item ID default = " + sandHoeID + commentSuffix;
		
		Property sandPickIDProperty  = config.get(CAT_TOOLS, "sandPickID", sandPickID);
		sandPickIDProperty.comment = commentPrefix + "Sand Pick Item ID default = " + sandPickID + commentSuffix;
		
		Property sandShovelIDProperty  = config.get(CAT_TOOLS, "sandShovelID", sandShovelID);
		sandShovelIDProperty.comment = commentPrefix + "Sand Shovel Item ID default = " + sandShovelID + commentSuffix;
		
		Property sandSwordIDProperty  = config.get(CAT_TOOLS, "sandSwordID", sandSwordID);		
		sandSwordIDProperty.comment = commentPrefix + "Sand Sword Item ID default = " + sandSwordID + commentSuffix;
		
		//obsidian
		Property obsidianAxeIDProperty  = config.get(CAT_TOOLS, "obsidianAxeID", obsidianAxeID);
		obsidianAxeIDProperty.comment = commentPrefix + "Obsidian Axe Item ID default = " + obsidianAxeID + commentSuffix;
		
		Property obsidianHoeIDProperty  = config.get(CAT_TOOLS, "obsidianHoeID", obsidianHoeID);
		obsidianHoeIDProperty.comment = commentPrefix + "Obsidian Hoe Item ID default = " + obsidianHoeID + commentSuffix;
		
		Property obsidianPickIDProperty  = config.get(CAT_TOOLS, "obsidianPickID", obsidianPickID);
		obsidianPickIDProperty.comment = commentPrefix + "Obsidian Pick Item ID default = " + obsidianPickID + commentSuffix;
		
		Property obsidianShovelIDProperty  = config.get(CAT_TOOLS, "obsidianShovelID", obsidianShovelID);
		obsidianShovelIDProperty.comment = commentPrefix + "Obsidian Shovel Item ID default = " + obsidianShovelID + commentSuffix;
		
		Property obsidianSwordIDProperty  = config.get(CAT_TOOLS, "obsidianSwordID", obsidianSwordID);
		obsidianSwordIDProperty.comment = commentPrefix + "Obsidian Sword Item ID default = " + obsidianSwordID + commentSuffix;
		
		//emerald
		Property emeraldAxeIDProperty  = config.get(CAT_TOOLS, "emeraldAxeID", emeraldAxeID);
		emeraldAxeIDProperty.comment = commentPrefix + "Emerald Axe Item ID default = " + emeraldAxeID + commentSuffix;
		
		Property emeraldHoeIDProperty  = config.get(CAT_TOOLS, "emeraldHoeID", emeraldHoeID);
		emeraldHoeIDProperty.comment = commentPrefix + "Emerald Hoe Item ID default = " + emeraldHoeID + commentSuffix;
		
		Property emeraldPickIDProperty  = config.get(CAT_TOOLS, "emeraldPickID", emeraldPickID);
		emeraldPickIDProperty.comment = commentPrefix + "Emerald Pick Item ID default = " + emeraldPickID + commentSuffix;
		
		Property emeraldShovelIDProperty  = config.get(CAT_TOOLS, "emeraldShovelID", emeraldShovelID);
		emeraldShovelIDProperty.comment = commentPrefix + "Emerald Shovel Item ID default = " + emeraldShovelID + commentSuffix;
		
		Property emeraldSwordIDProperty  = config.get(CAT_TOOLS, "emeraldSwordID", emeraldSwordID);
		emeraldSwordIDProperty.comment = commentPrefix + "Emerald Sword Item ID default = " + emeraldSwordID + commentSuffix;
		
		//Food
		Property breadSliceIDProperty  = config.get(CAT_FOOD, "breadSliceID", breadSliceID);
		breadSliceIDProperty.comment = commentPrefix + "Slice of Bread Item ID default = " + breadSliceID + commentSuffix;
		
		Property chickenStripsIDProperty  = config.get(CAT_FOOD, "chickenStripsID", chickenStripsID);
		chickenStripsIDProperty.comment = commentPrefix + "Chicken Tender Item ID default = " + chickenStripsID + commentSuffix;
		
		Property beefSlicesIDProperty  = config.get(CAT_FOOD, "beefSlicesID", beefSlicesID);
		beefSlicesIDProperty.comment = commentPrefix + "Beef Slices Item ID default = " + beefSlicesID + commentSuffix;
		
		Property baconIDProperty = config.get(CAT_FOOD, "Bacon", baconID);
		baconIDProperty.comment = commentPrefix + "Bacon Item ID default = " + baconID + commentSuffix;
		
		Property chickenSandwichIDProperty = config.get(CAT_FOOD, "chickenSandwichID", chickenSandwichID);
		chickenSandwichIDProperty.comment = commentPrefix + "Chicken Sandwich Item ID default = " + chickenSandwichID + commentSuffix;
		
		Property chickenSandwichBaconIDProperty = config.get(CAT_FOOD, "chickenSandwichBaconID", chickenSandwichBaconID);
		chickenSandwichBaconIDProperty.comment = commentPrefix + "Chicken Sandwich w/Bacon Item ID default = " + chickenSandwichBaconID + commentSuffix;
		
		Property beefSandwichIDProperty = config.get(CAT_FOOD, "beefSandwichID", beefSandwichID);
		beefSandwichIDProperty.comment = commentPrefix + "Beef Sandwich Item ID default = " + beefSandwichID + commentSuffix;
		
		Property beefSandwichBaconIDProperty = config.get(CAT_FOOD, "beefSandwichBaconID", beefSandwichBaconID);
		beefSandwichBaconIDProperty.comment = commentPrefix + "Beef Sandwich w/Bacon Item ID default = " + beefSandwichBaconID + commentSuffix;
		
		Property meatSandwichIDProperty = config.get(CAT_FOOD, "meatSandwichID", meatSandwichID);
		meatSandwichIDProperty.comment = commentPrefix + "Meat Sandwich Item ID default = " + meatSandwichID + commentSuffix;
		
		Property applePieIDProperty = config.get(CAT_FOOD, "applePieID", applePieID);
		applePieIDProperty.comment = commentPrefix + "Apple Pie Item ID default = " + applePieID + commentSuffix;
		
		Property fruitSaladIDProperty = config.get(CAT_FOOD, "fruitSaladID", fruitSaladID);
		fruitSaladIDProperty.comment = commentPrefix + "Fruit Salad Item ID default = " + fruitSaladID + commentSuffix;
		
		Property appleSliceIDProperty = config.get(CAT_FOOD, "appleSliceID", appleSliceID);
		appleSliceIDProperty.comment = commentPrefix + "Apple Slice Item ID default = " + appleSliceID + commentSuffix;
		
		Property BaBIDProperty = config.get(CAT_FOOD, "BaBID", BaBID);
		BaBIDProperty.comment = commentPrefix + "Beef and Bacon Sandwich Item ID default = " + BaBID + commentSuffix;
		
		Property PaBIDProperty = config.get(CAT_FOOD, "PaBID", PaBID);
		PaBIDProperty.comment = commentPrefix + "Pork and Bacon Sandwich Item ID default = " + PaBID + commentSuffix;
		
		Property CaBIDProperty = config.get(CAT_FOOD, "CaBID", CaBID);
		CaBIDProperty.comment = commentPrefix + "Chicken and Bacon Sandwich Item ID default = " + CaBID + commentSuffix;
		
		Property DogBreadIDProperty = config.get(CAT_FOOD, "DogBreadID", DogBreadID);
		DogBreadIDProperty.comment = commentPrefix + "Doggie Treat Item ID default = " + DogBreadID + commentSuffix;
		
		Property bowlChickenIDProperty = config.get(CAT_FOOD, "bowlChickenID", bowlChickenID);
		bowlChickenIDProperty.comment = commentPrefix + "Bowl Chicken Soup Item ID default = " + bowlChickenID + commentSuffix;
		
		Property bowlBeefIDProperty = config.get(CAT_FOOD, "bowlBeefID", bowlBeefID);
		bowlBeefIDProperty.comment = commentPrefix + "Bowl Beef Soup Item ID default = " + bowlBeefID + commentSuffix;
		
		Property bowlMeatIDProperty = config.get(CAT_FOOD, "bowlMeatID", bowlMeatID);
		bowlMeatIDProperty.comment = commentPrefix + "Bowl Meat Soup Item ID default = " + bowlMeatID + commentSuffix;
		
		//Armor
		Property dirtHelmetIDProperty = config.get(CAT_ARMOR, "dirtHelmetID", dirtHelmetID);
		dirtHelmetIDProperty.comment = commentPrefix + "Dirt Helmet Item ID default = " + dirtHelmetID + commentSuffix;
		
		Property dirtPlateIDProperty = config.get(CAT_ARMOR, "dirtPlateID", dirtPlateID);
		dirtPlateIDProperty.comment = commentPrefix + "Dirt Chest Plate Item ID default = " + dirtPlateID + commentSuffix;
		
		Property dirtLegsIDProperty = config.get(CAT_ARMOR, "dirtLegsID", dirtLegsID);
		dirtLegsIDProperty.comment = commentPrefix + "Dirt Leggings Item ID default = " + dirtLegsID + commentSuffix;
		
		Property dirtBootsIDProperty = config.get(CAT_ARMOR, "dirtBootsID", dirtBootsID);
		dirtBootsIDProperty.comment = commentPrefix + "Dirt Boots Item ID default = " + dirtBootsID + commentSuffix;
		
		Property dirtoneHelmetIDProperty = config.get(CAT_ARMOR, "dirtoneHelmetID", dirtoneHelmetID);
		dirtoneHelmetIDProperty.comment = commentPrefix + "Dirtone Helmet Item ID default = " + dirtoneHelmetID + commentSuffix;

		Property dirtonePlateIDProperty = config.get(CAT_ARMOR, "dirtonePlateID", dirtonePlateID);
		dirtonePlateIDProperty.comment = commentPrefix + "Dirtone Chest Plate Item ID default = " + dirtonePlateID + commentSuffix;
		
		Property dirtoneLegsIDProperty = config.get(CAT_ARMOR, "dirtoneLegsID", dirtoneLegsID);
		dirtoneLegsIDProperty.comment = commentPrefix + "Dirtone Leggings Item ID default = " + dirtoneLegsID + commentSuffix;
		
		Property dirtoneBootsIDProperty = config.get(CAT_ARMOR, "dirtoneBootsID", dirtoneBootsID);
		dirtoneBootsIDProperty.comment = commentPrefix + "Dirtone Boots Item ID default = " + dirtoneBootsID + commentSuffix;
		
		Property dironHelmetIDProperty = config.get(CAT_ARMOR, "dironHelmetID", dironHelmetID);
		dironHelmetIDProperty.comment = commentPrefix + "Diron Helemt Item ID default = " + dironHelmetID + commentSuffix;
		
		Property dironPlateIDProperty = config.get(CAT_ARMOR, "dironPlateID", dironPlateID);
		dironPlateIDProperty.comment = commentPrefix + "Diron Chest Plate Item ID default = " + dironPlateID + commentSuffix;
		
		Property dironLegsIDProperty = config.get(CAT_ARMOR, "dironLegsID", dironLegsID);
		dironLegsIDProperty.comment = commentPrefix + "Diron Leggings Item ID default = " + dironLegsID + commentSuffix;
		
		Property dironBootsIDProperty = config.get(CAT_ARMOR, "dironBootsID", dironBootsID);
		dironBootsIDProperty.comment = commentPrefix + "Diron Boots Item ID default = " + dironBootsID + commentSuffix;
		
		Property diroldHelmetIDProperty = config.get(CAT_ARMOR, "diroldHelmetID", diroldHelmetID);
		diroldHelmetIDProperty.comment = commentPrefix + "Dirold Helmet Item ID default = " + diroldHelmetID + commentSuffix;
		
		Property diroldPlateIDProperty = config.get(CAT_ARMOR, "diroldPlateID", diroldPlateID);
		diroldPlateIDProperty.comment = commentPrefix + "Dirold Chest Plate Item ID default = " + diroldPlateID + commentSuffix;
		
		Property diroldLegsIDProperty = config.get(CAT_ARMOR, "diroldLegsID", diroldLegsID);
		diroldLegsIDProperty.comment = commentPrefix + "Dirold Leggings Item ID default = " + diroldLegsID + commentSuffix;
		
		Property diroldBootsIDProperty = config.get(CAT_ARMOR, "diroldBootsID", diroldBootsID);
		diroldBootsIDProperty.comment = commentPrefix + "Dirold Boots Item ID default = " + diroldBootsID + commentSuffix;
		
		Property dirmendHelmetIDProperty = config.get(CAT_ARMOR, "dirmendHelmetID", dirmendHelmetID);
		dirmendHelmetIDProperty.comment = commentPrefix + "Dirmend Helmet Item ID default = " + dirmendHelmetID + commentSuffix;
		
		Property dirmendPlateIDProperty = config.get(CAT_ARMOR, "dirmendPlateID", dirmendPlateID);
		dirmendPlateIDProperty.comment = commentPrefix + "Dirmend Chest Plate Item ID default = " + dirmendPlateID + commentSuffix;
		
		Property dirmendLegsIDProperty = config.get(CAT_ARMOR, "dirmendLegsID", dirmendLegsID);
		dirmendLegsIDProperty.comment = commentPrefix + "Dirmend Leggings Item ID default = " + dirmendLegsID + commentSuffix;
		
		Property dirmendBootsIDProperty = config.get(CAT_ARMOR, "dirmendBootsID", dirmendBootsID);
		dirmendBootsIDProperty.comment = commentPrefix + "Dirmend Boots Item ID default = " + dirmendBootsID + commentSuffix;
		
		Property stornHelmetIDProperty = config.get(CAT_ARMOR, "stornHelmetID", stornHelmetID);
		stornHelmetIDProperty.comment = commentPrefix + "Storn Helmet Item ID default = " + stornHelmetID + commentSuffix;
		
		Property stornPlateIDProperty = config.get(CAT_ARMOR, "stornPLateID", stornPlateID);
		stornPlateIDProperty.comment = commentPrefix + "Storn Chest Plate Item ID default = " + stornPlateID + commentSuffix;
		
		Property stornLegsIDProperty = config.get(CAT_ARMOR, "stornLegsID", stornLegsID);
		stornLegsIDProperty.comment = commentPrefix + "Storn Leggings Item ID default = " + stornLegsID + commentSuffix;
		
		Property stornBootsIDProperty = config.get(CAT_ARMOR, "stornBootsID", stornBootsID);
		stornBootsIDProperty.comment = commentPrefix + "Storn Boots Item ID default = " + stornBootsID + commentSuffix;
		
		Property stoldHelmetIDProperty = config.get(CAT_ARMOR, "stoldHelmetID", stoldHelmetID);
		stoldHelmetIDProperty.comment = commentPrefix + "Stold Helmet Item ID default = " + stoldHelmetID + commentSuffix;
		
		Property stoldPlateIDProperty = config.get(CAT_ARMOR, "stoldPlateID", stoldPlateID);
		stoldPlateIDProperty.comment = commentPrefix + "Stold Chest Plate Item ID default = " + stoldPlateID + commentSuffix;
		
		Property stoldLegsIDProperty = config.get(CAT_ARMOR, "stoldLegsID", stoldLegsID);
		stoldLegsIDProperty.comment = commentPrefix + "Stold Leggings Item ID default = " + stoldLegsID + commentSuffix;
		
		Property stoldBootsIDProperty = config.get(CAT_ARMOR, "stoldBootsID", stoldBootsID);
		stoldBootsIDProperty.comment = commentPrefix + "Stold Boots Item ID default = " + stoldBootsID + commentSuffix;

		Property stomendHelmetIDProperty = config.get(CAT_ARMOR, "stomendHelmetID", stomendHelmetID);
		stomendHelmetIDProperty.comment = commentPrefix + "Stomend Helmet Item ID default = " + stomendHelmetID + commentSuffix;
		
		Property stomendPlateIDProperty = config.get(CAT_ARMOR, "stomendPlateID", stomendPlateID);
		stomendPlateIDProperty.comment = commentPrefix + "Stomend Chest Plate Item ID default = " + stomendPlateID + commentSuffix;
		
		Property stomendLegsIDProperty = config.get(CAT_ARMOR, "stomendLegsID", stomendLegsID);
		stomendLegsIDProperty.comment = commentPrefix + "Stomend Leggings Item ID default = " + stomendLegsID + commentSuffix;
		
		Property stomendBootsIDProperty = config.get(CAT_ARMOR, "stomendBootsID", stomendBootsID);
		stomendBootsIDProperty.comment = commentPrefix + "Stomend Boots Item ID default = " + stomendBootsID + commentSuffix;
		
		Property iroldHelmetIDProperty = config.get(CAT_ARMOR, "iroldHelmetID", iroldHelmetID);
		iroldHelmetIDProperty.comment = commentPrefix + "Irold Helmet Item ID default = " + iroldHelmetID + commentSuffix;
		
		Property iroldPlateIDProperty = config.get(CAT_ARMOR, "iroldPlateID", iroldPlateID);
		iroldPlateIDProperty.comment = commentPrefix + "Irold Chest Plate Item ID default = " + iroldPlateID + commentSuffix;
		
		Property iroldLegsIDProperty = config.get(CAT_ARMOR, "iroldLegsID", iroldLegsID);
		iroldLegsIDProperty.comment = commentPrefix + "Irold Leggings Item ID default = " + iroldLegsID + commentSuffix;
		
		Property iroldBootsIDProperty = config.get(CAT_ARMOR, "iroldBootsID", iroldBootsID);
		iroldBootsIDProperty.comment = commentPrefix + "Irold Boots Item ID default = " + iroldBootsID + commentSuffix;
		
		Property irmendHelmetIDProperty = config.get(CAT_ARMOR, "irmendHelmetID", irmendHelmetID);
		irmendHelmetIDProperty.comment = commentPrefix + "Irmend Helmet Item ID default = " + irmendHelmetID + commentSuffix;
		
		Property irmendPlateIDProperty = config.get(CAT_ARMOR, "irmendPlateID", irmendPlateID);
		irmendPlateIDProperty.comment = commentPrefix + "Irmend Chest Plate Item ID default = " + irmendPlateID + commentSuffix;
		
		Property irmendLegsIDProperty = config.get(CAT_ARMOR, "irmendLegsID", irmendLegsID);
		irmendLegsIDProperty.comment = commentPrefix + "Irmend Leggings Item ID default = " + irmendLegsID + commentSuffix;
		
		Property irmendBootsIDProperty = config.get(CAT_ARMOR, "irmendBootsID", irmendBootsID);
		irmendBootsIDProperty.comment = commentPrefix + "Irmend Boots Item ID default = " + irmendBootsID + commentSuffix;
		
		Property gomendHelmetIDProperty = config.get(CAT_ARMOR, "gomendHelmetID", gomendHelmetID);
		gomendHelmetIDProperty.comment = commentPrefix + "Gomend Helmet Item ID default = " + gomendHelmetID + commentSuffix;
		
		Property gomendPlateIDProperty = config.get(CAT_ARMOR, "gomendPlateID", gomendPlateID);
		gomendPlateIDProperty.comment = commentPrefix + "Gomend Chest Plate Item ID default = " + gomendPlateID + commentSuffix;
		
		Property gomendLegsIDProperty = config.get(CAT_ARMOR, "gomendLegsID", gomendLegsID);
		gomendLegsIDProperty.comment = commentPrefix + "Gomend Leggings Item ID default = " + gomendLegsID + commentSuffix;
		
		Property gomendBootsIDProperty = config.get(CAT_ARMOR, "gomendBootsID", gomendBootsID);
		gomendBootsIDProperty.comment = commentPrefix + "Gomend Boots Item ID default = " + gomendBootsID + commentSuffix;
		
		Property obsidianHelmetIDProperty = config.get(CAT_ARMOR, "obsidianHelmetID", obsidianHelmetID);
		obsidianHelmetIDProperty.comment = commentPrefix + "Obsidian Helmet Item ID default = " + obsidianHelmetID + commentSuffix;
		
		Property obsidianPlateIDProperty = config.get(CAT_ARMOR, "obsidianPlateID", obsidianPlateID);
		obsidianPlateIDProperty.comment = commentPrefix + "Obsidian Chest Plate Item ID default = " + obsidianPlateID + commentSuffix;
		
		Property obsidianLegsIDProperty = config.get(CAT_ARMOR, "obsidianLegsID", obsidianLegsID);
		obsidianLegsIDProperty.comment = commentPrefix + "Obsidian Leggings Item ID default = " + obsidianLegsID + commentSuffix;
		
		Property obsidianBootsIDProperty = config.get(CAT_ARMOR, "obsidianBootsID", obsidianBootsID);
		obsidianBootsIDProperty.comment = commentPrefix + "Obsidian Boots Item ID default = " + obsidianBootsID + commentSuffix;
		
		Property stoneHelmetIDProperty = config.get(CAT_ARMOR, "stoneHelmetID", stoneHelmetID);
		stoneHelmetIDProperty.comment = commentPrefix + "Stone Helmet Item ID default = " + stoneHelmetID + commentSuffix;
		
		Property stonePlateIDProperty = config.get(CAT_ARMOR, "stonePLateID", stonePlateID);
		stonePlateIDProperty.comment = commentPrefix + "Stone Chest Plate Item ID default = " + stonePlateID + commentSuffix;
		
		Property stoneLegsIDProperty = config.get(CAT_ARMOR, "stoneLegsID", stoneLegsID);
		stoneLegsIDProperty.comment = commentPrefix + "Stone Leggings Item ID default = " + stoneLegsID + commentSuffix;
		
		Property stoneBootsIDProperty = config.get(CAT_ARMOR, "stoneBootsID", stoneBootsID);
		stoneBootsIDProperty.comment = commentPrefix + "Stone Boots Item ID default = " + stoneBootsID + commentSuffix;
		
		Property sandHelmetIDProperty = config.get(CAT_ARMOR, "sandHelmetID", sandHelmetID);
		sandHelmetIDProperty.comment = commentPrefix + "Sand Helmet Item ID default = " + sandHelmetID + commentSuffix;
		
		Property sandPlateIDProperty = config.get(CAT_ARMOR, "sandPlateID", sandPlateID);
		sandPlateIDProperty.comment = commentPrefix + "Sand Chest Plate Item ID default = " + sandPlateID + commentSuffix;
		
		Property sandLegsIDProperty = config.get(CAT_ARMOR, "sandLegsID", sandLegsID);
		sandLegsIDProperty.comment = commentPrefix + "Sand Leggings Item ID default = " + sandLegsID + commentSuffix;
		
		Property sandBootsIDProperty = config.get(CAT_ARMOR, "sandBootsID", sandBootsID);
		sandBootsIDProperty.comment = commentPrefix + "Sand Boots Item ID default = " + sandBootsID + commentSuffix;
		
		Property emeraldHelmetIDProperty = config.get(CAT_ARMOR, "emeraldHelmetID", emeraldHelmetID);
		emeraldHelmetIDProperty.comment = commentPrefix + "Emerald Helmet Item ID default = " + emeraldHelmetID + commentSuffix;
		
		Property emeraldPlateIDProperty = config.get(CAT_ARMOR, "emeraldPlateID", emeraldPlateID);
		emeraldPlateIDProperty.comment = commentPrefix + "Emerald Chest Plate Item ID default = " + emeraldPlateID + commentSuffix;
		
		Property emeraldLegsIDProperty = config.get(CAT_ARMOR, "emeraldLegsID", emeraldLegsID);
		emeraldLegsIDProperty.comment = commentPrefix + "Emerald Leggings Item ID default = " + emeraldLegsID + commentSuffix;
		
		Property emeraldBootsIDProperty = config.get(CAT_ARMOR, "emeraldBootsID", emeraldBootsID);
		emeraldBootsIDProperty.comment = commentPrefix + "Emerald Boots Item ID default = " + emeraldBootsID + commentSuffix;
		
		
		config.save();
		
	}
	
	public Configuration getInstance(Configuration config)
	{
		return config;
	}

}
