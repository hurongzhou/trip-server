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
        List<User> users= (List<User>) redisUtil.get(key);
        if (users!=null){
            return users;
        }
        users=userDao.selectAll();
        redisUtil.set(key,users, RedisConstant.buildExp());
        return users;
    }

    public List<RestaurantAndDishes> searchRestaurantAndDishes(String keyWord,String areaCode){
        final String key="search_restaurant_dishes_"+keyWord;
        List<RestaurantAndDishes> resultList=(List<RestaurantAndDishes>) redisUtil.get(key);
        if (resultList!=null){
            return resultList;
        }
        resultList= new ArrayList();
        List<Dishes> dishesList=dishesService.queryByCondition(keyWord,null,areaCode);

        Set<Integer> restaurantIdList=new HashSet();
        for (Dishes d:dishesList){
            restaurantIdList.add(d.getRestaurantId());
        }
        Map<String,Object> param=new HashMap();
        param.put("restaurantName",keyWord);
        param.put("restaurantIdList",restaurantIdList);
        param.put("areaCode",areaCode);
        List<Restaurant> restaurantList=restaurantService.queryRestaurantByCondition(param);

        List<Integer> newIds=new ArrayList();
        for (Restaurant restaurant:restaurantList){
            Integer id=restaurant.getRestaurantId();
            newIds.add(id);
        }
        List<Dishes> newDishes=dishesService.queryByCondition(null,newIds,null);

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
