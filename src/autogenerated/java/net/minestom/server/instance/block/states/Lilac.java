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
public final class Lilac {
  public static final BlockState LILAC_0 = new BlockState(NamespaceID.from("minecraft:lilac:0"), (short) 7891, Block.LILAC, "half=upper");

  public static final BlockState LILAC_1 = new BlockState(NamespaceID.from("minecraft:lilac:1"), (short) 7892, Block.LILAC, "half=lower");

  static {
    Registries.registerBlockState(LILAC_0);
    Registries.registerBlockState(LILAC_1);
  }

  public static void initStates() {
    Block.LILAC.addBlockState(LILAC_0);
    Block.LILAC.addBlockState(LILAC_1);
  }
}
