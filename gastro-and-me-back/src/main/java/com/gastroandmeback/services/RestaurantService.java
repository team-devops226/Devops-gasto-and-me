package com.gastroandmeback.services;

import com.gastroandmeback.dto.RestaurantDTO;
import com.gastroandmeback.entities.RestaurantEntity;

import java.util.List;

public interface RestaurantService {

    RestaurantDTO addRestaurant(RestaurantDTO restaurant);

    RestaurantEntity editRestaurant(RestaurantEntity restaurant);

    List<RestaurantEntity> getRestaurants();

    RestaurantEntity getRestaurant(Long id);

    void deleteRestaurant(Long id);
}
