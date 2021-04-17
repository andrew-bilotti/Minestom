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
public final class DarkOakPressurePlate {
  public static final BlockState DARK_OAK_PRESSURE_PLATE_0 = new BlockState(NamespaceID.from("minecraft:dark_oak_pressure_plate:0"), (short) 3883, Block.DARK_OAK_PRESSURE_PLATE, "powered=true");

  public static final BlockState DARK_OAK_PRESSURE_PLATE_1 = new BlockState(NamespaceID.from("minecraft:dark_oak_pressure_plate:1"), (short) 3884, Block.DARK_OAK_PRESSURE_PLATE, "powered=false");

  static {
    Registries.registerBlockState(DARK_OAK_PRESSURE_PLATE_0);
    Registries.registerBlockState(DARK_OAK_PRESSURE_PLATE_1);
  }

  public static void initStates() {
    Block.DARK_OAK_PRESSURE_PLATE.addBlockState(DARK_OAK_PRESSURE_PLATE_0);
    Block.DARK_OAK_PRESSURE_PLATE.addBlockState(DARK_OAK_PRESSURE_PLATE_1);
  }
}
