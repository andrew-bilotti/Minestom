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
public final class Peony {
  public static final BlockState PEONY_0 = new BlockState(NamespaceID.from("minecraft:peony:0"), (short) 7895, Block.PEONY, "half=upper");

  public static final BlockState PEONY_1 = new BlockState(NamespaceID.from("minecraft:peony:1"), (short) 7896, Block.PEONY, "half=lower");

  static {
    Registries.registerBlockState(PEONY_0);
    Registries.registerBlockState(PEONY_1);
  }

  public static void initStates() {
    Block.PEONY.addBlockState(PEONY_0);
    Block.PEONY.addBlockState(PEONY_1);
  }
}
