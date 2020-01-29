<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.VerifyMessageResponse</code>
 */
class VerifyMessageResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bool is_signed_by_key = 1;</code>
     */
    private $is_signed_by_key = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $is_signed_by_key
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bool is_signed_by_key = 1;</code>
     * @return bool
     */
    public function getIsSignedByKey()
    {
        return $this->is_signed_by_key;
    }

    /**
     * Generated from protobuf field <code>bool is_signed_by_key = 1;</code>
     * @param bool $var
     * @return $this
     */
    public function setIsSignedByKey($var)
    {
        GPBUtil::checkBool($var);
        $this->is_signed_by_key = $var;

        return $this;
    }

}

