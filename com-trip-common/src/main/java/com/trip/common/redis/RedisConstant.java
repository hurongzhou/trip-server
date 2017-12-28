package com.trip.common.redis;

import java.util.Calendar;

public class RedisConstant {

    public static final long EXPIRE_TIME=5*24*60*60;

    private static long getSecondTo0Clock(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        long today=c.getTimeInMillis()/1000;
        long cur=System.currentTimeMillis()/1000;
        long left=today-cur+25*3600;
        return left;
    }

    public static long buildExp(){
        return getSecondTo0Clock()+EXPIRE_TIME;
    }
}
