package com.gastroandmeback.controllers;

import com.gastroandmeback.dto.RestaurantDTO;
import com.gastroandmeback.entities.RestaurantEntity;
import com.gastroandmeback.services.RestaurantService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin( origins = "*")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/restaurants")
    public RestaurantDTO addRestaurant(@RequestBody @Valid RestaurantDTO restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/restaurants")
    public List<RestaurantEntity> getRestaurants() {
        return restaurantService.getRestaurants();
    }

    @GetMapping("/restaurants/{id}")
    public RestaurantEntity getRestaurant(@PathVariable Long id) {
        return restaurantService.getRestaurant(id);
    }

    @DeleteMapping("/restaurants/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

}

