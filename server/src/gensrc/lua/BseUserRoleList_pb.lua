-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseUserRoleList_pb', package.seeall)


local BSEUSERROLELIST = protobuf.Descriptor();
local BSEUSERROLELIST_SERVERID_FIELD = protobuf.FieldDescriptor();
local BSEUSERROLELIST_USERID_FIELD = protobuf.FieldDescriptor();
local BSEUSERROLELIST_ROLENAME_FIELD = protobuf.FieldDescriptor();

BSEUSERROLELIST_SERVERID_FIELD.name = "serverid"
BSEUSERROLELIST_SERVERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserRoleList.serverid"
BSEUSERROLELIST_SERVERID_FIELD.number = 1
BSEUSERROLELIST_SERVERID_FIELD.index = 0
BSEUSERROLELIST_SERVERID_FIELD.label = 1
BSEUSERROLELIST_SERVERID_FIELD.has_default_value = false
BSEUSERROLELIST_SERVERID_FIELD.default_value = ""
BSEUSERROLELIST_SERVERID_FIELD.type = 9
BSEUSERROLELIST_SERVERID_FIELD.cpp_type = 9

BSEUSERROLELIST_USERID_FIELD.name = "userid"
BSEUSERROLELIST_USERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserRoleList.userid"
BSEUSERROLELIST_USERID_FIELD.number = 2
BSEUSERROLELIST_USERID_FIELD.index = 1
BSEUSERROLELIST_USERID_FIELD.label = 3
BSEUSERROLELIST_USERID_FIELD.has_default_value = false
BSEUSERROLELIST_USERID_FIELD.default_value = {}
BSEUSERROLELIST_USERID_FIELD.type = 9
BSEUSERROLELIST_USERID_FIELD.cpp_type = 9

BSEUSERROLELIST_ROLENAME_FIELD.name = "rolename"
BSEUSERROLELIST_ROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserRoleList.rolename"
BSEUSERROLELIST_ROLENAME_FIELD.number = 3
BSEUSERROLELIST_ROLENAME_FIELD.index = 2
BSEUSERROLELIST_ROLENAME_FIELD.label = 3
BSEUSERROLELIST_ROLENAME_FIELD.has_default_value = false
BSEUSERROLELIST_ROLENAME_FIELD.default_value = {}
BSEUSERROLELIST_ROLENAME_FIELD.type = 9
BSEUSERROLELIST_ROLENAME_FIELD.cpp_type = 9

BSEUSERROLELIST.name = "BseUserRoleList"
BSEUSERROLELIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseUserRoleList"
BSEUSERROLELIST.nested_types = {}
BSEUSERROLELIST.enum_types = {}
BSEUSERROLELIST.fields = {BSEUSERROLELIST_SERVERID_FIELD, BSEUSERROLELIST_USERID_FIELD, BSEUSERROLELIST_ROLENAME_FIELD}
BSEUSERROLELIST.is_extendable = false
BSEUSERROLELIST.extensions = {}

BseUserRoleList = protobuf.Message(BSEUSERROLELIST)
_G.BSEUSERROLELIST_PB_BSEUSERROLELIST = BSEUSERROLELIST
