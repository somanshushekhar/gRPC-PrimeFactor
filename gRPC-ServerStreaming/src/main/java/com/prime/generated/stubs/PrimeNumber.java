// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: primeNumber.proto

package com.prime.generated.stubs;

public final class PrimeNumber {
  private PrimeNumber() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prime_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prime_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_prime_PrimeNumberDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_prime_PrimeNumberDecompositionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021primeNumber.proto\022\005prime\"1\n\037PrimeNumbe" +
      "rDecompositionRequest\022\016\n\006number\030\001 \001(\003\"8\n" +
      " PrimeNumberDecompositionResponse\022\024\n\014pri" +
      "me_factor\030\001 \001(\0032\205\001\n\022PrimeNumberService\022o" +
      "\n\030PrimeNumberDecomposition\022&.prime.Prime" +
      "NumberDecompositionRequest\032\'.prime.Prime" +
      "NumberDecompositionResponse\"\0000\001B\035\n\031com.p" +
      "rime.generated.stubsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_prime_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_prime_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prime_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_prime_PrimeNumberDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_prime_PrimeNumberDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_prime_PrimeNumberDecompositionResponse_descriptor,
        new java.lang.String[] { "PrimeFactor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}