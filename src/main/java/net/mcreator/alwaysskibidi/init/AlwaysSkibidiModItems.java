
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.alwaysskibidi.item.AGiftFromTheForestItem;
import net.mcreator.alwaysskibidi.AlwaysSkibidiMod;

public class AlwaysSkibidiModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlwaysSkibidiMod.MODID);
	public static final DeferredHolder<Item, Item> A_GIFT_FROM_THE_FOREST = REGISTRY.register("a_gift_from_the_forest", AGiftFromTheForestItem::new);
	public static final DeferredHolder<Item, Item> TEST_ENTITY_SPAWN_EGG = REGISTRY.register("test_entity_spawn_egg", () -> new DeferredSpawnEggItem(AlwaysSkibidiModEntities.TEST_ENTITY, -1, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> DEAD_WOOD = block(AlwaysSkibidiModBlocks.DEAD_WOOD);
	public static final DeferredHolder<Item, Item> DEAD_LOG = block(AlwaysSkibidiModBlocks.DEAD_LOG);
	public static final DeferredHolder<Item, Item> DEAD_PLANKS = block(AlwaysSkibidiModBlocks.DEAD_PLANKS);
	public static final DeferredHolder<Item, Item> DEAD_LEAVES = block(AlwaysSkibidiModBlocks.DEAD_LEAVES);
	public static final DeferredHolder<Item, Item> DEAD_STAIRS = block(AlwaysSkibidiModBlocks.DEAD_STAIRS);
	public static final DeferredHolder<Item, Item> DEAD_SLAB = block(AlwaysSkibidiModBlocks.DEAD_SLAB);
	public static final DeferredHolder<Item, Item> DEAD_FENCE = block(AlwaysSkibidiModBlocks.DEAD_FENCE);
	public static final DeferredHolder<Item, Item> DEAD_FENCE_GATE = block(AlwaysSkibidiModBlocks.DEAD_FENCE_GATE);
	public static final DeferredHolder<Item, Item> DEAD_PRESSURE_PLATE = block(AlwaysSkibidiModBlocks.DEAD_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> DEAD_BUTTON = block(AlwaysSkibidiModBlocks.DEAD_BUTTON);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
