package com.trip.dao;

import com.trip.entity.Route;

import java.util.List;

public interface RouteDao {


    int deleteByPrimaryKey(Integer routeId);

    int insert(Route record);

    int insertSelective(Route record);

    Route selectByPrimaryKey(Integer routeId);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);

    List<Route> searchByViewpointId(Integer viewpointId);

}
