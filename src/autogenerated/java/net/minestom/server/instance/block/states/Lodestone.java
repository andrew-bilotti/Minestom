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
public final class Lodestone {
  public static final BlockState LODESTONE_0 = new BlockState(NamespaceID.from("minecraft:lodestone:0"), (short) 15846, Block.LODESTONE);

  static {
    Registries.registerBlockState(LODESTONE_0);
  }

  public static void initStates() {
    Block.LODESTONE.addBlockState(LODESTONE_0);
  }
}
