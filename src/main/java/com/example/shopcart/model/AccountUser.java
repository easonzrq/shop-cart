package com.example.shopcart.model;

import com.example.shopcart.model.base.BaseModel;

public class AccountUser extends BaseModel {
    private String id;

    private String password;

    private String userName;

    public AccountUser(String id, String password, String userName) {
        this.id = id;
        this.password = password;
        this.userName = userName;
    }

    public AccountUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}