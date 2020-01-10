/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.Catalyst.Protocol.Deltas.Delta');

goog.require('jspb.Message');
goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('proto.Catalyst.Protocol.Transaction.CoinbaseEntry');
goog.require('proto.Catalyst.Protocol.Transaction.ConfidentialEntry');
goog.require('proto.Catalyst.Protocol.Transaction.PublicEntry');
goog.require('proto.google.protobuf.Timestamp');


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
  proto.Catalyst.Protocol.Deltas.Delta.displayName = 'proto.Catalyst.Protocol.Deltas.Delta';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.Catalyst.Protocol.Deltas.Delta.repeatedFields_ = [5,6,7];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.toObject = function(opt_includeInstance) {
  return proto.Catalyst.Protocol.Deltas.Delta.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.Catalyst.Protocol.Deltas.Delta} msg The msg instance to transform.
 * @return {!Object}
 */
proto.Catalyst.Protocol.Deltas.Delta.toObject = function(includeInstance, msg) {
  var f, obj = {
    previousDeltaDfsHash: msg.getPreviousDeltaDfsHash_asB64(),
    merkleRoot: msg.getMerkleRoot_asB64(),
    merklePoda: msg.getMerklePoda_asB64(),
    timeStamp: (f = msg.getTimeStamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    publicEntriesList: jspb.Message.toObjectList(msg.getPublicEntriesList(),
    proto.Catalyst.Protocol.Transaction.PublicEntry.toObject, includeInstance),
    confidentialEntriesList: jspb.Message.toObjectList(msg.getConfidentialEntriesList(),
    proto.Catalyst.Protocol.Transaction.ConfidentialEntry.toObject, includeInstance),
    coinbaseEntriesList: jspb.Message.toObjectList(msg.getCoinbaseEntriesList(),
    proto.Catalyst.Protocol.Transaction.CoinbaseEntry.toObject, includeInstance)
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
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTimeStamp(value);
      break;
    case 5:
      var value = new proto.Catalyst.Protocol.Transaction.PublicEntry;
      reader.readMessage(value,proto.Catalyst.Protocol.Transaction.PublicEntry.deserializeBinaryFromReader);
      msg.addPublicEntries(value);
      break;
    case 6:
      var value = new proto.Catalyst.Protocol.Transaction.ConfidentialEntry;
      reader.readMessage(value,proto.Catalyst.Protocol.Transaction.ConfidentialEntry.deserializeBinaryFromReader);
      msg.addConfidentialEntries(value);
      break;
    case 7:
      var value = new proto.Catalyst.Protocol.Transaction.CoinbaseEntry;
      reader.readMessage(value,proto.Catalyst.Protocol.Transaction.CoinbaseEntry.deserializeBinaryFromReader);
      msg.addCoinbaseEntries(value);
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
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getPublicEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.Catalyst.Protocol.Transaction.PublicEntry.serializeBinaryToWriter
    );
  }
  f = message.getConfidentialEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.Catalyst.Protocol.Transaction.ConfidentialEntry.serializeBinaryToWriter
    );
  }
  f = message.getCoinbaseEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.Catalyst.Protocol.Transaction.CoinbaseEntry.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes previous_delta_dfs_hash = 1;
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getPreviousDeltaDfsHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
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


/** @param {!(string|Uint8Array)} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setPreviousDeltaDfsHash = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * optional bytes merkle_root = 2;
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerkleRoot = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
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


/** @param {!(string|Uint8Array)} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setMerkleRoot = function(value) {
  jspb.Message.setField(this, 2, value);
};


/**
 * optional bytes merkle_poda = 3;
 * @return {string}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getMerklePoda = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
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


/** @param {!(string|Uint8Array)} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setMerklePoda = function(value) {
  jspb.Message.setField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp time_stamp = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getTimeStamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/** @param {?proto.google.protobuf.Timestamp|undefined} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setTimeStamp = function(value) {
  jspb.Message.setWrapperField(this, 4, value);
};


proto.Catalyst.Protocol.Deltas.Delta.prototype.clearTimeStamp = function() {
  this.setTimeStamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {!boolean}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.hasTimeStamp = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated Catalyst.Protocol.Transaction.PublicEntry public_entries = 5;
 * If you change this array by adding, removing or replacing elements, or if you
 * replace the array itself, then you must call the setter to update it.
 * @return {!Array.<!proto.Catalyst.Protocol.Transaction.PublicEntry>}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getPublicEntriesList = function() {
  return /** @type{!Array.<!proto.Catalyst.Protocol.Transaction.PublicEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.Catalyst.Protocol.Transaction.PublicEntry, 5));
};


/** @param {!Array.<!proto.Catalyst.Protocol.Transaction.PublicEntry>} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setPublicEntriesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.Catalyst.Protocol.Transaction.PublicEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.Catalyst.Protocol.Transaction.PublicEntry}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.addPublicEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.Catalyst.Protocol.Transaction.PublicEntry, opt_index);
};


proto.Catalyst.Protocol.Deltas.Delta.prototype.clearPublicEntriesList = function() {
  this.setPublicEntriesList([]);
};


/**
 * repeated Catalyst.Protocol.Transaction.ConfidentialEntry confidential_entries = 6;
 * If you change this array by adding, removing or replacing elements, or if you
 * replace the array itself, then you must call the setter to update it.
 * @return {!Array.<!proto.Catalyst.Protocol.Transaction.ConfidentialEntry>}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getConfidentialEntriesList = function() {
  return /** @type{!Array.<!proto.Catalyst.Protocol.Transaction.ConfidentialEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.Catalyst.Protocol.Transaction.ConfidentialEntry, 6));
};


/** @param {!Array.<!proto.Catalyst.Protocol.Transaction.ConfidentialEntry>} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setConfidentialEntriesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.Catalyst.Protocol.Transaction.ConfidentialEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.Catalyst.Protocol.Transaction.ConfidentialEntry}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.addConfidentialEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.Catalyst.Protocol.Transaction.ConfidentialEntry, opt_index);
};


proto.Catalyst.Protocol.Deltas.Delta.prototype.clearConfidentialEntriesList = function() {
  this.setConfidentialEntriesList([]);
};


/**
 * repeated Catalyst.Protocol.Transaction.CoinbaseEntry coinbase_entries = 7;
 * If you change this array by adding, removing or replacing elements, or if you
 * replace the array itself, then you must call the setter to update it.
 * @return {!Array.<!proto.Catalyst.Protocol.Transaction.CoinbaseEntry>}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.getCoinbaseEntriesList = function() {
  return /** @type{!Array.<!proto.Catalyst.Protocol.Transaction.CoinbaseEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.Catalyst.Protocol.Transaction.CoinbaseEntry, 7));
};


/** @param {!Array.<!proto.Catalyst.Protocol.Transaction.CoinbaseEntry>} value */
proto.Catalyst.Protocol.Deltas.Delta.prototype.setCoinbaseEntriesList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.Catalyst.Protocol.Transaction.CoinbaseEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.Catalyst.Protocol.Transaction.CoinbaseEntry}
 */
proto.Catalyst.Protocol.Deltas.Delta.prototype.addCoinbaseEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.Catalyst.Protocol.Transaction.CoinbaseEntry, opt_index);
};


proto.Catalyst.Protocol.Deltas.Delta.prototype.clearCoinbaseEntriesList = function() {
  this.setCoinbaseEntriesList([]);
};

