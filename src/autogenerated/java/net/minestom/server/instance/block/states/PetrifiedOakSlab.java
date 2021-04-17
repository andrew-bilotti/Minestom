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
public final class PetrifiedOakSlab {
  public static final BlockState PETRIFIED_OAK_SLAB_0 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab:0"), (short) 8364, Block.PETRIFIED_OAK_SLAB, "type=top","waterlogged=true");

  public static final BlockState PETRIFIED_OAK_SLAB_1 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab:1"), (short) 8365, Block.PETRIFIED_OAK_SLAB, "type=top","waterlogged=false");

  public static final BlockState PETRIFIED_OAK_SLAB_2 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab:2"), (short) 8366, Block.PETRIFIED_OAK_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState PETRIFIED_OAK_SLAB_3 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab:3"), (short) 8367, Block.PETRIFIED_OAK_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState PETRIFIED_OAK_SLAB_4 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab:4"), (short) 8368, Block.PETRIFIED_OAK_SLAB, "type=double","waterlogged=true");

  public static final BlockState PETRIFIED_OAK_SLAB_5 = new BlockState(NamespaceID.from("minecraft:petrified_oak_slab:5"), (short) 8369, Block.PETRIFIED_OAK_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(PETRIFIED_OAK_SLAB_0);
    Registries.registerBlockState(PETRIFIED_OAK_SLAB_1);
    Registries.registerBlockState(PETRIFIED_OAK_SLAB_2);
    Registries.registerBlockState(PETRIFIED_OAK_SLAB_3);
    Registries.registerBlockState(PETRIFIED_OAK_SLAB_4);
    Registries.registerBlockState(PETRIFIED_OAK_SLAB_5);
  }

  public static void initStates() {
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_0);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_1);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_2);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_3);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_4);
    Block.PETRIFIED_OAK_SLAB.addBlockState(PETRIFIED_OAK_SLAB_5);
  }
}
