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
public final class EndStone {
  public static final BlockState END_STONE_0 = new BlockState(NamespaceID.from("minecraft:end_stone:0"), (short) 5158, Block.END_STONE);

  static {
    Registries.registerBlockState(END_STONE_0);
  }

  public static void initStates() {
    Block.END_STONE.addBlockState(END_STONE_0);
  }
}
