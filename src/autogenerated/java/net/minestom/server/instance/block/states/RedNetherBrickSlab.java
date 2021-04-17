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
public final class RedNetherBrickSlab {
  public static final BlockState RED_NETHER_BRICK_SLAB_0 = new BlockState(NamespaceID.from("minecraft:red_nether_brick_slab:0"), (short) 10853, Block.RED_NETHER_BRICK_SLAB, "type=top","waterlogged=true");

  public static final BlockState RED_NETHER_BRICK_SLAB_1 = new BlockState(NamespaceID.from("minecraft:red_nether_brick_slab:1"), (short) 10854, Block.RED_NETHER_BRICK_SLAB, "type=top","waterlogged=false");

  public static final BlockState RED_NETHER_BRICK_SLAB_2 = new BlockState(NamespaceID.from("minecraft:red_nether_brick_slab:2"), (short) 10855, Block.RED_NETHER_BRICK_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState RED_NETHER_BRICK_SLAB_3 = new BlockState(NamespaceID.from("minecraft:red_nether_brick_slab:3"), (short) 10856, Block.RED_NETHER_BRICK_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState RED_NETHER_BRICK_SLAB_4 = new BlockState(NamespaceID.from("minecraft:red_nether_brick_slab:4"), (short) 10857, Block.RED_NETHER_BRICK_SLAB, "type=double","waterlogged=true");

  public static final BlockState RED_NETHER_BRICK_SLAB_5 = new BlockState(NamespaceID.from("minecraft:red_nether_brick_slab:5"), (short) 10858, Block.RED_NETHER_BRICK_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(RED_NETHER_BRICK_SLAB_0);
    Registries.registerBlockState(RED_NETHER_BRICK_SLAB_1);
    Registries.registerBlockState(RED_NETHER_BRICK_SLAB_2);
    Registries.registerBlockState(RED_NETHER_BRICK_SLAB_3);
    Registries.registerBlockState(RED_NETHER_BRICK_SLAB_4);
    Registries.registerBlockState(RED_NETHER_BRICK_SLAB_5);
  }

  public static void initStates() {
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_0);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_1);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_2);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_3);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_4);
    Block.RED_NETHER_BRICK_SLAB.addBlockState(RED_NETHER_BRICK_SLAB_5);
  }
}
