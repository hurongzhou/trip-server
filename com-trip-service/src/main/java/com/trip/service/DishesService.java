package com.trip.service;

import com.trip.dao.DishesDao;
import com.trip.entity.Dishes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DishesService {

    @Resource
    DishesDao dishesDao;
    @Resource
    ImageService imageService;

    public List<Dishes> queryByCondition(String keyWord,List<Integer> restaurantIds,String areaCode){
        Map<String,Object> param=new HashMap();
        param.put("dishesName",keyWord);
        param.put("restaurantIdList",restaurantIds);
        param.put("areaCode",areaCode);
        List<Dishes> dishesList=dishesDao.queryByCondition(param);
        for (Dishes dishes:dishesList){
            List<String> urls=imageService.queryImageUrlsByForeignId("dishesId",dishes.getDishesId());
            dishes.setImageUrls(urls);
        }
        return dishesList;
    }

    public void addDishesList(List<Dishes> dishesList,Integer restaurantId){
        for (Dishes dishes:dishesList){
            dishes.setRestaurantId(restaurantId);
            dishesDao.insertSelective(dishes);
        }
    }

}
