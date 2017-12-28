package com.trip.service;

import com.trip.dao.RestaurantDao;
import com.trip.entity.Restaurant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {

    @Resource
    RestaurantDao restaurantDao;

    public List<Restaurant> queryRestaurantByCondition(Map<String,Object> param){
        return restaurantDao.selectRestaurantByCondition(param);
    }
}
