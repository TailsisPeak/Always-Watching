
package net.mcreator.alwaysskibidi.client.renderer;

public class TestEntityRenderer extends HumanoidMobRenderer<TestEntityEntity, HumanoidModel<TestEntityEntity>> {

	public TestEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(TestEntityEntity entity) {
		return new ResourceLocation("always_skibidi:textures/entities/custom-skinmc.png");
	}

}
