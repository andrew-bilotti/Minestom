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
public final class Stone {
  public static final BlockState STONE_0 = new BlockState(NamespaceID.from("minecraft:stone:0"), (short) 1, Block.STONE);

  static {
    Registries.registerBlockState(STONE_0);
  }

  public static void initStates() {
    Block.STONE.addBlockState(STONE_0);
  }
}
