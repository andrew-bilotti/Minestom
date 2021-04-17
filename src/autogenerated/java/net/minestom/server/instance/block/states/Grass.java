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
public final class Grass {
  public static final BlockState GRASS_0 = new BlockState(NamespaceID.from("minecraft:grass:0"), (short) 1342, Block.GRASS);

  static {
    Registries.registerBlockState(GRASS_0);
  }

  public static void initStates() {
    Block.GRASS.addBlockState(GRASS_0);
  }
}
