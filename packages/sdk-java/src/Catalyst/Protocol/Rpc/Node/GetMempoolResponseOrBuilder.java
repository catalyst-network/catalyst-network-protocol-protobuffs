// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rpc.proto

package Catalyst.Protocol.Rpc.Node;

public interface GetMempoolResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Catalyst.Protocol.Rpc.Node.GetMempoolResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
   */
  java.util.List<Catalyst.Protocol.Transaction.PublicEntry> 
      getTransactionsList();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
   */
  Catalyst.Protocol.Transaction.PublicEntry getTransactions(int index);
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
   */
  java.util.List<? extends Catalyst.Protocol.Transaction.PublicEntryOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
   */
  Catalyst.Protocol.Transaction.PublicEntryOrBuilder getTransactionsOrBuilder(
      int index);
}
