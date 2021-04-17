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
public final class PinkStainedGlass {
  public static final BlockState PINK_STAINED_GLASS_0 = new BlockState(NamespaceID.from("minecraft:pink_stained_glass:0"), (short) 4101, Block.PINK_STAINED_GLASS);

  static {
    Registries.registerBlockState(PINK_STAINED_GLASS_0);
  }

  public static void initStates() {
    Block.PINK_STAINED_GLASS.addBlockState(PINK_STAINED_GLASS_0);
  }
}
