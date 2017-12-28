package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;
import com.trip.service.StoreService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "store")
public class StoreController {
    Logger logger=Logger.getLogger(StoreController.class);

    @Resource
    StoreService storeService;


    @RequestMapping("login.json")
    @ResponseBody
    public APITripResult login(String loginName,String password){
        APITripResult api=new APITripResult();
        try {
            Restaurant restaurant=storeService.login(loginName,password);
            if (restaurant==null){
                api.setMassage("用户名或密码错误！");
                api.setStatus(APITripResult.SYSTEM_ERROR);
            }else {
                api.setMassage("登录成功!");
                api.setStatus(APITripResult.SUCCESS);
            }
        }catch (Exception e){
            logger.error(e);
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("findCommodityOfRestaurant.json")
    @ResponseBody
    public APITripResult findCommodityByRestaurant(@RequestBody Commodity commodityReq){
        APITripResult api=new APITripResult();
        try {
            List<Commodity> commodities=new ArrayList();
            if (commodityReq==null){
                commodities=storeService.findCommoditiesByCondition(new Commodity());
            }else {
                commodities=storeService.findCommoditiesByCondition(commodityReq);
            }
            api.setResult(commodities);
            api.setMassage("操作成功！");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e){
            logger.error(e);
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("addCommodity.json")
    @ResponseBody
    public APITripResult addCommodity(@RequestBody List<Commodity> commodities){
        APITripResult api=new APITripResult();
        try {
            storeService.addCommodity(commodities);
            api.setMassage("操作成功！");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e){
            logger.error(e);
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }
}
