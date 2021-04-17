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
public final class PoweredRail {
  public static final BlockState POWERED_RAIL_0 = new BlockState(NamespaceID.from("minecraft:powered_rail:0"), (short) 1305, Block.POWERED_RAIL, "powered=true","shape=north_south");

  public static final BlockState POWERED_RAIL_1 = new BlockState(NamespaceID.from("minecraft:powered_rail:1"), (short) 1306, Block.POWERED_RAIL, "powered=true","shape=east_west");

  public static final BlockState POWERED_RAIL_2 = new BlockState(NamespaceID.from("minecraft:powered_rail:2"), (short) 1307, Block.POWERED_RAIL, "powered=true","shape=ascending_east");

  public static final BlockState POWERED_RAIL_3 = new BlockState(NamespaceID.from("minecraft:powered_rail:3"), (short) 1308, Block.POWERED_RAIL, "powered=true","shape=ascending_west");

  public static final BlockState POWERED_RAIL_4 = new BlockState(NamespaceID.from("minecraft:powered_rail:4"), (short) 1309, Block.POWERED_RAIL, "powered=true","shape=ascending_north");

  public static final BlockState POWERED_RAIL_5 = new BlockState(NamespaceID.from("minecraft:powered_rail:5"), (short) 1310, Block.POWERED_RAIL, "powered=true","shape=ascending_south");

  public static final BlockState POWERED_RAIL_6 = new BlockState(NamespaceID.from("minecraft:powered_rail:6"), (short) 1311, Block.POWERED_RAIL, "powered=false","shape=north_south");

  public static final BlockState POWERED_RAIL_7 = new BlockState(NamespaceID.from("minecraft:powered_rail:7"), (short) 1312, Block.POWERED_RAIL, "powered=false","shape=east_west");

  public static final BlockState POWERED_RAIL_8 = new BlockState(NamespaceID.from("minecraft:powered_rail:8"), (short) 1313, Block.POWERED_RAIL, "powered=false","shape=ascending_east");

  public static final BlockState POWERED_RAIL_9 = new BlockState(NamespaceID.from("minecraft:powered_rail:9"), (short) 1314, Block.POWERED_RAIL, "powered=false","shape=ascending_west");

  public static final BlockState POWERED_RAIL_10 = new BlockState(NamespaceID.from("minecraft:powered_rail:10"), (short) 1315, Block.POWERED_RAIL, "powered=false","shape=ascending_north");

  public static final BlockState POWERED_RAIL_11 = new BlockState(NamespaceID.from("minecraft:powered_rail:11"), (short) 1316, Block.POWERED_RAIL, "powered=false","shape=ascending_south");

  static {
    Registries.registerBlockState(POWERED_RAIL_0);
    Registries.registerBlockState(POWERED_RAIL_1);
    Registries.registerBlockState(POWERED_RAIL_2);
    Registries.registerBlockState(POWERED_RAIL_3);
    Registries.registerBlockState(POWERED_RAIL_4);
    Registries.registerBlockState(POWERED_RAIL_5);
    Registries.registerBlockState(POWERED_RAIL_6);
    Registries.registerBlockState(POWERED_RAIL_7);
    Registries.registerBlockState(POWERED_RAIL_8);
    Registries.registerBlockState(POWERED_RAIL_9);
    Registries.registerBlockState(POWERED_RAIL_10);
    Registries.registerBlockState(POWERED_RAIL_11);
  }

  public static void initStates() {
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_0);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_1);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_2);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_3);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_4);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_5);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_6);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_7);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_8);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_9);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_10);
    Block.POWERED_RAIL.addBlockState(POWERED_RAIL_11);
  }
}
