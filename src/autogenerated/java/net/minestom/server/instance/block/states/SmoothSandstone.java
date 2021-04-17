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
public final class SmoothSandstone {
  public static final BlockState SMOOTH_SANDSTONE_0 = new BlockState(NamespaceID.from("minecraft:smooth_sandstone:0"), (short) 8419, Block.SMOOTH_SANDSTONE);

  static {
    Registries.registerBlockState(SMOOTH_SANDSTONE_0);
  }

  public static void initStates() {
    Block.SMOOTH_SANDSTONE.addBlockState(SMOOTH_SANDSTONE_0);
  }
}
