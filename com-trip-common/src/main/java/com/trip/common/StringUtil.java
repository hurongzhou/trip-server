package com.trip.common;

import java.util.UUID;

public class StringUtil {

    public static String getUUID(){
        String s = UUID.randomUUID().toString();
        return s.substring(1,4)+s.substring(5,7)+s.substring(10,13);
    }
}
