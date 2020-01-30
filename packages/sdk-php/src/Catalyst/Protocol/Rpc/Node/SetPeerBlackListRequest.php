<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Rpc.Node.SetPeerBlacklistRequest</code>
 */
class SetPeerBlacklistRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes public_key = 1;</code>
     */
    private $public_key = '';
    /**
     * Generated from protobuf field <code>bytes ip = 2;</code>
     */
    private $ip = '';
    /**
     * Generated from protobuf field <code>bool blacklist = 3;</code>
     */
    private $blacklist = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $public_key
     *     @type string $ip
     *     @type bool $blacklist
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes public_key = 1;</code>
     * @return string
     */
    public function getPublicKey()
    {
        return $this->public_key;
    }

    /**
     * Generated from protobuf field <code>bytes public_key = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setPublicKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->public_key = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes ip = 2;</code>
     * @return string
     */
    public function getIp()
    {
        return $this->ip;
    }

    /**
     * Generated from protobuf field <code>bytes ip = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setIp($var)
    {
        GPBUtil::checkString($var, False);
        $this->ip = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool blacklist = 3;</code>
     * @return bool
     */
    public function getBlacklist()
    {
        return $this->blacklist;
    }

    /**
     * Generated from protobuf field <code>bool blacklist = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setBlacklist($var)
    {
        GPBUtil::checkBool($var);
        $this->blacklist = $var;

        return $this;
    }

}

