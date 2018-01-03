package com.trip.service;

import com.trip.dao.StoreDao;
import com.trip.entity.Commodity;
import com.trip.entity.Restaurant;
import com.trip.entity.Store;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StoreService {

    @Resource
    StoreDao storeDao;
    @Resource
    ImageService imageService;

    public List<Commodity> findCommoditiesByCondition(Commodity commodity) {
        List<Commodity> commodityList=storeDao.findCommoditiesByCondition(commodity);
        for (Commodity c:commodityList){
            List<String> urls=imageService.queryImageUrlsByForeignId("commodityId",c.getCommodityId());
            c.setImageUrls(urls);
        }
        return commodityList;
    }

    public void addCommodity(List<Commodity> commodities){
        for (Commodity commodity:commodities){
            storeDao.addCommodity(commodity);
        }
    }

    public boolean register(Store store){
        Map<String,Object> param=new HashMap();
        param.put("loginName",store.getLoginName());
        Store s=storeDao.queryUniqueOne(param);
        if (s!=null){
            return false;
        }
        storeDao.addStore(store);
        return true;
    }

    public Store login(String loginName, String password){
        Map<String,Object> param=new HashMap();
        param.put("loginName",loginName);
        param.put("password",password);
        Store store=storeDao.queryUniqueOne(param);
        return store;
    }

    public List<Integer> modifyCommodityList(List<Commodity> commodities){
        List<Integer> modifyIds=new ArrayList();
        for (Commodity c:commodities){
            storeDao.modifyCommodity(c);
            modifyIds.add(c.getCommodityId());
        }
        return modifyIds;
    }

    public void deleteCommodityList(Integer[] commodityIds){
        for (int i=0;i<commodityIds.length;i++){
            storeDao.deleteCommodityById(commodityIds[i]);
        }
    }
}
