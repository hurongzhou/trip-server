package com.trip.mapper;

import com.sun.tools.corba.se.idl.StringGen;
import com.trip.entity.Image;

import java.util.List;
import java.util.Map;

public interface ImageMapper {

    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);

    List<String> queryByForeignKey(Map<String,Object> param);
}