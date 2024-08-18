
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import dev.isa.akatsuki.astolfoforge.item.MonsterWhiteItem;
import dev.isa.akatsuki.astolfoforge.item.AstolfoItemItem;
import dev.isa.akatsuki.astolfoforge.item.AstolfoAttracotrItem;
import dev.isa.akatsuki.astolfoforge.AstolfoforgeMod;

public class AstolfoforgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AstolfoforgeMod.MODID);
	public static final RegistryObject<Item> ASTOLFO_CASUAL_SPAWN_EGG = REGISTRY.register("astolfo_casual_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.ASTOLFO_CASUAL, -26113, -3407668, new Item.Properties()));
	public static final RegistryObject<Item> ASTOLFO_SCHOOLGIRL_SPAWN_EGG = REGISTRY.register("astolfo_schoolgirl_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL, -26113, -26113, new Item.Properties()));
	public static final RegistryObject<Item> ASTOLFO_ARMOR_SPAWN_EGG = REGISTRY.register("astolfo_armor_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.ASTOLFO_ARMOR, -26113, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> FELIX_SPAWN_EGG = REGISTRY.register("felix_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.FELIX, -6697729, -13395457, new Item.Properties()));
	public static final RegistryObject<Item> MONSTER_WHITE = REGISTRY.register("monster_white", () -> new MonsterWhiteItem());
	public static final RegistryObject<Item> ASTOLFO_ITEM = REGISTRY.register("astolfo_item", () -> new AstolfoItemItem());
	public static final RegistryObject<Item> ASTOLFO_ATTRACOTR = REGISTRY.register("astolfo_attracotr", () -> new AstolfoAttracotrItem());
	public static final RegistryObject<Item> ASTOLFO_REPELLENT_SPAWN_EGG = REGISTRY.register("astolfo_repellent_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.ASTOLFO_REPELLENT, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> BOYKISSER_SPAWN_EGG = REGISTRY.register("boykisser_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.BOYKISSER, -1, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> HIDERI_KANZAKI_SPAWN_EGG = REGISTRY.register("hideri_kanzaki_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.HIDERI_KANZAKI, -1, -10027009, new Item.Properties()));
	public static final RegistryObject<Item> VENTI_SPAWN_EGG = REGISTRY.register("venti_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.VENTI, -16711732, -16737895, new Item.Properties()));
	public static final RegistryObject<Item> RIMURU_SPAWN_EGG = REGISTRY.register("rimuru_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.RIMURU, -16750849, -10040065, new Item.Properties()));
	public static final RegistryObject<Item> NAGISA_SHIOTA_SPAWN_EGG = REGISTRY.register("nagisa_shiota_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.NAGISA_SHIOTA, -16763956, -13395457, new Item.Properties()));
	public static final RegistryObject<Item> SIEG_SPAWN_EGG = REGISTRY.register("sieg_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.SIEG, -16777216, -6724096, new Item.Properties()));
	public static final RegistryObject<Item> BRIDGET_SPAWN_EGG = REGISTRY.register("bridget_spawn_egg", () -> new ForgeSpawnEggItem(AstolfoforgeModEntities.BRIDGET, -10040065, -1, new Item.Properties()));
	public static final RegistryObject<Item> ASTOLFO_FLOWER = block(AstolfoforgeModBlocks.ASTOLFO_FLOWER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
