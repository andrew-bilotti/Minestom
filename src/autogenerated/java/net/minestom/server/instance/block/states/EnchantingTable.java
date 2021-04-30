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
public final class EnchantingTable {
    public static final BlockState ENCHANTING_TABLE_0 = new BlockState(NamespaceID.from("minecraft:enchanting_table_0"), (short) 5136, Block.ENCHANTING_TABLE);

    static {
        Registry.BLOCK_STATE_REGISTRY.register(ENCHANTING_TABLE_0);
    }

    public static void initStates() {
        Block.ENCHANTING_TABLE.addBlockState(ENCHANTING_TABLE_0);
    }
}