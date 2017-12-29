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
    public int deleteByPrimaryKey(Integer dishesId) {
        return 0;
    }

    @Override
    public int insert(Dishes record) {
        return 0;
    }

    @Override
    public int insertSelective(Dishes record) {
        return dishesMapper.insertSelective(record);
    }

    @Override
    public Dishes selectByPrimaryKey(Integer dishesId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Dishes record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dishes record) {
        return 0;
    }

    @Override
    public List<Dishes> queryByCondition(Map<String,Object> param) {
        return dishesMapper.queryByCondition(param);
    }
}
