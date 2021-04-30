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
public final class WhiteStainedGlass {
    public static final BlockState WHITE_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:white_stained_glass_0"), (short) 4095, Block.WHITE_STAINED_GLASS);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(WHITE_STAINED_GLASS_0);
    }

    public static void initStates() {
        Block.WHITE_STAINED_GLASS.addBlockState(WHITE_STAINED_GLASS_0);
    }
}