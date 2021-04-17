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
public final class PottedBirchSapling {
  public static final BlockState POTTED_BIRCH_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:potted_birch_sapling:0"), (short) 6312, Block.POTTED_BIRCH_SAPLING);

  static {
    Registries.registerBlockState(POTTED_BIRCH_SAPLING_0);
  }

  public static void initStates() {
    Block.POTTED_BIRCH_SAPLING.addBlockState(POTTED_BIRCH_SAPLING_0);
  }
}
