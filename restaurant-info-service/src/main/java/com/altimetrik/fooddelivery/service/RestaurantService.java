package com.altimetrik.fooddelivery.service;

import com.altimetrik.fooddelivery.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    public void createRestaurant(Restaurant restaurant);
    public List<Restaurant> listAllRestaurants();
    public Optional<Restaurant> listRestaurantsById(Integer restaurantId);
    public void deleteRestaurantById(Integer restaurantId);
}
