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
import java.util.List;

@Controller
@RequestMapping(value = "dishes")
public class DishesController {

    Logger logger=Logger.getLogger(DishesController.class);

    @Resource
    DishesService dishesService;

    @RequestMapping("queryByCondition.json")
    @ResponseBody
    public APITripResult queryByCondition(@RequestBody Dishes dishes){
        APITripResult api=new APITripResult();
        try {
            List<Dishes> dishesList=new ArrayList();
            if (dishes==null){
                 dishesList=dishesService.queryByCondition(new Dishes());
            }else {
                dishesList=dishesService.queryByCondition(dishes);
            }
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
