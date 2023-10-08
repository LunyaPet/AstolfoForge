
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.programmerastolfo.astolfo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import me.programmerastolfo.astolfo.entity.FelixEntity;
import me.programmerastolfo.astolfo.entity.BoykisserEntity;
import me.programmerastolfo.astolfo.entity.AstolfoSchoolgirlEntity;
import me.programmerastolfo.astolfo.entity.AstolfoRepellentEntity;
import me.programmerastolfo.astolfo.entity.AstolfoCasualEntity;
import me.programmerastolfo.astolfo.entity.AstolfoArmorEntity;
import me.programmerastolfo.astolfo.AstolfoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AstolfoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AstolfoMod.MODID);
	public static final RegistryObject<EntityType<AstolfoSchoolgirlEntity>> ASTOLFO_SCHOOLGIRL = register("astolfo_schoolgirl", EntityType.Builder.<AstolfoSchoolgirlEntity>of(AstolfoSchoolgirlEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstolfoSchoolgirlEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AstolfoCasualEntity>> ASTOLFO_CASUAL = register("astolfo_casual", EntityType.Builder.<AstolfoCasualEntity>of(AstolfoCasualEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstolfoCasualEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AstolfoArmorEntity>> ASTOLFO_ARMOR = register("astolfo_armor", EntityType.Builder.<AstolfoArmorEntity>of(AstolfoArmorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstolfoArmorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FelixEntity>> FELIX = register("felix",
			EntityType.Builder.<FelixEntity>of(FelixEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FelixEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AstolfoRepellentEntity>> ASTOLFO_REPELLENT = register("astolfo_repellent",
			EntityType.Builder.<AstolfoRepellentEntity>of(AstolfoRepellentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstolfoRepellentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoykisserEntity>> BOYKISSER = register("boykisser",
			EntityType.Builder.<BoykisserEntity>of(BoykisserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoykisserEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AstolfoSchoolgirlEntity.init();
			AstolfoCasualEntity.init();
			AstolfoArmorEntity.init();
			FelixEntity.init();
			AstolfoRepellentEntity.init();
			BoykisserEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASTOLFO_SCHOOLGIRL.get(), AstolfoSchoolgirlEntity.createAttributes().build());
		event.put(ASTOLFO_CASUAL.get(), AstolfoCasualEntity.createAttributes().build());
		event.put(ASTOLFO_ARMOR.get(), AstolfoArmorEntity.createAttributes().build());
		event.put(FELIX.get(), FelixEntity.createAttributes().build());
		event.put(ASTOLFO_REPELLENT.get(), AstolfoRepellentEntity.createAttributes().build());
		event.put(BOYKISSER.get(), BoykisserEntity.createAttributes().build());
	}
}
