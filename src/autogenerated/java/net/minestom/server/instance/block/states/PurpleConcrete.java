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
public final class PurpleConcrete {
  public static final BlockState PURPLE_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:purple_concrete:0"), (short) 9452, Block.PURPLE_CONCRETE);

  static {
    Registries.registerBlockState(PURPLE_CONCRETE_0);
  }

  public static void initStates() {
    Block.PURPLE_CONCRETE.addBlockState(PURPLE_CONCRETE_0);
  }
}
