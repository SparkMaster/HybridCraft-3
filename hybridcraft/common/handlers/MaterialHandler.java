package hybridcraft.common.handlers;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class MaterialHandler {
	
	// Tool Materials
	public static EnumToolMaterial dirt = EnumHelper.addToolMaterial("dirt", 0, 30, 1.0F, 0, 15);
	public static EnumToolMaterial dirtone = EnumHelper.addToolMaterial("dirtone", 1, 80, 2.0F, 1, 14);
	public static EnumToolMaterial diron = EnumHelper.addToolMaterial("diron", 1, 140, 3.5F, 1, 14);
	public static EnumToolMaterial dirold = EnumHelper.addToolMaterial("dirold", 0, 31, 6.5F, 0, 14);
	public static EnumToolMaterial dirmend = EnumHelper.addToolMaterial("dirmend", 2, 795, 4.5F, 2, 14);
	public static EnumToolMaterial storn = EnumHelper.addToolMaterial("storn", 2, 190, 5.0F, 2, 14);
	public static EnumToolMaterial stold = EnumHelper.addToolMaterial("stold", 2, 81, 8.0F, 2, 14);
	public static EnumToolMaterial stomend = EnumHelper.addToolMaterial("stomend", 2, 846, 6.0F, 2, 14);
	public static EnumToolMaterial irold = EnumHelper.addToolMaterial("irold", 2, 141, 9.0F, 2, 14);
	public static EnumToolMaterial irmend = EnumHelper.addToolMaterial("irmend", 2, 905, 7.0F, 2, 14);
	public static EnumToolMaterial gomend = EnumHelper.addToolMaterial("gomend", 2, 796, 10.0F, 2, 14);
	public static EnumToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 3, 1233, 12.0F, 3, 14);
	public static EnumToolMaterial sand = EnumHelper.addToolMaterial("sand", 0, 35, 2.0F, 0, 14);
	public static EnumToolMaterial cobble = EnumHelper.addToolMaterial("cobble", 0, 75, 1.0F, 0, 14);
	public static EnumToolMaterial emerald = EnumHelper.addToolMaterial("emerald", 4, 2000, 20.0F, 3, 27);

	// Armor Materials
	public static EnumArmorMaterial dirta = EnumHelper.addArmorMaterial("dirt", 30, new int[] { 1, 1, 1, 1 }, 14);
	public static EnumArmorMaterial dirtonea = EnumHelper.addArmorMaterial("dirtone", 40, new int[] { 1, 2, 1, 1 }, 14);
	public static EnumArmorMaterial dirona = EnumHelper.addArmorMaterial("diron", 70, new int[] { 1, 2, 1, 2 }, 14);
	public static EnumArmorMaterial dirolda = EnumHelper.addArmorMaterial("dirold", 31, new int[] { 1, 2, 2, 2 }, 14);
	public static EnumArmorMaterial dirmenda = EnumHelper.addArmorMaterial("dirmend", 90, new int[] { 2, 2, 2, 2 }, 14);
	public static EnumArmorMaterial storna = EnumHelper.addArmorMaterial("storn", 80, new int[] { 2, 3, 2, 3 }, 14);
	public static EnumArmorMaterial stolda = EnumHelper.addArmorMaterial("stold", 37, new int[] { 2, 3, 3, 3 }, 14);
	public static EnumArmorMaterial stomenda = EnumHelper.addArmorMaterial("stomend", 100, new int[] { 3, 3, 3, 3 }, 14);
	public static EnumArmorMaterial irolda = EnumHelper.addArmorMaterial("irold", 44, new int[] { 3, 4, 3, 3 }, 14);
	public static EnumArmorMaterial irmenda = EnumHelper.addArmorMaterial("irmend", 120, new int[] { 3, 4, 3, 4 }, 14);
	public static EnumArmorMaterial gomenda = EnumHelper.addArmorMaterial("gomend", 150, new int[] { 4, 4, 4, 4 }, 14);
	public static EnumArmorMaterial obsidiana = EnumHelper.addArmorMaterial("obsidian", 300, new int[] { 10, 10, 10, 10 }, 14);
	public static EnumArmorMaterial stonea = EnumHelper.addArmorMaterial("stone", 50, new int[] { 2, 3, 2, 2 }, 14);
	public static EnumArmorMaterial sanda = EnumHelper.addArmorMaterial("sand", 60, new int[] { 2, 1, 2, 2, }, 14);
	public static EnumArmorMaterial emeralda = EnumHelper.addArmorMaterial("emerald", 500, new int[] { 12, 12, 12, 12 }, 27);

}
