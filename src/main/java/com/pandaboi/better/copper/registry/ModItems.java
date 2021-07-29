package com.pandaboi.better.copper.registry;

import com.pandaboi.better.copper.BetterCopper;
import com.pandaboi.better.copper.armor.CopperArmorMaterial;
import com.pandaboi.better.copper.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    //Tools
    public static ToolItem COPPER_PICKAXE;

    static {
        COPPER_PICKAXE = new CustomPickaxeItem(CopperToolMaterial.INSTANCE, 0, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    }

    public static ToolItem COPPER_AXE = new CustomAxeItem(CopperToolMaterial.INSTANCE, 6, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COPPER_HOE = new CustomHoeItem(CopperToolMaterial.INSTANCE, -2, -2.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, 0.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 2, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    //Armor
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
    public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    //Others
    public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems(){
        //Tools
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_hoe"), COPPER_HOE);

        //Armor
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_boots"), COPPER_BOOTS);

        //Others
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, "copper_nugget"), COPPER_NUGGET);
    }
    
}