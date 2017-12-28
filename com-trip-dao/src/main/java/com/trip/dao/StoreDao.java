package com.trip.dao;

import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;

import java.util.List;
import java.util.Map;

public interface StoreDao {
    List<Commodity> findCommoditiesByCondition(Commodity commodity);
    void addCommodity(Commodity commodity);
    Restaurant login(Map<String,Object> param);
}
