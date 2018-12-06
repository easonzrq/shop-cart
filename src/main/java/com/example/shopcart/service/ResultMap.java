package com.example.shopcart.service;

import com.example.shopcart.enums.ResultCode;

import java.util.HashMap;
import java.util.Map;

public class ResultMap {
    public static Map<String,Object> fillResult(ResultCode resultCode, Object object){
        Map<String,Object> resultMap=new HashMap<String,Object>();
        resultMap.put("Code",resultCode.getCode());
        resultMap.put("Message",resultCode.getMesg());
        resultMap.put("Result",object);
        return resultMap;
    }

    public static Map<String,Object> fillResult(ResultCode resultCode){
        Map<String,Object> resultMap=new HashMap<String,Object>();
        resultMap.put("Code",resultCode.getCode());
        resultMap.put("Message",resultCode.getMesg());
        return resultMap;
    }

    public static Map<String,Object> fillResult(ResultCode resultCode,String message){
        Map<String,Object> resultMap=new HashMap<String,Object>();
        resultMap.put("Code",resultCode.getCode());
        resultMap.put("Message",message);
        return resultMap;
    }
}
