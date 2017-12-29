package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.RestaurantAndDishes;
import com.trip.entity.User;
import com.trip.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "user")
public class UserController {
    Logger logger=Logger.getLogger(UserController.class);

    @Value("#{areas}")
    Map<String,String> areaMap;
    @Resource
    UserService userService;

    @RequestMapping("login.json")
    @ResponseBody
    public APITripResult login(String loginName, String password, HttpServletRequest request){
        APITripResult api=new APITripResult();
        try {
            Map<String,Object> param=new HashMap();
            param.put("loginName",loginName);
            param.put("password",password);
            User user=userService.login(param);
            if (user!=null){
                request.getSession().setAttribute("user",user);
                api.setMassage("登录成功！");
                api.setStatus(APITripResult.SUCCESS);
            }else {
                api.setMassage("用户名或密码错误！");
                api.setStatus(APITripResult.SYSTEM_ERROR);
            }
        } catch (Exception e){
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("addList.json")
    @ResponseBody
    public APITripResult addUserList(@RequestBody List<User> users, HttpServletRequest request){
        APITripResult api=new APITripResult();
        List<Integer> userIds=new ArrayList();
        try {
            userIds=userService.addList(users);
            api.setResult(userIds);
            api.setMassage("success");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("queryAll.json")
    @ResponseBody
    public APITripResult queryAll(){
        APITripResult api=new APITripResult();
        List<User> users=new ArrayList();
        try {
            users=userService.queryAll();
            api.setResult(users);
            api.setMassage("操作成功！");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e){
            logger.error("系统错误！{}",e);
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("searchRestaurantAndDishes.json")
    @ResponseBody
    public APITripResult searchRestaurantAndDishes(String keyWord,String areaCode){
        APITripResult api=new APITripResult();
        try {
            String area=areaMap.get(areaCode);
            if (area==null){
                throw new Exception("您选择的地区未开通！");
            }
            List<RestaurantAndDishes> rdList=userService.searchRestaurantAndDishes(keyWord,areaCode);
            api.setResult(rdList);
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
