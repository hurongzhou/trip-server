package com.trip.common.dynamic;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class DynamicDatasourceAspect {
    private static final Logger log= Logger.getLogger(DynamicDatasourceAspect.class);

    /**
     *执行service方法之前现在执行该方法，在spring的aop中配置
     * @param joinPoint 节点，可以获得service的方法名
     */
    public void before(JoinPoint joinPoint){
        //获得方法名
        String methodName=joinPoint.getSignature().getName();
        if (isSlave(methodName)){
            DynamicDatasourceHolder.markSlave();   //设置走从库
            log.info(methodName+" USE dataSource:slave");
        }else {
            DynamicDatasourceHolder.markMaster();   //设置走主库
            log.info(methodName+" USE dataSource:master");
        }
    }

    public boolean isSlave(String methodName){
        return StringUtils.startsWithAny(methodName,"query","find","get","search","select");
    }
}
