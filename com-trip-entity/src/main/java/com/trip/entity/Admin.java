package com.trip.entity;

import java.io.Serializable;

public class Admin implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.a_id
     *
     * @mbggenerated Sun Dec 24 11:47:29 CST 2017
     */
    private Integer aId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.login_name
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.email
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.content
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.exp_content
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    private String expContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.a_id
     *
     * @return the value of admin.a_id
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public Integer getaId() {
        return aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.a_id
     *
     * @param aId the value for admin.a_id
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.login_name
     *
     * @return the value of admin.login_name
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.login_name
     *
     * @param loginName the value for admin.login_name
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.email
     *
     * @return the value of admin.email
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.email
     *
     * @param email the value for admin.email
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.content
     *
     * @return the value of admin.content
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.content
     *
     * @param content the value for admin.content
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.exp_content
     *
     * @return the value of admin.exp_content
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public String getExpContent() {
        return expContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.exp_content
     *
     * @param expContent the value for admin.exp_content
     *
     * @mbggenerated Sun Dec 24 11:47:30 CST 2017
     */
    public void setExpContent(String expContent) {
        this.expContent = expContent == null ? null : expContent.trim();
    }
}