package hybridcraft.common.handlers;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ConfigurationHandler {
		
	Configuration config;
	
	public static final String CATEGORY_BLOCKS = "Blocks";
	public static final String CATEGORY_ITEMS = "Items";
	
	//Armors 4100-4300
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
	
	//Blocks 4301-4400
	public static int dirtBlockID = 4301;
	public static int dirtoneBlockID = 4302;
	public static int dironBlockID = 4304;
	public static int diroldBlockID = 4305;
	public static int dirmendBlockID = 4306;
	public static int stoneBlockID = 4307;
	public static int stornBlockID = 4308;
	public static int stoldBlockID = 4309;
	public static int stomendBlockID = 4310;
	public static int iroldBlockID = 4311;
	public static int irmendBlockID = 4312;
	public static int gomendBlockID = 4313;
	public static int sandBlockID = 4314;
	public static int dandID = 4315;
	public static int davelID = 4316;
	public static int doneID = 4317;
	public static int counterID = 4318;
	public static int stoveID = 4319;
	public static int potID = 4320;
	public static int combinerID = 4321;
	
	//Ingots 4401-4500
	public static int obsidianShardID = 4401;
	public static int obsidianIngotID = 4402;
	public static int sandIngotID = 4403;
	public static int dirtIngotID = 4404;
		
	//Flowers 4501-4550
	public static int dirtFlowerID = 4501;
	public static int stoneFlowerID = 4502;
	public static int ironFlowerID = 4503;
	public static int goldFlowerID = 4504;
	public static int diamondFlowerID = 4505;
	public static int obsidianFlowerID = 4506;
	
	//Tools 4551-4700
	public static int dirtSwordID = 4551;
	public static int dirtPickID = 4552;
	public static int dirtAxeID = 4553;
	public static int dirtShovelID = 4554;
	public static int dirtHoeID = 4555;
	
	//Foods 4701-4850
	public static int breadSliceID = 4701;
	public static int chickenStripsID = 4702;
	public static int beefSlicesID = 4703;
	public static int baconID = 4704;
	public static int chickenSandwichID = 4705;
	public static int chickenSandwichBaconID = 4708;
	public static int beefSandwichID = 4709;
	public static int beefSandwichBaconID = 4710;
	public static int meatSandwichID = 4711;
	public static int applePieID = 4712;
	public static int fruitSaladID = 4713;
	public static int appleSliceID = 4714;
	public static int bowlChickenID = 4715;
	public static int bowlBeefID = 4716;
	public static int bowlMeatID = 4717;
	public static int BaBID = 4718;
	public static int PaBID = 4719;
	public static int CaBID = 4720;
	public static int DogBreadID = 4721;
	
	public static void loadConfig()
	{
		Property dirtHelmetIDProperty = config.get("Armor", "dirtHelmet", dirtHelmetID);
		dirtHelmetIDProperty.comment = "Default Value = 4100";
		
	}

	private Property get(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}
}
