package com.example.shopcart.controller;

import com.example.shopcart.dto.ShopCartDto;
import com.example.shopcart.enums.ResultCode;
import com.example.shopcart.service.ResultMap;
import com.example.shopcart.serviceImpl.ShopCartImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/shopcart")
public class ShopCartController {
    @Autowired
    ShopCartImpl shopCartImpl;

   /* @GetMapping()
    public Map<String,Object> getShopCartList(){
        return ResultMap.fillResult(ResultCode.Success,shopCartImpl.selectAll());
    }*/

    @GetMapping("/{userId}")
    public Map<String, Object> getShopCart(@PathVariable("userId") String userId) {
        return ResultMap.fillResult(ResultCode.Success, shopCartImpl.selectByUserId(userId));
    }

    @PostMapping()
    public void addShopCart(@RequestBody ShopCartDto shopCartDto) {

    }

    /*
    购物只允许修改数量，不允许修改任何其他东西
    * */
    @PutMapping("/{id}")
    public void editShopCart(@PathVariable("id") String id, @RequestBody Integer count) {

    }

    @DeleteMapping("/{id}")
    public void deleteShopCart(@PathVariable("id") String id) {

    }
}
