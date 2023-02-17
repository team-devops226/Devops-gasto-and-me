package com.gastroandmeback.services;

import com.gastroandmeback.entities.RatingEntity;

import java.util.List;

public interface RatingService {
    RatingEntity addRating(RatingEntity rating);

    RatingEntity editRating(RatingEntity rating);

    List<RatingEntity> getRatings();

    RatingEntity getRating(Long id);

    void deleteRating(Long id);
}
