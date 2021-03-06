package com.trip.mapper;

import com.trip.entity.Viewpoint;

import java.util.List;
import java.util.Map;

public interface ViewpointMapper {

    int deleteByPrimaryKey(Integer viewpointId);

    int insert(Viewpoint record);

    int insertSelective(Viewpoint record);

    Viewpoint selectByPrimaryKey(Integer viewpointId);

    int updateByPrimaryKeySelective(Viewpoint record);

    int updateByPrimaryKey(Viewpoint record);

    List<Viewpoint> searchByKeyword(Map<String,Object> param);

    List<Viewpoint> queryAll();
}