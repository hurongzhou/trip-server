package com.trip.mapper;

import com.trip.entity.Commodity;

import java.util.List;

public interface CommodityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_commodity
     *
     * @mbggenerated Wed Dec 27 14:17:51 CST 2017
     */
    int deleteByPrimaryKey(Integer commodityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_commodity
     *
     * @mbggenerated Wed Dec 27 14:17:51 CST 2017
     */
    int insert(Commodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_commodity
     *
     * @mbggenerated Wed Dec 27 14:17:51 CST 2017
     */
    int insertSelective(Commodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_commodity
     *
     * @mbggenerated Wed Dec 27 14:17:51 CST 2017
     */
    Commodity selectByPrimaryKey(Integer commodityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_commodity
     *
     * @mbggenerated Wed Dec 27 14:17:51 CST 2017
     */
    int updateByPrimaryKeySelective(Commodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_commodity
     *
     * @mbggenerated Wed Dec 27 14:17:51 CST 2017
     */
    int updateByPrimaryKey(Commodity record);

    List<Commodity> findCommodityByCondition(Commodity commodity);
}