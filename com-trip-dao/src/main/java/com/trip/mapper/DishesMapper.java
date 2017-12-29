package com.trip.mapper;

import com.trip.entity.Dishes;

import java.util.List;
import java.util.Map;

public interface DishesMapper {

    int deleteByPrimaryKey(Integer dishesId);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    Dishes selectByPrimaryKey(Integer dishesId);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);

    List<Dishes> queryByCondition(Map<String,Object> param);
}