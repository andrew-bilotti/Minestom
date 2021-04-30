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
public final class Stone {
    public static final BlockState STONE_0 = new BlockState(NamespaceID.from("minecraft:stone_0"), (short) 1, Block.STONE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(STONE_0);
    }

    public static void initStates() {
        Block.STONE.addBlockState(STONE_0);
    }
}