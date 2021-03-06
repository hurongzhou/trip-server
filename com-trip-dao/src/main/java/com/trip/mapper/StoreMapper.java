package com.trip.mapper;

import com.trip.entity.Store;

import java.util.Map;

public interface StoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_store
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    int deleteByPrimaryKey(Integer storeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_store
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    int insert(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_store
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    int insertSelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_store
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    Store selectByPrimaryKey(Integer storeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_store
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    int updateByPrimaryKeySelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_store
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    int updateByPrimaryKey(Store record);

    Store queryUniqueOne(Map<String,Object> param);

}