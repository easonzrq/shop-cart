package com.example.shopcart.util;

import com.example.shopcart.model.base.BaseModel;
import org.springframework.beans.BeanUtils;

public class CopyUtil {
    /*
    * copy id to the newInstance
    * */
    public static <T extends BaseModel> T copyProperties(String id, T source){
        Class clazz=source.getClass();
        T destination= null;
        try {
            destination = (T)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        source.setId(id);
        BeanUtils.copyProperties(source,destination);
        return destination;
    }
}
