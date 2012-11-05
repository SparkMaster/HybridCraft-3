package hybridcraft.common.handlers;

import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;

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
	
	public static int emeraldhelmetID = 4156;
	public static int emeraldplateID = 4157;
	public static int emeraldlegsID = 4158;
	public static int emeraldbootsID = 4159;
	
	
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

	private static final String COMMENT_PREFIX = "\n";
	private static final String COMMENT_SUFFIX = "\n";
	
	public static void loadConfig(Configuration config)
	{
		
		config.load();
		

		dirtBlockID = config.get("blocks", "dirtBlockID", dirtBlockID).getInt();
		
		
		dirtoneBlockID = config.get(CAT_BLOCKS, "dirtOneBlockID", dirtoneBlockID).getInt();
		dironBlockID = config.get(CAT_BLOCKS, "dironBlockID", dironBlockID).getInt();
		diroldBlockID = config.get(CAT_BLOCKS, "diroldBlockID", diroldBlockID).getInt();
		dirmendBlockID = config.get(CAT_BLOCKS, "dirmendBlockID", dirmendBlockID).getInt();
		stoneBlockID = config.get(CAT_BLOCKS, "stoneBlockID", stoneBlockID).getInt();
		stornBlockID = config.get(CAT_BLOCKS, "stornBlockID", stornBlockID).getInt();
		stoldBlockID = config.get(CAT_BLOCKS, "stoldBlockID", stoldBlockID).getInt();
		stomendBlockID = config.get(CAT_BLOCKS, "stomendBlockID", stomendBlockID).getInt();
		iroldBlockID = config.get(CAT_BLOCKS, "iroldBlockID", iroldBlockID).getInt();
		irmendBlockID = config.get(CAT_BLOCKS, "irmendBlockID", irmendBlockID).getInt();
		gomendBlockID = config.get(CAT_BLOCKS, "gomendBlockID", gomendBlockID).getInt();
		dandID = config.get(CAT_BLOCKS, "dandID", dandID).getInt();
		davelID = config.get(CAT_BLOCKS, "davelID",	davelID).getInt();
		doneID = config.get(CAT_BLOCKS, "doneID", doneID).getInt();
		sandID = config.get(CAT_BLOCKS, "sandID", sandID).getInt();
		counterBlockID = config.get(CAT_BLOCKS, "counterBlockID", counterBlockID).getInt();
		stoveBlockID = config.get(CAT_BLOCKS, "stoveBlockID", stoveBlockID).getInt();
		potBlockID = config.get(CAT_BLOCKS, "potBlockID", potBlockID).getInt();
		combinerBlockID = config.get(CAT_BLOCKS, "combinerBlockID", combinerBlockID).getInt();
		
		/*Load all ingot Ids */
		obsidianShardID = config.get(CAT_ITEMS, "obsidianShardID", obsidianShardID).getInt();
		obsidianIngotID = config.get(CAT_ITEMS, "obsidianIngotID", obsidianIngotID).getInt();
		sandIngotID = config.get(CAT_ITEMS, "sandIngotID", sandIngotID).getInt();
		dirtIngotID = config.get(CAT_ITEMS, "dirtIngotID", dirtIngotID).getInt();
		dirtoneIngotID = config.get(CAT_ITEMS, "dirtoneIngotID", dirtoneIngotID).getInt();
		dironIngotID = config.get(CAT_ITEMS, "dironIngotID", dironIngotID).getInt();
		diroldIngotID = config.get(CAT_ITEMS, "diroldIngotID", diroldIngotID).getInt();
		dirmendIngotID = config.get(CAT_ITEMS, "dirmendIngotID", dirmendIngotID).getInt();
		stornIngotID = config.get(CAT_ITEMS, "stornIngotID", stornIngotID).getInt();
		stoldIngotID = config.get(CAT_ITEMS, "stoldIngotID", stoldIngotID).getInt();
		stomendIngotID = config.get(CAT_ITEMS, "stomendIngotID", stomendIngotID).getInt();
		iroldIngotID = config.get(CAT_ITEMS, "iroldIngotID", iroldIngotID).getInt();
		irmendIngotID = config.get(CAT_ITEMS, "irmendIngotID", irmendIngotID).getInt();
		gomendIngotID = config.get(CAT_ITEMS, "gomendIngotID", gomendIngotID).getInt();
		
		/*Load all tool Ids */
		
		//dirt
		dirtAxeID = config.get(CAT_TOOLS, "dirtAxeID", dirtAxeID).getInt();
		dirtHoeID = config.get(CAT_TOOLS, "dirtHoeID", dirtHoeID).getInt();
		dirtPickID = config.get(CAT_TOOLS, "dirtPickID", dirtPickID).getInt();
		dirtShovelID = config.get(CAT_TOOLS, "dirtShovelID", dirtShovelID).getInt();
		dirtSwordID = config.get(CAT_TOOLS, "dirtSwordID", dirtSwordID).getInt();		

		//Dirt and diamond
		dirmendAxeID = config.get(CAT_TOOLS, "dirmendAxeID", dirmendAxeID).getInt();
		dirmendHoeID = config.get(CAT_TOOLS, "dirmendHoeID", dirmendHoeID).getInt();
		dirmendPickID = config.get(CAT_TOOLS, "dirmendPickID", dirmendPickID).getInt();
		dirmendShovelID = config.get(CAT_TOOLS, "dirmendShovelID", dirmendShovelID).getInt();
		dirmendSwordID = config.get(CAT_TOOLS, "dirmendSwordID", dirmendSwordID).getInt();		
		
		//dirt and gold
		diroldAxeID = config.get(CAT_TOOLS, "diroldAxeID", diroldAxeID).getInt();
		diroldHoeID = config.get(CAT_TOOLS, "diroldHoeID", diroldHoeID).getInt();
		diroldPickID = config.get(CAT_TOOLS, "diroldPickID", diroldPickID).getInt();
		diroldShovelID = config.get(CAT_TOOLS, "diroldShovelID", diroldShovelID).getInt();
		diroldSwordID = config.get(CAT_TOOLS, "diroldSwordID", diroldSwordID).getInt();
		
		//dirt and iron
		dironAxeID = config.get(CAT_TOOLS, "dironAxeID", dironAxeID).getInt();
		dironHoeID = config.get(CAT_TOOLS, "dironHoeID", dironHoeID).getInt();
		dironPickID = config.get(CAT_TOOLS, "dironPickID", dironPickID).getInt();
		dironShovelID = config.get(CAT_TOOLS, "dironShovelID", dironShovelID).getInt();
		dironSwordID = config.get(CAT_TOOLS, "dironSwordID", dironSwordID).getInt();
		
		//STORN
		stornAxeID = config.get(CAT_TOOLS, "stornAxeID", stornAxeID).getInt();
		stornHoeID = config.get(CAT_TOOLS, "stornHoeID", stornHoeID).getInt();
		stornPickID = config.get(CAT_TOOLS, "stornPickID", stornPickID).getInt();
		stornShovelID = config.get(CAT_TOOLS, "stornShovelID", stornShovelID).getInt();
		stornSwordID = config.get(CAT_TOOLS, "stornSwordID", stornSwordID).getInt();
		
		//stold
		stoldAxeID = config.get(CAT_TOOLS, "stoldAxeID", stoldAxeID).getInt();
		stoldHoeID = config.get(CAT_TOOLS, "stoldHoeID", stoldHoeID).getInt();
		stoldPickID = config.get(CAT_TOOLS, "stoldPickID", stoldPickID).getInt();
		stoldShovelID = config.get(CAT_TOOLS, "stoldShovelID", stoldShovelID).getInt();
		stoldSwordID = config.get(CAT_TOOLS, "stoldSwordID", stoldSwordID).getInt();
		
		//STOMEND
		stomendAxeID = config.get(CAT_TOOLS, "stomendAxeID", stomendAxeID).getInt();
		stomendHoeID = config.get(CAT_TOOLS, "stomendHoeID", stomendHoeID).getInt();
		stomendPickID = config.get(CAT_TOOLS, "stomendPickID", stomendPickID).getInt();
		stomendShovelID = config.get(CAT_TOOLS, "stomendShovelID", stomendShovelID).getInt();
		stomendSwordID = config.get(CAT_TOOLS, "stomendSwordID", stomendSwordID).getInt();
		
		//IROLD
		iroldAxeID = config.get(CAT_TOOLS, "iroldAxeID", iroldAxeID).getInt();
		iroldHoeID = config.get(CAT_TOOLS, "iroldHoeID", iroldHoeID).getInt();
		iroldPickID = config.get(CAT_TOOLS, "iroldPickID", iroldPickID).getInt();
		iroldShovelID = config.get(CAT_TOOLS, "iroldShovelID", iroldShovelID).getInt();
		iroldSwordID = config.get(CAT_TOOLS, "iroldSwordID", iroldSwordID).getInt();
		
		//IRMEND
		irmendAxeID = config.get(CAT_TOOLS, "irmendAxeID", irmendAxeID).getInt();
		irmendHoeID = config.get(CAT_TOOLS, "irmendHoeID", irmendHoeID).getInt();
		irmendPickID = config.get(CAT_TOOLS, "irmendPickID", irmendPickID).getInt();
		irmendShovelID = config.get(CAT_TOOLS, "irmendShovelID", irmendShovelID).getInt();
		irmendSwordID = config.get(CAT_TOOLS, "irmendSwordID", irmendSwordID).getInt();	
		
		//GOMEND
		gomendAxeID = config.get(CAT_TOOLS, "gomendAxeID", gomendAxeID).getInt();
		gomendHoeID = config.get(CAT_TOOLS, "gomendHoeID", gomendHoeID).getInt();
		gomendPickID = config.get(CAT_TOOLS, "gomendPickID", gomendPickID).getInt();
		gomendShovelID = config.get(CAT_TOOLS, "gomendShovelID", gomendShovelID).getInt();
		gomendSwordID = config.get(CAT_TOOLS, "gomendSwordID", gomendSwordID).getInt();
		
		//sand
		sandAxeID = config.get(CAT_TOOLS, "sandAxeID", sandAxeID).getInt();
		sandHoeID = config.get(CAT_TOOLS, "sandHoeID", sandHoeID).getInt();
		sandPickID = config.get(CAT_TOOLS, "sandPickID", sandPickID).getInt();
		sandShovelID = config.get(CAT_TOOLS, "sandShovelID", sandShovelID).getInt();
		sandSwordID = config.get(CAT_TOOLS, "sandSwordID", sandSwordID).getInt();		
		
		//obsidian
		obsidianAxeID = config.get(CAT_TOOLS, "obsidianAxeID", obsidianAxeID).getInt();
		obsidianHoeID = config.get(CAT_TOOLS, "obsidianHoeID", obsidianHoeID).getInt();
		obsidianPickID = config.get(CAT_TOOLS, "obsidianPickID", obsidianPickID).getInt();
		obsidianShovelID = config.get(CAT_TOOLS, "obsidianShovelID", obsidianShovelID).getInt();
		obsidianSwordID = config.get(CAT_TOOLS, "obsidianSwordID", obsidianSwordID).getInt();
		
		//emerald
		emeraldAxeID = config.get(CAT_TOOLS, "emeraldAxeID", emeraldAxeID).getInt();
		emeraldHoeID = config.get(CAT_TOOLS, "emeraldHoeID", emeraldHoeID).getInt();
		emeraldPickID = config.get(CAT_TOOLS, "emeraldPickID", emeraldPickID).getInt();
		emeraldShovelID = config.get(CAT_TOOLS, "emeraldShovelID", emeraldShovelID).getInt();
		emeraldSwordID = config.get(CAT_TOOLS, "emeraldSwordID", emeraldSwordID).getInt();
		
		//Food
		breadSliceID = config.get(CAT_FOOD, "breadSliceID", breadSliceID).getInt();
		chickenStripsID = config.get(CAT_FOOD, "chickenStripsID", chickenStripsID).getInt();
		beefSlicesID = config.get(CAT_FOOD, "beefSlicesID", beefSlicesID).getInt();
		baconID = config.get(CAT_FOOD, "Bacon", baconID).getInt();
		chickenSandwichID = config.get(CAT_FOOD, "chickenSandwichID", chickenSandwichID).getInt();
		chickenSandwichBaconID = config.get(CAT_FOOD, "chickenSandwichBaconID", chickenSandwichBaconID).getInt();
		beefSandwichID = config.get(CAT_FOOD, "beefSandwichID", beefSandwichID).getInt();
		beefSandwichBaconID = config.get(CAT_FOOD, "beefSandwichBaconID", beefSandwichBaconID).getInt();
		meatSandwichID = config.get(CAT_FOOD, "meatSandwichID", meatSandwichID).getInt();
		applePieID = config.get(CAT_FOOD, "applePieID", applePieID).getInt();
		fruitSaladID = config.get(CAT_FOOD, "fruitSaladID", fruitSaladID).getInt();
		appleSliceID = config.get(CAT_FOOD, "appleSliceID", appleSliceID).getInt();
		BaBID = config.get(CAT_FOOD, "BaBID", BaBID).getInt();
		PaBID = config.get(CAT_FOOD, "PaBID", PaBID).getInt();
		CaBID = config.get(CAT_FOOD, "CaBID", CaBID).getInt();
		DogBreadID = config.get(CAT_FOOD, "DogBreadID", DogBreadID).getInt();
		bowlChickenID = config.get(CAT_FOOD, "bowlChickenID", bowlChickenID).getInt();
		bowlBeefID = config.get(CAT_FOOD, "bowlBeefID", bowlBeefID).getInt();
		bowlMeatID = config.get(CAT_FOOD, "bowlMeatID", bowlMeatID).getInt();
		
		//Armor
		dirtHelmetID = config.get(CAT_ARMOR, "dirtHelmetID", dirtHelmetID).getInt();
		dirtPlateID = config.get(CAT_ARMOR, "dirtPlateID", dirtPlateID).getInt();
		dirtLegsID = config.get(CAT_ARMOR, "dirtLegsID", dirtLegsID).getInt();
		dirtBootsID = config.get(CAT_ARMOR, "dirtBootsID", dirtBootsID).getInt();
		
		dirtoneHelmetID = config.get(CAT_ARMOR, "dirtoneHelmetID", dirtoneHelmetID).getInt();
		dirtonePlateID = config.get(CAT_ARMOR, "dirtonePlateID", dirtonePlateID).getInt();
		dirtoneLegsID = config.get(CAT_ARMOR, "dirtoneLegsID", dirtoneLegsID).getInt();
		dirtoneBootsID = config.get(CAT_ARMOR, "dirtoneBootsID", dirtoneBootsID).getInt();
		
		dironHelmetID = config.get(CAT_ARMOR, "dironHelmetID", dironHelmetID).getInt();
		dironPlateID = config.get(CAT_ARMOR, "dironPlateID", dironPlateID).getInt();
		dironLegsID = config.get(CAT_ARMOR, "dironLegsID", dironLegsID).getInt();
		dironBootsID = config.get(CAT_ARMOR, "dironBootsID", dironBootsID).getInt();
		
		diroldHelmetID = config.get(CAT_ARMOR, "diroldHelmetID", diroldHelmetID).getInt();
		diroldPlateID = config.get(CAT_ARMOR, "diroldPlateID", diroldPlateID).getInt();
		diroldLegsID = config.get(CAT_ARMOR, "diroldLegsID", diroldLegsID).getInt();
		diroldBootsID = config.get(CAT_ARMOR, "diroldBootsID", diroldBootsID).getInt();
		
		dirmendHelmetID = config.get(CAT_ARMOR, "dirmendHelmetID", dirmendHelmetID).getInt();
		dirmendPlateID = config.get(CAT_ARMOR, "dirmendPlateID", dirmendPlateID).getInt();
		dirmendLegsID = config.get(CAT_ARMOR, "dirmendLegsID", dirmendLegsID).getInt();
		dirmendBootsID = config.get(CAT_ARMOR, "dirmendBootsID", dirmendBootsID).getInt();
		
		stornHelmetID = config.get(CAT_ARMOR, "stornHelmetID", stornHelmetID).getInt();
		stornPlateID = config.get(CAT_ARMOR, "stornPLateID", stornPlateID).getInt();
		stornLegsID = config.get(CAT_ARMOR, "stornLegsID", stornLegsID).getInt();
		stornBootsID = config.get(CAT_ARMOR, "stornBootsID", stornBootsID).getInt();
		
		stoldHelmetID = config.get(CAT_ARMOR, "stoldHelmetID", stoldHelmetID).getInt();
		stoldPlateID = config.get(CAT_ARMOR, "stoldPlateID", stoldPlateID).getInt();
		stoldLegsID = config.get(CAT_ARMOR, "stoldLegsID", stoldLegsID).getInt();
		stoldBootsID = config.get(CAT_ARMOR, "stoldBootsID", stoldBootsID).getInt();
		
		stomendHelmetID = config.get(CAT_ARMOR, "stomendHelmetID", stomendHelmetID).getInt();
		stomendPlateID = config.get(CAT_ARMOR, "stomendPlateID", stomendPlateID).getInt();
		stomendLegsID = config.get(CAT_ARMOR, "stomendLegsID", stomendLegsID).getInt();
		stomendBootsID = config.get(CAT_ARMOR, "stomendBootsID", stomendBootsID).getInt();
		
		iroldHelmetID = config.get(CAT_ARMOR, "iroldHelmetID", iroldHelmetID).getInt();
		iroldPlateID = config.get(CAT_ARMOR, "iroldPlateID", iroldPlateID).getInt();
		iroldLegsID = config.get(CAT_ARMOR, "iroldLegsID", iroldLegsID).getInt();
		iroldBootsID = config.get(CAT_ARMOR, "iroldBootsID", iroldBootsID).getInt();
		
		irmendHelmetID = config.get(CAT_ARMOR, "irmendHelmetID", irmendHelmetID).getInt();
		irmendPlateID = config.get(CAT_ARMOR, "irmendPlateID", irmendPlateID).getInt();
		irmendLegsID = config.get(CAT_ARMOR, "irmendLegsID", irmendLegsID).getInt();
		irmendBootsID = config.get(CAT_ARMOR, "irmendBootsID", irmendBootsID).getInt();
		
		gomendHelmetID = config.get(CAT_ARMOR, "gomendHelmetID", gomendHelmetID).getInt();
		gomendPlateID = config.get(CAT_ARMOR, "gomendPlateID", gomendPlateID).getInt();
		gomendLegsID = config.get(CAT_ARMOR, "gomendLegsID", gomendLegsID).getInt();
		gomendBootsID = config.get(CAT_ARMOR, "gomendBootsID", gomendBootsID).getInt();
		
		obsidianHelmetID = config.get(CAT_ARMOR, "obsidianHelmetID", obsidianHelmetID).getInt();
		obsidianPlateID = config.get(CAT_ARMOR, "obsidianPlateID", obsidianPlateID).getInt();
		obsidianLegsID = config.get(CAT_ARMOR, "obsidianLegsID", obsidianLegsID).getInt();
		obsidianBootsID = config.get(CAT_ARMOR, "obsidianBootsID", obsidianBootsID).getInt();
		
		stoneHelmetID = config.get(CAT_ARMOR, "stoneHelmetID", stoneHelmetID).getInt();
		stonePlateID = config.get(CAT_ARMOR, "stonePLateID", stonePlateID).getInt();
		stoneLegsID = config.get(CAT_ARMOR, "stoneLegsID", stoneLegsID).getInt();
		stoneBootsID = config.get(CAT_ARMOR, "stoneBootsID", stoneBootsID).getInt();
		
		sandHelmetID = config.get(CAT_ARMOR, "sandHelmetID", sandHelmetID).getInt();
		sandPlateID = config.get(CAT_ARMOR, "sandPlateID", sandPlateID).getInt();
		sandLegsID = config.get(CAT_ARMOR, "sandLegsID", sandLegsID).getInt();
		sandBootsID = config.get(CAT_ARMOR, "sandBootsID", sandBootsID).getInt();
		
		emeraldhelmetID = config.get(CAT_ARMOR, "emeraldhelmetID", emeraldhelmetID).getInt();
		emeraldplateID = config.get(CAT_ARMOR, "emeraldplateID", emeraldplateID).getInt();
		emeraldlegsID = config.get(CAT_ARMOR, "emeraldlegsID", emeraldlegsID).getInt();
		emeraldbootsID = config.get(CAT_ARMOR, "emeraldbootsID", emeraldbootsID).getInt();
		
		
		config.save();
		
	}
	
	public Configuration getInstance(Configuration config)
	{
		return config;
	}

}
