<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: Rpc.proto

namespace Catalyst\Protocol\Rpc\Node;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>Catalyst.Protocol.Rpc.Node.GetMempoolResponse</code>
 */
class GetMempoolResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
     */
    private $transactions;

    public function __construct() {
        \GPBMetadata\Rpc::initOnce();
        parent::__construct();
    }

    /**
     * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
     */
    public function getTransactions()
    {
        return $this->transactions;
    }

    /**
     * <code>repeated .Catalyst.Protocol.Transaction.PublicEntry transactions = 1;</code>
     */
    public function setTransactions(&$var)
    {
        GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Catalyst\Protocol\Transaction\PublicEntry::class);
        $this->transactions = $var;
    }

}

