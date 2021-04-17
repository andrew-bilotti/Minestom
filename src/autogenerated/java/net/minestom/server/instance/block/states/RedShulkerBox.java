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
public final class RedShulkerBox {
  public static final BlockState RED_SHULKER_BOX_0 = new BlockState(NamespaceID.from("minecraft:red_shulker_box:0"), (short) 9366, Block.RED_SHULKER_BOX, "facing=north");

  public static final BlockState RED_SHULKER_BOX_1 = new BlockState(NamespaceID.from("minecraft:red_shulker_box:1"), (short) 9367, Block.RED_SHULKER_BOX, "facing=east");

  public static final BlockState RED_SHULKER_BOX_2 = new BlockState(NamespaceID.from("minecraft:red_shulker_box:2"), (short) 9368, Block.RED_SHULKER_BOX, "facing=south");

  public static final BlockState RED_SHULKER_BOX_3 = new BlockState(NamespaceID.from("minecraft:red_shulker_box:3"), (short) 9369, Block.RED_SHULKER_BOX, "facing=west");

  public static final BlockState RED_SHULKER_BOX_4 = new BlockState(NamespaceID.from("minecraft:red_shulker_box:4"), (short) 9370, Block.RED_SHULKER_BOX, "facing=up");

  public static final BlockState RED_SHULKER_BOX_5 = new BlockState(NamespaceID.from("minecraft:red_shulker_box:5"), (short) 9371, Block.RED_SHULKER_BOX, "facing=down");

  static {
    Registries.registerBlockState(RED_SHULKER_BOX_0);
    Registries.registerBlockState(RED_SHULKER_BOX_1);
    Registries.registerBlockState(RED_SHULKER_BOX_2);
    Registries.registerBlockState(RED_SHULKER_BOX_3);
    Registries.registerBlockState(RED_SHULKER_BOX_4);
    Registries.registerBlockState(RED_SHULKER_BOX_5);
  }

  public static void initStates() {
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_0);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_1);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_2);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_3);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_4);
    Block.RED_SHULKER_BOX.addBlockState(RED_SHULKER_BOX_5);
  }
}
