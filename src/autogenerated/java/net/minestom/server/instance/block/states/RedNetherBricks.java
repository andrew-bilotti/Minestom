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
public final class RedNetherBricks {
  public static final BlockState RED_NETHER_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:red_nether_bricks:0"), (short) 9259, Block.RED_NETHER_BRICKS);

  static {
    Registries.registerBlockState(RED_NETHER_BRICKS_0);
  }

  public static void initStates() {
    Block.RED_NETHER_BRICKS.addBlockState(RED_NETHER_BRICKS_0);
  }
}
