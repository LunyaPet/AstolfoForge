
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import dev.isa.akatsuki.astolfoforge.AstolfoforgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AstolfoforgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AstolfoforgeMod.MODID);
	public static final RegistryObject<CreativeModeTab> ASTOLFO_TAB = REGISTRY.register("astolfo_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.astolfoforge.astolfo_tab")).icon(() -> new ItemStack(AstolfoforgeModItems.ASTOLFO_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AstolfoforgeModItems.ASTOLFO_CASUAL_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.ASTOLFO_SCHOOLGIRL_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.ASTOLFO_ARMOR_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.FELIX_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.MONSTER_WHITE.get());
				tabData.accept(AstolfoforgeModItems.ASTOLFO_ATTRACOTR.get());
				tabData.accept(AstolfoforgeModItems.ASTOLFO_REPELLENT_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.HIDERI_KANZAKI_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.VENTI_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.RIMURU_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.NAGISA_SHIOTA_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModItems.SIEG_SPAWN_EGG.get());
				tabData.accept(AstolfoforgeModBlocks.ASTOLFO_FLOWER.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AstolfoforgeModItems.BOYKISSER_SPAWN_EGG.get());
			tabData.accept(AstolfoforgeModItems.BRIDGET_SPAWN_EGG.get());
		}
	}
}
