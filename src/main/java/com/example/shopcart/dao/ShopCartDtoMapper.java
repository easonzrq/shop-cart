package com.example.shopcart.dao;

import com.example.shopcart.dto.ShopCartDto;

import java.util.List;

public interface ShopCartDtoMapper {
    List<ShopCartDto> selectAll();

    List<ShopCartDto> selectByUserid(String userId);
}
