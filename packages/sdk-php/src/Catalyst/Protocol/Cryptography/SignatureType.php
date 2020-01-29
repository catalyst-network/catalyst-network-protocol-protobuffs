<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Cryptography.proto

namespace Catalyst\Protocol\Cryptography;

use UnexpectedValueException;

/**
 * Represents domains of a node.
 *
 * Protobuf type <code>Catalyst.Protocol.Cryptography.SignatureType</code>
 */
class SignatureType
{
    /**
     * Unknown signature.
     *
     * Generated from protobuf enum <code>SIGNATURE_TYPE_UNKNOWN = 0;</code>
     */
    const SIGNATURE_TYPE_UNKNOWN = 0;
    /**
     * Signatures for public transactions.
     *
     * Generated from protobuf enum <code>TRANSACTION_PUBLIC = 1;</code>
     */
    const TRANSACTION_PUBLIC = 1;
    /**
     * Signatures for confidential transactions.
     *
     * Generated from protobuf enum <code>TRANSACTION_CONFIDENTIAL = 2;</code>
     */
    const TRANSACTION_CONFIDENTIAL = 2;
    /**
     * Signatures for rpc messages.
     *
     * Generated from protobuf enum <code>PROTOCOL_RPC = 3;</code>
     */
    const PROTOCOL_RPC = 3;
    /**
     * Signatures for peer protocol messages.
     *
     * Generated from protobuf enum <code>PROTOCOL_PEER = 4;</code>
     */
    const PROTOCOL_PEER = 4;

    private static $valueToName = [
        self::SIGNATURE_TYPE_UNKNOWN => 'SIGNATURE_TYPE_UNKNOWN',
        self::TRANSACTION_PUBLIC => 'TRANSACTION_PUBLIC',
        self::TRANSACTION_CONFIDENTIAL => 'TRANSACTION_CONFIDENTIAL',
        self::PROTOCOL_RPC => 'PROTOCOL_RPC',
        self::PROTOCOL_PEER => 'PROTOCOL_PEER',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}

