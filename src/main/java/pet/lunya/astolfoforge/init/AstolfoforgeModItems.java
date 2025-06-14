
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pet.lunya.astolfoforge.init;

import pet.lunya.astolfoforge.item.MonsterWhiteItem;
import pet.lunya.astolfoforge.item.AstolfoItemItem;
import pet.lunya.astolfoforge.item.AstolfoAttracotrItem;
import pet.lunya.astolfoforge.AstolfoforgeMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class AstolfoforgeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AstolfoforgeMod.MODID);
	public static final DeferredItem<Item> ASTOLFO_CASUAL_SPAWN_EGG = register("astolfo_casual_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.ASTOLFO_CASUAL.get(), properties));
	public static final DeferredItem<Item> ASTOLFO_SCHOOLGIRL_SPAWN_EGG = register("astolfo_schoolgirl_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get(), properties));
	public static final DeferredItem<Item> ASTOLFO_ARMOR_SPAWN_EGG = register("astolfo_armor_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.ASTOLFO_ARMOR.get(), properties));
	public static final DeferredItem<Item> FELIX_SPAWN_EGG = register("felix_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.FELIX.get(), properties));
	public static final DeferredItem<Item> MONSTER_WHITE = register("monster_white", MonsterWhiteItem::new);
	public static final DeferredItem<Item> ASTOLFO_ITEM = register("astolfo_item", AstolfoItemItem::new);
	public static final DeferredItem<Item> ASTOLFO_ATTRACOTR = register("astolfo_attracotr", AstolfoAttracotrItem::new);
	public static final DeferredItem<Item> ASTOLFO_REPELLENT_SPAWN_EGG = register("astolfo_repellent_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.ASTOLFO_REPELLENT.get(), properties));
	public static final DeferredItem<Item> BOYKISSER_SPAWN_EGG = register("boykisser_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.BOYKISSER.get(), properties));
	public static final DeferredItem<Item> HIDERI_KANZAKI_SPAWN_EGG = register("hideri_kanzaki_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.HIDERI_KANZAKI.get(), properties));
	public static final DeferredItem<Item> VENTI_SPAWN_EGG = register("venti_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.VENTI.get(), properties));
	public static final DeferredItem<Item> RIMURU_SPAWN_EGG = register("rimuru_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.RIMURU.get(), properties));
	public static final DeferredItem<Item> NAGISA_SHIOTA_SPAWN_EGG = register("nagisa_shiota_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.NAGISA_SHIOTA.get(), properties));
	public static final DeferredItem<Item> SIEG_SPAWN_EGG = register("sieg_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.SIEG.get(), properties));
	public static final DeferredItem<Item> BRIDGET_SPAWN_EGG = register("bridget_spawn_egg", properties -> new SpawnEggItem(AstolfoforgeModEntities.BRIDGET.get(), properties));
	public static final DeferredItem<Item> ASTOLFO_FLOWER = block(AstolfoforgeModBlocks.ASTOLFO_FLOWER);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
