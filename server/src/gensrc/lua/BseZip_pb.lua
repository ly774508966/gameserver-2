-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseZip_pb', package.seeall)


local BSEZIP = protobuf.Descriptor();
local BSEZIP_NAME_FIELD = protobuf.FieldDescriptor();
local BSEZIP_PAYLOAD_FIELD = protobuf.FieldDescriptor();

BSEZIP_NAME_FIELD.name = "name"
BSEZIP_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseZip.name"
BSEZIP_NAME_FIELD.number = 1
BSEZIP_NAME_FIELD.index = 0
BSEZIP_NAME_FIELD.label = 1
BSEZIP_NAME_FIELD.has_default_value = false
BSEZIP_NAME_FIELD.default_value = ""
BSEZIP_NAME_FIELD.type = 9
BSEZIP_NAME_FIELD.cpp_type = 9

BSEZIP_PAYLOAD_FIELD.name = "payload"
BSEZIP_PAYLOAD_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseZip.payload"
BSEZIP_PAYLOAD_FIELD.number = 2
BSEZIP_PAYLOAD_FIELD.index = 1
BSEZIP_PAYLOAD_FIELD.label = 1
BSEZIP_PAYLOAD_FIELD.has_default_value = false
BSEZIP_PAYLOAD_FIELD.default_value = ""
BSEZIP_PAYLOAD_FIELD.type = 12
BSEZIP_PAYLOAD_FIELD.cpp_type = 9

BSEZIP.name = "BseZip"
BSEZIP.full_name = ".com.xinqihd.sns.gameserver.proto.BseZip"
BSEZIP.nested_types = {}
BSEZIP.enum_types = {}
BSEZIP.fields = {BSEZIP_NAME_FIELD, BSEZIP_PAYLOAD_FIELD}
BSEZIP.is_extendable = false
BSEZIP.extensions = {}

BseZip = protobuf.Message(BSEZIP)
_G.BSEZIP_PB_BSEZIP = BSEZIP
