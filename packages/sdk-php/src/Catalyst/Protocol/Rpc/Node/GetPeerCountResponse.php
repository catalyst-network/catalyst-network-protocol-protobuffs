<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.GetPeerCountResponse</code>
 */
class GetPeerCountResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int32 peer_count = 1;</code>
     */
    protected $peer_count = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $peer_count
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int32 peer_count = 1;</code>
     * @return int
     */
    public function getPeerCount()
    {
        return $this->peer_count;
    }

    /**
     * Generated from protobuf field <code>int32 peer_count = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setPeerCount($var)
    {
        GPBUtil::checkInt32($var);
        $this->peer_count = $var;

        return $this;
    }

}

