package com.example.shopcart.model;

public class Permission {
    private String id;

    private String permissionName;

    private String url;

    public Permission(String id, String permissionName, String url) {
        this.id = id;
        this.permissionName = permissionName;
        this.url = url;
    }

    public Permission() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}