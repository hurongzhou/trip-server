package com.trip.service;

import com.trip.dao.ImageDao;
import com.trip.entity.Image;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ImageService {

    @Resource
    ImageDao imageDao;

    public void addImage(Image image){
        imageDao.insertSelective(image);
    }

}
