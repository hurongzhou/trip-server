package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.*;
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

    /**
     * 用户登录
     * @param loginName 登录名
     * @param password 密码
     * @param request
     * @return
     */
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

    /**
     * 添加用户
     * @param users  用户集合
     * @param request
     * @return
     */
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


    /**
     * 查询所有的用户
     * @return
     */
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

    /**
     * 关键字搜索餐厅和菜品
     * @param keyWord  关键字
     * @param areaCode 地区号
     * @return
     */
    @RequestMapping("searchRestaurantAndDishes.json")
    @ResponseBody
    public APITripResult searchRestaurantAndDishes(String keyWord,String areaCode){
        APITripResult api=new APITripResult();
        try {
            String area=areaMap.get(areaCode);
            if (area==null){
                throw new Exception("您选择的地区未开通！");
            }
            List<Restaurant> rdList=userService.searchRestaurantAndDishes(keyWord,areaCode);
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

    /**
     *通过id获取餐馆的详细信息
     * @param restaurantId 获取餐馆
     * @return
     */
    @RequestMapping("queryRestaurantById.json")
    @ResponseBody
    public APITripResult getRestaurantDetailById(Integer restaurantId){
        APITripResult api=new APITripResult();
        try {
            Restaurant restaurant=userService.getRestaurantDetailById(restaurantId);
            api.setResult(restaurant);
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

    /**
     * 根据id获取菜品的详细信息
     * @param dishesId 菜品id
     * @return
     */
    @RequestMapping("getDishesById.json")
    @ResponseBody
    public APITripResult getDishesDetailById(Integer dishesId){
        APITripResult api=new APITripResult();
        try {
            Dishes dishes=userService.getDishesDetailById(dishesId);
            api.setResult(dishes);
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

    /**
     * 关键字搜索景点
     * @param keyword 关键字
     * @return
     */
    @RequestMapping("searchViewpointByKeyword.json")
    @ResponseBody
    public APITripResult searchViewpointByKeyword(String keyword){
        APITripResult api=new APITripResult();
        try {
            List<Viewpoint> viewpoints=userService.searchViewPoints(keyword);
            api.setResult(viewpoints);
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
