package com.trip.dao;

import com.trip.entity.Image;

public interface ImageDao {

    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}
