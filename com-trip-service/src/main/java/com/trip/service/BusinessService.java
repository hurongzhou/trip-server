package com.trip.service;

import com.trip.dao.BusinessDao;
import com.trip.entity.Business;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by hurong on 2017/12/24.
 */
@Service
public class BusinessService {

    @Resource
    BusinessDao businessDao;

    public Business login(Map<String,Object> param){
        return businessDao.login(param);
    }

    public void addBusiness(List<Business> businesses){
        for (Business business:businesses){
            businessDao.insertSelective(business);
        }
    }
}
