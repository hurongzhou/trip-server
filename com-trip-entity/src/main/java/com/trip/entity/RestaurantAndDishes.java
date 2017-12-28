package com.trip.entity;

import java.util.List;

public class RestaurantAndDishes {
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
