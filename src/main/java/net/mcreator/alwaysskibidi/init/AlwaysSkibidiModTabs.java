
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.alwaysskibidi.AlwaysSkibidiMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AlwaysSkibidiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlwaysSkibidiMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALWAYS_WATCHING = REGISTRY.register("always_watching",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.always_skibidi.always_watching")).icon(() -> new ItemStack(AlwaysSkibidiModItems.A_GIFT_FROM_THE_FOREST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlwaysSkibidiModItems.A_GIFT_FROM_THE_FOREST.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AlwaysSkibidiModItems.TEST_ENTITY_SPAWN_EGG.get());
		}
	}
}
