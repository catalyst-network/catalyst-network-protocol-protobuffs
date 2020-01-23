// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Deltas.proto

package Catalyst.Protocol.Deltas;

/**
 * <pre>
 **
 * DeltaDfsHashBroadcast
 * DeltaDfsHash: The DFS address at which the full content of the delta can be retrieved.
 * PreviousDeltaDfsHash: The DFS address for the content of the delta preceding this candidate.
 * </pre>
 *
 * Protobuf type {@code Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast}
 */
public  final class DeltaDfsHashBroadcast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast)
    DeltaDfsHashBroadcastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeltaDfsHashBroadcast.newBuilder() to construct.
  private DeltaDfsHashBroadcast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeltaDfsHashBroadcast() {
    deltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeltaDfsHashBroadcast(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            deltaDfsHash_ = input.readBytes();
            break;
          }
          case 18: {

            previousDeltaDfsHash_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_DeltaDfsHashBroadcast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_DeltaDfsHashBroadcast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.class, Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.Builder.class);
  }

  public static final int DELTADFSHASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString deltaDfsHash_;
  /**
   * <code>bytes DeltaDfsHash = 1;</code>
   */
  public com.google.protobuf.ByteString getDeltaDfsHash() {
    return deltaDfsHash_;
  }

  public static final int PREVIOUSDELTADFSHASH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString previousDeltaDfsHash_;
  /**
   * <code>bytes PreviousDeltaDfsHash = 2;</code>
   */
  public com.google.protobuf.ByteString getPreviousDeltaDfsHash() {
    return previousDeltaDfsHash_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!deltaDfsHash_.isEmpty()) {
      output.writeBytes(1, deltaDfsHash_);
    }
    if (!previousDeltaDfsHash_.isEmpty()) {
      output.writeBytes(2, previousDeltaDfsHash_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!deltaDfsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, deltaDfsHash_);
    }
    if (!previousDeltaDfsHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, previousDeltaDfsHash_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast other = (Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast) obj;

    boolean result = true;
    result = result && getDeltaDfsHash()
        .equals(other.getDeltaDfsHash());
    result = result && getPreviousDeltaDfsHash()
        .equals(other.getPreviousDeltaDfsHash());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DELTADFSHASH_FIELD_NUMBER;
    hash = (53 * hash) + getDeltaDfsHash().hashCode();
    hash = (37 * hash) + PREVIOUSDELTADFSHASH_FIELD_NUMBER;
    hash = (53 * hash) + getPreviousDeltaDfsHash().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * DeltaDfsHashBroadcast
   * DeltaDfsHash: The DFS address at which the full content of the delta can be retrieved.
   * PreviousDeltaDfsHash: The DFS address for the content of the delta preceding this candidate.
   * </pre>
   *
   * Protobuf type {@code Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast)
      Catalyst.Protocol.Deltas.DeltaDfsHashBroadcastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_DeltaDfsHashBroadcast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_DeltaDfsHashBroadcast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.class, Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.Builder.class);
    }

    // Construct using Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      deltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;

      previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.Deltas.Deltas.internal_static_Catalyst_Protocol_Deltas_DeltaDfsHashBroadcast_descriptor;
    }

    @java.lang.Override
    public Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast getDefaultInstanceForType() {
      return Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.getDefaultInstance();
    }

    @java.lang.Override
    public Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast build() {
      Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast buildPartial() {
      Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast result = new Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast(this);
      result.deltaDfsHash_ = deltaDfsHash_;
      result.previousDeltaDfsHash_ = previousDeltaDfsHash_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast) {
        return mergeFrom((Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast other) {
      if (other == Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast.getDefaultInstance()) return this;
      if (other.getDeltaDfsHash() != com.google.protobuf.ByteString.EMPTY) {
        setDeltaDfsHash(other.getDeltaDfsHash());
      }
      if (other.getPreviousDeltaDfsHash() != com.google.protobuf.ByteString.EMPTY) {
        setPreviousDeltaDfsHash(other.getPreviousDeltaDfsHash());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString deltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes DeltaDfsHash = 1;</code>
     */
    public com.google.protobuf.ByteString getDeltaDfsHash() {
      return deltaDfsHash_;
    }
    /**
     * <code>bytes DeltaDfsHash = 1;</code>
     */
    public Builder setDeltaDfsHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deltaDfsHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes DeltaDfsHash = 1;</code>
     */
    public Builder clearDeltaDfsHash() {
      
      deltaDfsHash_ = getDefaultInstance().getDeltaDfsHash();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString previousDeltaDfsHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes PreviousDeltaDfsHash = 2;</code>
     */
    public com.google.protobuf.ByteString getPreviousDeltaDfsHash() {
      return previousDeltaDfsHash_;
    }
    /**
     * <code>bytes PreviousDeltaDfsHash = 2;</code>
     */
    public Builder setPreviousDeltaDfsHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      previousDeltaDfsHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes PreviousDeltaDfsHash = 2;</code>
     */
    public Builder clearPreviousDeltaDfsHash() {
      
      previousDeltaDfsHash_ = getDefaultInstance().getPreviousDeltaDfsHash();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast)
  private static final Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast();
  }

  public static Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeltaDfsHashBroadcast>
      PARSER = new com.google.protobuf.AbstractParser<DeltaDfsHashBroadcast>() {
    @java.lang.Override
    public DeltaDfsHashBroadcast parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeltaDfsHashBroadcast(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeltaDfsHashBroadcast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeltaDfsHashBroadcast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Catalyst.Protocol.Deltas.DeltaDfsHashBroadcast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
