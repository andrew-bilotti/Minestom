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
public final class OakSlab {
  public static final BlockState OAK_SLAB_0 = new BlockState(NamespaceID.from("minecraft:oak_slab:0"), (short) 8304, Block.OAK_SLAB, "type=top","waterlogged=true");

  public static final BlockState OAK_SLAB_1 = new BlockState(NamespaceID.from("minecraft:oak_slab:1"), (short) 8305, Block.OAK_SLAB, "type=top","waterlogged=false");

  public static final BlockState OAK_SLAB_2 = new BlockState(NamespaceID.from("minecraft:oak_slab:2"), (short) 8306, Block.OAK_SLAB, "type=bottom","waterlogged=true");

  public static final BlockState OAK_SLAB_3 = new BlockState(NamespaceID.from("minecraft:oak_slab:3"), (short) 8307, Block.OAK_SLAB, "type=bottom","waterlogged=false");

  public static final BlockState OAK_SLAB_4 = new BlockState(NamespaceID.from("minecraft:oak_slab:4"), (short) 8308, Block.OAK_SLAB, "type=double","waterlogged=true");

  public static final BlockState OAK_SLAB_5 = new BlockState(NamespaceID.from("minecraft:oak_slab:5"), (short) 8309, Block.OAK_SLAB, "type=double","waterlogged=false");

  static {
    Registries.registerBlockState(OAK_SLAB_0);
    Registries.registerBlockState(OAK_SLAB_1);
    Registries.registerBlockState(OAK_SLAB_2);
    Registries.registerBlockState(OAK_SLAB_3);
    Registries.registerBlockState(OAK_SLAB_4);
    Registries.registerBlockState(OAK_SLAB_5);
  }

  public static void initStates() {
    Block.OAK_SLAB.addBlockState(OAK_SLAB_0);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_1);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_2);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_3);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_4);
    Block.OAK_SLAB.addBlockState(OAK_SLAB_5);
  }
}
