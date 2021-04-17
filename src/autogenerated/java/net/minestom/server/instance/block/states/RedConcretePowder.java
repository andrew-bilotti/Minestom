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
public final class RedConcretePowder {
  public static final BlockState RED_CONCRETE_POWDER_0 = new BlockState(NamespaceID.from("minecraft:red_concrete_powder:0"), (short) 9472, Block.RED_CONCRETE_POWDER);

  static {
    Registries.registerBlockState(RED_CONCRETE_POWDER_0);
  }

  public static void initStates() {
    Block.RED_CONCRETE_POWDER.addBlockState(RED_CONCRETE_POWDER_0);
  }
}
