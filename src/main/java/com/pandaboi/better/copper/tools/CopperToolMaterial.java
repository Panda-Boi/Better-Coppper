package com.pandaboi.better.copper.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {
    
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    @Override
    public int getDurability() {
    return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
    return 5.0F;
    }   

    @Override
    public float getAttackDamage() {
    return 2.0F;
    }

    @Override
    public int getMiningLevel() {
    return 1;
    }

    @Override
    public int getEnchantability() {
    return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

}
