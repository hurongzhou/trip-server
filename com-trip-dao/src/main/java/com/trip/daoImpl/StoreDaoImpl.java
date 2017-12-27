package com.trip.daoImpl;

import com.trip.dao.StoreDao;
import com.trip.entity.Commodity;
import com.trip.mapper.CommodityMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StoreDaoImpl implements StoreDao{

    @Resource
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> findCommoditiesByCondition(Commodity commodityCondition) {
        return commodityMapper.findCommodityByCondition(commodityCondition);
    }
}
