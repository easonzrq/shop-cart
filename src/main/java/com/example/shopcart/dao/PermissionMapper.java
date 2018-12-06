package com.example.shopcart.dao;

import com.example.shopcart.model.Permission;

import java.util.List;

public interface PermissionMapper {
    List<Permission> findByAdminUserId(String userid);
    List<Permission> findAll();
}