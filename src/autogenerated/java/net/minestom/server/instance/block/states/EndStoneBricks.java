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
public final class EndStoneBricks {
  public static final BlockState END_STONE_BRICKS_0 = new BlockState(NamespaceID.from("minecraft:end_stone_bricks:0"), (short) 9222, Block.END_STONE_BRICKS);

  static {
    Registries.registerBlockState(END_STONE_BRICKS_0);
  }

  public static void initStates() {
    Block.END_STONE_BRICKS.addBlockState(END_STONE_BRICKS_0);
  }
}
