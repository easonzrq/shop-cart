package com.example.shopcart.model;

import com.example.shopcart.model.base.BaseModel;

public class ShopCart extends BaseModel {
    private String id;

    private String productId;

    private String userId;

    private Integer count;

    public ShopCart(String id, String productId, String userId, Integer count) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.count = count;
    }

    public ShopCart() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}