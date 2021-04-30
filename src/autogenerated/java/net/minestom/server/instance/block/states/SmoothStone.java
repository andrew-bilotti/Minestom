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
public final class SmoothStone {
    public static final BlockState SMOOTH_STONE_0 = new BlockState(NamespaceID.from("minecraft:smooth_stone_0"), (short) 8418, Block.SMOOTH_STONE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_STONE_0);
    }

    public static void initStates() {
        Block.SMOOTH_STONE.addBlockState(SMOOTH_STONE_0);
    }
}