package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor;

import java.util.function.Supplier;

import com.tsarhydrantine.tsbase.TsRegistry;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum TsItemTiers implements IItemTier {
		CANDYCANE(2, 800, 15.0F, 2.5F, 9, () -> { return Ingredient.fromItems(TsRegistry.CANDYCANE_CRYSTAL.get()); }),
		ROYAL_ICE(5, 1800, 4.0F, 3.5F, 15, () -> { return Ingredient.fromItems(TsRegistry.ROYAL_ICE.get()); });

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final Supplier<Ingredient> repairMaterial;

		private TsItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = repairMaterial;
		}

		@Override
		public int getMaxUses() { return maxUses; }

		@Override
		public float getEfficiency() { return efficiency; }

		@Override
		public float getAttackDamage() { return attackDamage; }

		@Override
		public int getHarvestLevel() { return harvestLevel; }

		@Override
		public int getEnchantability() { return enchantability; }

		@Override
		public Ingredient getRepairMaterial() { return repairMaterial.get(); }
}

