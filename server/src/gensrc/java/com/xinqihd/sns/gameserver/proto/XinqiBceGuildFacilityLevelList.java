// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceGuildFacilityLevelList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceGuildFacilityLevelList {
  private XinqiBceGuildFacilityLevelList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceGuildFacilityLevelListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  public static final class BceGuildFacilityLevelList extends
      com.google.protobuf.GeneratedMessage
      implements BceGuildFacilityLevelListOrBuilder {
    // Use BceGuildFacilityLevelList.newBuilder() to construct.
    private BceGuildFacilityLevelList(Builder builder) {
      super(builder);
    }
    private BceGuildFacilityLevelList(boolean noInit) {}
    
    private static final BceGuildFacilityLevelList defaultInstance;
    public static BceGuildFacilityLevelList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceGuildFacilityLevelList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_fieldAccessorTable;
    }
    
    private void initFields() {
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
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList.newBuilder()
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
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList result = new com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList(this);
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList.getDefaultInstance()) return this;
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
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceGuildFacilityLevelList)
    }
    
    static {
      defaultInstance = new BceGuildFacilityLevelList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceGuildFacilityLevelList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037BceGuildFacilityLevelList.proto\022 com.x" +
      "inqihd.sns.gameserver.proto\"\033\n\031BceGuildF" +
      "acilityLevelListB B\036XinqiBceGuildFacilit" +
      "yLevelList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceGuildFacilityLevelList_descriptor,
              new java.lang.String[] { },
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildFacilityLevelList.BceGuildFacilityLevelList.Builder.class);
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