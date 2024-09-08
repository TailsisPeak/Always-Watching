
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.alwaysskibidi.client.renderer.TestEntityRenderer;
import net.mcreator.alwaysskibidi.client.renderer.StalkerRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlwaysSkibidiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlwaysSkibidiModEntities.TEST_ENTITY.get(), TestEntityRenderer::new);
		event.registerEntityRenderer(AlwaysSkibidiModEntities.STALKER.get(), StalkerRenderer::new);
	}
}
