package com.trip.service;

import com.trip.dao.StoreDao;
import com.trip.entity.Commodity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoreService {

    @Resource
    StoreDao storeDao;

    public List<Commodity> findCommonditiesByCondition(Commodity commodity){
        return storeDao.findCommoditiesByCondition(commodity);
    }

    public void addCommodity(List<Commodity> commodities){
        for (Commodity commodity:commodities){
            storeDao.addCommodity(commodity);
        }
    }
}
