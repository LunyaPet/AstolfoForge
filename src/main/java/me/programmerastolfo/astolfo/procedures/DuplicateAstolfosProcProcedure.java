package me.programmerastolfo.astolfo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import me.programmerastolfo.astolfo.init.AstolfoModEntities;
import me.programmerastolfo.astolfo.entity.AstolfoSchoolgirlEntity;
import me.programmerastolfo.astolfo.entity.AstolfoCasualEntity;
import me.programmerastolfo.astolfo.entity.AstolfoArmorEntity;

import java.util.List;
import java.util.Comparator;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DuplicateAstolfosProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((DoubleArgumentType.getDouble(arguments, "range")) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				for (int index0 = 0; index0 < (int) DoubleArgumentType.getDouble(arguments, "amount"); index0++) {
					if (entityiterator instanceof AstolfoArmorEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoModEntities.ASTOLFO_ARMOR.get().spawn(_level, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof AstolfoCasualEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoModEntities.ASTOLFO_CASUAL.get().spawn(_level, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
					if (entityiterator instanceof AstolfoSchoolgirlEntity) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = AstolfoModEntities.ASTOLFO_SCHOOLGIRL.get().spawn(_level, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				}
			}
		}
	}
}
