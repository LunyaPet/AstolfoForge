
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

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

import dev.isa.akatsuki.astolfoforge.entity.VentiEntity;
import dev.isa.akatsuki.astolfoforge.entity.SiegEntity;
import dev.isa.akatsuki.astolfoforge.entity.RimuruEntity;
import dev.isa.akatsuki.astolfoforge.entity.NagisaShiotaEntity;
import dev.isa.akatsuki.astolfoforge.entity.HideriKanzakiEntity;
import dev.isa.akatsuki.astolfoforge.entity.FelixEntity;
import dev.isa.akatsuki.astolfoforge.entity.BridgetEntity;
import dev.isa.akatsuki.astolfoforge.entity.BoykisserEntity;
import dev.isa.akatsuki.astolfoforge.entity.AstolfoSchoolgirlEntity;
import dev.isa.akatsuki.astolfoforge.entity.AstolfoRepellentEntity;
import dev.isa.akatsuki.astolfoforge.entity.AstolfoCasualEntity;
import dev.isa.akatsuki.astolfoforge.entity.AstolfoArmorEntity;
import dev.isa.akatsuki.astolfoforge.AstolfoforgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AstolfoforgeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AstolfoforgeMod.MODID);
	public static final RegistryObject<EntityType<AstolfoCasualEntity>> ASTOLFO_CASUAL = register("astolfo_casual", EntityType.Builder.<AstolfoCasualEntity>of(AstolfoCasualEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstolfoCasualEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AstolfoSchoolgirlEntity>> ASTOLFO_SCHOOLGIRL = register("astolfo_schoolgirl", EntityType.Builder.<AstolfoSchoolgirlEntity>of(AstolfoSchoolgirlEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AstolfoSchoolgirlEntity::new).fireImmune().sized(0.6f, 1.8f));
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
	public static final RegistryObject<EntityType<HideriKanzakiEntity>> HIDERI_KANZAKI = register("hideri_kanzaki", EntityType.Builder.<HideriKanzakiEntity>of(HideriKanzakiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HideriKanzakiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VentiEntity>> VENTI = register("venti",
			EntityType.Builder.<VentiEntity>of(VentiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VentiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RimuruEntity>> RIMURU = register("rimuru",
			EntityType.Builder.<RimuruEntity>of(RimuruEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RimuruEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NagisaShiotaEntity>> NAGISA_SHIOTA = register("nagisa_shiota", EntityType.Builder.<NagisaShiotaEntity>of(NagisaShiotaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NagisaShiotaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SiegEntity>> SIEG = register("sieg",
			EntityType.Builder.<SiegEntity>of(SiegEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SiegEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BridgetEntity>> BRIDGET = register("bridget",
			EntityType.Builder.<BridgetEntity>of(BridgetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BridgetEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AstolfoCasualEntity.init();
			AstolfoSchoolgirlEntity.init();
			AstolfoArmorEntity.init();
			FelixEntity.init();
			AstolfoRepellentEntity.init();
			BoykisserEntity.init();
			HideriKanzakiEntity.init();
			VentiEntity.init();
			RimuruEntity.init();
			NagisaShiotaEntity.init();
			SiegEntity.init();
			BridgetEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASTOLFO_CASUAL.get(), AstolfoCasualEntity.createAttributes().build());
		event.put(ASTOLFO_SCHOOLGIRL.get(), AstolfoSchoolgirlEntity.createAttributes().build());
		event.put(ASTOLFO_ARMOR.get(), AstolfoArmorEntity.createAttributes().build());
		event.put(FELIX.get(), FelixEntity.createAttributes().build());
		event.put(ASTOLFO_REPELLENT.get(), AstolfoRepellentEntity.createAttributes().build());
		event.put(BOYKISSER.get(), BoykisserEntity.createAttributes().build());
		event.put(HIDERI_KANZAKI.get(), HideriKanzakiEntity.createAttributes().build());
		event.put(VENTI.get(), VentiEntity.createAttributes().build());
		event.put(RIMURU.get(), RimuruEntity.createAttributes().build());
		event.put(NAGISA_SHIOTA.get(), NagisaShiotaEntity.createAttributes().build());
		event.put(SIEG.get(), SiegEntity.createAttributes().build());
		event.put(BRIDGET.get(), BridgetEntity.createAttributes().build());
	}
}
