package com.wagdynavas.wnratingdataservice.repository;

import com.wagdynavas.wnratingdataservice.model.RatingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingDataRepository extends JpaRepository<RatingData, Long> {

    Optional<RatingData> findByMovieId(String movieId);

    @Query("select rd from RatingData rd where rd.userId = :userId")
    List<RatingData> findAllByUserId(@Param("userId") String userId);
}
