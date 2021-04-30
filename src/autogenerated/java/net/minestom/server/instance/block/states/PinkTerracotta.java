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
public final class PinkTerracotta {
    public static final BlockState PINK_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:pink_terracotta_0"), (short) 6857, Block.PINK_TERRACOTTA);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PINK_TERRACOTTA_0);
    }

    public static void initStates() {
        Block.PINK_TERRACOTTA.addBlockState(PINK_TERRACOTTA_0);
    }
}