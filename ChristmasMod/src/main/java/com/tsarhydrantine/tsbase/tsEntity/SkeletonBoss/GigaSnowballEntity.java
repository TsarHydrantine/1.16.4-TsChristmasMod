package com.tsarhydrantine.tsbase.tsEntity.SkeletonBoss;

import com.tsarhydrantine.tsbase.tsEntity.TsEntities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.world.World;

public class GigaSnowballEntity extends AbstractFireballEntity{
	
	public GigaSnowballEntity(EntityType<? extends AbstractFireballEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	 public GigaSnowballEntity(EntityType<? extends FireballEntity> type, World worldIn, LivingEntity shooter, double accelX, double accelY, double accelZ) {
	      super(type, shooter, accelX, accelY, accelZ, worldIn);
	   }
	
}
