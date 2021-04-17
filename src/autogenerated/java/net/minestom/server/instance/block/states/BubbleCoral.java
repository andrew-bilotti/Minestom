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
public final class BubbleCoral {
  public static final BlockState BUBBLE_CORAL_0 = new BlockState(NamespaceID.from("minecraft:bubble_coral:0"), (short) 9538, Block.BUBBLE_CORAL, "waterlogged=true");

  public static final BlockState BUBBLE_CORAL_1 = new BlockState(NamespaceID.from("minecraft:bubble_coral:1"), (short) 9539, Block.BUBBLE_CORAL, "waterlogged=false");

  static {
    Registries.registerBlockState(BUBBLE_CORAL_0);
    Registries.registerBlockState(BUBBLE_CORAL_1);
  }

  public static void initStates() {
    Block.BUBBLE_CORAL.addBlockState(BUBBLE_CORAL_0);
    Block.BUBBLE_CORAL.addBlockState(BUBBLE_CORAL_1);
  }
}
