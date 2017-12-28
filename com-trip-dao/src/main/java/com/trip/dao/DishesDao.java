package com.trip.dao;

import com.trip.entity.Dishes;

import java.util.List;
import java.util.Map;

public interface DishesDao {
    List<Dishes> queryByCondition(Map<String,Object> param);
}
