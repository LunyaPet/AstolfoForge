package me.programmerastolfo.astolfo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import me.programmerastolfo.astolfo.init.AstolfoModEntities;

public class AstolfoFlowerPlantDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 16); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AstolfoModEntities.ASTOLFO_ARMOR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 16); index1++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AstolfoModEntities.ASTOLFO_CASUAL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 16); index2++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = AstolfoModEntities.ASTOLFO_SCHOOLGIRL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
