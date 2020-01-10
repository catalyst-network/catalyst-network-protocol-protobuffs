<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Cryptography.proto

namespace Catalyst\Protocol\Cryptography;

/**
 * <pre>
 * Represents domains of a node.
 * </pre>
 *
 * Protobuf enum <code>Catalyst.Protocol.Cryptography.SignatureType</code>
 */
class SignatureType
{
    /**
     * <pre>
     * Unknown signature.
     * </pre>
     *
     * <code>SIGNATURE_TYPE_UNKNOWN = 0;</code>
     */
    const SIGNATURE_TYPE_UNKNOWN = 0;
    /**
     * <pre>
     * Signatures for public transactions.
     * </pre>
     *
     * <code>TRANSACTION_PUBLIC = 1;</code>
     */
    const TRANSACTION_PUBLIC = 1;
    /**
     * <pre>
     * Signatures for confidential transactions.
     * </pre>
     *
     * <code>TRANSACTION_CONFIDENTIAL = 2;</code>
     */
    const TRANSACTION_CONFIDENTIAL = 2;
    /**
     * <pre>
     * Signatures for rpc messages.
     * </pre>
     *
     * <code>PROTOCOL_RPC = 3;</code>
     */
    const PROTOCOL_RPC = 3;
    /**
     * <pre>
     * Signatures for peer protocol messages.
     * </pre>
     *
     * <code>PROTOCOL_PEER = 4;</code>
     */
    const PROTOCOL_PEER = 4;
}
