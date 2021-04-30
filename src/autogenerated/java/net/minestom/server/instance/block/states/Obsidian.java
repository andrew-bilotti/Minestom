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
public final class Obsidian {
    public static final BlockState OBSIDIAN_0 = new BlockState(NamespaceID.from("minecraft:obsidian_0"), (short) 1434, Block.OBSIDIAN);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(OBSIDIAN_0);
    }

    public static void initStates() {
        Block.OBSIDIAN.addBlockState(OBSIDIAN_0);
    }
}