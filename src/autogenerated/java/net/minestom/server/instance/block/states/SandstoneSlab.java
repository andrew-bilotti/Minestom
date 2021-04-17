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
public final class SandstoneSlab {
  public static final BlockState SANDSTONE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:sandstone_slab:0"), (short) 8352, Block.SANDSTONE_SLAB, "type=top","waterlogged=true");

  public static final BlockState SANDSTONE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:sandstone_slab:1"), (short) 8353, Block.SANDSTONE_SLAB, "type=top","waterlogged=false");

  public static final BlockState SANDSTONE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:sandstone_slab:2"), (short) 8354, Block.SANDSTONE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState SANDSTONE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:sandstone_slab:3"), (short) 8355, Block.SANDSTONE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState SANDSTONE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:sandstone_slab:4"), (short) 8356, Block.SANDSTONE_SLAB, "type=double","waterlogged=true");

  public static final BlockState SANDSTONE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:sandstone_slab:5"), (short) 8357, Block.SANDSTONE_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(SANDSTONE_SLAB_0);
    Registries.registerBlockState(SANDSTONE_SLAB_1);
    Registries.registerBlockState(SANDSTONE_SLAB_2);
    Registries.registerBlockState(SANDSTONE_SLAB_3);
    Registries.registerBlockState(SANDSTONE_SLAB_4);
    Registries.registerBlockState(SANDSTONE_SLAB_5);
  }

  public static void initStates() {
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_0);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_1);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_2);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_3);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_4);
    Block.SANDSTONE_SLAB.addBlockState(SANDSTONE_SLAB_5);
  }
}
