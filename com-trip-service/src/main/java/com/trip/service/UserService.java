package com.trip.service;

import com.trip.common.redis.RedisConstant;
import com.trip.common.redis.RedisUtil;
import com.trip.dao.UserDao;
import com.trip.entity.Dishes;
import com.trip.entity.Restaurant;
import com.trip.entity.RestaurantAndDishes;
import com.trip.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserService {

    @Resource
    UserDao userDao;
    @Resource
    RestaurantService restaurantService;
    @Resource
    DishesService dishesService;
    @Resource
    RedisUtil redisUtil;

    public User login(Map<String,Object> param){
        return userDao.login(param);
    }

    public List<Integer> addList(List<User> users){
        List<Integer> userIds=new ArrayList();
        for (User user:users){
            userDao.insertSelective(user);
            int id=user.getUserId();
            userIds.add(id);
        }
        return userIds;
    }

    public List<User> queryAll(){
        String key="query_all_user";
        List<User> users=new ArrayList();
        users= (List<User>) redisUtil.get(key);
        if (users==null){
            users=userDao.selectAll();
            redisUtil.set(key,users, RedisConstant.buildExp());
        }
        return users;
    }

    public List<RestaurantAndDishes> searchRestaurantAndDishes(String keyWord){
        final String key="search_restaurant_dishes_"+keyWord;
        List<RestaurantAndDishes> resultList= (List<RestaurantAndDishes>) redisUtil.get(key);
        if (resultList!=null){
            return resultList;
        }
        Map<String,Object> dishesParam=new HashMap();
        dishesParam.put("dishesName",keyWord);
        List<Dishes> dishesList=dishesService.queryByCondition(dishesParam);

        Set<Integer> restaurantIdList=new HashSet();
        for (Dishes d:dishesList){
            restaurantIdList.add(d.getRestaurantId());
        }
        Map<String,Object> param=new HashMap();
        param.put("restaurantName",keyWord);
        param.put("restaurantIdList",restaurantIdList);
        List<Restaurant> restaurantList=restaurantService.queryRestaurantByCondition(param);

        List<Integer> newIds=new ArrayList();
        for (Restaurant restaurant:restaurantList){
            Integer id=restaurant.getRestaurantId();
            newIds.add(id);
        }
        Map<String,Object> newParam=new HashMap();
        newParam.put("restaurantIdList",newIds);
        newParam.put("dishesName",keyWord);
        List<Dishes> newDishes=dishesService.queryByCondition(newParam);

        for (Restaurant r:restaurantList){
            RestaurantAndDishes rd=new RestaurantAndDishes();
            rd.setRestaurant(r);
            List<Dishes> dishesOfR=new ArrayList();
            for (Dishes d:newDishes){
                if (r.getRestaurantId()==d.getRestaurantId()){
                    dishesOfR.add(d);
                }
            }
            rd.setDishesList(dishesOfR);
            resultList.add(rd);
        }
        redisUtil.set(key,resultList,RedisConstant.buildExp());
        return resultList;
    }
}
