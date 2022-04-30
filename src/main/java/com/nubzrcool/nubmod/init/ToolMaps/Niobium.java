package com.nubzrcool.nubmod.init.ToolMaps;

import com.google.common.base.Supplier;
import com.nubzrcool.nubmod.init.NiobiumItems;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class Niobium implements Tier {

	private float attackDamageBonus = 9.0f;
	private float speed = 15;
    private int enchantability = 20;
    private int harvestLevel = 7;
    private int durability = 2000;
    private Supplier<Ingredient> repairMaterial = () -> Ingredient.of(NiobiumItems.NIOBIUM.get());

    public Niobium(float attackDamageBonus) {
        this.attackDamageBonus = attackDamageBonus;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public int getUses() {
        return this.durability;
    }
	
}
