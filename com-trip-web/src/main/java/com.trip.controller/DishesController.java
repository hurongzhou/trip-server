package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Dishes;
import com.trip.service.DishesService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "dishes")
public class DishesController {

    Logger logger=Logger.getLogger(DishesController.class);

    @Resource
    DishesService dishesService;

    @RequestMapping("queryByCondition.json")
    @ResponseBody
    public APITripResult queryByCondition(String keyWord){
        APITripResult api=new APITripResult();
        try {
            Map<String,Object> param=new HashMap();
            param.put("dishesName",keyWord);
            List<Dishes> dishesList=new ArrayList();
            dishesList=dishesService.queryByCondition(param);
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
}
