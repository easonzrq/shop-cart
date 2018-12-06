package com.example.shopcart.dao;

import com.example.shopcart.model.ShopCart;

public interface ShopCartMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShopCart record);

    int insertSelective(ShopCart record);

    ShopCart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopCart record);

    int updateByPrimaryKey(ShopCart record);
}