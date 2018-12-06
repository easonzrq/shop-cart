package com.example.shopcart.enums;

import java.util.HashMap;
import java.util.Map;

public enum ResultCode {
    Success("success","success"),
    RecourdNotFound("RecourdNotFound","RecourdNotFound"),
    IllegalArgumentException("IllegalArgumentException","IllegalArgumentException");

    private String code;
    private String mesg;

    ResultCode(String code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public Map<String,String> getResultMap(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("code", this.getCode());
        map.put("message", this.getMesg());
        return map;
    }
}
