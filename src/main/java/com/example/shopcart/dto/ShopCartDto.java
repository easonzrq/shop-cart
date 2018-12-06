package com.example.shopcart.dto;

public class ShopCartDto {
    private String id;
    private String userName;
    private String productName;
    private Integer count;

    public ShopCartDto() {

    }

    public ShopCartDto(String id, String userName, String productName, Integer count) {
        this.id = id;
        this.userName = userName;
        this.productName = productName;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
