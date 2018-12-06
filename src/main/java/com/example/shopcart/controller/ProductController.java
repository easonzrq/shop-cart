package com.example.shopcart.controller;

import com.example.shopcart.enums.ResultCode;
import com.example.shopcart.model.Product;
import com.example.shopcart.service.ResultMap;
import com.example.shopcart.serviceImpl.ProductImpl;
import com.example.shopcart.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductImpl productImpl;
    /*
     *Note:准备写成List的模式的，但是还没有搞懂mybatis的写法，暂时搁置
     */
    @GetMapping(value="")
    public List<Product> getAllProduct(){
        return null;
    }

    @GetMapping(value="/{id}")
    public Map<String,Object> getProduct(@PathVariable("id") String id){
        return ResultMap.fillResult(ResultCode.Success,productImpl.getProduct(id));
    }

    /*@PostMapping(value="/{id}")
    public Map<String,Object> addProduct(@PathVariable("id") Long id, model model){
        Integer count=(Integer) model.asMap().get("count");
        return ResultMap.fillResult(ResultCode.Success,count);
    }*/

    @PostMapping()
    public Map<String,Object> addProduct( Product product){
        productImpl.postProduct(product);
        return ResultMap.fillResult(ResultCode.Success,product.getProductName()+"添加成功");
    }

    @PutMapping(value="/{id}")
    public Map<String,Object> editProduct(@PathVariable("id") String id ,@RequestBody Product product){
        Product editProduct=CopyUtil.copyProperties(id,product);
        productImpl.editProduct(editProduct);
        return ResultMap.fillResult(ResultCode.Success);
    }

    @DeleteMapping(value="/{id}")
    public Map<String,Object> deleteProduct(@PathVariable("id") String id) {
        productImpl.deleteProduct(id);
        return ResultMap.fillResult(ResultCode.Success);
    }
}
