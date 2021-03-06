package com.jsoniter.benchmark.with_int_list;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Pb.proto

public final class Pb {
  private Pb() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PbTestObjectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PbTestObject)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 field1 = 1 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getField1List();
    /**
     * <code>repeated int32 field1 = 1 [packed = true];</code>
     */
    int getField1Count();
    /**
     * <code>repeated int32 field1 = 1 [packed = true];</code>
     */
    int getField1(int index);
  }
  /**
   * Protobuf type {@code PbTestObject}
   */
  public  static final class PbTestObject extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PbTestObject)
      PbTestObjectOrBuilder {
    // Use PbTestObject.newBuilder() to construct.
    private PbTestObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PbTestObject() {
      field1_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private PbTestObject(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                field1_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              field1_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                field1_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                field1_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          field1_ = java.util.Collections.unmodifiableList(field1_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Pb.internal_static_PbTestObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Pb.internal_static_PbTestObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Pb.PbTestObject.class, Pb.PbTestObject.Builder.class);
    }

    public static final int FIELD1_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> field1_;
    /**
     * <code>repeated int32 field1 = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getField1List() {
      return field1_;
    }
    /**
     * <code>repeated int32 field1 = 1 [packed = true];</code>
     */
    public int getField1Count() {
      return field1_.size();
    }
    /**
     * <code>repeated int32 field1 = 1 [packed = true];</code>
     */
    public int getField1(int index) {
      return field1_.get(index);
    }
    private int field1MemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getField1List().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(field1MemoizedSerializedSize);
      }
      for (int i = 0; i < field1_.size(); i++) {
        output.writeInt32NoTag(field1_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < field1_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(field1_.get(i));
        }
        size += dataSize;
        if (!getField1List().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        field1MemoizedSerializedSize = dataSize;
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Pb.PbTestObject)) {
        return super.equals(obj);
      }
      Pb.PbTestObject other = (Pb.PbTestObject) obj;

      boolean result = true;
      result = result && getField1List()
          .equals(other.getField1List());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getField1Count() > 0) {
        hash = (37 * hash) + FIELD1_FIELD_NUMBER;
        hash = (53 * hash) + getField1List().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Pb.PbTestObject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Pb.PbTestObject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Pb.PbTestObject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Pb.PbTestObject parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Pb.PbTestObject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Pb.PbTestObject parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Pb.PbTestObject parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Pb.PbTestObject parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Pb.PbTestObject parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Pb.PbTestObject parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Pb.PbTestObject prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PbTestObject}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PbTestObject)
        Pb.PbTestObjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Pb.internal_static_PbTestObject_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Pb.internal_static_PbTestObject_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Pb.PbTestObject.class, Pb.PbTestObject.Builder.class);
      }

      // Construct using Pb.PbTestObject.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        field1_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Pb.internal_static_PbTestObject_descriptor;
      }

      public Pb.PbTestObject getDefaultInstanceForType() {
        return Pb.PbTestObject.getDefaultInstance();
      }

      public Pb.PbTestObject build() {
        Pb.PbTestObject result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Pb.PbTestObject buildPartial() {
        Pb.PbTestObject result = new Pb.PbTestObject(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          field1_ = java.util.Collections.unmodifiableList(field1_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.field1_ = field1_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Pb.PbTestObject) {
          return mergeFrom((Pb.PbTestObject)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Pb.PbTestObject other) {
        if (other == Pb.PbTestObject.getDefaultInstance()) return this;
        if (!other.field1_.isEmpty()) {
          if (field1_.isEmpty()) {
            field1_ = other.field1_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureField1IsMutable();
            field1_.addAll(other.field1_);
          }
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Pb.PbTestObject parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Pb.PbTestObject) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> field1_ = java.util.Collections.emptyList();
      private void ensureField1IsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          field1_ = new java.util.ArrayList<java.lang.Integer>(field1_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getField1List() {
        return java.util.Collections.unmodifiableList(field1_);
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public int getField1Count() {
        return field1_.size();
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public int getField1(int index) {
        return field1_.get(index);
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public Builder setField1(
          int index, int value) {
        ensureField1IsMutable();
        field1_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public Builder addField1(int value) {
        ensureField1IsMutable();
        field1_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public Builder addAllField1(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureField1IsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, field1_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 field1 = 1 [packed = true];</code>
       */
      public Builder clearField1() {
        field1_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:PbTestObject)
    }

    // @@protoc_insertion_point(class_scope:PbTestObject)
    private static final Pb.PbTestObject DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Pb.PbTestObject();
    }

    public static Pb.PbTestObject getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PbTestObject>
        PARSER = new com.google.protobuf.AbstractParser<PbTestObject>() {
      public PbTestObject parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new PbTestObject(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PbTestObject> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PbTestObject> getParserForType() {
      return PARSER;
    }

    public Pb.PbTestObject getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PbTestObject_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PbTestObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010Pb.proto\"\"\n\014PbTestObject\022\022\n\006field1\030\001 \003" +
      "(\005B\002\020\001B\002H\001b\006proto3"
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
    internal_static_PbTestObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PbTestObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PbTestObject_descriptor,
        new java.lang.String[] { "Field1", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
