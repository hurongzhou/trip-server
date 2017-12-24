package com.trip.service;

import com.trip.dao.AdminDao;
import com.trip.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdminService {

    @Autowired
    AdminDao adminDao;

    public Admin login(Map<String,Object> map){
        return adminDao.login(map);
    }


}
