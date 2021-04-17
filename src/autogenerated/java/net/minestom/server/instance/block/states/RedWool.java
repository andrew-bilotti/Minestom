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
public final class RedWool {
  public static final BlockState RED_WOOL_0 = new BlockState(NamespaceID.from("minecraft:red_wool:0"), (short) 1398, Block.RED_WOOL);

  static {
    Registries.registerBlockState(RED_WOOL_0);
  }

  public static void initStates() {
    Block.RED_WOOL.addBlockState(RED_WOOL_0);
  }
}
