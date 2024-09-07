
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.alwaysskibidi.block.RottenMeakSackBlock;
import net.mcreator.alwaysskibidi.block.DeadWoodBlock;
import net.mcreator.alwaysskibidi.block.DeadStairsBlock;
import net.mcreator.alwaysskibidi.block.DeadSlabBlock;
import net.mcreator.alwaysskibidi.block.DeadPressurePlateBlock;
import net.mcreator.alwaysskibidi.block.DeadPlanksBlock;
import net.mcreator.alwaysskibidi.block.DeadLogBlock;
import net.mcreator.alwaysskibidi.block.DeadLeavesBlock;
import net.mcreator.alwaysskibidi.block.DeadFenceGateBlock;
import net.mcreator.alwaysskibidi.block.DeadFenceBlock;
import net.mcreator.alwaysskibidi.block.DeadButtonBlock;
import net.mcreator.alwaysskibidi.AlwaysSkibidiMod;

public class AlwaysSkibidiModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlwaysSkibidiMod.MODID);
	public static final DeferredHolder<Block, Block> DEAD_WOOD = REGISTRY.register("dead_wood", DeadWoodBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_LOG = REGISTRY.register("dead_log", DeadLogBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_PLANKS = REGISTRY.register("dead_planks", DeadPlanksBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_LEAVES = REGISTRY.register("dead_leaves", DeadLeavesBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_STAIRS = REGISTRY.register("dead_stairs", DeadStairsBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_SLAB = REGISTRY.register("dead_slab", DeadSlabBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_FENCE = REGISTRY.register("dead_fence", DeadFenceBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_FENCE_GATE = REGISTRY.register("dead_fence_gate", DeadFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_PRESSURE_PLATE = REGISTRY.register("dead_pressure_plate", DeadPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> DEAD_BUTTON = REGISTRY.register("dead_button", DeadButtonBlock::new);
	public static final DeferredHolder<Block, Block> ROTTEN_MEAK_SACK = REGISTRY.register("rotten_meak_sack", RottenMeakSackBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
