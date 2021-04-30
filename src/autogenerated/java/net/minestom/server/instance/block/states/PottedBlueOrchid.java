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
public final class PottedBlueOrchid {
    public static final BlockState POTTED_BLUE_ORCHID_0 = new BlockState(NamespaceID.from("minecraft:potted_blue_orchid_0"), (short) 6319, Block.POTTED_BLUE_ORCHID);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(POTTED_BLUE_ORCHID_0);
    }

    public static void initStates() {
        Block.POTTED_BLUE_ORCHID.addBlockState(POTTED_BLUE_ORCHID_0);
    }
}