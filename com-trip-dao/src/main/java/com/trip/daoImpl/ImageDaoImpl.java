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
        return imageMapper.deleteByPrimaryKey(imageId);
    }

    @Override
    public int insert(Image record) {
        return imageMapper.insert(record);
    }

    @Override
    public int insertSelective(Image record) {
        return imageMapper.insertSelective(record);
    }

    @Override
    public Image selectByPrimaryKey(Integer imageId) {
        return imageMapper.selectByPrimaryKey(imageId);
    }

    @Override
    public int updateByPrimaryKeySelective(Image record) {
        return imageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Image record) {
        return updateByPrimaryKey(record);
    }

    @Override
    public List<String> queryByForeignKey(Map<String, Object> param) {
        return imageMapper.queryByForeignKey(param);
    }
}
