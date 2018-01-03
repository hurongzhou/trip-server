package com.trip.service;

import com.trip.common.redis.RedisConstant;
import com.trip.common.redis.RedisUtil;
import com.trip.dao.ViewpointDao;
import com.trip.entity.Route;
import com.trip.entity.Ticket;
import com.trip.entity.Viewpoint;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ViewpointService {

    @Resource
    ViewpointDao viewpointDao;
    @Resource
    RouteService routeService;
    @Resource
    TicketService ticketService;
    @Resource
    ImageService imageService;
    @Resource
    RedisUtil redisUtil;

    public List<Viewpoint> searchByKeyword(String keyword){
        Map<String,Object> param=new HashMap();
        param.put("viewpointName",keyword);
        List<Viewpoint> viewpoints=viewpointDao.searchByKeyword(param);
        for (Viewpoint viewpoint:viewpoints){
            List<Route> routes=routeService.searchByViewpointId(viewpoint.getViewpointId());
            List<Ticket> tickets=ticketService.searchByViewpointId(viewpoint.getViewpointId());
            List<String> urls=imageService.queryImageUrlsByForeignId("viewpointId",viewpoint.getViewpointId());
            viewpoint.setImageUrls(urls);
            viewpoint.setRoutes(routes);
            viewpoint.setTickets(tickets);
        }
        return viewpoints;
    }

    public Viewpoint searchById(Integer id){
        String key="viewpoint"+id;
        Viewpoint viewpoint= (Viewpoint) redisUtil.get(key);
        if (viewpoint!=null){
            return viewpoint;
        }
        viewpoint=viewpointDao.selectByPrimaryKey(id);
        List<Route> routes=routeService.searchByViewpointId(id);
        List<Ticket> tickets=ticketService.searchByViewpointId(id);
        List<String> urls=imageService.queryImageUrlsByForeignId("viewpointId",viewpoint.getViewpointId());
        viewpoint.setImageUrls(urls);
        viewpoint.setRoutes(routes);
        viewpoint.setTickets(tickets);
        redisUtil.set(key,viewpoint, RedisConstant.buildExp());
        return viewpoint;
    }
    
    public List<Viewpoint> queryAll(){
        return viewpointDao.queryAll();
    }
}
