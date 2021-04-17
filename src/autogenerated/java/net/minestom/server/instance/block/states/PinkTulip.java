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
public final class PinkTulip {
  public static final BlockState PINK_TULIP_0 = new BlockState(NamespaceID.from("minecraft:pink_tulip:0"), (short) 1420, Block.PINK_TULIP);

  static {
    Registries.registerBlockState(PINK_TULIP_0);
  }

  public static void initStates() {
    Block.PINK_TULIP.addBlockState(PINK_TULIP_0);
  }
}
