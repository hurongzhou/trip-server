package com.trip.service;

import com.trip.dao.DishesDao;
import com.trip.entity.Dishes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DishesService {

    @Resource
    DishesDao dishesDao;

    public List<Dishes> queryByCondition(String keyWord,List<Integer> restaurantIds){
        Map<String,Object> param=new HashMap();
        param.put("dishesName",keyWord);
        param.put("restaurantIdList",restaurantIds);
        return dishesDao.queryByCondition(param);
    }
}
