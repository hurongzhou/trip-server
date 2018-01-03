package com.trip.daoImpl;

import com.trip.dao.ViewpointDao;
import com.trip.entity.Viewpoint;
import com.trip.mapper.ViewpointMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class ViewpointDaoImpl implements ViewpointDao{

    @Resource
    ViewpointMapper viewpointMapper;

    @Override
    public int deleteByPrimaryKey(Integer viewpointId) {
        return viewpointMapper.deleteByPrimaryKey(viewpointId);
    }

    @Override
    public int insert(Viewpoint record) {
        return viewpointMapper.insert(record);
    }

    @Override
    public int insertSelective(Viewpoint record) {
        return viewpointMapper.insertSelective(record);
    }

    @Override
    public Viewpoint selectByPrimaryKey(Integer viewpointId) {
        return viewpointMapper.selectByPrimaryKey(viewpointId);
    }

    @Override
    public int updateByPrimaryKeySelective(Viewpoint record) {
        return viewpointMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Viewpoint record) {
        return viewpointMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Viewpoint> searchByKeyword(Map<String, Object> param) {
        return viewpointMapper.searchByKeyword(param);
    }
}
