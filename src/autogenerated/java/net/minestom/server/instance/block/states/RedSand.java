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
public final class RedSand {
  public static final BlockState RED_SAND_0 = new BlockState(NamespaceID.from("minecraft:red_sand:0"), (short) 67, Block.RED_SAND);

  static {
    Registries.registerBlockState(RED_SAND_0);
  }

  public static void initStates() {
    Block.RED_SAND.addBlockState(RED_SAND_0);
  }
}
