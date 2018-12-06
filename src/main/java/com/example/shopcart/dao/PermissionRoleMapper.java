package com.example.shopcart.dao;

import com.example.shopcart.model.PermissionRole;

public interface PermissionRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);

    PermissionRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PermissionRole record);

    int updateByPrimaryKey(PermissionRole record);
}