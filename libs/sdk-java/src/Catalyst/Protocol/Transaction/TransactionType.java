// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transaction.proto

package Catalyst.Protocol.Transaction;

/**
 * Protobuf enum {@code Catalyst.Protocol.Transaction.TransactionType}
 */
public enum TransactionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *Unknown transaction type.
   * </pre>
   *
   * <code>TRANSACTION_TYPE_UNKNOWN = 0;</code>
   */
  TRANSACTION_TYPE_UNKNOWN(0),
  /**
   * <pre>
   * Public transaction type.
   * </pre>
   *
   * <code>PUBLIC = 1;</code>
   */
  PUBLIC(1),
  /**
   * <pre>
   * Private transaction type.
   * </pre>
   *
   * <code>CONFIDENTIAL = 2;</code>
   */
  CONFIDENTIAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *Unknown transaction type.
   * </pre>
   *
   * <code>TRANSACTION_TYPE_UNKNOWN = 0;</code>
   */
  public static final int TRANSACTION_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Public transaction type.
   * </pre>
   *
   * <code>PUBLIC = 1;</code>
   */
  public static final int PUBLIC_VALUE = 1;
  /**
   * <pre>
   * Private transaction type.
   * </pre>
   *
   * <code>CONFIDENTIAL = 2;</code>
   */
  public static final int CONFIDENTIAL_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TransactionType valueOf(int value) {
    return forNumber(value);
  }

  public static TransactionType forNumber(int value) {
    switch (value) {
      case 0: return TRANSACTION_TYPE_UNKNOWN;
      case 1: return PUBLIC;
      case 2: return CONFIDENTIAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransactionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransactionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransactionType>() {
          public TransactionType findValueByNumber(int number) {
            return TransactionType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return Catalyst.Protocol.Transaction.Transaction.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransactionType[] VALUES = values();

  public static TransactionType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransactionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Catalyst.Protocol.Transaction.TransactionType)
}
