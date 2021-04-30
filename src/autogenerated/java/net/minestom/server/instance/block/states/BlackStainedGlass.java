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
public final class BlackStainedGlass {
    public static final BlockState BLACK_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:black_stained_glass_0"), (short) 4110, Block.BLACK_STAINED_GLASS);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(BLACK_STAINED_GLASS_0);
    }

    public static void initStates() {
        Block.BLACK_STAINED_GLASS.addBlockState(BLACK_STAINED_GLASS_0);
    }
}