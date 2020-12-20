package com.tsarhydrantine.tsbase.tsEntity.SkeletonBoss;

import net.minecraft.client.renderer.entity.model.AbstractZombieModel;

public class IceSkeletonModel extends AbstractZombieModel<IceSkeletonEntity> {
	public IceSkeletonModel() {
		this(0.0F);
	}

	public IceSkeletonModel(float modelSize) {
		super(modelSize, 0.0F, 64, 32);
	}

	@Override
	public boolean isAggressive(IceSkeletonEntity entityIn) {
		return false;
	}
}
