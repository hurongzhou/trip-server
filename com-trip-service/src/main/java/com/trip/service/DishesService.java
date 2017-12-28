package com.trip.service;

import com.trip.dao.DishesDao;
import com.trip.entity.Dishes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DishesService {

    @Resource
    DishesDao dishesDao;

    public List<Dishes> queryByCondition(Map<String,Object> param){
        return dishesDao.queryByCondition(param);
    }
}
