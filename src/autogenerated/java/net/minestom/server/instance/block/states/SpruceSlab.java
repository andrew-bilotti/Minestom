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
public final class SpruceSlab {
  public static final BlockState SPRUCE_SLAB_0 = new BlockState(NamespaceID.from("minecraft:spruce_slab:0"), (short) 8310, Block.SPRUCE_SLAB, "type=top","waterlogged=true");

  public static final BlockState SPRUCE_SLAB_1 = new BlockState(NamespaceID.from("minecraft:spruce_slab:1"), (short) 8311, Block.SPRUCE_SLAB, "type=top","waterlogged=false");

  public static final BlockState SPRUCE_SLAB_2 = new BlockState(NamespaceID.from("minecraft:spruce_slab:2"), (short) 8312, Block.SPRUCE_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState SPRUCE_SLAB_3 = new BlockState(NamespaceID.from("minecraft:spruce_slab:3"), (short) 8313, Block.SPRUCE_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState SPRUCE_SLAB_4 = new BlockState(NamespaceID.from("minecraft:spruce_slab:4"), (short) 8314, Block.SPRUCE_SLAB, "type=double","waterlogged=true");

  public static final BlockState SPRUCE_SLAB_5 = new BlockState(NamespaceID.from("minecraft:spruce_slab:5"), (short) 8315, Block.SPRUCE_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(SPRUCE_SLAB_0);
    Registries.registerBlockState(SPRUCE_SLAB_1);
    Registries.registerBlockState(SPRUCE_SLAB_2);
    Registries.registerBlockState(SPRUCE_SLAB_3);
    Registries.registerBlockState(SPRUCE_SLAB_4);
    Registries.registerBlockState(SPRUCE_SLAB_5);
  }

  public static void initStates() {
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_0);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_1);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_2);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_3);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_4);
    Block.SPRUCE_SLAB.addBlockState(SPRUCE_SLAB_5);
  }
}
