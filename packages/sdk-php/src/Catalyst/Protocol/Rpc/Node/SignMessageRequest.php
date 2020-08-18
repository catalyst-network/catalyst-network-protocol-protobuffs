<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.Rpc.Node.SignMessageRequest</code>
 */
class SignMessageRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bytes message = 1;</code>
     */
    private $message = '';
    /**
     * <code>string key_id = 2;</code>
     */
    private $key_id = '';
    /**
     * <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 3;</code>
     */
    private $signing_context = null;

    public function __construct() {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct();
    }

    /**
     * <code>bytes message = 1;</code>
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * <code>bytes message = 1;</code>
     */
    public function setMessage($var)
    {
        GPBUtil::checkString($var, False);
        $this->message = $var;
    }

    /**
     * <code>string key_id = 2;</code>
     */
    public function getKeyId()
    {
        return $this->key_id;
    }

    /**
     * <code>string key_id = 2;</code>
     */
    public function setKeyId($var)
    {
        GPBUtil::checkString($var, True);
        $this->key_id = $var;
    }

    /**
     * <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 3;</code>
     */
    public function getSigningContext()
    {
        return $this->signing_context;
    }

    /**
     * <code>.Catalyst.Protocol.Cryptography.SigningContext signing_context = 3;</code>
     */
    public function setSigningContext(&$var)
    {
        GPBUtil::checkMessage($var, \Catalyst\Protocol\Cryptography\SigningContext::class);
        $this->signing_context = $var;
    }

}

