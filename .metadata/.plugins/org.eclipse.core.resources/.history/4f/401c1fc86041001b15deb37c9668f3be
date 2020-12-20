package com.tsarhydrantine.tsbase.tsEntity.goals;

import java.util.EnumSet;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.Hand;

public class TsSlowMeleeAttackGoal extends MeleeAttackGoal {
	protected CreatureEntity attacker;
	private double speedTowardsTarget;
	private boolean longMemory;
	private Path path;
	private double targetX;
	private double targetY;
	private double targetZ;
	private int delayCounter;
	private int attackFloorValue;

	public TsSlowMeleeAttackGoal(CreatureEntity creature, double speedIn, boolean useLongMemory) {
		super(creature, speedIn, useLongMemory);
	}

	/**
	 * Keep ticking a continuous task that has already been started
	 */
	public void tick() {
		LivingEntity livingentity = this.attacker.getAttackTarget();
		this.attacker.getLookController().setLookPositionWithEntity(livingentity, 30.0F, 30.0F);
		double distance = this.attacker.getDistanceSq(livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ());
		this.delayCounter = Math.max(this.delayCounter - 1, 0);
		if ((this.longMemory || this.attacker.getEntitySenses().canSee(livingentity)) && this.delayCounter <= 0 && (this.targetX == 0.0D && this.targetY == 0.0D && this.targetZ == 0.0D || livingentity.getDistanceSq(this.targetX, this.targetY, this.targetZ) >= 1.0D || this.attacker.getRNG().nextFloat() < 0.05F)) {
			this.targetX = livingentity.getPosX();
			this.targetY = livingentity.getPosY();
			this.targetZ = livingentity.getPosZ();
			this.delayCounter = 4 + this.attacker.getRNG().nextInt(7);

			if (distance > 1024.0D) {
				this.delayCounter += 10;
			} else if (distance > 256.0D) {
				this.delayCounter += 5;
			}

			if (!this.attacker.getNavigator().tryMoveToEntityLiving(livingentity, this.speedTowardsTarget)) {
				this.delayCounter += 15;
			}
		}

		this.attackFloorValue = Math.max(this.attackFloorValue - 1, 0);
		this.checkAndPerformAttack(livingentity, distance);
	}

	protected void checkAndPerformAttack(LivingEntity enemy, double distToEnemySqr) {
		double distance = this.getAttackReachSqr(enemy);
		if (distToEnemySqr <= distance && this.attackFloorValue <= 0) {
			this.attackFloorValue = 20;
			this.attacker.swingArm(Hand.MAIN_HAND);
			this.attacker.attackEntityAsMob(enemy);
		}

	}

	protected double getAttackReachSqr(LivingEntity attackTarget) {
		return (double) (4.0F + attackTarget.getWidth());
	}
}