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
public final class MelonStem {
  public static final BlockState MELON_STEM_0 = new BlockState(NamespaceID.from("minecraft:melon_stem:0"), (short) 4784, Block.MELON_STEM, "age=0");

  public static final BlockState MELON_STEM_1 = new BlockState(NamespaceID.from("minecraft:melon_stem:1"), (short) 4785, Block.MELON_STEM, "age=1");

  public static final BlockState MELON_STEM_2 = new BlockState(NamespaceID.from("minecraft:melon_stem:2"), (short) 4786, Block.MELON_STEM, "age=2");

  public static final BlockState MELON_STEM_3 = new BlockState(NamespaceID.from("minecraft:melon_stem:3"), (short) 4787, Block.MELON_STEM, "age=3");

  public static final BlockState MELON_STEM_4 = new BlockState(NamespaceID.from("minecraft:melon_stem:4"), (short) 4788, Block.MELON_STEM, "age=4");

  public static final BlockState MELON_STEM_5 = new BlockState(NamespaceID.from("minecraft:melon_stem:5"), (short) 4789, Block.MELON_STEM, "age=5");

  public static final BlockState MELON_STEM_6 = new BlockState(NamespaceID.from("minecraft:melon_stem:6"), (short) 4790, Block.MELON_STEM, "age=6");

  public static final BlockState MELON_STEM_7 = new BlockState(NamespaceID.from("minecraft:melon_stem:7"), (short) 4791, Block.MELON_STEM, "age=7");

  static {
    Registries.registerBlockState(MELON_STEM_0);
    Registries.registerBlockState(MELON_STEM_1);
    Registries.registerBlockState(MELON_STEM_2);
    Registries.registerBlockState(MELON_STEM_3);
    Registries.registerBlockState(MELON_STEM_4);
    Registries.registerBlockState(MELON_STEM_5);
    Registries.registerBlockState(MELON_STEM_6);
    Registries.registerBlockState(MELON_STEM_7);
  }

  public static void initStates() {
    Block.MELON_STEM.addBlockState(MELON_STEM_0);
    Block.MELON_STEM.addBlockState(MELON_STEM_1);
    Block.MELON_STEM.addBlockState(MELON_STEM_2);
    Block.MELON_STEM.addBlockState(MELON_STEM_3);
    Block.MELON_STEM.addBlockState(MELON_STEM_4);
    Block.MELON_STEM.addBlockState(MELON_STEM_5);
    Block.MELON_STEM.addBlockState(MELON_STEM_6);
    Block.MELON_STEM.addBlockState(MELON_STEM_7);
  }
}
