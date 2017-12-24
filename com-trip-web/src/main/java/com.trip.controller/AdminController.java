package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Admin;
import com.trip.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("login.json")
    @ResponseBody
    public APITripResult login(String loginName, String password, HttpServletRequest request){
        APITripResult api=new APITripResult();
        try {
            Map<String,Object> param=new HashMap();
            param.put("loginName",loginName);
            param.put("password",password);
            Admin admin=adminService.login(param);
            if (admin!=null){
                request.getSession().setAttribute("admin",admin);
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
}
