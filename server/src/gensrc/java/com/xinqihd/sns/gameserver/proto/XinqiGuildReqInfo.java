// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GuildReqInfo.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiGuildReqInfo {
  private XinqiGuildReqInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GuildReqInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 guildID = 1;
    boolean hasGuildID();
    int getGuildID();
    
    // optional string guildName = 2;
    boolean hasGuildName();
    String getGuildName();
  }
  public static final class GuildReqInfo extends
      com.google.protobuf.GeneratedMessage
      implements GuildReqInfoOrBuilder {
    // Use GuildReqInfo.newBuilder() to construct.
    private GuildReqInfo(Builder builder) {
      super(builder);
    }
    private GuildReqInfo(boolean noInit) {}
    
    private static final GuildReqInfo defaultInstance;
    public static GuildReqInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public GuildReqInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 guildID = 1;
    public static final int GUILDID_FIELD_NUMBER = 1;
    private int guildID_;
    public boolean hasGuildID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getGuildID() {
      return guildID_;
    }
    
    // optional string guildName = 2;
    public static final int GUILDNAME_FIELD_NUMBER = 2;
    private java.lang.Object guildName_;
    public boolean hasGuildName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getGuildName() {
      java.lang.Object ref = guildName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          guildName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGuildNameBytes() {
      java.lang.Object ref = guildName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        guildName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      guildID_ = 0;
      guildName_ = "";
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
        output.writeInt32(1, guildID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getGuildNameBytes());
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
          .computeInt32Size(1, guildID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getGuildNameBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo.newBuilder()
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
        guildID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        guildName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo build() {
        com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo result = new com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guildID_ = guildID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.guildName_ = guildName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo.getDefaultInstance()) return this;
        if (other.hasGuildID()) {
          setGuildID(other.getGuildID());
        }
        if (other.hasGuildName()) {
          setGuildName(other.getGuildName());
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
            case 8: {
              bitField0_ |= 0x00000001;
              guildID_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              guildName_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 guildID = 1;
      private int guildID_ ;
      public boolean hasGuildID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getGuildID() {
        return guildID_;
      }
      public Builder setGuildID(int value) {
        bitField0_ |= 0x00000001;
        guildID_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guildID_ = 0;
        onChanged();
        return this;
      }
      
      // optional string guildName = 2;
      private java.lang.Object guildName_ = "";
      public boolean hasGuildName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getGuildName() {
        java.lang.Object ref = guildName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          guildName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGuildName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        guildName_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guildName_ = getDefaultInstance().getGuildName();
        onChanged();
        return this;
      }
      void setGuildName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        guildName_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.GuildReqInfo)
    }
    
    static {
      defaultInstance = new GuildReqInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.GuildReqInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GuildReqInfo.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\"2\n\014GuildReqInfo\022\017\n\007guildI" +
      "D\030\001 \001(\005\022\021\n\tguildName\030\002 \001(\tB\023B\021XinqiGuild" +
      "ReqInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_GuildReqInfo_descriptor,
              new java.lang.String[] { "GuildID", "GuildName", },
              com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo.class,
              com.xinqihd.sns.gameserver.proto.XinqiGuildReqInfo.GuildReqInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}