package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Dishes;
import com.trip.entity.Restaurant;
import com.trip.service.RestaurantService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "restaurant")
public class RestaurantController {

    Logger logger=Logger.getLogger(RestaurantController.class);

    @Value("#{areas}")
    Map<String,String> areaMap;
    @Resource
    RestaurantService restaurantService;

    @RequestMapping("login.json")
    @ResponseBody
    public APITripResult login(String loginName,String password){
        APITripResult api=new APITripResult();
        try {
            if (loginName==null||loginName.equals("")
                    ||password==null||password.equals("")){
                throw new Exception("用户名或密码为空！");
            }
            Restaurant restaurant=restaurantService.login(loginName,password);
            if (restaurant==null){
                api.setMassage("用户名或密码错误！");
                api.setStatus(APITripResult.SYSTEM_ERROR);
            }else {
                api.setMassage("登陆成功！");
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

    @RequestMapping("queryDishes.json")
    @ResponseBody
    public APITripResult queryDishes(Integer restaurantId){
        APITripResult api=new APITripResult();
        try {
            List<Dishes> dishesList=restaurantService.queryDishes(restaurantId);
            api.setResult(dishesList);
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

    @RequestMapping("addDishesList.json")
    @ResponseBody
    public APITripResult addDishesList(@RequestBody List<Dishes> dishesList,Integer restaurantId){
        APITripResult api=new APITripResult();
        try {
            restaurantService.addDishesList(dishesList,restaurantId);
            api.setMassage("添加成功！");
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
