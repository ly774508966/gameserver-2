// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseArrangeList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseArrangeList {
  private XinqiBseArrangeList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseArrangeListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 totalnum = 1;
    boolean hasTotalnum();
    int getTotalnum();
    
    // repeated .com.xinqihd.sns.gameserver.proto.ArrangeInfo arrInfo = 2;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo> 
        getArrInfoList();
    com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo getArrInfo(int index);
    int getArrInfoCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder> 
        getArrInfoOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder getArrInfoOrBuilder(
        int index);
  }
  public static final class BseArrangeList extends
      com.google.protobuf.GeneratedMessage
      implements BseArrangeListOrBuilder {
    // Use BseArrangeList.newBuilder() to construct.
    private BseArrangeList(Builder builder) {
      super(builder);
    }
    private BseArrangeList(boolean noInit) {}
    
    private static final BseArrangeList defaultInstance;
    public static BseArrangeList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseArrangeList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 totalnum = 1;
    public static final int TOTALNUM_FIELD_NUMBER = 1;
    private int totalnum_;
    public boolean hasTotalnum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getTotalnum() {
      return totalnum_;
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.ArrangeInfo arrInfo = 2;
    public static final int ARRINFO_FIELD_NUMBER = 2;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo> arrInfo_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo> getArrInfoList() {
      return arrInfo_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder> 
        getArrInfoOrBuilderList() {
      return arrInfo_;
    }
    public int getArrInfoCount() {
      return arrInfo_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo getArrInfo(int index) {
      return arrInfo_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder getArrInfoOrBuilder(
        int index) {
      return arrInfo_.get(index);
    }
    
    private void initFields() {
      totalnum_ = 0;
      arrInfo_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTotalnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getArrInfoCount(); i++) {
        if (!getArrInfo(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, totalnum_);
      }
      for (int i = 0; i < arrInfo_.size(); i++) {
        output.writeMessage(2, arrInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, totalnum_);
      }
      for (int i = 0; i < arrInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, arrInfo_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getArrInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        totalnum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (arrInfoBuilder_ == null) {
          arrInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          arrInfoBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList result = new com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.totalnum_ = totalnum_;
        if (arrInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            arrInfo_ = java.util.Collections.unmodifiableList(arrInfo_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.arrInfo_ = arrInfo_;
        } else {
          result.arrInfo_ = arrInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList.getDefaultInstance()) return this;
        if (other.hasTotalnum()) {
          setTotalnum(other.getTotalnum());
        }
        if (arrInfoBuilder_ == null) {
          if (!other.arrInfo_.isEmpty()) {
            if (arrInfo_.isEmpty()) {
              arrInfo_ = other.arrInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureArrInfoIsMutable();
              arrInfo_.addAll(other.arrInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.arrInfo_.isEmpty()) {
            if (arrInfoBuilder_.isEmpty()) {
              arrInfoBuilder_.dispose();
              arrInfoBuilder_ = null;
              arrInfo_ = other.arrInfo_;
              bitField0_ = (bitField0_ & ~0x00000002);
              arrInfoBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getArrInfoFieldBuilder() : null;
            } else {
              arrInfoBuilder_.addAllMessages(other.arrInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTotalnum()) {
          
          return false;
        }
        for (int i = 0; i < getArrInfoCount(); i++) {
          if (!getArrInfo(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              totalnum_ = input.readInt32();
              break;
            }
            case 18: {
              com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addArrInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 totalnum = 1;
      private int totalnum_ ;
      public boolean hasTotalnum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getTotalnum() {
        return totalnum_;
      }
      public Builder setTotalnum(int value) {
        bitField0_ |= 0x00000001;
        totalnum_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalnum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        totalnum_ = 0;
        onChanged();
        return this;
      }
      
      // repeated .com.xinqihd.sns.gameserver.proto.ArrangeInfo arrInfo = 2;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo> arrInfo_ =
        java.util.Collections.emptyList();
      private void ensureArrInfoIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          arrInfo_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo>(arrInfo_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder> arrInfoBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo> getArrInfoList() {
        if (arrInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(arrInfo_);
        } else {
          return arrInfoBuilder_.getMessageList();
        }
      }
      public int getArrInfoCount() {
        if (arrInfoBuilder_ == null) {
          return arrInfo_.size();
        } else {
          return arrInfoBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo getArrInfo(int index) {
        if (arrInfoBuilder_ == null) {
          return arrInfo_.get(index);
        } else {
          return arrInfoBuilder_.getMessage(index);
        }
      }
      public Builder setArrInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo value) {
        if (arrInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArrInfoIsMutable();
          arrInfo_.set(index, value);
          onChanged();
        } else {
          arrInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setArrInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder builderForValue) {
        if (arrInfoBuilder_ == null) {
          ensureArrInfoIsMutable();
          arrInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          arrInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addArrInfo(com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo value) {
        if (arrInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArrInfoIsMutable();
          arrInfo_.add(value);
          onChanged();
        } else {
          arrInfoBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addArrInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo value) {
        if (arrInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArrInfoIsMutable();
          arrInfo_.add(index, value);
          onChanged();
        } else {
          arrInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addArrInfo(
          com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder builderForValue) {
        if (arrInfoBuilder_ == null) {
          ensureArrInfoIsMutable();
          arrInfo_.add(builderForValue.build());
          onChanged();
        } else {
          arrInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addArrInfo(
          int index, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder builderForValue) {
        if (arrInfoBuilder_ == null) {
          ensureArrInfoIsMutable();
          arrInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          arrInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllArrInfo(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo> values) {
        if (arrInfoBuilder_ == null) {
          ensureArrInfoIsMutable();
          super.addAll(values, arrInfo_);
          onChanged();
        } else {
          arrInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearArrInfo() {
        if (arrInfoBuilder_ == null) {
          arrInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          arrInfoBuilder_.clear();
        }
        return this;
      }
      public Builder removeArrInfo(int index) {
        if (arrInfoBuilder_ == null) {
          ensureArrInfoIsMutable();
          arrInfo_.remove(index);
          onChanged();
        } else {
          arrInfoBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder getArrInfoBuilder(
          int index) {
        return getArrInfoFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder getArrInfoOrBuilder(
          int index) {
        if (arrInfoBuilder_ == null) {
          return arrInfo_.get(index);  } else {
          return arrInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder> 
           getArrInfoOrBuilderList() {
        if (arrInfoBuilder_ != null) {
          return arrInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(arrInfo_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder addArrInfoBuilder() {
        return getArrInfoFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder addArrInfoBuilder(
          int index) {
        return getArrInfoFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder> 
           getArrInfoBuilderList() {
        return getArrInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder> 
          getArrInfoFieldBuilder() {
        if (arrInfoBuilder_ == null) {
          arrInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder>(
                  arrInfo_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          arrInfo_ = null;
        }
        return arrInfoBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseArrangeList)
    }
    
    static {
      defaultInstance = new BseArrangeList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseArrangeList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BseArrangeList.proto\022 com.xinqihd.sns." +
      "gameserver.proto\032\021ArrangeInfo.proto\"b\n\016B" +
      "seArrangeList\022\020\n\010totalnum\030\001 \002(\005\022>\n\007arrIn" +
      "fo\030\002 \003(\0132-.com.xinqihd.sns.gameserver.pr" +
      "oto.ArrangeInfoB\025B\023XinqiBseArrangeList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseArrangeList_descriptor,
              new java.lang.String[] { "Totalnum", "ArrInfo", },
              com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseArrangeList.BseArrangeList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}