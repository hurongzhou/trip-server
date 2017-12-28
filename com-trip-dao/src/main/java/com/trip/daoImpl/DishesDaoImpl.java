package com.trip.daoImpl;

import com.trip.dao.DishesDao;
import com.trip.entity.Dishes;
import com.trip.mapper.DishesMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class DishesDaoImpl implements DishesDao{

    @Resource
    DishesMapper dishesMapper;

    @Override
    public List<Dishes> queryByCondition(Map<String,Object> param) {
        return dishesMapper.queryByCondition(param);
    }
}
