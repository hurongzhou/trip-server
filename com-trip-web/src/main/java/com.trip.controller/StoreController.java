package com.trip.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.trip.common.APITripResult;
import com.trip.entity.Commodity;
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

    @RequestMapping("findCommodityOfStore.json")
    @ResponseBody
    public APITripResult findCommodities(@RequestBody Commodity commodityReq){
        APITripResult api=new APITripResult();
        try {
            List<Commodity> commodities=new ArrayList();
            if (commodityReq==null){
                commodities=storeService.findCommonditiesByCondition(new Commodity());
            }else {
                commodities=storeService.findCommonditiesByCondition(commodityReq);
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
}
