// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseGuildContributeQuery.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseGuildContributeQuery {
  private XinqiBseGuildContributeQuery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseGuildContributeQueryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string guildID = 1;
    boolean hasGuildID();
    String getGuildID();
    
    // optional uint32 wealth = 2;
    boolean hasWealth();
    int getWealth();
    
    // optional uint32 credit = 3;
    boolean hasCredit();
    int getCredit();
    
    // optional uint32 goldenwealth = 4;
    boolean hasGoldenwealth();
    int getGoldenwealth();
    
    // optional uint32 goldencredit = 5;
    boolean hasGoldencredit();
    int getGoldencredit();
    
    // optional uint32 guildwealth = 8;
    boolean hasGuildwealth();
    int getGuildwealth();
    
    // optional uint32 mycredit = 9;
    boolean hasMycredit();
    int getMycredit();
  }
  public static final class BseGuildContributeQuery extends
      com.google.protobuf.GeneratedMessage
      implements BseGuildContributeQueryOrBuilder {
    // Use BseGuildContributeQuery.newBuilder() to construct.
    private BseGuildContributeQuery(Builder builder) {
      super(builder);
    }
    private BseGuildContributeQuery(boolean noInit) {}
    
    private static final BseGuildContributeQuery defaultInstance;
    public static BseGuildContributeQuery getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseGuildContributeQuery getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string guildID = 1;
    public static final int GUILDID_FIELD_NUMBER = 1;
    private java.lang.Object guildID_;
    public boolean hasGuildID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getGuildID() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          guildID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGuildIDBytes() {
      java.lang.Object ref = guildID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        guildID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional uint32 wealth = 2;
    public static final int WEALTH_FIELD_NUMBER = 2;
    private int wealth_;
    public boolean hasWealth() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getWealth() {
      return wealth_;
    }
    
    // optional uint32 credit = 3;
    public static final int CREDIT_FIELD_NUMBER = 3;
    private int credit_;
    public boolean hasCredit() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getCredit() {
      return credit_;
    }
    
    // optional uint32 goldenwealth = 4;
    public static final int GOLDENWEALTH_FIELD_NUMBER = 4;
    private int goldenwealth_;
    public boolean hasGoldenwealth() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getGoldenwealth() {
      return goldenwealth_;
    }
    
    // optional uint32 goldencredit = 5;
    public static final int GOLDENCREDIT_FIELD_NUMBER = 5;
    private int goldencredit_;
    public boolean hasGoldencredit() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getGoldencredit() {
      return goldencredit_;
    }
    
    // optional uint32 guildwealth = 8;
    public static final int GUILDWEALTH_FIELD_NUMBER = 8;
    private int guildwealth_;
    public boolean hasGuildwealth() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getGuildwealth() {
      return guildwealth_;
    }
    
    // optional uint32 mycredit = 9;
    public static final int MYCREDIT_FIELD_NUMBER = 9;
    private int mycredit_;
    public boolean hasMycredit() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getMycredit() {
      return mycredit_;
    }
    
    private void initFields() {
      guildID_ = "";
      wealth_ = 0;
      credit_ = 0;
      goldenwealth_ = 0;
      goldencredit_ = 0;
      guildwealth_ = 0;
      mycredit_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getGuildIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, wealth_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, credit_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, goldenwealth_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, goldencredit_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(8, guildwealth_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt32(9, mycredit_);
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
          .computeBytesSize(1, getGuildIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, wealth_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, credit_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, goldenwealth_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, goldencredit_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, guildwealth_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, mycredit_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        guildID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        wealth_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        credit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        goldenwealth_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        goldencredit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        guildwealth_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        mycredit_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery result = new com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guildID_ = guildID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.wealth_ = wealth_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.credit_ = credit_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.goldenwealth_ = goldenwealth_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.goldencredit_ = goldencredit_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.guildwealth_ = guildwealth_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.mycredit_ = mycredit_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery.getDefaultInstance()) return this;
        if (other.hasGuildID()) {
          setGuildID(other.getGuildID());
        }
        if (other.hasWealth()) {
          setWealth(other.getWealth());
        }
        if (other.hasCredit()) {
          setCredit(other.getCredit());
        }
        if (other.hasGoldenwealth()) {
          setGoldenwealth(other.getGoldenwealth());
        }
        if (other.hasGoldencredit()) {
          setGoldencredit(other.getGoldencredit());
        }
        if (other.hasGuildwealth()) {
          setGuildwealth(other.getGuildwealth());
        }
        if (other.hasMycredit()) {
          setMycredit(other.getMycredit());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              bitField0_ |= 0x00000001;
              guildID_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              wealth_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              credit_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              goldenwealth_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              goldencredit_ = input.readUInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000020;
              guildwealth_ = input.readUInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000040;
              mycredit_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string guildID = 1;
      private java.lang.Object guildID_ = "";
      public boolean hasGuildID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getGuildID() {
        java.lang.Object ref = guildID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          guildID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGuildID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guildID_ = getDefaultInstance().getGuildID();
        onChanged();
        return this;
      }
      void setGuildID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
      }
      
      // optional uint32 wealth = 2;
      private int wealth_ ;
      public boolean hasWealth() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getWealth() {
        return wealth_;
      }
      public Builder setWealth(int value) {
        bitField0_ |= 0x00000002;
        wealth_ = value;
        onChanged();
        return this;
      }
      public Builder clearWealth() {
        bitField0_ = (bitField0_ & ~0x00000002);
        wealth_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 credit = 3;
      private int credit_ ;
      public boolean hasCredit() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getCredit() {
        return credit_;
      }
      public Builder setCredit(int value) {
        bitField0_ |= 0x00000004;
        credit_ = value;
        onChanged();
        return this;
      }
      public Builder clearCredit() {
        bitField0_ = (bitField0_ & ~0x00000004);
        credit_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 goldenwealth = 4;
      private int goldenwealth_ ;
      public boolean hasGoldenwealth() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getGoldenwealth() {
        return goldenwealth_;
      }
      public Builder setGoldenwealth(int value) {
        bitField0_ |= 0x00000008;
        goldenwealth_ = value;
        onChanged();
        return this;
      }
      public Builder clearGoldenwealth() {
        bitField0_ = (bitField0_ & ~0x00000008);
        goldenwealth_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 goldencredit = 5;
      private int goldencredit_ ;
      public boolean hasGoldencredit() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getGoldencredit() {
        return goldencredit_;
      }
      public Builder setGoldencredit(int value) {
        bitField0_ |= 0x00000010;
        goldencredit_ = value;
        onChanged();
        return this;
      }
      public Builder clearGoldencredit() {
        bitField0_ = (bitField0_ & ~0x00000010);
        goldencredit_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 guildwealth = 8;
      private int guildwealth_ ;
      public boolean hasGuildwealth() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getGuildwealth() {
        return guildwealth_;
      }
      public Builder setGuildwealth(int value) {
        bitField0_ |= 0x00000020;
        guildwealth_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildwealth() {
        bitField0_ = (bitField0_ & ~0x00000020);
        guildwealth_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 mycredit = 9;
      private int mycredit_ ;
      public boolean hasMycredit() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getMycredit() {
        return mycredit_;
      }
      public Builder setMycredit(int value) {
        bitField0_ |= 0x00000040;
        mycredit_ = value;
        onChanged();
        return this;
      }
      public Builder clearMycredit() {
        bitField0_ = (bitField0_ & ~0x00000040);
        mycredit_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseGuildContributeQuery)
    }
    
    static {
      defaultInstance = new BseGuildContributeQuery(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseGuildContributeQuery)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035BseGuildContributeQuery.proto\022 com.xin" +
      "qihd.sns.gameserver.proto\032\017GuildInfo.pro" +
      "to\"\235\001\n\027BseGuildContributeQuery\022\017\n\007guildI" +
      "D\030\001 \001(\t\022\016\n\006wealth\030\002 \001(\r\022\016\n\006credit\030\003 \001(\r\022" +
      "\024\n\014goldenwealth\030\004 \001(\r\022\024\n\014goldencredit\030\005 " +
      "\001(\r\022\023\n\013guildwealth\030\010 \001(\r\022\020\n\010mycredit\030\t \001" +
      "(\rB\036B\034XinqiBseGuildContributeQuery"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseGuildContributeQuery_descriptor,
              new java.lang.String[] { "GuildID", "Wealth", "Credit", "Goldenwealth", "Goldencredit", "Guildwealth", "Mycredit", },
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildContributeQuery.BseGuildContributeQuery.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiGuildInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
