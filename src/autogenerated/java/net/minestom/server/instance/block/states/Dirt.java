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
public final class Dirt {
  public static final BlockState DIRT_0 = new BlockState(NamespaceID.from("minecraft:dirt:0"), (short) 10, Block.DIRT);

  static {
    Registries.registerBlockState(DIRT_0);
  }

  public static void initStates() {
    Block.DIRT.addBlockState(DIRT_0);
  }
}
