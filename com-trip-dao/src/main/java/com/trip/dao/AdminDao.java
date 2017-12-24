package com.trip.dao;

import com.trip.entity.Admin;

import java.util.Map;

public interface AdminDao {
    public Admin login(Map<String,Object> map);
}
