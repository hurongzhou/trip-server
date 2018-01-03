package com.trip.service;

import com.trip.dao.ImageDao;
import com.trip.entity.Image;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ImageService {

    @Resource
    ImageDao imageDao;

    public void addImage(Image image){
        imageDao.insertSelective(image);
    }

    public List<String> queryImageUrlsByForeignId(String type,Integer foreignId){
        Map<String,Object> param=new HashMap();
        param.put(type,foreignId);
        List<String> urls=imageDao.queryByForeignKey(param);
        return urls;
    }

}
