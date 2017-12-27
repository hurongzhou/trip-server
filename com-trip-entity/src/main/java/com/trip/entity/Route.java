package com.trip.entity;

public class Route {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.route_id
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private Integer routeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.start_station
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private String startStation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.end_station
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private String endStation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.price
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.type
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.duration
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private String duration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.viewpoint_id
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private Integer viewpointId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.exp_content1
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private String expContent1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_route.exp_content2
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    private String expContent2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.route_id
     *
     * @return the value of tb_route.route_id
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public Integer getRouteId() {
        return routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.route_id
     *
     * @param routeId the value for tb_route.route_id
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.start_station
     *
     * @return the value of tb_route.start_station
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public String getStartStation() {
        return startStation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.start_station
     *
     * @param startStation the value for tb_route.start_station
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setStartStation(String startStation) {
        this.startStation = startStation == null ? null : startStation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.end_station
     *
     * @return the value of tb_route.end_station
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public String getEndStation() {
        return endStation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.end_station
     *
     * @param endStation the value for tb_route.end_station
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setEndStation(String endStation) {
        this.endStation = endStation == null ? null : endStation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.price
     *
     * @return the value of tb_route.price
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.price
     *
     * @param price the value for tb_route.price
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.type
     *
     * @return the value of tb_route.type
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.type
     *
     * @param type the value for tb_route.type
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.duration
     *
     * @return the value of tb_route.duration
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.duration
     *
     * @param duration the value for tb_route.duration
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.viewpoint_id
     *
     * @return the value of tb_route.viewpoint_id
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public Integer getViewpointId() {
        return viewpointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.viewpoint_id
     *
     * @param viewpointId the value for tb_route.viewpoint_id
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setViewpointId(Integer viewpointId) {
        this.viewpointId = viewpointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.exp_content1
     *
     * @return the value of tb_route.exp_content1
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public String getExpContent1() {
        return expContent1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.exp_content1
     *
     * @param expContent1 the value for tb_route.exp_content1
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setExpContent1(String expContent1) {
        this.expContent1 = expContent1 == null ? null : expContent1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_route.exp_content2
     *
     * @return the value of tb_route.exp_content2
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public String getExpContent2() {
        return expContent2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_route.exp_content2
     *
     * @param expContent2 the value for tb_route.exp_content2
     *
     * @mbggenerated Wed Dec 27 16:30:27 CST 2017
     */
    public void setExpContent2(String expContent2) {
        this.expContent2 = expContent2 == null ? null : expContent2.trim();
    }
}