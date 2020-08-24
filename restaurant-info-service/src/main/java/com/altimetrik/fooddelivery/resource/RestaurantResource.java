package com.altimetrik.fooddelivery.resource;

import com.altimetrik.fooddelivery.configuration.RestaurantConfiguration;
import com.altimetrik.fooddelivery.model.Restaurant;
import com.altimetrik.fooddelivery.service.impl.RestaurantServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurant")
public class RestaurantResource {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantResource.class);

    private RestaurantServiceImpl restaurantService;

    @Autowired
    public void setRestaurantService(RestaurantServiceImpl restaurantService){
        this.restaurantService = restaurantService;
    }

    private RestaurantConfiguration restaurantConfiguration;

    @Autowired
    public void setRestaurantConfiguration(RestaurantConfiguration restaurantConfiguration){
        this.restaurantConfiguration = restaurantConfiguration;
    }


    @PostMapping
    public void addRestaurant(@RequestBody Restaurant restaurant){
        String method = "addRestaurant";
        logger.info(method,"Inside resource class");
        restaurantService.createRestaurant(restaurant);
    }

    @GetMapping("/all")
    public List<Restaurant> listAllRestaurants(){
        String method = "listAllRestaurants";
        logger.info(method,"Inside resource class");
        logger.info(method,"Successfully retrieved all the restaurants.");
        return restaurantService.listAllRestaurants();

    }

    @GetMapping("/{restaurantId}")
    public Optional<Restaurant> listRestaurantsById(@PathVariable("restaurantId") Integer restaurantId){
        String method = "listAllRestaurants";
        logger.info(method,"Inside resource class");
       return restaurantService.listRestaurantsById(restaurantId);
    }

    @GetMapping("/fromProperties")
    public Restaurant getRestaurantFromProperties(){
        String method = "getRestaurantFromProperties";
        logger.info(method,"Inside resource class");
        return new Restaurant(restaurantConfiguration.getId(),restaurantConfiguration.getName(),
                restaurantConfiguration.getLocation(),restaurantConfiguration.getRating(),
                restaurantConfiguration.getReview());
    }
}