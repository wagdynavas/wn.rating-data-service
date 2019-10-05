package com.wagdynavas.wnratingdataservice.resource;

import com.wagdynavas.wnratingdataservice.model.RatingData;
import com.wagdynavas.wnratingdataservice.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingDataResource {

    @GetMapping("/{movieId}")
    public RatingData getRatingData(@PathVariable("movieId") String movieId) {
        return new RatingData(movieId, 6);
    }


    @GetMapping("/user/{userId}")
    public UserRating getUsersRatingData(@PathVariable("userId") String userId) {
        List<RatingData> ratingData =  Arrays.asList(
                new RatingData("123", 6),
                new RatingData("654", 7)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingData);

        return userRating;
    }
}
