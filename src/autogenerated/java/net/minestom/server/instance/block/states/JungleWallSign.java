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
public final class JungleWallSign {
  public static final BlockState JUNGLE_WALL_SIGN_0 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:0"), (short) 3767, Block.JUNGLE_WALL_SIGN, "facing=north","waterlogged=true");

  public static final BlockState JUNGLE_WALL_SIGN_1 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:1"), (short) 3768, Block.JUNGLE_WALL_SIGN, "facing=north","waterlogged=false");

  public static final BlockState JUNGLE_WALL_SIGN_2 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:2"), (short) 3769, Block.JUNGLE_WALL_SIGN, "facing=south","waterlogged=true");

  public static final BlockState JUNGLE_WALL_SIGN_3 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:3"), (short) 3770, Block.JUNGLE_WALL_SIGN, "facing=south","waterlogged=false");

  public static final BlockState JUNGLE_WALL_SIGN_4 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:4"), (short) 3771, Block.JUNGLE_WALL_SIGN, "facing=west","waterlogged=true");

  public static final BlockState JUNGLE_WALL_SIGN_5 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:5"), (short) 3772, Block.JUNGLE_WALL_SIGN, "facing=west","waterlogged=false");

  public static final BlockState JUNGLE_WALL_SIGN_6 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:6"), (short) 3773, Block.JUNGLE_WALL_SIGN, "facing=east","waterlogged=true");

  public static final BlockState JUNGLE_WALL_SIGN_7 = new BlockState(NamespaceID.from("minecraft:jungle_wall_sign:7"), (short) 3774, Block.JUNGLE_WALL_SIGN, "facing=east","waterlogged=false");

  static {
    Registries.registerBlockState(JUNGLE_WALL_SIGN_0);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_1);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_2);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_3);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_4);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_5);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_6);
    Registries.registerBlockState(JUNGLE_WALL_SIGN_7);
  }

  public static void initStates() {
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_0);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_1);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_2);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_3);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_4);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_5);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_6);
    Block.JUNGLE_WALL_SIGN.addBlockState(JUNGLE_WALL_SIGN_7);
  }
}
