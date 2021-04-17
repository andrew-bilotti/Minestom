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
public final class BlackShulkerBox {
  public static final BlockState BLACK_SHULKER_BOX_0 = new BlockState(NamespaceID.from("minecraft:black_shulker_box:0"), (short) 9372, Block.BLACK_SHULKER_BOX, "facing=north");

  public static final BlockState BLACK_SHULKER_BOX_1 = new BlockState(NamespaceID.from("minecraft:black_shulker_box:1"), (short) 9373, Block.BLACK_SHULKER_BOX, "facing=east");

  public static final BlockState BLACK_SHULKER_BOX_2 = new BlockState(NamespaceID.from("minecraft:black_shulker_box:2"), (short) 9374, Block.BLACK_SHULKER_BOX, "facing=south");

  public static final BlockState BLACK_SHULKER_BOX_3 = new BlockState(NamespaceID.from("minecraft:black_shulker_box:3"), (short) 9375, Block.BLACK_SHULKER_BOX, "facing=west");

  public static final BlockState BLACK_SHULKER_BOX_4 = new BlockState(NamespaceID.from("minecraft:black_shulker_box:4"), (short) 9376, Block.BLACK_SHULKER_BOX, "facing=up");

  public static final BlockState BLACK_SHULKER_BOX_5 = new BlockState(NamespaceID.from("minecraft:black_shulker_box:5"), (short) 9377, Block.BLACK_SHULKER_BOX, "facing=down");

  static {
    Registries.registerBlockState(BLACK_SHULKER_BOX_0);
    Registries.registerBlockState(BLACK_SHULKER_BOX_1);
    Registries.registerBlockState(BLACK_SHULKER_BOX_2);
    Registries.registerBlockState(BLACK_SHULKER_BOX_3);
    Registries.registerBlockState(BLACK_SHULKER_BOX_4);
    Registries.registerBlockState(BLACK_SHULKER_BOX_5);
  }

  public static void initStates() {
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_0);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_1);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_2);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_3);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_4);
    Block.BLACK_SHULKER_BOX.addBlockState(BLACK_SHULKER_BOX_5);
  }
}
