package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Commodity;
import com.trip.entity.Store;
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


    @RequestMapping("register.json")
    @ResponseBody
    public APITripResult register(@RequestBody Store store){
        APITripResult api=new APITripResult();
        try {
            if (store==null){
                api.setMassage("注册的信息为空！");
                api.setStatus(APITripResult.SYSTEM_ERROR);
                return api;
            }
            boolean success=storeService.register(store);
            if (!success){
                api.setMassage("登录名已存在！");
                api.setStatus(APITripResult.SYSTEM_ERROR);
            }else {
                api.setMassage("注册成功！");
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

    @RequestMapping("login.json")
    @ResponseBody
    public APITripResult login(String loginName,String password){
        APITripResult api=new APITripResult();
        try {
            Store store=storeService.login(loginName,password);
            if (store==null){
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

    @RequestMapping("findCommodityOfStore.json")
    @ResponseBody
    public APITripResult findCommodityByStore(@RequestBody Commodity commodityReq){
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

    @RequestMapping("modifyCommodityList.json")
    @ResponseBody
    public APITripResult modifyCommodityList(@RequestBody List<Commodity> commodityList){
        APITripResult api=new APITripResult();
        try {
            List<Integer> modifyIds=storeService.modifyCommodityList(commodityList);
            api.setResult(modifyIds);
            api.setMassage("修改成功！");
            api.setStatus(APITripResult.SUCCESS);
        }catch (Exception e){
            logger.error(e);
            e.printStackTrace();
            api.setMassage(e.getMessage());
            api.setStatus(APITripResult.SYSTEM_ERROR);
        }
        return api;
    }

    @RequestMapping("deleteCommodityLis.json")
    @ResponseBody
    public APITripResult deleteCommodityList(Integer[] commodityIds){
        APITripResult api=new APITripResult();
        try {
            if (commodityIds==null||commodityIds.length<1){
                api.setMassage("您没有选择任何商品!");
                api.setStatus(APITripResult.SYSTEM_ERROR);
            }else {
                storeService.deleteCommodityList(commodityIds);
                api.setMassage("删除成功！");
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
}
