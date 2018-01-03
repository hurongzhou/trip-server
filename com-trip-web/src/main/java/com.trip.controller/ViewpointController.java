package com.trip.controller;

import com.trip.common.APITripResult;
import com.trip.entity.Viewpoint;
import com.trip.service.ViewpointService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "viewpoint")
public class ViewpointController {

    Logger logger=Logger.getLogger(ViewpointController.class);

    @Resource
    ViewpointService viewpointService;


    @RequestMapping("getDetailById.json")
    @ResponseBody
    public APITripResult getDetailById(Integer viewpointId){
        APITripResult api=new APITripResult();
        try {
            Viewpoint viewpoint=viewpointService.searchById(viewpointId);
            api.setResult(viewpoint);
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
    
    @RequestMapping("queryAll.json")
    @ResponseBody
    public APITripResult queryAll(){
        APITripResult api=new APITripResult();
        try {
            List<Viewpoint> viewpoints=viewpointService.queryAll();
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
