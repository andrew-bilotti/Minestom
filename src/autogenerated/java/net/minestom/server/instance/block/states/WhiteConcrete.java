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
public final class WhiteConcrete {
  public static final BlockState WHITE_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:white_concrete:0"), (short) 9442, Block.WHITE_CONCRETE);

  static {
    Registries.registerBlockState(WHITE_CONCRETE_0);
  }

  public static void initStates() {
    Block.WHITE_CONCRETE.addBlockState(WHITE_CONCRETE_0);
  }
}
