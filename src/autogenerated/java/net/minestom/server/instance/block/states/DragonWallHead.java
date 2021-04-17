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
public final class DragonWallHead {
  public static final BlockState DRAGON_WALL_HEAD_0 = new BlockState(NamespaceID.from("minecraft:dragon_wall_head:0"), (short) 6610, Block.DRAGON_WALL_HEAD, "facing=north");

  public static final BlockState DRAGON_WALL_HEAD_1 = new BlockState(NamespaceID.from("minecraft:dragon_wall_head:1"), (short) 6611, Block.DRAGON_WALL_HEAD, "facing=south");

  public static final BlockState DRAGON_WALL_HEAD_2 = new BlockState(NamespaceID.from("minecraft:dragon_wall_head:2"), (short) 6612, Block.DRAGON_WALL_HEAD, "facing=west");

  public static final BlockState DRAGON_WALL_HEAD_3 = new BlockState(NamespaceID.from("minecraft:dragon_wall_head:3"), (short) 6613, Block.DRAGON_WALL_HEAD, "facing=east");

  static {
    Registries.registerBlockState(DRAGON_WALL_HEAD_0);
    Registries.registerBlockState(DRAGON_WALL_HEAD_1);
    Registries.registerBlockState(DRAGON_WALL_HEAD_2);
    Registries.registerBlockState(DRAGON_WALL_HEAD_3);
  }

  public static void initStates() {
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_0);
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_1);
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_2);
    Block.DRAGON_WALL_HEAD.addBlockState(DRAGON_WALL_HEAD_3);
  }
}
