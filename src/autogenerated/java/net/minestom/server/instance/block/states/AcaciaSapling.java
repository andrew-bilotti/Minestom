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
public final class AcaciaSapling {
  public static final BlockState ACACIA_SAPLING_0 = new BlockState(NamespaceID.from("minecraft:acacia_sapling:0"), (short) 29, Block.ACACIA_SAPLING, "stage=0");

  public static final BlockState ACACIA_SAPLING_1 = new BlockState(NamespaceID.from("minecraft:acacia_sapling:1"), (short) 30, Block.ACACIA_SAPLING, "stage=1");

  static {
    Registries.registerBlockState(ACACIA_SAPLING_0);
    Registries.registerBlockState(ACACIA_SAPLING_1);
  }

  public static void initStates() {
    Block.ACACIA_SAPLING.addBlockState(ACACIA_SAPLING_0);
    Block.ACACIA_SAPLING.addBlockState(ACACIA_SAPLING_1);
  }
}
