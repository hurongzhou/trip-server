package com.trip.daoImpl;

import com.trip.dao.RestaurantDao;
import com.trip.entity.Restaurant;
import com.trip.mapper.RestaurantMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class RestaurantDaoImpl implements RestaurantDao{

    @Resource
    RestaurantMapper restaurantMapper;

    @Override
    public int deleteByPrimaryKey(Integer restaurantId) {
        return 0;
    }

    @Override
    public int insert(Restaurant record) {
        return 0;
    }

    @Override
    public int insertSelective(Restaurant record) {
        return 0;
    }

    @Override
    public Restaurant selectByPrimaryKey(Integer restaurantId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Restaurant record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Restaurant record) {
        return 0;
    }

    @Override
    public Restaurant login(Map<String, Object> param) {
        return null;
    }

    @Override
    public List<Restaurant> selectRestaurantByCondition(Map<String, Object> param) {
        return restaurantMapper.selectRestaurantByCondition(param);
    }
}
