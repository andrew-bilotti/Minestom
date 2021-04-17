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
public final class InfestedStone {
  public static final BlockState INFESTED_STONE_0 = new BlockState(NamespaceID.from("minecraft:infested_stone:0"), (short) 4499, Block.INFESTED_STONE);

  static {
    Registries.registerBlockState(INFESTED_STONE_0);
  }

  public static void initStates() {
    Block.INFESTED_STONE.addBlockState(INFESTED_STONE_0);
  }
}
