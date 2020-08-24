package com.altimetrik.fooddelivery.repository;

import com.altimetrik.fooddelivery.model.Restaurant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Integer> {

}