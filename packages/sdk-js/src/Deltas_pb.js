// source: Deltas.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var Transaction_pb = require('./Transaction_pb.js');
goog.object.extend(proto, Transaction_pb);
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
goog.object.extend(proto, google_protobuf_timestamp_pb);
goog.exportSymbol('proto.Catalyst.Protocol.Deltas.Delta', null, global);
goog.exportSymbol('proto.Catalyst.Protocol.Deltas.DeltaIndex', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.Catalyst.Protocol.Deltas.DeltaIndex, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.Catalyst.Protocol.Deltas.DeltaIndex.displayName = 'proto.Catalyst.Protocol.Deltas.DeltaIndex';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.Catalyst.Protocol.Deltas.Delta = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.Catalyst.Protocol.Deltas.Delta.repeatedFields_, null);
};
goog.inherits(proto.Catalyst.Protocol.Deltas.Delta, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.Catalyst.Protocol.Deltas.Delta.displayName = 'proto.Catalyst.Protocol.Deltas.Delta';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.toObject = function(opt_includeInstance) {
  return proto.Catalyst.Protocol.Deltas.DeltaIndex.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.Catalyst.Protocol.Deltas.DeltaIndex} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.toObject = function(includeInstance, msg) {
  var f, obj = {
    height: jspb.Message.getFieldWithDefault(msg, 1, 0),
    cid: msg.getCid_asB64()
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.Catalyst.Protocol.Deltas.DeltaIndex}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.Catalyst.Protocol.Deltas.DeltaIndex;
  return proto.Catalyst.Protocol.Deltas.DeltaIndex.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.Catalyst.Protocol.Deltas.DeltaIndex} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.Catalyst.Protocol.Deltas.DeltaIndex}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setHeight(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCid(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.Catalyst.Protocol.Deltas.DeltaIndex.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.Catalyst.Protocol.Deltas.DeltaIndex} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHeight();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getCid_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional uint32 height = 1;
 * @return {number}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.Catalyst.Protocol.Deltas.DeltaIndex} returns this
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bytes cid = 2;
 * @return {!(string|Uint8Array)}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.getCid = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes cid = 2;
 * This is a type-conversion wrapper around `getCid()`
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.getCid_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCid()));
};


/**
 * optional bytes cid = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCid()`
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.getCid_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCid()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.Catalyst.Protocol.Deltas.DeltaIndex} returns this
 */
proto.Catalyst.Protocol.Deltas.DeltaIndex.prototype.setCid = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.Catalyst.Protocol.Deltas.Delta.repeatedFields_ = [5,6,7];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.toObject = function(opt_includeInstance) {
  return proto.Catalyst.Protocol.Deltas.Delta.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.Catalyst.Protocol.Deltas.Delta} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.Catalyst.Protocol.Deltas.Delta.toObject = function(includeInstance, msg) {
  var f, obj = {
    previousDeltaDfsHash: msg.getPreviousDeltaDfsHash_asB64(),
    merkleRoot: msg.getMerkleRoot_asB64(),
    merklePoda: msg.getMerklePoda_asB64(),
    timeStamp: (f = msg.getTimeStamp()) && google_protobuf_timestamp_pb.Timestamp.toObject(includeInstance, f),
    publicEntriesList: jspb.Message.toObjectList(msg.getPublicEntriesList(),
    Transaction_pb.PublicEntry.toObject, includeInstance),
    confidentialEntriesList: jspb.Message.toObjectList(msg.getConfidentialEntriesList(),
    Transaction_pb.ConfidentialEntry.toObject, includeInstance),
    coinbaseEntriesList: jspb.Message.toObjectList(msg.getCoinbaseEntriesList(),
    Transaction_pb.CoinbaseEntry.toObject, includeInstance),
    stateRoot: msg.getStateRoot_asB64(),
    deltaNumber: jspb.Message.getFieldWithDefault(msg, 9, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.Catalyst.Protocol.Deltas.Delta}
 */
proto.Catalyst.Protocol.Deltas.Delta.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.Catalyst.Protocol.Deltas.Delta;
  return proto.Catalyst.Protocol.Deltas.Delta.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.Catalyst.Protocol.Deltas.Delta} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.Catalyst.Protocol.Deltas.Delta}
 */
proto.Catalyst.Protocol.Deltas.Delta.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPreviousDeltaDfsHash(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMerkleRoot(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMerklePoda(value);
      break;
    case 4:
      var value = new google_protobuf_timestamp_pb.Timestamp;
      reader.readMessage(value,google_protobuf_timestamp_pb.Timestamp.deserializeBinaryFromReader);
      msg.setTimeStamp(value);
      break;
    case 5:
      var value = new Transaction_pb.PublicEntry;
      reader.readMessage(value,Transaction_pb.PublicEntry.deserializeBinaryFromReader);
      msg.addPublicEntries(value);
      break;
    case 6:
      var value = new Transaction_pb.ConfidentialEntry;
      reader.readMessage(value,Transaction_pb.ConfidentialEntry.deserializeBinaryFromReader);
      msg.addConfidentialEntries(value);
      break;
    case 7:
      var value = new Transaction_pb.CoinbaseEntry;
      reader.readMessage(value,Transaction_pb.CoinbaseEntry.deserializeBinaryFromReader);
      msg.addCoinbaseEntries(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setStateRoot(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setDeltaNumber(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.Catalyst.Protocol.Deltas.Delta.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.Catalyst.Protocol.Deltas.Delta} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.Catalyst.Protocol.Deltas.Delta.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPreviousDeltaDfsHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getMerkleRoot_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getMerklePoda_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getTimeStamp();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      google_protobuf_timestamp_pb.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getPublicEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      Transaction_pb.PublicEntry.serializeBinaryToWriter
    );
  }
  f = message.getConfidentialEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      Transaction_pb.ConfidentialEntry.serializeBinaryToWriter
    );
  }
  f = message.getCoinbaseEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      Transaction_pb.CoinbaseEntry.serializeBinaryToWriter
    );
  }
  f = message.getStateRoot_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
  f = message.getDeltaNumber();
  if (f !== 0) {
    writer.writeInt64(
      9,
      f
    );
  }
};


/**
 * optional bytes previous_delta_dfs_hash = 1;
 * @return {!(string|Uint8Array)}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getPreviousDeltaDfsHash = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes previous_delta_dfs_hash = 1;
 * This is a type-conversion wrapper around `getPreviousDeltaDfsHash()`
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getPreviousDeltaDfsHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPreviousDeltaDfsHash()));
};


/**
 * optional bytes previous_delta_dfs_hash = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPreviousDeltaDfsHash()`
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getPreviousDeltaDfsHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPreviousDeltaDfsHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setPreviousDeltaDfsHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes merkle_root = 2;
 * @return {!(string|Uint8Array)}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerkleRoot = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes merkle_root = 2;
 * This is a type-conversion wrapper around `getMerkleRoot()`
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerkleRoot_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMerkleRoot()));
};


/**
 * optional bytes merkle_root = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMerkleRoot()`
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerkleRoot_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMerkleRoot()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setMerkleRoot = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes merkle_poda = 3;
 * @return {!(string|Uint8Array)}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerklePoda = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes merkle_poda = 3;
 * This is a type-conversion wrapper around `getMerklePoda()`
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerklePoda_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMerklePoda()));
};


/**
 * optional bytes merkle_poda = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMerklePoda()`
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerklePoda_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMerklePoda()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setMerklePoda = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp time_stamp = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getTimeStamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, google_protobuf_timestamp_pb.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
*/
proto.Catalyst.Protocol.Deltas.Delta.prototype.setTimeStamp = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.clearTimeStamp = function() {
  return this.setTimeStamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.hasTimeStamp = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;
 * @return {!Array<!proto.Catalyst.Protocol.Transaction.PublicEntry>}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getPublicEntriesList = function() {
  return /** @type{!Array<!proto.Catalyst.Protocol.Transaction.PublicEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, Transaction_pb.PublicEntry, 5));
};


/**
 * @param {!Array<!proto.Catalyst.Protocol.Transaction.PublicEntry>} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
*/
proto.Catalyst.Protocol.Deltas.Delta.prototype.setPublicEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.Catalyst.Protocol.Transaction.PublicEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.Catalyst.Protocol.Transaction.PublicEntry}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.addPublicEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.Catalyst.Protocol.Transaction.PublicEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.clearPublicEntriesList = function() {
  return this.setPublicEntriesList([]);
};


/**
 * repeated Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;
 * @return {!Array<!proto.Catalyst.Protocol.Transaction.ConfidentialEntry>}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getConfidentialEntriesList = function() {
  return /** @type{!Array<!proto.Catalyst.Protocol.Transaction.ConfidentialEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, Transaction_pb.ConfidentialEntry, 6));
};


/**
 * @param {!Array<!proto.Catalyst.Protocol.Transaction.ConfidentialEntry>} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
*/
proto.Catalyst.Protocol.Deltas.Delta.prototype.setConfidentialEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.Catalyst.Protocol.Transaction.ConfidentialEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.Catalyst.Protocol.Transaction.ConfidentialEntry}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.addConfidentialEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.Catalyst.Protocol.Transaction.ConfidentialEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.clearConfidentialEntriesList = function() {
  return this.setConfidentialEntriesList([]);
};


/**
 * repeated Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;
 * @return {!Array<!proto.Catalyst.Protocol.Transaction.CoinbaseEntry>}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getCoinbaseEntriesList = function() {
  return /** @type{!Array<!proto.Catalyst.Protocol.Transaction.CoinbaseEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, Transaction_pb.CoinbaseEntry, 7));
};


/**
 * @param {!Array<!proto.Catalyst.Protocol.Transaction.CoinbaseEntry>} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
*/
proto.Catalyst.Protocol.Deltas.Delta.prototype.setCoinbaseEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.Catalyst.Protocol.Transaction.CoinbaseEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.Catalyst.Protocol.Transaction.CoinbaseEntry}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.addCoinbaseEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.Catalyst.Protocol.Transaction.CoinbaseEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.clearCoinbaseEntriesList = function() {
  return this.setCoinbaseEntriesList([]);
};


/**
 * optional bytes state_root = 8;
 * @return {!(string|Uint8Array)}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getStateRoot = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes state_root = 8;
 * This is a type-conversion wrapper around `getStateRoot()`
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getStateRoot_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getStateRoot()));
};


/**
 * optional bytes state_root = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getStateRoot()`
 * @return {!Uint8Array}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getStateRoot_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getStateRoot()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setStateRoot = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};


/**
 * optional int64 delta_number = 9;
 * @return {number}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getDeltaNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.Catalyst.Protocol.Deltas.Delta} returns this
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setDeltaNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


goog.object.extend(exports, proto.Catalyst.Protocol.Deltas);
