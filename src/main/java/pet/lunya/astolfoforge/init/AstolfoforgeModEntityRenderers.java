
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pet.lunya.astolfoforge.init;

import pet.lunya.astolfoforge.client.renderer.VentiRenderer;
import pet.lunya.astolfoforge.client.renderer.SiegRenderer;
import pet.lunya.astolfoforge.client.renderer.RimuruRenderer;
import pet.lunya.astolfoforge.client.renderer.NagisaShiotaRenderer;
import pet.lunya.astolfoforge.client.renderer.HideriKanzakiRenderer;
import pet.lunya.astolfoforge.client.renderer.FelixRenderer;
import pet.lunya.astolfoforge.client.renderer.BridgetRenderer;
import pet.lunya.astolfoforge.client.renderer.BoykisserRenderer;
import pet.lunya.astolfoforge.client.renderer.AstolfoSchoolgirlRenderer;
import pet.lunya.astolfoforge.client.renderer.AstolfoRepellentRenderer;
import pet.lunya.astolfoforge.client.renderer.AstolfoCasualRenderer;
import pet.lunya.astolfoforge.client.renderer.AstolfoArmorRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
