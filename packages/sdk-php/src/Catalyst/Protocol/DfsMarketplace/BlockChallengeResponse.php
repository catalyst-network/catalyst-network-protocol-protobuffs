<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: DfsMarketplace.proto

namespace Catalyst\Protocol\DfsMarketplace;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Catalyst.Protocol.DfsMarketplace.BlockChallengeResponse</code>
 */
class BlockChallengeResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string answer = 1;</code>
     */
    protected $answer = '';
    /**
     * Generated from protobuf field <code>string block_challenge_request_hash = 2;</code>
     */
    protected $block_challenge_request_hash = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $answer
     *     @type string $block_challenge_request_hash
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\DfsMarketplace::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string answer = 1;</code>
     * @return string
     */
    public function getAnswer()
    {
        return $this->answer;
    }

    /**
     * Generated from protobuf field <code>string answer = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setAnswer($var)
    {
        GPBUtil::checkString($var, True);
        $this->answer = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string block_challenge_request_hash = 2;</code>
     * @return string
     */
    public function getBlockChallengeRequestHash()
    {
        return $this->block_challenge_request_hash;
    }

    /**
     * Generated from protobuf field <code>string block_challenge_request_hash = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setBlockChallengeRequestHash($var)
    {
        GPBUtil::checkString($var, True);
        $this->block_challenge_request_hash = $var;

        return $this;
    }

}

