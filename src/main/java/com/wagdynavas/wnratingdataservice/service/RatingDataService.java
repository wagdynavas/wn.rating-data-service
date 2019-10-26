package com.wagdynavas.wnratingdataservice.service;

import com.wagdynavas.wnratingdataservice.model.RatingData;
import com.wagdynavas.wnratingdataservice.repository.RatingDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingDataService {

    @Autowired
    private RatingDataRepository ratingDataRepository;

    public Optional<RatingData> getRatingDataById(Long id) {
        return ratingDataRepository.findById(id);
    }

    public Optional<RatingData> getRatingDataByMovieId(String movieId) {
        return ratingDataRepository.findByMovieId(movieId);
    }

    public List<RatingData> getRatingDataByUserId(String userId) {
        return  ratingDataRepository.findAllByUserId(userId);
    }
}
