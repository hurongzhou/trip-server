package com.trip.entity;

public class Restaurant {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.restaurant_id
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private Integer restaurantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.login_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.password
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.restaurant_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String restaurantName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.address
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.tel
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.score
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private Double score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.monthly_sales
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private Integer monthlySales;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.exp_content1
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String expContent1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_restaurant.exp_content2
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    private String expContent2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.restaurant_id
     *
     * @return the value of tb_restaurant.restaurant_id
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.restaurant_id
     *
     * @param restaurantId the value for tb_restaurant.restaurant_id
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.login_name
     *
     * @return the value of tb_restaurant.login_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.login_name
     *
     * @param loginName the value for tb_restaurant.login_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.password
     *
     * @return the value of tb_restaurant.password
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.password
     *
     * @param password the value for tb_restaurant.password
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.restaurant_name
     *
     * @return the value of tb_restaurant.restaurant_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.restaurant_name
     *
     * @param restaurantName the value for tb_restaurant.restaurant_name
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.address
     *
     * @return the value of tb_restaurant.address
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.address
     *
     * @param address the value for tb_restaurant.address
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.tel
     *
     * @return the value of tb_restaurant.tel
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.tel
     *
     * @param tel the value for tb_restaurant.tel
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.score
     *
     * @return the value of tb_restaurant.score
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public Double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.score
     *
     * @param score the value for tb_restaurant.score
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.monthly_sales
     *
     * @return the value of tb_restaurant.monthly_sales
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public Integer getMonthlySales() {
        return monthlySales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.monthly_sales
     *
     * @param monthlySales the value for tb_restaurant.monthly_sales
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.exp_content1
     *
     * @return the value of tb_restaurant.exp_content1
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getExpContent1() {
        return expContent1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.exp_content1
     *
     * @param expContent1 the value for tb_restaurant.exp_content1
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setExpContent1(String expContent1) {
        this.expContent1 = expContent1 == null ? null : expContent1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_restaurant.exp_content2
     *
     * @return the value of tb_restaurant.exp_content2
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public String getExpContent2() {
        return expContent2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_restaurant.exp_content2
     *
     * @param expContent2 the value for tb_restaurant.exp_content2
     *
     * @mbggenerated Wed Dec 27 11:16:14 CST 2017
     */
    public void setExpContent2(String expContent2) {
        this.expContent2 = expContent2 == null ? null : expContent2.trim();
    }
}