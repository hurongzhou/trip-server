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
        return restaurantMapper.deleteByPrimaryKey(restaurantId);
    }

    @Override
    public int insert(Restaurant record) {
        return restaurantMapper.insert(record);
    }

    @Override
    public int insertSelective(Restaurant record) {
        return restaurantMapper.insertSelective(record);
    }

    @Override
    public Restaurant selectByPrimaryKey(Integer restaurantId) {
        return restaurantMapper.selectByPrimaryKey(restaurantId);
    }

    @Override
    public int updateByPrimaryKeySelective(Restaurant record) {
        return restaurantMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Restaurant record) {
        return restaurantMapper.updateByPrimaryKey(record);
    }

    @Override
    public Restaurant queryUniqueOne(Map<String, Object> param) {
        return restaurantMapper.queryUniqueOne(param);
    }

    @Override
    public List<Restaurant> selectRestaurantByCondition(Map<String, Object> param) {
        return restaurantMapper.selectRestaurantByCondition(param);
    }
}
