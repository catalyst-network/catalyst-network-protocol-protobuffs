<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: IPPN.proto

namespace Catalyst\Protocol\IPPN;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.IPPN.DeltaHistoryRequest</code>
 */
class DeltaHistoryRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The number of deltas CIDs a node requests.
     * </pre>
     *
     * <code>uint32 range = 1;</code>
     */
    private $range = 0;
    /**
     * <pre>
     * The given height the node wants the range from.
     * </pre>
     *
     * <code>uint32 height = 2;</code>
     */
    private $height = 0;

    public function __construct() {
        \GPBMetadata\IPPN::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The number of deltas CIDs a node requests.
     * </pre>
     *
     * <code>uint32 range = 1;</code>
     */
    public function getRange()
    {
        return $this->range;
    }

    /**
     * <pre>
     * The number of deltas CIDs a node requests.
     * </pre>
     *
     * <code>uint32 range = 1;</code>
     */
    public function setRange($var)
    {
        GPBUtil::checkUint32($var);
        $this->range = $var;
    }

    /**
     * <pre>
     * The given height the node wants the range from.
     * </pre>
     *
     * <code>uint32 height = 2;</code>
     */
    public function getHeight()
    {
        return $this->height;
    }

    /**
     * <pre>
     * The given height the node wants the range from.
     * </pre>
     *
     * <code>uint32 height = 2;</code>
     */
    public function setHeight($var)
    {
        GPBUtil::checkUint32($var);
        $this->height = $var;
    }

}
