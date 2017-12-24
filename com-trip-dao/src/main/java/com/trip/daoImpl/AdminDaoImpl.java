package com.trip.daoImpl;

import com.trip.dao.AdminDao;
import com.trip.entity.Admin;
import com.trip.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AdminDaoImpl implements AdminDao {

    @Autowired
    AdminMapper adminMapper;


    public Admin login(Map<String, Object> map) {
        return adminMapper.login(map);
    }
}
