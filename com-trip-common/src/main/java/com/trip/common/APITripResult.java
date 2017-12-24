package com.trip.common;

import java.util.HashMap;

/**
 * Created by hurong on 2017/12/24.
 */
public class APITripResult extends HashMap {
    public static final Integer SUCCESS=1;
    public static final Integer SYSTEM_ERROR=0;
    public static final Integer BUSINESS_ERRO=2;
    private Integer status;
    private String massage;

    public void setStatus(Integer status){
        this.put("status",status);
    }
    public void setMassage(String msg){
        this.put("massage",msg);
    }
    public void setResult(Object o){
        this.put("data",o);
    }
}
