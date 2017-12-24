package com.trip.daoImpl;

import com.trip.dao.BusinessDao;
import com.trip.entity.Business;
import com.trip.mapper.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by hurong on 2017/12/24.
 */
@Repository
public class BusinessDaoImpl implements BusinessDao {

    @Autowired
    BusinessMapper businessMapper;

    public Business login(Map<String, Object> param) {
        return businessMapper.login(param);
    }

    public void insertSelective(Business business) {
        businessMapper.insertSelective(business);
    }
}
