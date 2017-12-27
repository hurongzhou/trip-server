package com.trip.dao;

import com.trip.entity.Dishes;

import java.util.List;

public interface DishesDao {
    List<Dishes> queryByCondition(Dishes dishes);
}
