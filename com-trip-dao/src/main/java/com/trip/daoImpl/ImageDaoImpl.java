package com.trip.daoImpl;

import com.trip.dao.ImageDao;
import com.trip.entity.Image;
import com.trip.mapper.ImageMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class ImageDaoImpl implements ImageDao{

    @Resource
    ImageMapper imageMapper;

    @Override
    public int deleteByPrimaryKey(Integer imageId) {
        return 0;
    }

    @Override
    public int insert(Image record) {
        return 0;
    }

    @Override
    public int insertSelective(Image record) {
        return imageMapper.insertSelective(record);
    }

    @Override
    public Image selectByPrimaryKey(Integer imageId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Image record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Image record) {
        return 0;
    }

    @Override
    public List<String> queryByForeignKey(Map<String, Object> param) {
        return imageMapper.queryByForeignKey(param);
    }
}
