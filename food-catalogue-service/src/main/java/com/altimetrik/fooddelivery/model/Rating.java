package com.altimetrik.fooddelivery.model;

import java.util.Date;

public class Rating {

	private String restaurantId;
	private Integer rating;
	
	public Rating(String restaurantId, Integer rating) {
		super();
		this.restaurantId = restaurantId;
		this.rating = rating;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
