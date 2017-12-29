package com.trip.service;

import com.trip.common.redis.RedisConstant;
import com.trip.common.redis.RedisUtil;
import com.trip.dao.RestaurantDao;
import com.trip.entity.Dishes;
import com.trip.entity.Restaurant;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAData;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {

    @Resource
    RestaurantDao restaurantDao;
    @Resource
    DishesService dishesService;
    @Resource
    RedisUtil redisUtil;

    public Restaurant login(String loginName,String password){
        Map<String,Object> param=new HashMap();
        param.put("loginName",loginName);
        param.put("password",password);
        Restaurant restaurant=restaurantDao.login(param);
        return restaurant;
    }

    public List<Restaurant> queryRestaurantByCondition(Map<String,Object> param){
        return restaurantDao.selectRestaurantByCondition(param);
    }

    public List<Dishes> queryDishes(Integer restaurantId){
        String key="restaurant_dishes"+restaurantId;
        List<Dishes> dishesList= (List<Dishes>) redisUtil.get(key);
        if (dishesList!=null){
            return dishesList;
        }
        List<Integer> ids=new ArrayList();
        ids.add(restaurantId);
        dishesList=dishesService.queryByCondition(null,ids,null);
        redisUtil.set(key,dishesList, RedisConstant.buildExp());
        return dishesList;
    }

    public void addDishesList(List<Dishes> dishesList,Integer restaurantId){
        String key="restaurant_dishes"+restaurantId;
        redisUtil.del(key);
        dishesService.addDishesList(dishesList,restaurantId);
    }
}
