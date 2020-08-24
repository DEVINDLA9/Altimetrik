package com.altimetrik.fooddelivery.service.impl;

import com.altimetrik.fooddelivery.model.Restaurant;
import com.altimetrik.fooddelivery.repository.RestaurantRepository;
import com.altimetrik.fooddelivery.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantServiceImpl.class);

    private RestaurantRepository restaurantRepository;
    @Autowired
    public void setRestaurantRepository(RestaurantRepository repository){
        this.restaurantRepository = repository;
    }

    @Override
    @Transactional
    public void createRestaurant(Restaurant restaurant){
        String method = "saveRestaurant";
        logger.info(method, "Inside Service class");
        restaurantRepository.save(restaurant);
    }

    @Override
    @Transactional
    public List<Restaurant> listAllRestaurants(){
        String method = "listAllRestaurants";
        logger.info(method, "Inside Service class");
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Restaurant> listRestaurantsById(Integer restaurantId){
        String method = "listRestaurantsByLocation";
        logger.info(method, "Inside Service class");
        return restaurantRepository.findById(restaurantId);
    }

    @Override
    @Transactional
    public void deleteRestaurantById(Integer restaurantId) {
        restaurantRepository.deleteById(restaurantId);
    }
}