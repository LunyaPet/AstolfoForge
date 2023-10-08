
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.programmerastolfo.astolfo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import me.programmerastolfo.astolfo.client.renderer.FelixRenderer;
import me.programmerastolfo.astolfo.client.renderer.BoykisserRenderer;
import me.programmerastolfo.astolfo.client.renderer.AstolfoSchoolgirlRenderer;
import me.programmerastolfo.astolfo.client.renderer.AstolfoRepellentRenderer;
import me.programmerastolfo.astolfo.client.renderer.AstolfoCasualRenderer;
import me.programmerastolfo.astolfo.client.renderer.AstolfoArmorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AstolfoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AstolfoModEntities.ASTOLFO_SCHOOLGIRL.get(), AstolfoSchoolgirlRenderer::new);
		event.registerEntityRenderer(AstolfoModEntities.ASTOLFO_CASUAL.get(), AstolfoCasualRenderer::new);
		event.registerEntityRenderer(AstolfoModEntities.ASTOLFO_ARMOR.get(), AstolfoArmorRenderer::new);
		event.registerEntityRenderer(AstolfoModEntities.FELIX.get(), FelixRenderer::new);
		event.registerEntityRenderer(AstolfoModEntities.ASTOLFO_REPELLENT.get(), AstolfoRepellentRenderer::new);
		event.registerEntityRenderer(AstolfoModEntities.BOYKISSER.get(), BoykisserRenderer::new);
	}
}
