package com.example.shopcart.serviceImpl;

import com.example.shopcart.dto.ShopCartDto;

import java.util.List;

public interface ShopCartImpl {
    public List<ShopCartDto> selectAll();
    public List<ShopCartDto> selectByUserId(String useriId);

}
