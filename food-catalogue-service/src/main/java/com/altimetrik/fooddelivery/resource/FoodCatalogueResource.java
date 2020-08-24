package com.altimetrik.fooddelivery.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.altimetrik.fooddelivery.model.Rating;
import com.altimetrik.fooddelivery.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.altimetrik.fooddelivery.model.FoodItem;


@RestController
@RequestMapping("/foodCatalogue")
public class FoodCatalogueResource {

	@PostMapping
	public void addFoodItem(@RequestBody FoodItem foodItem) {

	}

	@GetMapping("/{foodName}")
	public List<Restaurant> listRestaurantsByFood(@PathVariable("foodName") String foodName){
		RestTemplate restTemplate = new RestTemplate();
		List<Restaurant> restaurantListByFood = (List<Restaurant>) restTemplate.getForObject("http://localhost:8082/restaurant/" + foodName, Restaurant.class);
		return restaurantListByFood;
	}
}
