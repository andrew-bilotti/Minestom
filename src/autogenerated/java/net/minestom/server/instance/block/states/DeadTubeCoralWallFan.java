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
public final class DeadTubeCoralWallFan {
  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_0 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:0"), (short) 9564, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=north","waterlogged=true");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_1 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:1"), (short) 9565, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=north","waterlogged=false");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_2 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:2"), (short) 9566, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=south","waterlogged=true");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_3 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:3"), (short) 9567, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=south","waterlogged=false");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_4 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:4"), (short) 9568, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=west","waterlogged=true");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_5 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:5"), (short) 9569, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=west","waterlogged=false");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_6 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:6"), (short) 9570, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=east","waterlogged=true");

  public static final BlockState DEAD_TUBE_CORAL_WALL_FAN_7 = new BlockState(NamespaceID.from("minecraft:dead_tube_coral_wall_fan:7"), (short) 9571, Block.DEAD_TUBE_CORAL_WALL_FAN, "facing=east","waterlogged=false");

  static {
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_0);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_1);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_2);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_3);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_4);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_5);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_6);
    Registries.registerBlockState(DEAD_TUBE_CORAL_WALL_FAN_7);
  }

  public static void initStates() {
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_0);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_1);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_2);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_3);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_4);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_5);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_6);
    Block.DEAD_TUBE_CORAL_WALL_FAN.addBlockState(DEAD_TUBE_CORAL_WALL_FAN_7);
  }
}
