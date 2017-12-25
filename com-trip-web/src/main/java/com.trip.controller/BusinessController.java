package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Business;
import com.trip.service.BusinessService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hurong on 2017/12/24.
 */
@Controller
@RequestMapping(value = "business")
public class BusinessController {

    @Resource
    BusinessService businessService;

    @RequestMapping("login.json")
    @ResponseBody
    public APITripResult login(String loginName, String password, HttpServletRequest request){
        APITripResult api=new APITripResult();
        try {
            Map<String,Object> param=new HashMap();
            param.put("loginName",loginName);
            param.put("password",password);
            Business business=businessService.login(param);
            if (business!=null){
                request.getSession().setAttribute("business",business);
                api.setResult(business);
                api.setMassage("登录成功！");
                api.setStatus(APITripResult.SUCCESS);
            }else {
                api.setMassage("用户名或密码错误！");
                api.setStatus(APITripResult.SYSTEM_ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping(value = "add.json")
    @ResponseBody
    public APITripResult addBusiness(@RequestBody Business business){
        APITripResult api=new APITripResult();
        try {
            List<Business> list=new ArrayList<Business>();
            list.add(business);
            businessService.addBusiness(list);
            api.setMassage("添加成功！");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }
}
