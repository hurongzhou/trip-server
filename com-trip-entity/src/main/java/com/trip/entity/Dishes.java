package com.trip.entity;

import java.io.Serializable;

public class Dishes implements Serializable{

    private Integer dishesId;

    private String dishesName;

    private Double price;

    private String detail;

    private Integer monthlySales;

    private Integer restaurantId;

    private String expContent1;

    private String expContent2;

    public Integer getDishesId() {
        return dishesId;
    }

    public void setDishesId(Integer dishesId) {
        this.dishesId = dishesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.dishes_name
     *
     * @return the value of tb_dishes.dishes_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getDishesName() {
        return dishesName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.dishes_name
     *
     * @param dishesName the value for tb_dishes.dishes_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setDishesName(String dishesName) {
        this.dishesName = dishesName == null ? null : dishesName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.price
     *
     * @return the value of tb_dishes.price
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.price
     *
     * @param price the value for tb_dishes.price
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.detail
     *
     * @return the value of tb_dishes.detail
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.detail
     *
     * @param detail the value for tb_dishes.detail
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.monthly_sales
     *
     * @return the value of tb_dishes.monthly_sales
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public Integer getMonthlySales() {
        return monthlySales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.monthly_sales
     *
     * @param monthlySales the value for tb_dishes.monthly_sales
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.restaurant_id
     *
     * @return the value of tb_dishes.restaurant_id
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.restaurant_id
     *
     * @param restaurantId the value for tb_dishes.restaurant_id
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.exp_content1
     *
     * @return the value of tb_dishes.exp_content1
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getExpContent1() {
        return expContent1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.exp_content1
     *
     * @param expContent1 the value for tb_dishes.exp_content1
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setExpContent1(String expContent1) {
        this.expContent1 = expContent1 == null ? null : expContent1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dishes.exp_content2
     *
     * @return the value of tb_dishes.exp_content2
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getExpContent2() {
        return expContent2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dishes.exp_content2
     *
     * @param expContent2 the value for tb_dishes.exp_content2
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setExpContent2(String expContent2) {
        this.expContent2 = expContent2 == null ? null : expContent2.trim();
    }
}