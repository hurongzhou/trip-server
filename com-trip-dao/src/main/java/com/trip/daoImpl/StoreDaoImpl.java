package com.trip.daoImpl;

import com.trip.dao.StoreDao;
import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;
import com.trip.mapper.CommodityMapper;
import com.trip.mapper.RestaurantMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class StoreDaoImpl implements StoreDao{

    @Resource
    CommodityMapper commodityMapper;
    @Resource
    RestaurantMapper restaurantMapper;

    @Override
    public List<Commodity> findCommoditiesByCondition(Commodity commodityCondition) {
        return commodityMapper.findCommodityByCondition(commodityCondition);
    }

    @Override
    public void addCommodity(Commodity commodity) {
        commodityMapper.insertSelective(commodity);
    }

    @Override
    public Restaurant login(Map<String, Object> param) {
        return restaurantMapper.login(param);
    }
}
