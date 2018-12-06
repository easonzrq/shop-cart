package com.example.shopcart.model;

import com.example.shopcart.model.base.BaseModel;

public class Product extends BaseModel {
    private String id;

    private String category;

    private Integer count;

    private String description;

    private String productName;

    public Product(String id, String category, Integer count, String description, String productName) {
        this.id = id;
        this.category = category;
        this.count = count;
        this.description = description;
        this.productName = productName;
    }

    public Product() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
}