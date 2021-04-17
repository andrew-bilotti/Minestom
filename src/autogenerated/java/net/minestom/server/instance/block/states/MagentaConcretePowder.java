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
public final class MagentaConcretePowder {
  public static final BlockState MAGENTA_CONCRETE_POWDER_0 = new BlockState(NamespaceID.from("minecraft:magenta_concrete_powder:0"), (short) 9460, Block.MAGENTA_CONCRETE_POWDER);

  static {
    Registries.registerBlockState(MAGENTA_CONCRETE_POWDER_0);
  }

  public static void initStates() {
    Block.MAGENTA_CONCRETE_POWDER.addBlockState(MAGENTA_CONCRETE_POWDER_0);
  }
}
