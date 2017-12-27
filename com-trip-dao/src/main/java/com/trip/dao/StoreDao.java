package com.trip.dao;

import com.trip.entity.Commodity;

import java.util.List;

public interface StoreDao {
    List<Commodity> findCommoditiesByCondition(Commodity commodity);
}
