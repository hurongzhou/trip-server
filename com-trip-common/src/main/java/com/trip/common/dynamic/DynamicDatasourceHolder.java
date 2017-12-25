package com.trip.common.dynamic;


public class DynamicDatasourceHolder {
    private static final String MASTER="master";
    private static final String SLAVE="slave";
    private static ThreadLocal holder=new ThreadLocal();

    public static Object getDatasourceKey(){
        return holder.get();
    }

    public static void setDatasourceKey(Object o){
        holder.set(o);
    }

    public static void markMaster(){
        setDatasourceKey(MASTER);
    }

    public static void markSlave(){
        setDatasourceKey(SLAVE);
    }

}
