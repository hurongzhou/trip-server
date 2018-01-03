package com.trip.entity;

import java.io.Serializable;
import java.util.List;

public class Store implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.store_id
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private Integer storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.login_name
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.password
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.store_name
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String storeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.address
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.score
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private Double score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.tel
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.monthly_sales
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private Integer monthlySales;

    private List<String> imageUrls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.exp_content1
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String expContent1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_store.exp_content2
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    private String expContent2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.store_id
     *
     * @return the value of tb_store.store_id
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.store_id
     *
     * @param storeId the value for tb_store.store_id
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.login_name
     *
     * @return the value of tb_store.login_name
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.login_name
     *
     * @param loginName the value for tb_store.login_name
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.password
     *
     * @return the value of tb_store.password
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.password
     *
     * @param password the value for tb_store.password
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.store_name
     *
     * @return the value of tb_store.store_name
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.store_name
     *
     * @param storeName the value for tb_store.store_name
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.address
     *
     * @return the value of tb_store.address
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.address
     *
     * @param address the value for tb_store.address
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.score
     *
     * @return the value of tb_store.score
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public Double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.score
     *
     * @param score the value for tb_store.score
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.tel
     *
     * @return the value of tb_store.tel
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.tel
     *
     * @param tel the value for tb_store.tel
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.monthly_sales
     *
     * @return the value of tb_store.monthly_sales
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public Integer getMonthlySales() {
        return monthlySales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.monthly_sales
     *
     * @param monthlySales the value for tb_store.monthly_sales
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setMonthlySales(Integer monthlySales) {
        this.monthlySales = monthlySales;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.exp_content1
     *
     * @return the value of tb_store.exp_content1
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getExpContent1() {
        return expContent1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.exp_content1
     *
     * @param expContent1 the value for tb_store.exp_content1
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setExpContent1(String expContent1) {
        this.expContent1 = expContent1 == null ? null : expContent1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_store.exp_content2
     *
     * @return the value of tb_store.exp_content2
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public String getExpContent2() {
        return expContent2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_store.exp_content2
     *
     * @param expContent2 the value for tb_store.exp_content2
     *
     * @mbggenerated Wed Dec 27 14:47:41 CST 2017
     */
    public void setExpContent2(String expContent2) {
        this.expContent2 = expContent2 == null ? null : expContent2.trim();
    }
}