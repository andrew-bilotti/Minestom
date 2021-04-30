package net.minestom.server.instance.block.states;

import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;


/**
 * AUTOGENERATED by BlockGenerator
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class ChiseledQuartzBlock {
    public static final BlockState CHISELED_QUARTZ_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:chiseled_quartz_block_0"), (short) 6743, Block.CHISELED_QUARTZ_BLOCK);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(CHISELED_QUARTZ_BLOCK_0);
    }

    public static void initStates() {
        Block.CHISELED_QUARTZ_BLOCK.addBlockState(CHISELED_QUARTZ_BLOCK_0);
    }
}