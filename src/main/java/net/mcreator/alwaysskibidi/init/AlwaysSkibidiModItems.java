
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

import net.mcreator.alwaysskibidi.item.DeadToolsSwordItem;
import net.mcreator.alwaysskibidi.item.DeadToolsShovelItem;
import net.mcreator.alwaysskibidi.item.DeadToolsPickaxeItem;
import net.mcreator.alwaysskibidi.item.DeadToolsHoeItem;
import net.mcreator.alwaysskibidi.item.DeadToolsAxeItem;
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
	public static final DeferredHolder<Item, Item> DEAD_TOOLS_PICKAXE = REGISTRY.register("dead_tools_pickaxe", DeadToolsPickaxeItem::new);
	public static final DeferredHolder<Item, Item> DEAD_TOOLS_AXE = REGISTRY.register("dead_tools_axe", DeadToolsAxeItem::new);
	public static final DeferredHolder<Item, Item> DEAD_TOOLS_SWORD = REGISTRY.register("dead_tools_sword", DeadToolsSwordItem::new);
	public static final DeferredHolder<Item, Item> DEAD_TOOLS_SHOVEL = REGISTRY.register("dead_tools_shovel", DeadToolsShovelItem::new);
	public static final DeferredHolder<Item, Item> DEAD_TOOLS_HOE = REGISTRY.register("dead_tools_hoe", DeadToolsHoeItem::new);
	public static final DeferredHolder<Item, Item> ROTTEN_MEAK_SACK = block(AlwaysSkibidiModBlocks.ROTTEN_MEAK_SACK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
