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
public final class PurpleCarpet {
    public static final BlockState PURPLE_CARPET_0 = new BlockState(NamespaceID.from("minecraft:purple_carpet_0"), (short) 7880, Block.PURPLE_CARPET);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PURPLE_CARPET_0);
    }

    public static void initStates() {
        Block.PURPLE_CARPET.addBlockState(PURPLE_CARPET_0);
    }
}