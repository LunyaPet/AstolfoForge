
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.isa.akatsuki.astolfoforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import dev.isa.akatsuki.astolfoforge.client.renderer.VentiRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.SiegRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.RimuruRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.NagisaShiotaRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.HideriKanzakiRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.FelixRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.BridgetRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.BoykisserRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.AstolfoSchoolgirlRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.AstolfoRepellentRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.AstolfoCasualRenderer;
import dev.isa.akatsuki.astolfoforge.client.renderer.AstolfoArmorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AstolfoforgeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_CASUAL.get(), AstolfoCasualRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_SCHOOLGIRL.get(), AstolfoSchoolgirlRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_ARMOR.get(), AstolfoArmorRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.FELIX.get(), FelixRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.ASTOLFO_REPELLENT.get(), AstolfoRepellentRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.BOYKISSER.get(), BoykisserRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.HIDERI_KANZAKI.get(), HideriKanzakiRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.VENTI.get(), VentiRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.RIMURU.get(), RimuruRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.NAGISA_SHIOTA.get(), NagisaShiotaRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.SIEG.get(), SiegRenderer::new);
		event.registerEntityRenderer(AstolfoforgeModEntities.BRIDGET.get(), BridgetRenderer::new);
	}
}
