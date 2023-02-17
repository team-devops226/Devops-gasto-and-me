package com.gastroandmeback.controllers;

import com.gastroandmeback.entities.RatingEntity;
import com.gastroandmeback.services.RatingService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin( origins = "*")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/ratings")
    public RatingEntity addRating(@RequestBody @Valid RatingEntity rating) {
        return ratingService.addRating(rating);
    }

    @GetMapping("/ratings")
    public List<RatingEntity> getRatings() {
        return ratingService.getRatings();
    }

    @GetMapping("/ratings/{id}")
    public RatingEntity getRating(@PathVariable Long id) {
        return ratingService.getRating(id);
    }

    @DeleteMapping("/ratings/{id}")
    public void deleteRatings(@PathVariable Long id) {
        ratingService.deleteRating(id);
    }
}
