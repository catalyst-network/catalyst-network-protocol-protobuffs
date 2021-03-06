// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Deltas.proto

package Catalyst.Protocol.Deltas;

public final class Deltas {
  private Deltas() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Deltas_DeltaIndex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Deltas_DeltaIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Catalyst_Protocol_Deltas_Delta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Catalyst_Protocol_Deltas_Delta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Deltas.proto\022\030Catalyst.Protocol.Deltas" +
      "\032\021Transaction.proto\032\037google/protobuf/tim" +
      "estamp.proto\")\n\nDeltaIndex\022\016\n\006height\030\001 \001" +
      "(\r\022\013\n\003cid\030\002 \001(\014\"\210\003\n\005Delta\022\037\n\027previous_de" +
      "lta_dfs_hash\030\001 \001(\014\022\023\n\013merkle_root\030\002 \001(\014\022" +
      "\023\n\013merkle_poda\030\003 \001(\014\022.\n\ntime_stamp\030\004 \001(\013" +
      "2\032.google.protobuf.Timestamp\022B\n\016public_e" +
      "ntries\030\005 \003(\0132*.Catalyst.Protocol.Transac" +
      "tion.PublicEntry\022N\n\024confidential_entries" +
      "\030\006 \003(\01320.Catalyst.Protocol.Transaction.C" +
      "onfidentialEntry\022F\n\020coinbase_entries\030\007 \003" +
      "(\0132,.Catalyst.Protocol.Transaction.Coinb" +
      "aseEntry\022\022\n\nstate_root\030\010 \001(\014\022\024\n\014delta_nu" +
      "mber\030\t \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Catalyst.Protocol.Transaction.Transaction.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_Catalyst_Protocol_Deltas_DeltaIndex_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Catalyst_Protocol_Deltas_DeltaIndex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Deltas_DeltaIndex_descriptor,
        new java.lang.String[] { "Height", "Cid", });
    internal_static_Catalyst_Protocol_Deltas_Delta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Catalyst_Protocol_Deltas_Delta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Catalyst_Protocol_Deltas_Delta_descriptor,
        new java.lang.String[] { "PreviousDeltaDfsHash", "MerkleRoot", "MerklePoda", "TimeStamp", "PublicEntries", "ConfidentialEntries", "CoinbaseEntries", "StateRoot", "DeltaNumber", });
    Catalyst.Protocol.Transaction.Transaction.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
