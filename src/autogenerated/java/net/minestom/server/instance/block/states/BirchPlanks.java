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
public final class BirchPlanks {
  public static final BlockState BIRCH_PLANKS_0 = new BlockState(NamespaceID.from("minecraft:birch_planks:0"), (short) 17, Block.BIRCH_PLANKS);

  static {
    Registries.registerBlockState(BIRCH_PLANKS_0);
  }

  public static void initStates() {
    Block.BIRCH_PLANKS.addBlockState(BIRCH_PLANKS_0);
  }
}
