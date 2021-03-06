// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceSendGift.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceSendGift {
  private XinqiBceSendGift() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceSendGiftOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .com.xinqihd.sns.gameserver.proto.Gift gift = 1;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift> 
        getGiftList();
    com.xinqihd.sns.gameserver.proto.XinqiGift.Gift getGift(int index);
    int getGiftCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder> 
        getGiftOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder getGiftOrBuilder(
        int index);
    
    // required string fromUserName = 2;
    boolean hasFromUserName();
    String getFromUserName();
    
    // required string toUserIdStr = 3;
    boolean hasToUserIdStr();
    String getToUserIdStr();
  }
  public static final class BceSendGift extends
      com.google.protobuf.GeneratedMessage
      implements BceSendGiftOrBuilder {
    // Use BceSendGift.newBuilder() to construct.
    private BceSendGift(Builder builder) {
      super(builder);
    }
    private BceSendGift(boolean noInit) {}
    
    private static final BceSendGift defaultInstance;
    public static BceSendGift getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceSendGift getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_fieldAccessorTable;
    }
    
    private int bitField0_;
    // repeated .com.xinqihd.sns.gameserver.proto.Gift gift = 1;
    public static final int GIFT_FIELD_NUMBER = 1;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift> gift_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift> getGiftList() {
      return gift_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder> 
        getGiftOrBuilderList() {
      return gift_;
    }
    public int getGiftCount() {
      return gift_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGift.Gift getGift(int index) {
      return gift_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder getGiftOrBuilder(
        int index) {
      return gift_.get(index);
    }
    
    // required string fromUserName = 2;
    public static final int FROMUSERNAME_FIELD_NUMBER = 2;
    private java.lang.Object fromUserName_;
    public boolean hasFromUserName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getFromUserName() {
      java.lang.Object ref = fromUserName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          fromUserName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFromUserNameBytes() {
      java.lang.Object ref = fromUserName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        fromUserName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string toUserIdStr = 3;
    public static final int TOUSERIDSTR_FIELD_NUMBER = 3;
    private java.lang.Object toUserIdStr_;
    public boolean hasToUserIdStr() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getToUserIdStr() {
      java.lang.Object ref = toUserIdStr_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          toUserIdStr_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getToUserIdStrBytes() {
      java.lang.Object ref = toUserIdStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        toUserIdStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      gift_ = java.util.Collections.emptyList();
      fromUserName_ = "";
      toUserIdStr_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasFromUserName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasToUserIdStr()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getGiftCount(); i++) {
        if (!getGift(i).isInitialized()) {
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
      for (int i = 0; i < gift_.size(); i++) {
        output.writeMessage(1, gift_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getFromUserNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(3, getToUserIdStrBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < gift_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, gift_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFromUserNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getToUserIdStrBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGiftOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getGiftFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (giftBuilder_ == null) {
          gift_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          giftBuilder_.clear();
        }
        fromUserName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        toUserIdStr_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift result = new com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (giftBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            gift_ = java.util.Collections.unmodifiableList(gift_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.gift_ = gift_;
        } else {
          result.gift_ = giftBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fromUserName_ = fromUserName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.toUserIdStr_ = toUserIdStr_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift.getDefaultInstance()) return this;
        if (giftBuilder_ == null) {
          if (!other.gift_.isEmpty()) {
            if (gift_.isEmpty()) {
              gift_ = other.gift_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureGiftIsMutable();
              gift_.addAll(other.gift_);
            }
            onChanged();
          }
        } else {
          if (!other.gift_.isEmpty()) {
            if (giftBuilder_.isEmpty()) {
              giftBuilder_.dispose();
              giftBuilder_ = null;
              gift_ = other.gift_;
              bitField0_ = (bitField0_ & ~0x00000001);
              giftBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getGiftFieldBuilder() : null;
            } else {
              giftBuilder_.addAllMessages(other.gift_);
            }
          }
        }
        if (other.hasFromUserName()) {
          setFromUserName(other.getFromUserName());
        }
        if (other.hasToUserIdStr()) {
          setToUserIdStr(other.getToUserIdStr());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasFromUserName()) {
          
          return false;
        }
        if (!hasToUserIdStr()) {
          
          return false;
        }
        for (int i = 0; i < getGiftCount(); i++) {
          if (!getGift(i).isInitialized()) {
            
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
            case 10: {
              com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addGift(subBuilder.buildPartial());
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              fromUserName_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              toUserIdStr_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .com.xinqihd.sns.gameserver.proto.Gift gift = 1;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift> gift_ =
        java.util.Collections.emptyList();
      private void ensureGiftIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          gift_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift>(gift_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGift.Gift, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder, com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder> giftBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift> getGiftList() {
        if (giftBuilder_ == null) {
          return java.util.Collections.unmodifiableList(gift_);
        } else {
          return giftBuilder_.getMessageList();
        }
      }
      public int getGiftCount() {
        if (giftBuilder_ == null) {
          return gift_.size();
        } else {
          return giftBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGift.Gift getGift(int index) {
        if (giftBuilder_ == null) {
          return gift_.get(index);
        } else {
          return giftBuilder_.getMessage(index);
        }
      }
      public Builder setGift(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift value) {
        if (giftBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGiftIsMutable();
          gift_.set(index, value);
          onChanged();
        } else {
          giftBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setGift(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder builderForValue) {
        if (giftBuilder_ == null) {
          ensureGiftIsMutable();
          gift_.set(index, builderForValue.build());
          onChanged();
        } else {
          giftBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addGift(com.xinqihd.sns.gameserver.proto.XinqiGift.Gift value) {
        if (giftBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGiftIsMutable();
          gift_.add(value);
          onChanged();
        } else {
          giftBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addGift(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift value) {
        if (giftBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGiftIsMutable();
          gift_.add(index, value);
          onChanged();
        } else {
          giftBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addGift(
          com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder builderForValue) {
        if (giftBuilder_ == null) {
          ensureGiftIsMutable();
          gift_.add(builderForValue.build());
          onChanged();
        } else {
          giftBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addGift(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder builderForValue) {
        if (giftBuilder_ == null) {
          ensureGiftIsMutable();
          gift_.add(index, builderForValue.build());
          onChanged();
        } else {
          giftBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllGift(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiGift.Gift> values) {
        if (giftBuilder_ == null) {
          ensureGiftIsMutable();
          super.addAll(values, gift_);
          onChanged();
        } else {
          giftBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearGift() {
        if (giftBuilder_ == null) {
          gift_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          giftBuilder_.clear();
        }
        return this;
      }
      public Builder removeGift(int index) {
        if (giftBuilder_ == null) {
          ensureGiftIsMutable();
          gift_.remove(index);
          onChanged();
        } else {
          giftBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder getGiftBuilder(
          int index) {
        return getGiftFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder getGiftOrBuilder(
          int index) {
        if (giftBuilder_ == null) {
          return gift_.get(index);  } else {
          return giftBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder> 
           getGiftOrBuilderList() {
        if (giftBuilder_ != null) {
          return giftBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(gift_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder addGiftBuilder() {
        return getGiftFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder addGiftBuilder(
          int index) {
        return getGiftFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder> 
           getGiftBuilderList() {
        return getGiftFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGift.Gift, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder, com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder> 
          getGiftFieldBuilder() {
        if (giftBuilder_ == null) {
          giftBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiGift.Gift, com.xinqihd.sns.gameserver.proto.XinqiGift.Gift.Builder, com.xinqihd.sns.gameserver.proto.XinqiGift.GiftOrBuilder>(
                  gift_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          gift_ = null;
        }
        return giftBuilder_;
      }
      
      // required string fromUserName = 2;
      private java.lang.Object fromUserName_ = "";
      public boolean hasFromUserName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getFromUserName() {
        java.lang.Object ref = fromUserName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          fromUserName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFromUserName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        fromUserName_ = value;
        onChanged();
        return this;
      }
      public Builder clearFromUserName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fromUserName_ = getDefaultInstance().getFromUserName();
        onChanged();
        return this;
      }
      void setFromUserName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        fromUserName_ = value;
        onChanged();
      }
      
      // required string toUserIdStr = 3;
      private java.lang.Object toUserIdStr_ = "";
      public boolean hasToUserIdStr() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getToUserIdStr() {
        java.lang.Object ref = toUserIdStr_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          toUserIdStr_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setToUserIdStr(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        toUserIdStr_ = value;
        onChanged();
        return this;
      }
      public Builder clearToUserIdStr() {
        bitField0_ = (bitField0_ & ~0x00000004);
        toUserIdStr_ = getDefaultInstance().getToUserIdStr();
        onChanged();
        return this;
      }
      void setToUserIdStr(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        toUserIdStr_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceSendGift)
    }
    
    static {
      defaultInstance = new BceSendGift(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceSendGift)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BceSendGift.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\032\nGift.proto\"n\n\013BceSendGift" +
      "\0224\n\004gift\030\001 \003(\0132&.com.xinqihd.sns.gameser" +
      "ver.proto.Gift\022\024\n\014fromUserName\030\002 \002(\t\022\023\n\013" +
      "toUserIdStr\030\003 \002(\tB\022B\020XinqiBceSendGift"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceSendGift_descriptor,
              new java.lang.String[] { "Gift", "FromUserName", "ToUserIdStr", },
              com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceSendGift.BceSendGift.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiGift.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
