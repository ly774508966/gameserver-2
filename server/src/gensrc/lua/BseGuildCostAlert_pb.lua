-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGuildCostAlert_pb', package.seeall)


local BSEGUILDCOSTALERT = protobuf.Descriptor();
local BSEGUILDCOSTALERT_REMAIN_FIELD = protobuf.FieldDescriptor();
local BSEGUILDCOSTALERT_GUILDLEVEL_FIELD = protobuf.FieldDescriptor();

BSEGUILDCOSTALERT_REMAIN_FIELD.name = "remain"
BSEGUILDCOSTALERT_REMAIN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildCostAlert.remain"
BSEGUILDCOSTALERT_REMAIN_FIELD.number = 1
BSEGUILDCOSTALERT_REMAIN_FIELD.index = 0
BSEGUILDCOSTALERT_REMAIN_FIELD.label = 1
BSEGUILDCOSTALERT_REMAIN_FIELD.has_default_value = true
BSEGUILDCOSTALERT_REMAIN_FIELD.default_value = 0
BSEGUILDCOSTALERT_REMAIN_FIELD.type = 5
BSEGUILDCOSTALERT_REMAIN_FIELD.cpp_type = 1

BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.name = "guildlevel"
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildCostAlert.guildlevel"
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.number = 2
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.index = 1
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.label = 1
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.has_default_value = true
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.default_value = 0
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.type = 5
BSEGUILDCOSTALERT_GUILDLEVEL_FIELD.cpp_type = 1

BSEGUILDCOSTALERT.name = "BseGuildCostAlert"
BSEGUILDCOSTALERT.full_name = ".com.xinqihd.sns.gameserver.proto.BseGuildCostAlert"
BSEGUILDCOSTALERT.nested_types = {}
BSEGUILDCOSTALERT.enum_types = {}
BSEGUILDCOSTALERT.fields = {BSEGUILDCOSTALERT_REMAIN_FIELD, BSEGUILDCOSTALERT_GUILDLEVEL_FIELD}
BSEGUILDCOSTALERT.is_extendable = false
BSEGUILDCOSTALERT.extensions = {}

BseGuildCostAlert = protobuf.Message(BSEGUILDCOSTALERT)
_G.BSEGUILDCOSTALERT_PB_BSEGUILDCOSTALERT = BSEGUILDCOSTALERT
