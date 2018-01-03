package com.trip.daoImpl;

import com.trip.dao.RouteDao;
import com.trip.entity.Route;
import com.trip.mapper.RouteMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class RouteDaoImpl implements RouteDao{

    @Resource
    RouteMapper routeMapper;

    @Override
    public int deleteByPrimaryKey(Integer routeId) {
        return routeMapper.deleteByPrimaryKey(routeId);
    }

    @Override
    public int insert(Route record) {
        return routeMapper.insert(record);
    }

    @Override
    public int insertSelective(Route record) {
        return routeMapper.insertSelective(record);
    }

    @Override
    public Route selectByPrimaryKey(Integer routeId) {
        return routeMapper.selectByPrimaryKey(routeId);
    }

    @Override
    public int updateByPrimaryKeySelective(Route record) {
        return routeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Route record) {
        return routeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Route> searchByViewpointId(Integer viewpointId) {
        return routeMapper.searchByViewpointId(viewpointId);
    }
}
