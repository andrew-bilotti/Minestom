package net.minestom.server.item;

import net.kyori.adventure.text.Component;
import net.minestom.server.item.attribute.ItemAttribute;
import net.minestom.server.utils.binary.BinaryWriter;
import net.minestom.server.utils.binary.Writeable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jglrxavpok.hephaistos.nbt.NBTCompound;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ItemMeta implements Writeable {

    private final int damage;
    private final boolean unbreakable;
    private final int hideFlag;
    private final Component displayName;
    private final List<Component> lore;

    private final Map<Enchantment, Short> enchantmentMap;
    private final List<ItemAttribute> attributes;

    private final int customModelData;

    private final NBTCompound nbt;
    private final ItemMetaBuilder emptyBuilder;

    private BinaryWriter cachedBuffer;

    protected ItemMeta(@NotNull ItemMetaBuilder metaBuilder) {
        this.damage = metaBuilder.damage;
        this.unbreakable = metaBuilder.unbreakable;
        this.hideFlag = metaBuilder.hideFlag;
        this.displayName = metaBuilder.displayName;
        this.lore = Collections.unmodifiableList(metaBuilder.lore);
        this.enchantmentMap = Collections.unmodifiableMap(metaBuilder.enchantmentMap);
        this.attributes = Collections.unmodifiableList(metaBuilder.attributes);
        this.customModelData = metaBuilder.customModelData;

        this.nbt = metaBuilder.nbt;
        this.emptyBuilder = metaBuilder.getSupplier().get();
    }

    @Contract(value = "_, -> new", pure = true)
    public @NotNull ItemMeta with(@NotNull Consumer<@NotNull ItemMetaBuilder> builderConsumer) {
        var builder = builder();
        builderConsumer.accept(builder);
        return builder.build();
    }

    @Contract(pure = true)
    public int getDamage() {
        return damage;
    }

    @Contract(pure = true)
    public boolean isUnbreakable() {
        return unbreakable;
    }

    @Contract(pure = true)
    public int getHideFlag() {
        return hideFlag;
    }

    @Contract(pure = true)
    public @Nullable Component getDisplayName() {
        return displayName;
    }

    @Contract(pure = true)
    public @NotNull List<@NotNull Component> getLore() {
        return lore;
    }

    @Contract(pure = true)
    public @NotNull Map<Enchantment, Short> getEnchantmentMap() {
        return enchantmentMap;
    }

    @Contract(pure = true)
    public @NotNull List<ItemAttribute> getAttributes() {
        return attributes;
    }

    @Contract(pure = true)
    public int getCustomModelData() {
        return customModelData;
    }

    public <T> T getOrDefault(@NotNull ItemTag<T> tag, @Nullable T defaultValue) {
        var key = tag.getKey();
        if (nbt.containsKey(key)) {
            return tag.read(toNBT());
        } else {
            return defaultValue;
        }
    }

    public <T> @Nullable T get(@NotNull ItemTag<T> tag) {
        return tag.read(toNBT());
    }

    public @NotNull NBTCompound toNBT() {
        return nbt.deepClone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemMeta itemMeta = (ItemMeta) o;
        return nbt.equals(itemMeta.nbt);
    }

    @Override
    public int hashCode() {
        return nbt.hashCode();
    }

    @Contract(value = "-> new", pure = true)
    protected @NotNull ItemMetaBuilder builder() {
        return ItemMetaBuilder.fromNBT(emptyBuilder, nbt);
    }

    @Override
    public synchronized void write(@NotNull BinaryWriter writer) {
        if (cachedBuffer == null) {
            BinaryWriter w = new BinaryWriter();
            w.writeNBT("", nbt);
            this.cachedBuffer = w;
        }
        writer.write(cachedBuffer);
        cachedBuffer.getBuffer().resetReaderIndex();
    }
}
