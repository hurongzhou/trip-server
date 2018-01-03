package com.trip.daoImpl;

import com.trip.dao.StoreDao;
import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;
import com.trip.entity.Store;
import com.trip.mapper.CommodityMapper;
import com.trip.mapper.RestaurantMapper;
import com.trip.mapper.StoreMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class StoreDaoImpl implements StoreDao{

    @Resource
    CommodityMapper commodityMapper;
    @Resource
    StoreMapper storeMapper;

    @Override
    public List<Commodity> findCommoditiesByCondition(Commodity commodityCondition) {
        return commodityMapper.findCommodityByCondition(commodityCondition);
    }

    @Override
    public void addCommodity(Commodity commodity) {
        commodityMapper.insertSelective(commodity);
    }

    @Override
    public void addStore(Store store) {
        storeMapper.insertSelective(store);
    }

    @Override
    public Store queryUniqueOne(Map<String, Object> param) {
        return storeMapper.queryUniqueOne(param);
    }

    @Override
    public void modifyCommodity(Commodity commodity) {
        commodityMapper.updateByPrimaryKeySelective(commodity);
    }

    @Override
    public void deleteCommodityById(Integer commodityId) {
        commodityMapper.deleteByPrimaryKey(commodityId);
    }
}
