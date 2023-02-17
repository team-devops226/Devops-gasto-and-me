package com.gastroandmeback.services.impl;

import com.gastroandmeback.entities.RatingEntity;
import com.gastroandmeback.repositories.RatingRepository;
import com.gastroandmeback.services.RatingService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;
    private final ModelMapper ratingMapper;

    public RatingServiceImpl(RatingRepository ratingRepository, ModelMapper ratingMapper) {
        this.ratingRepository = ratingRepository;
        this.ratingMapper = ratingMapper;
    }

    @Override
    public RatingEntity addRating(RatingEntity rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public RatingEntity editRating(RatingEntity rating) {
        return null;
    }

    @Override
    public List<RatingEntity> getRatings() {
        return ratingRepository.findAll()
                .stream().map(el -> ratingMapper.map(el, RatingEntity.class))
                .collect(Collectors.toList());
    }

    @Override
    public RatingEntity getRating(Long id) {
        return ratingRepository.findById(id).get();
    }

    @Override
    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }
}
