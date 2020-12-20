// Made with Blockbench 3.7.4
package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.RoyalIceArmor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class RoyalIceArmorModel extends BipedModel<LivingEntity> {
	public final ModelRenderer HornsRight;
	public final ModelRenderer HornRight;
	public final ModelRenderer HornsLeft;
	public final ModelRenderer HornLeft;

	public RoyalIceArmorModel(float size) {
		super(size, 0.0F, 64, 32);

		HornsRight = new ModelRenderer(this);
		HornsRight.setRotationPoint(0.0F, -8.5F, -6.0F);
		bipedHead.addChild(HornsRight);
		setRotationAngle(HornsRight, -0.3054F, -0.2182F, 0.0F);
		HornsRight.setTextureOffset(0, 23).addBox(1.0F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, -0.5F, false);

		HornRight = new ModelRenderer(this);
		HornRight.setRotationPoint(0.0F, -1.306F, -2.5088F);
		HornsRight.addChild(HornRight);
		setRotationAngle(HornRight, -1.5708F, 0.0F, 0.0F);
		HornRight.setTextureOffset(0, 23).addBox(1.0F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, -0.75F, false);

		HornsLeft = new ModelRenderer(this);
		HornsLeft.setRotationPoint(-5.0F, -8.5F, -5.0F);
		bipedHead.addChild(HornsLeft);
		setRotationAngle(HornsLeft, -0.3054F, 0.2182F, 0.0F);
		HornsLeft.setTextureOffset(0, 23).addBox(1.0F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, -0.5F, false);

		HornLeft = new ModelRenderer(this);
		HornLeft.setRotationPoint(0.0F, -1.306F, -2.5088F);
		HornsLeft.addChild(HornLeft);
		setRotationAngle(HornLeft, -1.5708F, 0.0F, 0.0F);
		HornLeft.setTextureOffset(0, 23).addBox(1.0F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, -0.75F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}