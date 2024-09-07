
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alwaysskibidi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.alwaysskibidi.block.DeadLogBlock;
import net.mcreator.alwaysskibidi.AlwaysSkibidiMod;

public class AlwaysSkibidiModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlwaysSkibidiMod.MODID);
	public static final DeferredHolder<Block, Block> DEAD_LOG = REGISTRY.register("dead_log", DeadLogBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
