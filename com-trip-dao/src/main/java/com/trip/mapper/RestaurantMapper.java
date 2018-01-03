package com.trip.mapper;

import com.trip.entity.Restaurant;

import java.util.List;
import java.util.Map;

public interface RestaurantMapper {

    int deleteByPrimaryKey(Integer restaurantId);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(Integer restaurantId);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);

    Restaurant queryUniqueOne(Map<String,Object> param);

    List<Restaurant> selectRestaurantByCondition(Map<String,Object> param);
}