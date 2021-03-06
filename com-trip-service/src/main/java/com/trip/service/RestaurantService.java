package com.trip.service;

import com.trip.common.redis.RedisConstant;
import com.trip.common.redis.RedisUtil;
import com.trip.dao.RestaurantDao;
import com.trip.entity.Dishes;
import com.trip.entity.Restaurant;
import org.springframework.stereotype.Service;

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
    ImageService imageService;
    @Resource
    RedisUtil redisUtil;



    public boolean register(Restaurant restaurant){
        Map<String,Object> param=new HashMap();
        param.put("loginName",restaurant.getLoginName());
        Restaurant r=restaurantDao.queryUniqueOne(param);
        if (r!=null){
            return false;
        }
        restaurantDao.insertSelective(restaurant);
        return true;
    }

    public Restaurant login(String loginName,String password){
        Map<String,Object> param=new HashMap();
        param.put("loginName",loginName);
        param.put("password",password);
        Restaurant restaurant=restaurantDao.queryUniqueOne(param);
        return restaurant;
    }

    public List<Restaurant> queryRestaurantByCondition(Map<String,Object> param){
        List<Restaurant> restaurantList=restaurantDao.selectRestaurantByCondition(param);
        for (Restaurant r:restaurantList){
            List<String> urls=imageService.queryImageUrlsByForeignId("restaurantId",r.getRestaurantId());
            r.setImageUrls(urls);
        }
        return restaurantList;
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

    public Restaurant queryRestaurantById(Integer restaurantId){
        Restaurant restaurant=restaurantDao.selectByPrimaryKey(restaurantId);
        List<Dishes> dishesList=queryDishes(restaurantId);
        restaurant.setDishesList(dishesList);
        return restaurant;
    }

    public void addDishesList(List<Dishes> dishesList,Integer restaurantId){
        String key="restaurant_dishes"+restaurantId;
        redisUtil.del(key);
        dishesService.addDishesList(dishesList,restaurantId);
    }
}
