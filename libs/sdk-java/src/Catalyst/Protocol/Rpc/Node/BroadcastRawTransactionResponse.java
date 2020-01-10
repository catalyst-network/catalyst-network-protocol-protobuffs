// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rpc.proto

package Catalyst.Protocol.Rpc.Node;

/**
 * Protobuf type {@code Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse}
 */
public  final class BroadcastRawTransactionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse)
    BroadcastRawTransactionResponseOrBuilder {
  // Use BroadcastRawTransactionResponse.newBuilder() to construct.
  private BroadcastRawTransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BroadcastRawTransactionResponse() {
    responseCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BroadcastRawTransactionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            responseCode_ = rawValue;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Catalyst.Protocol.Rpc.Node.Rpc.internal_static_Catalyst_Protocol_Rpc_Node_BroadcastRawTransactionResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Catalyst.Protocol.Rpc.Node.Rpc.internal_static_Catalyst_Protocol_Rpc_Node_BroadcastRawTransactionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.class, Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.Builder.class);
  }

  public static final int RESPONSE_CODE_FIELD_NUMBER = 1;
  private int responseCode_;
  /**
   * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
   */
  public int getResponseCodeValue() {
    return responseCode_;
  }
  /**
   * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
   */
  public Catalyst.Protocol.Rpc.Node.ResponseCode getResponseCode() {
    Catalyst.Protocol.Rpc.Node.ResponseCode result = Catalyst.Protocol.Rpc.Node.ResponseCode.valueOf(responseCode_);
    return result == null ? Catalyst.Protocol.Rpc.Node.ResponseCode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (responseCode_ != Catalyst.Protocol.Rpc.Node.ResponseCode.PENDING.getNumber()) {
      output.writeEnum(1, responseCode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseCode_ != Catalyst.Protocol.Rpc.Node.ResponseCode.PENDING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, responseCode_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse)) {
      return super.equals(obj);
    }
    Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse other = (Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse) obj;

    boolean result = true;
    result = result && responseCode_ == other.responseCode_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + responseCode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse)
      Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Catalyst.Protocol.Rpc.Node.Rpc.internal_static_Catalyst_Protocol_Rpc_Node_BroadcastRawTransactionResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Catalyst.Protocol.Rpc.Node.Rpc.internal_static_Catalyst_Protocol_Rpc_Node_BroadcastRawTransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.class, Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.Builder.class);
    }

    // Construct using Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      responseCode_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Catalyst.Protocol.Rpc.Node.Rpc.internal_static_Catalyst_Protocol_Rpc_Node_BroadcastRawTransactionResponse_descriptor;
    }

    public Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse getDefaultInstanceForType() {
      return Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.getDefaultInstance();
    }

    public Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse build() {
      Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse buildPartial() {
      Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse result = new Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse(this);
      result.responseCode_ = responseCode_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse) {
        return mergeFrom((Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse other) {
      if (other == Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse.getDefaultInstance()) return this;
      if (other.responseCode_ != 0) {
        setResponseCodeValue(other.getResponseCodeValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int responseCode_ = 0;
    /**
     * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
     */
    public int getResponseCodeValue() {
      return responseCode_;
    }
    /**
     * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
     */
    public Builder setResponseCodeValue(int value) {
      responseCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
     */
    public Catalyst.Protocol.Rpc.Node.ResponseCode getResponseCode() {
      Catalyst.Protocol.Rpc.Node.ResponseCode result = Catalyst.Protocol.Rpc.Node.ResponseCode.valueOf(responseCode_);
      return result == null ? Catalyst.Protocol.Rpc.Node.ResponseCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
     */
    public Builder setResponseCode(Catalyst.Protocol.Rpc.Node.ResponseCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      responseCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Catalyst.Protocol.Rpc.Node.ResponseCode response_code = 1;</code>
     */
    public Builder clearResponseCode() {
      
      responseCode_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse)
  }

  // @@protoc_insertion_point(class_scope:Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse)
  private static final Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse();
  }

  public static Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BroadcastRawTransactionResponse>
      PARSER = new com.google.protobuf.AbstractParser<BroadcastRawTransactionResponse>() {
    public BroadcastRawTransactionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BroadcastRawTransactionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BroadcastRawTransactionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BroadcastRawTransactionResponse> getParserForType() {
    return PARSER;
  }

  public Catalyst.Protocol.Rpc.Node.BroadcastRawTransactionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
