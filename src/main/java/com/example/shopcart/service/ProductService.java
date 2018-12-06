package com.example.shopcart.service;

import com.example.shopcart.dao.ProductMapper;
import com.example.shopcart.model.Product;
import com.example.shopcart.serviceImpl.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductImpl {
    @Autowired
    ProductMapper productMapper;

    public Product getProduct(String id) {
        Product product = productMapper.selectByPrimaryKey(id);
        if ("".equals(product) || product == null) {
            throw new IllegalArgumentException("Record not exits.");
        }
        return product;
    }

    public void postProduct(Product product) {
        productMapper.insert(product);
    }

    public void editProduct(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }

    public void deleteProduct(String id) {
        productMapper.deleteByPrimaryKey(id);
    }
}
