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
public final class KelpPlant {
  public static final BlockState KELP_PLANT_0 = new BlockState(NamespaceID.from("minecraft:kelp_plant:0"), (short) 9500, Block.KELP_PLANT);

  static {
    Registries.registerBlockState(KELP_PLANT_0);
  }

  public static void initStates() {
    Block.KELP_PLANT.addBlockState(KELP_PLANT_0);
  }
}
