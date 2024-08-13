
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.programmerastolfo.astolfo.init;

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

import me.programmerastolfo.astolfo.AstolfoMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AstolfoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AstolfoMod.MODID);
	public static final RegistryObject<CreativeModeTab> ASTOLFO_TAB = REGISTRY.register("astolfo_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.astolfo.astolfo_tab")).icon(() -> new ItemStack(AstolfoModItems.ASTOLFO_ITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AstolfoModItems.ASTOLFO_CASUAL_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.ASTOLFO_SCHOOLGIRL_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.ASTOLFO_ARMOR_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.FELIX_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.MONSTER_WHITE.get());
				tabData.accept(AstolfoModItems.ASTOLFO_ATTRACOTR.get());
				tabData.accept(AstolfoModItems.ASTOLFO_REPELLENT_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.HIDERI_KANZAKI_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.VENTI_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.RIMURU_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.NAGISA_SHIOTA_SPAWN_EGG.get());
				tabData.accept(AstolfoModItems.SIEG_SPAWN_EGG.get());
				tabData.accept(AstolfoModBlocks.ASTOLFO_FLOWER.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AstolfoModItems.BOYKISSER_SPAWN_EGG.get());
			tabData.accept(AstolfoModItems.BRIDGET_SPAWN_EGG.get());
		}
	}
}
