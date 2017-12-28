package com.trip.entity;

import java.io.Serializable;
import java.util.List;

public class RestaurantAndDishes implements Serializable{
    private Restaurant restaurant;
    private List<Dishes> dishesList;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Dishes> getDishesList() {
        return dishesList;
    }

    public void setDishesList(List<Dishes> dishesList) {
        this.dishesList = dishesList;
    }
}
