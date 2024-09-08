
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.alwaysskibidi.client.model.Modelstalker;
import net.mcreator.alwaysskibidi.client.model.ModelADVheadgear;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AlwaysSkibidiModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelstalker.LAYER_LOCATION, Modelstalker::createBodyLayer);
		event.registerLayerDefinition(ModelADVheadgear.LAYER_LOCATION, ModelADVheadgear::createBodyLayer);
	}
}
