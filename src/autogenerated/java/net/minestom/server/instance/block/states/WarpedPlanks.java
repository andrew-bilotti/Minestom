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
public final class WarpedPlanks {
    public static final BlockState WARPED_PLANKS_0 = new BlockState(NamespaceID.from("minecraft:warped_planks_0"), (short) 15054, Block.WARPED_PLANKS);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(WARPED_PLANKS_0);
    }

    public static void initStates() {
        Block.WARPED_PLANKS.addBlockState(WARPED_PLANKS_0);
    }
}