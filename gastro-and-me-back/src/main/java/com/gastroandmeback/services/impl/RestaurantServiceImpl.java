package com.gastroandmeback.services.impl;

import com.gastroandmeback.dto.RestaurantDTO;
import com.gastroandmeback.entities.RestaurantEntity;
import com.gastroandmeback.repositories.RestaurantRepository;
import com.gastroandmeback.services.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    private ModelMapper restaurantMapper;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, ModelMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

    @Override
    public RestaurantDTO addRestaurant(RestaurantDTO restaurantDTO) {
        RestaurantEntity restaurantEntity = restaurantMapper.map(restaurantDTO,RestaurantEntity.class);
        RestaurantEntity restaurantSaved = restaurantRepository.save(restaurantEntity);
        return restaurantMapper.map(restaurantSaved,RestaurantDTO.class);
    }

    @Override
    public RestaurantEntity editRestaurant(RestaurantEntity restaurant) {
        return null;
    }

    @Override
    public List<RestaurantEntity> getRestaurants() {
        return restaurantRepository.findAll()
                .stream().map(el -> restaurantMapper.map(el, RestaurantEntity.class))
                .collect(Collectors.toList());
    }

    @Override
    public RestaurantEntity getRestaurant(Long id) {
        return restaurantRepository.findById(id).get();
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

}

