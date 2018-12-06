package com.example.shopcart.common;

import com.example.shopcart.enums.ResultCode;
import com.example.shopcart.service.ResultMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@ControllerAdvice
public class ErrorControllerAdvice {
    @ResponseBody
    @ExceptionHandler(value = IllegalArgumentException.class)
    public Map<String, Object> illegalArgumentHandler(Exception ex) {
        return ResultMap.fillResult(ResultCode.IllegalArgumentException, ex.toString());
    }
}
