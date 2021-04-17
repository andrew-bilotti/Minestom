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
public final class PurpleGlazedTerracotta {
  public static final BlockState PURPLE_GLAZED_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:purple_glazed_terracotta:0"), (short) 9418, Block.PURPLE_GLAZED_TERRACOTTA, "facing=north");

  public static final BlockState PURPLE_GLAZED_TERRACOTTA_1 = new BlockState(NamespaceID.from("minecraft:purple_glazed_terracotta:1"), (short) 9419, Block.PURPLE_GLAZED_TERRACOTTA, "facing=south");

  public static final BlockState PURPLE_GLAZED_TERRACOTTA_2 = new BlockState(NamespaceID.from("minecraft:purple_glazed_terracotta:2"), (short) 9420, Block.PURPLE_GLAZED_TERRACOTTA, "facing=west");

  public static final BlockState PURPLE_GLAZED_TERRACOTTA_3 = new BlockState(NamespaceID.from("minecraft:purple_glazed_terracotta:3"), (short) 9421, Block.PURPLE_GLAZED_TERRACOTTA, "facing=east");

  static {
    Registries.registerBlockState(PURPLE_GLAZED_TERRACOTTA_0);
    Registries.registerBlockState(PURPLE_GLAZED_TERRACOTTA_1);
    Registries.registerBlockState(PURPLE_GLAZED_TERRACOTTA_2);
    Registries.registerBlockState(PURPLE_GLAZED_TERRACOTTA_3);
  }

  public static void initStates() {
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_0);
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_1);
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_2);
    Block.PURPLE_GLAZED_TERRACOTTA.addBlockState(PURPLE_GLAZED_TERRACOTTA_3);
  }
}
