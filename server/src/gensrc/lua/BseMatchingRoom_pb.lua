-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseMatchingRoom_pb', package.seeall)


local BSEMATCHINGROOM = protobuf.Descriptor();
local BSEMATCHINGROOM_ROOMID_FIELD = protobuf.FieldDescriptor();

BSEMATCHINGROOM_ROOMID_FIELD.name = "roomId"
BSEMATCHINGROOM_ROOMID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMatchingRoom.roomId"
BSEMATCHINGROOM_ROOMID_FIELD.number = 1
BSEMATCHINGROOM_ROOMID_FIELD.index = 0
BSEMATCHINGROOM_ROOMID_FIELD.label = 2
BSEMATCHINGROOM_ROOMID_FIELD.has_default_value = false
BSEMATCHINGROOM_ROOMID_FIELD.default_value = 0
BSEMATCHINGROOM_ROOMID_FIELD.type = 5
BSEMATCHINGROOM_ROOMID_FIELD.cpp_type = 1

BSEMATCHINGROOM.name = "BseMatchingRoom"
BSEMATCHINGROOM.full_name = ".com.xinqihd.sns.gameserver.proto.BseMatchingRoom"
BSEMATCHINGROOM.nested_types = {}
BSEMATCHINGROOM.enum_types = {}
BSEMATCHINGROOM.fields = {BSEMATCHINGROOM_ROOMID_FIELD}
BSEMATCHINGROOM.is_extendable = false
BSEMATCHINGROOM.extensions = {}

BseMatchingRoom = protobuf.Message(BSEMATCHINGROOM)
_G.BSEMATCHINGROOM_PB_BSEMATCHINGROOM = BSEMATCHINGROOM
