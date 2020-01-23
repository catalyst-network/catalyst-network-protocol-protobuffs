// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Transaction.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30002
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30002 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class GPBTimestamp;
@class RangeProof;
@class Signature;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum TransactionType

typedef GPB_ENUM(TransactionType) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  TransactionType_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  /** Unknown transaction type. */
  TransactionType_TransactionTypeUnknown = 0,

  /** Public transaction type. */
  TransactionType_Public = 1,

  /** Private transaction type. */
  TransactionType_Confidential = 2,
};

GPBEnumDescriptor *TransactionType_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL TransactionType_IsValidValue(int32_t value);

#pragma mark - TransactionRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
@interface TransactionRoot : GPBRootObject
@end

#pragma mark - PublicEntry

typedef GPB_ENUM(PublicEntry_FieldNumber) {
  PublicEntry_FieldNumber_ReceiverAddress = 1,
  PublicEntry_FieldNumber_SenderAddress = 2,
  PublicEntry_FieldNumber_Amount = 3,
  PublicEntry_FieldNumber_Data_p = 4,
  PublicEntry_FieldNumber_Timestamp = 5,
  PublicEntry_FieldNumber_GasPrice = 6,
  PublicEntry_FieldNumber_GasLimit = 7,
  PublicEntry_FieldNumber_TransactionFees = 8,
  PublicEntry_FieldNumber_Nonce = 9,
  PublicEntry_FieldNumber_Signature = 10,
};

@interface PublicEntry : GPBMessage

/** Address of receiver. */
@property(nonatomic, readwrite, copy, null_resettable) NSData *receiverAddress;

/** Address of sender. */
@property(nonatomic, readwrite, copy, null_resettable) NSData *senderAddress;

/** uint256 amount */
@property(nonatomic, readwrite, copy, null_resettable) NSData *amount;

/** Smart contract data. */
@property(nonatomic, readwrite, copy, null_resettable) NSData *data_p;

@property(nonatomic, readwrite, strong, null_resettable) GPBTimestamp *timestamp;
/** Test to see if @c timestamp has been set. */
@property(nonatomic, readwrite) BOOL hasTimestamp;

@property(nonatomic, readwrite, copy, null_resettable) NSData *gasPrice;

@property(nonatomic, readwrite) uint64_t gasLimit;

/** 8 bytes, clear text, fees * 10^12 */
@property(nonatomic, readwrite, copy, null_resettable) NSData *transactionFees;

/** A nonce, similar to Ethereum, incremented on each transaction on the account issuing the transaction */
@property(nonatomic, readwrite) uint64_t nonce;

/** is the ed25519ph context signature */
@property(nonatomic, readwrite, strong, null_resettable) Signature *signature;
/** Test to see if @c signature has been set. */
@property(nonatomic, readwrite) BOOL hasSignature;

@end

#pragma mark - ConfidentialEntry

typedef GPB_ENUM(ConfidentialEntry_FieldNumber) {
  ConfidentialEntry_FieldNumber_ReceiverPublicKey = 1,
  ConfidentialEntry_FieldNumber_SenderPublicKey = 2,
  ConfidentialEntry_FieldNumber_PedersenCommitment = 3,
  ConfidentialEntry_FieldNumber_RangeProof = 4,
  ConfidentialEntry_FieldNumber_TransactionFees = 5,
  ConfidentialEntry_FieldNumber_Nonce = 6,
};

@interface ConfidentialEntry : GPBMessage

/** PublicKey of receiver. */
@property(nonatomic, readwrite, copy, null_resettable) NSData *receiverPublicKey;

/** PublicKey of sender. */
@property(nonatomic, readwrite, copy, null_resettable) NSData *senderPublicKey;

/** 32 bytes */
@property(nonatomic, readwrite, copy, null_resettable) NSData *pedersenCommitment;

@property(nonatomic, readwrite, strong, null_resettable) RangeProof *rangeProof;
/** Test to see if @c rangeProof has been set. */
@property(nonatomic, readwrite) BOOL hasRangeProof;

/** 8 bytes, clear text, fees * 10^12 */
@property(nonatomic, readwrite, copy, null_resettable) NSData *transactionFees;

/** A nonce, similar to Ethereum, incremented on each transaction on the account issuing the transaction */
@property(nonatomic, readwrite) uint64_t nonce;

@end

#pragma mark - CoinbaseEntry

typedef GPB_ENUM(CoinbaseEntry_FieldNumber) {
  CoinbaseEntry_FieldNumber_ReceiverPublicKey = 1,
  CoinbaseEntry_FieldNumber_Amount = 2,
};

@interface CoinbaseEntry : GPBMessage

/** public key behind the address where the Coinbase will be credited */
@property(nonatomic, readwrite, copy, null_resettable) NSData *receiverPublicKey;

/** uint256 amount */
@property(nonatomic, readwrite, copy, null_resettable) NSData *amount;

@end

#pragma mark - RangeProof

typedef GPB_ENUM(RangeProof_FieldNumber) {
  RangeProof_FieldNumber_ValueCommitmentArray = 1,
  RangeProof_FieldNumber_BitCommitment = 2,
  RangeProof_FieldNumber_PerBitBlindingFactorCommitment = 3,
  RangeProof_FieldNumber_PolyCommitmentT1 = 4,
  RangeProof_FieldNumber_PolyCommitmentT2 = 5,
  RangeProof_FieldNumber_ProofOfShareTau = 6,
  RangeProof_FieldNumber_ProofOfShareMu = 7,
  RangeProof_FieldNumber_AggregatedVectorPolynomialLArray = 8,
  RangeProof_FieldNumber_AggregatedVectorPolynomialRArray = 9,
  RangeProof_FieldNumber_APrime0 = 10,
  RangeProof_FieldNumber_BPrime0 = 11,
  RangeProof_FieldNumber_T = 12,
};

/**
 * *
 * BulletProof-based range proof. See https://eprint.iacr.org/2017/1066.pdf for references to equations below.
 * Total byte size is (9+2k)*32, where k = log_2(n*m), m is number of aggregates in proof, (2^n)-1 is upper range of values.
 **/
@interface RangeProof : GPBMessage

/** m * 32 bytes, value commitment (eq. 36) */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSData*> *valueCommitmentArray;
/** The number of items in @c valueCommitmentArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger valueCommitmentArray_Count;

/** 32 bytes, bit commitment (eq. 48) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *bitCommitment;

/** 32 bytes, per bit blinding factor commitment (eq. 48) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *perBitBlindingFactorCommitment;

/** 32 bytes, poly commitment (eq. 54) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *polyCommitmentT1;

/** 32 bytes, poly commitment (eq. 54) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *polyCommitmentT2;

/** 32 bytes, proof of share (eq. 63) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *proofOfShareTau;

/** 32 bytes, proof of share (eq. 63) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *proofOfShareMu;

/** k * 32 bytes, aggregated vector polynomial (eq. 63) */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSData*> *aggregatedVectorPolynomialLArray;
/** The number of items in @c aggregatedVectorPolynomialLArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger aggregatedVectorPolynomialLArray_Count;

/** k * 32 bytes, aggregated vector polynomial (eq. 63) */
@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSData*> *aggregatedVectorPolynomialRArray;
/** The number of items in @c aggregatedVectorPolynomialRArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger aggregatedVectorPolynomialRArray_Count;

/** 32 bytes (eq. 63) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *aPrime0;

/** 32 bytes (eq. 63) */
@property(nonatomic, readwrite, copy, null_resettable) NSData *bPrime0;

@property(nonatomic, readwrite, copy, null_resettable) NSData *t;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
