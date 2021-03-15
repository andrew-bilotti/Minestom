package net.minestom.server.entity;

import net.minestom.server.MinecraftServer;
import net.minestom.server.chat.ColoredText;
import net.minestom.server.chat.JsonMessage;
import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.EntityMetaDataPacket;
import net.minestom.server.utils.BlockPosition;
import net.minestom.server.utils.Direction;
import net.minestom.server.utils.Position;
import net.minestom.server.utils.Vector;
import net.minestom.server.utils.binary.BinaryReader;
import net.minestom.server.utils.binary.BinaryWriter;
import net.minestom.server.utils.binary.Readable;
import net.minestom.server.utils.binary.Writeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jglrxavpok.hephaistos.nbt.NBT;
import org.jglrxavpok.hephaistos.nbt.NBTEnd;
import org.jglrxavpok.hephaistos.nbt.NBTException;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

public class Metadata {

    // METADATA TYPES

    public static Value<Byte> Byte(byte value) {
        return new Value<>(TYPE_BYTE, value, writer -> writer.writeByte(value), BinaryReader::readByte);
    }

    public static Value<Integer> VarInt(int value) {
        return new Value<>(TYPE_VARINT, value, writer -> writer.writeVarInt(value), BinaryReader::readVarInt);
    }

    public static Value<Float> Float(float value) {
        return new Value<>(TYPE_FLOAT, value, writer -> writer.writeFloat(value), BinaryReader::readFloat);
    }

    public static Value<String> String(@NotNull String value) {
        return new Value<>(TYPE_STRING, value, writer -> writer.writeSizedString(value), reader -> reader.readSizedString(Integer.MAX_VALUE));
    }

    public static Value<JsonMessage> Chat(@NotNull JsonMessage value) {
        return new Value<>(TYPE_CHAT, value, writer -> writer.writeSizedString(value.toString()), reader -> reader.readJsonMessage(Integer.MAX_VALUE));
    }

    public static Value<JsonMessage> OptChat(@Nullable JsonMessage value) {
        return new Value<>(TYPE_OPTCHAT, value, writer -> {
            final boolean present = value != null;
            writer.writeBoolean(present);
            if (present) {
                writer.writeSizedString(value.toString());
            }
        },
        reader -> {
            boolean present = reader.readBoolean();
            if(present) {
                return reader.readJsonMessage(Integer.MAX_VALUE);
            } else {
                return null;
            }
        });
    }

    public static Value<ItemStack> Slot(@NotNull ItemStack value) {
        return new Value<>(TYPE_SLOT, value, writer -> writer.writeItemStack(value), BinaryReader::readItemStack);
    }

    public static Value<Boolean> Boolean(boolean value) {
        return new Value<>(TYPE_BOOLEAN, value, writer -> writer.writeBoolean(value), BinaryReader::readBoolean);
    }

    public static Value<Vector> Rotation(@NotNull Vector value) {
        return new Value<>(TYPE_ROTATION, value, writer -> {
            writer.writeFloat((float) value.getX());
            writer.writeFloat((float) value.getY());
            writer.writeFloat((float) value.getZ());
        }, reader -> new Vector(reader.readFloat(), reader.readFloat(), reader.readFloat()));
    }

    public static Value<BlockPosition> Position(@NotNull BlockPosition value) {
        return new Value<>(TYPE_POSITION, value, writer -> writer.writeBlockPosition(value), BinaryReader::readBlockPosition);
    }

    public static Value<BlockPosition> OptPosition(@Nullable BlockPosition value) {
        return new Value<>(TYPE_OPTPOSITION, value, writer -> {
            final boolean present = value != null;
            writer.writeBoolean(present);
            if (present) {
                writer.writeBlockPosition(value);
            }
        }, reader -> {
            boolean present = reader.readBoolean();
            if(present) {
                return reader.readBlockPosition();
            } else {
                return null;
            }
        });
    }

    public static Value<Direction> Direction(@NotNull Direction value) {
        return new Value<>(TYPE_DIRECTION, value, writer -> writer.writeVarInt(value.ordinal()), reader -> Direction.values()[reader.readVarInt()]);
    }

    public static Value<UUID> OptUUID(@Nullable UUID value) {
        return new Value<>(TYPE_OPTUUID, value, writer -> {
            final boolean present = value != null;
            writer.writeBoolean(present);
            if (present) {
                writer.writeUuid(value);
            }
        }, reader -> {
            boolean present = reader.readBoolean();
            if(present) {
                return reader.readUuid();
            } else {
                return null;
            }
        });
    }

    public static Value<Integer> OptBlockID(@Nullable Integer value) {
        return new Value<>(TYPE_OPTBLOCKID, value, writer -> {
            final boolean present = value != null;
            writer.writeVarInt(present ? value : 0);
        }, reader -> {
            boolean present = reader.readBoolean();
            if(present) {
                return reader.readVarInt();
            } else {
                return null;
            }
        });
    }

    public static Value<NBT> NBT(@NotNull NBT nbt) {
        return new Value<>(TYPE_NBT, nbt, writer -> {
            writer.writeNBT("", nbt);
        }, reader -> {
            try {
                return reader.readTag();
            } catch (IOException | NBTException e) {
                MinecraftServer.getExceptionManager().handleException(e);
                return null;
            }
        });
    }

    public static Value<int[]> VillagerData(int villagerType,
                                            int villagerProfession,
                                            int level) {
        return new Value<>(TYPE_VILLAGERDATA, new int[]{villagerType, villagerProfession, level}, writer -> {
            writer.writeVarInt(villagerType);
            writer.writeVarInt(villagerProfession);
            writer.writeVarInt(level);
        }, reader -> new int[] {
                reader.readVarInt(),
                reader.readVarInt(),
                reader.readVarInt()
        });
    }

    public static Value<Integer> OptVarInt(@Nullable Integer value) {
        return new Value<>(TYPE_OPTVARINT, value, writer -> {
            final boolean present = value != null;
            writer.writeVarInt(present ? value + 1 : 0);
        }, reader -> {
            boolean present = reader.readBoolean();
            if(present) {
                return reader.readVarInt();
            } else {
                return null;
            }
        });
    }

    public static Value<Entity.Pose> Pose(@NotNull Entity.Pose value) {
        return new Value<>(TYPE_POSE, value, writer -> writer.writeVarInt(value.ordinal()), reader -> Entity.Pose.values()[reader.readVarInt()]);
    }

    public static final byte TYPE_BYTE = 0;
    public static final byte TYPE_VARINT = 1;
    public static final byte TYPE_FLOAT = 2;
    public static final byte TYPE_STRING = 3;
    public static final byte TYPE_CHAT = 4;
    public static final byte TYPE_OPTCHAT = 5;
    public static final byte TYPE_SLOT = 6;
    public static final byte TYPE_BOOLEAN = 7;
    public static final byte TYPE_ROTATION = 8;
    public static final byte TYPE_POSITION = 9;
    public static final byte TYPE_OPTPOSITION = 10;
    public static final byte TYPE_DIRECTION = 11;
    public static final byte TYPE_OPTUUID = 12;
    public static final byte TYPE_OPTBLOCKID = 13;
    public static final byte TYPE_NBT = 14;
    public static final byte TYPE_PARTICLE = 15;
    public static final byte TYPE_VILLAGERDATA = 16;
    public static final byte TYPE_OPTVARINT = 17;
    public static final byte TYPE_POSE = 18;

    private final Entity entity;

    private Map<Byte, Entry<?>> metadataMap = new ConcurrentHashMap<>();

    public Metadata(@Nullable Entity entity) {
        this.entity = entity;
    }

    public <T> T getIndex(byte index, @Nullable T defaultValue) {
        Entry<?> value = metadataMap.get(index);
        return value != null ? (T) value.getMetaValue().value : defaultValue;
    }

    public void setIndex(byte index, @NotNull Value<?> value) {
        final Entry<?> entry = new Entry<>(index, value);
        this.metadataMap.put(index, entry);

        // Send metadata packet to update viewers and self
        if (entity != null && entity.isActive()) {
            EntityMetaDataPacket metaDataPacket = new EntityMetaDataPacket();
            metaDataPacket.entityId = entity.getEntityId();
            metaDataPacket.entries = Collections.singleton(entry);

            this.entity.sendPacketToViewersAndSelf(metaDataPacket);
        }
    }

    @NotNull
    public Collection<Entry<?>> getEntries() {
        return metadataMap.values();
    }

    public static class Entry<T> implements Writeable {

        protected byte index;
        protected Value<T> value;

        private Entry(byte index, @NotNull Value<T> value) {
            this.index = index;
            this.value = value;
        }

        public Entry(BinaryReader reader) {
            this.index = reader.readByte();
            int type = reader.readVarInt();
            value = Metadata.read(type, reader);
        }

        @Override
        public void write(@NotNull BinaryWriter writer) {
            writer.writeByte(index);
            this.value.write(writer);
        }

        public byte getIndex() {
            return index;
        }

        @NotNull
        public Value<T> getMetaValue() {
            return value;
        }
    }

    private static <T> Value<T> getCorrespondingNewEmptyValue(int type) {
        switch(type) {
            case TYPE_BYTE:
                return (Value<T>) Byte((byte) 0);
            case TYPE_VARINT:
                return (Value<T>) VarInt(0);
            case TYPE_FLOAT:
                return (Value<T>) Float(0);
            case TYPE_STRING:
                return (Value<T>) String("");
            case TYPE_CHAT:
                return (Value<T>) Chat(ColoredText.of(""));
            case TYPE_OPTCHAT:
                return (Value<T>) OptChat(null);
            case TYPE_SLOT:
                return (Value<T>) Slot(ItemStack.getAirItem());
            case TYPE_BOOLEAN:
                return (Value<T>) Boolean(false);
            case TYPE_ROTATION:
                return (Value<T>) Rotation(new Vector());
            case TYPE_POSITION:
                return (Value<T>) Position(new BlockPosition(0,0,0));
            case TYPE_OPTPOSITION:
                return (Value<T>) OptPosition(null);
            case TYPE_DIRECTION:
                return (Value<T>) Direction(Direction.DOWN);
            case TYPE_OPTUUID:
                return (Value<T>) OptUUID(null);
            case TYPE_OPTBLOCKID:
                return (Value<T>) OptBlockID(null);
            case TYPE_NBT:
                return (Value<T>) NBT(new NBTEnd());
            case TYPE_PARTICLE:
                throw new UnsupportedOperationException();
            case TYPE_VILLAGERDATA:
                return (Value<T>) VillagerData(0,0,0);
            case TYPE_OPTVARINT:
                return (Value<T>) OptVarInt(null);
            case TYPE_POSE:
                return (Value<T>) Pose(Entity.Pose.STANDING);

            default:
                throw new UnsupportedOperationException();
        }
    }

    private static <T> Value<T> read(int type, BinaryReader reader) {
        Value<T> value = getCorrespondingNewEmptyValue(type);
        value.read(reader);
        return value;
    }

    public static class Value<T> implements Writeable, Readable {

        protected final int type;
        protected T value;
        protected final Consumer<BinaryWriter> valueWriter;
        protected final Function<BinaryReader, T> readingFunction;

        private Value(int type, T value, @NotNull Consumer<BinaryWriter> valueWriter, @NotNull Function<BinaryReader, T> readingFunction) {
            this.type = type;
            this.value = value;
            this.valueWriter = valueWriter;
            this.readingFunction = readingFunction;
        }

        @Override
        public void write(@NotNull BinaryWriter writer) {
            writer.writeVarInt(type);
            this.valueWriter.accept(writer);
        }

        @Override
        public void read(@NotNull BinaryReader reader) {
            // skip type, will be read somewhere else
            value = readingFunction.apply(reader);
        }

        public int getType() {
            return type;
        }

        public T getValue() {
            return value;
        }
    }

}