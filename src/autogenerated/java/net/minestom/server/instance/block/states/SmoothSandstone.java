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
public final class SmoothSandstone {
    public static final BlockState SMOOTH_SANDSTONE_0 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone_0"), (short) 8419, Block.SMOOTH_SANDSTONE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(SMOOTH_SANDSTONE_0);
    }

    public static void initStates() {
        Block.SMOOTH_SANDSTONE.addBlockState(SMOOTH_SANDSTONE_0);
    }
}