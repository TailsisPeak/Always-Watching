
package net.mcreator.alwaysskibidi.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DeadLogBlock extends Block {
	public DeadLogBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}