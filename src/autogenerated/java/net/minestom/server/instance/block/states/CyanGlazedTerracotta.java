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
public final class CyanGlazedTerracotta {
  public static final BlockState CYAN_GLAZED_TERRACOTTA_0 = new BlockState(NamespaceID.from("minecraft:cyan_glazed_terracotta:0"), (short) 9414, Block.CYAN_GLAZED_TERRACOTTA, "facing=north");

  public static final BlockState CYAN_GLAZED_TERRACOTTA_1 = new BlockState(NamespaceID.from("minecraft:cyan_glazed_terracotta:1"), (short) 9415, Block.CYAN_GLAZED_TERRACOTTA, "facing=south");

  public static final BlockState CYAN_GLAZED_TERRACOTTA_2 = new BlockState(NamespaceID.from("minecraft:cyan_glazed_terracotta:2"), (short) 9416, Block.CYAN_GLAZED_TERRACOTTA, "facing=west");

  public static final BlockState CYAN_GLAZED_TERRACOTTA_3 = new BlockState(NamespaceID.from("minecraft:cyan_glazed_terracotta:3"), (short) 9417, Block.CYAN_GLAZED_TERRACOTTA, "facing=east");

  static {
    Registries.registerBlockState(CYAN_GLAZED_TERRACOTTA_0);
    Registries.registerBlockState(CYAN_GLAZED_TERRACOTTA_1);
    Registries.registerBlockState(CYAN_GLAZED_TERRACOTTA_2);
    Registries.registerBlockState(CYAN_GLAZED_TERRACOTTA_3);
  }

  public static void initStates() {
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_0);
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_1);
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_2);
    Block.CYAN_GLAZED_TERRACOTTA.addBlockState(CYAN_GLAZED_TERRACOTTA_3);
  }
}
