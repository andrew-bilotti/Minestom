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
public final class PrismarineBricks {
    public static final BlockState PRISMARINE_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:prismarine_bricks_0"), (short) 7606, Block.PRISMARINE_BRICKS);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(PRISMARINE_BRICKS_0);
    }

    public static void initStates() {
        Block.PRISMARINE_BRICKS.addBlockState(PRISMARINE_BRICKS_0);
    }
}