package com.trip.service;

import com.trip.dao.StoreDao;
import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StoreService {

    @Resource
    StoreDao storeDao;

    public List<Commodity> findCommoditiesByCondition(Commodity commodity){
        return storeDao.findCommoditiesByCondition(commodity);
    }

    public void addCommodity(List<Commodity> commodities){
        for (Commodity commodity:commodities){
            storeDao.addCommodity(commodity);
        }
    }

    public Restaurant login(String loginName,String password){
        Map<String,Object> param=new HashMap();
        param.put("loginName",loginName);
        param.put("password",password);
        Restaurant restaurant=storeDao.login(param);
        return restaurant;
    }
}
