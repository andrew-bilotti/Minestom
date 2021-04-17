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
public final class BrownMushroom {
  public static final BlockState BROWN_MUSHROOM_0 = new BlockState(NamespaceID.from("minecraft:brown_mushroom:0"), (short) 1425, Block.BROWN_MUSHROOM);

  static {
    Registries.registerBlockState(BROWN_MUSHROOM_0);
  }

  public static void initStates() {
    Block.BROWN_MUSHROOM.addBlockState(BROWN_MUSHROOM_0);
  }
}
