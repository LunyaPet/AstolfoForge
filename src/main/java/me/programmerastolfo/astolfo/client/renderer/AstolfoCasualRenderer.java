
package me.programmerastolfo.astolfo.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import me.programmerastolfo.astolfo.entity.AstolfoCasualEntity;

public class AstolfoCasualRenderer extends HumanoidMobRenderer<AstolfoCasualEntity, HumanoidModel<AstolfoCasualEntity>> {
	public AstolfoCasualRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(AstolfoCasualEntity entity) {
		return new ResourceLocation("astolfo:textures/entities/astolfo_casual_3.png");
	}
}
