package com.trip.service;

import com.trip.dao.RouteDao;
import com.trip.entity.Route;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RouteService {

    @Resource
    RouteDao routeDao;

    public List<Route> searchByViewpointId(Integer viewpointId){
        return routeDao.searchByViewpointId(viewpointId);
    }
}
