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
public final class LimeCarpet {
    public static final BlockState LIME_CARPET_0 = new BlockState(NamespaceID.from("minecraft:lime_carpet_0"), (short) 7875, Block.LIME_CARPET);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(LIME_CARPET_0);
    }

    public static void initStates() {
        Block.LIME_CARPET.addBlockState(LIME_CARPET_0);
    }
}