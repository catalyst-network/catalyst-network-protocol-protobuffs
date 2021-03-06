# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Peer.proto

require 'google/protobuf'

require 'google/protobuf/timestamp_pb'
require 'google/protobuf/duration_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("Peer.proto", :syntax => :proto3) do
    add_message "Catalyst.Protocol.Peer.PeerId" do
      optional :ip, :bytes, 1
      optional :port, :uint32, 2
      optional :public_key, :bytes, 3
    end
    add_message "Catalyst.Protocol.Peer.PeerInfo" do
      optional :peer_id, :message, 1, "Catalyst.Protocol.Peer.PeerId"
      optional :reputation, :sint32, 2
      optional :is_blacklisted, :bool, 3
      optional :is_unreachable, :bool, 4
      optional :inactive_for, :message, 5, "google.protobuf.Duration"
      optional :last_seen, :message, 6, "google.protobuf.Timestamp"
      optional :modified, :message, 7, "google.protobuf.Timestamp"
      optional :created, :message, 8, "google.protobuf.Timestamp"
    end
  end
end

module Catalyst
  module Protocol
    module Peer
      PeerId = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("Catalyst.Protocol.Peer.PeerId").msgclass
      PeerInfo = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("Catalyst.Protocol.Peer.PeerInfo").msgclass
    end
  end
end
