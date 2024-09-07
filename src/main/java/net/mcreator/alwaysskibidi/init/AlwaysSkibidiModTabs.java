
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
				tabData.accept(AlwaysSkibidiModBlocks.DEAD_WOOD.get().asItem());
				tabData.accept(AlwaysSkibidiModBlocks.DEAD_LOG.get().asItem());
				tabData.accept(AlwaysSkibidiModBlocks.ROTTEN_MEAK_SACK.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_WOOD.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_LOG.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_PLANKS.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_STAIRS.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_SLAB.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_FENCE.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_FENCE_GATE.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_PRESSURE_PLATE.get().asItem());
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(AlwaysSkibidiModItems.DEAD_TOOLS_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AlwaysSkibidiModItems.TEST_ENTITY_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AlwaysSkibidiModBlocks.DEAD_LEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AlwaysSkibidiModItems.DEAD_TOOLS_PICKAXE.get());
			tabData.accept(AlwaysSkibidiModItems.DEAD_TOOLS_AXE.get());
			tabData.accept(AlwaysSkibidiModItems.DEAD_TOOLS_SHOVEL.get());
			tabData.accept(AlwaysSkibidiModItems.DEAD_TOOLS_HOE.get());
		}
	}
}
