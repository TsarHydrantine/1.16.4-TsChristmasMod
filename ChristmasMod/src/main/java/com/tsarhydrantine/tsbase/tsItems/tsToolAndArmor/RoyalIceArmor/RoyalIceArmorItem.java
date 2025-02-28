package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.RoyalIceArmor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class RoyalIceArmorItem extends ArmorItem {

	public RoyalIceArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
	}

	RoyalIceArmorModel model = new RoyalIceArmorModel(1F);
	
	@SuppressWarnings("unchecked")
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {

		return (A) model;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
	{
			return "tschristmas:textures/models/armor/royal_ice_helmet.png";
	}

}
