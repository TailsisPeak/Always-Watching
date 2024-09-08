
package net.mcreator.alwaysskibidi.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.alwaysskibidi.entity.StalkerEntity;
import net.mcreator.alwaysskibidi.client.model.Modelstalker;

public class StalkerRenderer extends MobRenderer<StalkerEntity, Modelstalker<StalkerEntity>> {
	public StalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstalker(context.bakeLayer(Modelstalker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StalkerEntity entity) {
		return new ResourceLocation("always_skibidi:textures/entities/stlker_texture.png");
	}
}
