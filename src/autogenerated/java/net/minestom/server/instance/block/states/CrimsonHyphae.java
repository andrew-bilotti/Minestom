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
public final class CrimsonHyphae {
  public static final BlockState CRIMSON_HYPHAE_0 = new BlockState(NamespaceID.from("minecraft:crimson_hyphae:0"), (short) 14989, Block.CRIMSON_HYPHAE, "axis=x");

  public static final BlockState CRIMSON_HYPHAE_1 = new BlockState(NamespaceID.from("minecraft:crimson_hyphae:1"), (short) 14990, Block.CRIMSON_HYPHAE, "axis=y");

  public static final BlockState CRIMSON_HYPHAE_2 = new BlockState(NamespaceID.from("minecraft:crimson_hyphae:2"), (short) 14991, Block.CRIMSON_HYPHAE, "axis=z");

  static {
    Registries.registerBlockState(CRIMSON_HYPHAE_0);
    Registries.registerBlockState(CRIMSON_HYPHAE_1);
    Registries.registerBlockState(CRIMSON_HYPHAE_2);
  }

  public static void initStates() {
    Block.CRIMSON_HYPHAE.addBlockState(CRIMSON_HYPHAE_0);
    Block.CRIMSON_HYPHAE.addBlockState(CRIMSON_HYPHAE_1);
    Block.CRIMSON_HYPHAE.addBlockState(CRIMSON_HYPHAE_2);
  }
}
