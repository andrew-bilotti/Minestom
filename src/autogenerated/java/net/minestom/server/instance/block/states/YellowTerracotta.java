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
public final class YellowTerracotta {
  public static final BlockState YELLOW_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:yellow_terracotta:0"), (short) 6855, Block.YELLOW_TERRACOTTA);

  static {
    Registries.registerBlockState(YELLOW_TERRACOTTA_0);
  }

  public static void initStates() {
    Block.YELLOW_TERRACOTTA.addBlockState(YELLOW_TERRACOTTA_0);
  }
}
