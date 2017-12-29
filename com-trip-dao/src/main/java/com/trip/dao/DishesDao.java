package com.trip.dao;

import com.trip.entity.Commodity;
import com.trip.entity.Dishes;
import org.springframework.test.annotation.Commit;

import java.util.List;
import java.util.Map;

public interface DishesDao {

    int deleteByPrimaryKey(Integer dishesId);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    Dishes selectByPrimaryKey(Integer dishesId);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);

    List<Dishes> queryByCondition(Map<String,Object> param);
}
