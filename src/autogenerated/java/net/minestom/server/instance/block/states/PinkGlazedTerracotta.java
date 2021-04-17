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
public final class PinkGlazedTerracotta {
  public static final BlockState PINK_GLAZED_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:pink_glazed_terracotta:0"), (short) 9402, Block.PINK_GLAZED_TERRACOTTA, "facing=north");

  public static final BlockState PINK_GLAZED_TERRACOTTA_1 = new BlockState(NamespaceID.from("minecraft:pink_glazed_terracotta:1"), (short) 9403, Block.PINK_GLAZED_TERRACOTTA, "facing=south");

  public static final BlockState PINK_GLAZED_TERRACOTTA_2 = new BlockState(NamespaceID.from("minecraft:pink_glazed_terracotta:2"), (short) 9404, Block.PINK_GLAZED_TERRACOTTA, "facing=west");

  public static final BlockState PINK_GLAZED_TERRACOTTA_3 = new BlockState(NamespaceID.from("minecraft:pink_glazed_terracotta:3"), (short) 9405, Block.PINK_GLAZED_TERRACOTTA, "facing=east");

  static {
    Registries.registerBlockState(PINK_GLAZED_TERRACOTTA_0);
    Registries.registerBlockState(PINK_GLAZED_TERRACOTTA_1);
    Registries.registerBlockState(PINK_GLAZED_TERRACOTTA_2);
    Registries.registerBlockState(PINK_GLAZED_TERRACOTTA_3);
  }

  public static void initStates() {
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_0);
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_1);
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_2);
    Block.PINK_GLAZED_TERRACOTTA.addBlockState(PINK_GLAZED_TERRACOTTA_3);
  }
}
