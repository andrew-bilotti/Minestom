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
public final class BlueCarpet {
  public static final BlockState BLUE_CARPET_0 = new BlockState(NamespaceID.from("minecraft:blue_carpet:0"), (short) 7881, Block.BLUE_CARPET);

  static {
    Registries.registerBlockState(BLUE_CARPET_0);
  }

  public static void initStates() {
    Block.BLUE_CARPET.addBlockState(BLUE_CARPET_0);
  }
}
