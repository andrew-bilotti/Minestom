package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class HoneyBlock {
  public static final BlockState HONEY_BLOCK_0 = new BlockState(NamespaceID.from("minecraft:honey_block:0"), (short) 15832, Block.HONEY_BLOCK);

  static {
    Registries.registerBlockState(HONEY_BLOCK_0);
  }

  public static void initStates() {
    Block.HONEY_BLOCK.addBlockState(HONEY_BLOCK_0);
  }
}
