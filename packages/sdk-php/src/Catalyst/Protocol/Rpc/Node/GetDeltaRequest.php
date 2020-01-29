<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.GetDeltaRequest</code>
 */
class GetDeltaRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes delta_dfs_hash = 1;</code>
     */
    private $delta_dfs_hash = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $delta_dfs_hash
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes delta_dfs_hash = 1;</code>
     * @return string
     */
    public function getDeltaDfsHash()
    {
        return $this->delta_dfs_hash;
    }

    /**
     * Generated from protobuf field <code>bytes delta_dfs_hash = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDeltaDfsHash($var)
    {
        GPBUtil::checkString($var, False);
        $this->delta_dfs_hash = $var;

        return $this;
    }

}

