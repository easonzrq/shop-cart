package com.example.shopcart.dao;

import com.example.shopcart.model.AccountUser;

public interface AccountUserMapper {
    AccountUser findByUserName(String username);
}