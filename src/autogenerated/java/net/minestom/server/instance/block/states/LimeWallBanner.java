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
public final class LimeWallBanner {
  public static final BlockState LIME_WALL_BANNER_0 = new BlockState(NamespaceID.from("minecraft:lime_wall_banner:0"), (short) 8177, Block.LIME_WALL_BANNER, "facing=north");

  public static final BlockState LIME_WALL_BANNER_1 = new BlockState(NamespaceID.from("minecraft:lime_wall_banner:1"), (short) 8178, Block.LIME_WALL_BANNER, "facing=south");

  public static final BlockState LIME_WALL_BANNER_2 = new BlockState(NamespaceID.from("minecraft:lime_wall_banner:2"), (short) 8179, Block.LIME_WALL_BANNER, "facing=west");

  public static final BlockState LIME_WALL_BANNER_3 = new BlockState(NamespaceID.from("minecraft:lime_wall_banner:3"), (short) 8180, Block.LIME_WALL_BANNER, "facing=east");

  static {
    Registries.registerBlockState(LIME_WALL_BANNER_0);
    Registries.registerBlockState(LIME_WALL_BANNER_1);
    Registries.registerBlockState(LIME_WALL_BANNER_2);
    Registries.registerBlockState(LIME_WALL_BANNER_3);
  }

  public static void initStates() {
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_0);
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_1);
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_2);
    Block.LIME_WALL_BANNER.addBlockState(LIME_WALL_BANNER_3);
  }
}
