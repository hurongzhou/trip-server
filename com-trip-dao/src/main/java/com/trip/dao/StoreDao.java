package com.trip.dao;

import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;
import com.trip.entity.Store;

import java.util.List;
import java.util.Map;

public interface StoreDao {
    List<Commodity> findCommoditiesByCondition(Commodity commodity);
    void addCommodity(Commodity commodity);
    void addStore(Store store);
    Store queryUniqueOne(Map<String,Object> param);
    void modifyCommodity(Commodity commodity);
    void deleteCommodityById(Integer commodityId);
}
