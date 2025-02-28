package com.tsarhydrantine.tsbase.tsEntity.SkeletonBoss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.tsarhydrantine.tsbase.TsBase;

import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

public class IceSkeletonRenderer extends MobRenderer<IceSkeletonEntity, BipedModel<IceSkeletonEntity>> {
	private static final ResourceLocation SKELETON_TEXTURES = new ResourceLocation(TsBase.MODID, "textures/entity/ice_skeleton_lord/ice_skeleton_boss.png");
	private final float scale;
	private final static float scaleIn = 4.0F;

	public IceSkeletonRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new IceSkeletonModel(), 0.5F * scaleIn);
		this.scale = scaleIn;
		this.addLayer(new HeldItemLayer<>(this));
		this.addLayer(new BipedArmorLayer<>(this, new IceSkeletonModel(0.5F), new IceSkeletonModel(1.0F)));
	}

	@Override
	protected void preRenderCallback(IceSkeletonEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
		matrixStackIn.scale(this.scale, this.scale, this.scale);
		//GL11.glScalef(scale, scale, scale);
	}

	@Override
	public boolean shouldRender(IceSkeletonEntity livingEntityIn, ClippingHelper camera, double camX, double camY,
			double camZ) {
		// TODO Auto-generated method stub
		return super.shouldRender(livingEntityIn, camera, camX, camY, camZ);
	}
	
	@Override
	public ResourceLocation getEntityTexture(IceSkeletonEntity entity) {
		return SKELETON_TEXTURES;
	}
}
