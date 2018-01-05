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
        return dishesMapper.deleteByPrimaryKey(dishesId);
    }

    @Override
    public int insert(Dishes record) {
        return dishesMapper.insert(record);
    }

    @Override
    public int insertSelective(Dishes record) {
        return dishesMapper.insertSelective(record);
    }

    @Override
    public Dishes selectByPrimaryKey(Integer dishesId) {
        return dishesMapper.selectByPrimaryKey(dishesId);
    }

    @Override
    public int updateByPrimaryKeySelective(Dishes record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dishes record) {
        return dishesMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Dishes> queryByCondition(Map<String,Object> param) {
        return dishesMapper.queryByCondition(param);
    }
}
