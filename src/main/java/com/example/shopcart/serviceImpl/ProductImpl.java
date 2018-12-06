package com.example.shopcart.serviceImpl;

import com.example.shopcart.model.Product;

public interface ProductImpl {
    public Product getProduct(String id);
    public void postProduct(Product product);
    public void editProduct(Product product);
    public void deleteProduct(String id);
}
