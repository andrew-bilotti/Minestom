package net.minestom.server.instance.block;

import it.unimi.dsi.fastutil.shorts.Short2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectSortedMap;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.tag.Tag;
import net.minestom.server.tag.TagReadable;
import net.minestom.server.utils.NamespaceID;
import net.minestom.server.utils.math.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.IntStream;

@SuppressWarnings("removal")
public interface Block extends Keyed, TagReadable, BlockOld {

    Registry REGISTRY = new Registry();

    <T> @NotNull Block withProperty(@NotNull BlockProperty<T> property, @NotNull T value);

    <T> @NotNull Block withTag(@NotNull Tag<T> tag, @Nullable T value);

    @NotNull Block getDefaultBlock();

    @NotNull NamespaceID getNamespaceId();

    @Override
    default @NotNull Key key() {
        return getNamespaceId();
    }

    default @NotNull String getName() {
        return getNamespaceId().asString();
    }

    short getProtocolId();

    class Registry {

        private final Short2ObjectSortedMap<BlockSupplier> set = new Short2ObjectAVLTreeMap<>();

        private Registry() {
        }

        public @Nullable Block fromStateId(short stateId) {
            BlockSupplier supplier = set.get(stateId);
            return supplier.get(stateId);
        }

        public void register(@NotNull IntRange range, @NotNull BlockSupplier blockSupplier) {
            IntStream.range(range.getMinimum(), range.getMaximum()).forEach(value -> set.put((short) value, blockSupplier));
        }

        @FunctionalInterface
        private interface BlockSupplier {
            @NotNull Block get(short stateId);
        }
    }

}