package com.wagdynavas.wnratingdataservice.resource;

import com.wagdynavas.wnratingdataservice.model.RatingData;
import com.wagdynavas.wnratingdataservice.model.UserRating;
import com.wagdynavas.wnratingdataservice.service.RatingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingDataResource {

    @Autowired
    private RatingDataService ratingDataService;

    @GetMapping("/{movieId}")
    public RatingData getRatingData(@PathVariable("movieId") String movieId) {
        return  null;
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity<UserRating> getUsersRatingData(@PathVariable("userId") String userId) {

        List<RatingData> ratingData =  ratingDataService.getRatingDataByUserId(userId);
        if (ratingData.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingData);

        return ResponseEntity.status(HttpStatus.OK).body(userRating);
    }


}
