package com.trip.dao;

import com.trip.entity.Business;

import java.util.Map;

/**
 * Created by hurong on 2017/12/24.
 */
public interface BusinessDao {
    Business login(Map<String,Object> param);
    void insertSelective(Business business);
}
