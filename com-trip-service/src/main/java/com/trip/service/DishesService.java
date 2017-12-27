package com.trip.service;

import com.trip.dao.DishesDao;
import com.trip.entity.Dishes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DishesService {

    @Resource
    DishesDao dishesDao;

    public List<Dishes> queryByCondition(Dishes d){
        return dishesDao.queryByCondition(d);
    }
}
