package com.trip.daoImpl;

import com.trip.dao.DishesDao;
import com.trip.entity.Dishes;
import com.trip.mapper.DishesMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class DishesDaoImpl implements DishesDao{

    @Resource
    DishesMapper dishesMapper;

    @Override
    public List<Dishes> queryByCondition(Dishes dishes) {
        return dishesMapper.queryByCondition(dishes);
    }
}
