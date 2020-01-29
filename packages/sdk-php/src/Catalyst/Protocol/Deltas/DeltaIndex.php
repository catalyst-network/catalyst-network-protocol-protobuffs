<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Deltas.proto

namespace Catalyst\Protocol\Deltas;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.Deltas.DeltaIndex</code>
 */
class DeltaIndex extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 height = 1;</code>
     */
    private $height = 0;
    /**
     * Generated from protobuf field <code>bytes cid = 2;</code>
     */
    private $cid = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $height
     *     @type string $cid
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Deltas::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint32 height = 1;</code>
     * @return int
     */
    public function getHeight()
    {
        return $this->height;
    }

    /**
     * Generated from protobuf field <code>uint32 height = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setHeight($var)
    {
        GPBUtil::checkUint32($var);
        $this->height = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes cid = 2;</code>
     * @return string
     */
    public function getCid()
    {
        return $this->cid;
    }

    /**
     * Generated from protobuf field <code>bytes cid = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setCid($var)
    {
        GPBUtil::checkString($var, False);
        $this->cid = $var;

        return $this;
    }

}

