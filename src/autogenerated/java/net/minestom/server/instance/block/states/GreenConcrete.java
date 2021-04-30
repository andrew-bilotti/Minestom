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
public final class GreenConcrete {
    public static final BlockState GREEN_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:green_concrete_0"), (short) 9455, Block.GREEN_CONCRETE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(GREEN_CONCRETE_0);
    }

    public static void initStates() {
        Block.GREEN_CONCRETE.addBlockState(GREEN_CONCRETE_0);
    }
}