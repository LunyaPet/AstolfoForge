
package dev.isa.akatsuki.astolfoforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import dev.isa.akatsuki.astolfoforge.entity.NagisaShiotaEntity;

public class NagisaShiotaRenderer extends HumanoidMobRenderer<NagisaShiotaEntity, HumanoidModel<NagisaShiotaEntity>> {
	public NagisaShiotaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(NagisaShiotaEntity entity) {
		return new ResourceLocation("astolfoforge:textures/entities/nagisa.png");
	}
}
