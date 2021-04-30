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
public final class RedstoneBlock {
    public static final BlockState REDSTONE_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:redstone_block_0"), (short) 6730, Block.REDSTONE_BLOCK);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(REDSTONE_BLOCK_0);
    }

    public static void initStates() {
        Block.REDSTONE_BLOCK.addBlockState(REDSTONE_BLOCK_0);
    }
}