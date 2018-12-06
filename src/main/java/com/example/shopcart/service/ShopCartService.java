package com.example.shopcart.service;

import com.example.shopcart.dao.ShopCartDtoMapper;
import com.example.shopcart.dao.ShopCartMapper;
import com.example.shopcart.dto.ShopCartDto;
import com.example.shopcart.serviceImpl.ShopCartImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCartService implements ShopCartImpl {
    @Autowired
    ShopCartMapper shopCartMapper;

    @Autowired
    ShopCartDtoMapper shopCartDtoMapper;

    public List<ShopCartDto> selectAll(){
        return shopCartDtoMapper.selectAll();
    }

    public List<ShopCartDto> selectByUserId(String userId){
        return shopCartDtoMapper.selectByUserid(userId);
    }

}
