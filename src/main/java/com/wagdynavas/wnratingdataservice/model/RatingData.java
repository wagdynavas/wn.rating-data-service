package com.wagdynavas.wnratingdataservice.model;

import javax.persistence.*;

@Entity
public class RatingData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ratingId;

    @Column(name = "rate")
    private int rate;

    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "user_id")
    private String userId;



    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingData that = (RatingData) o;

        if (rate != that.rate) return false;
        if (ratingId != null ? !ratingId.equals(that.ratingId) : that.ratingId != null) return false;
        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
        return userId != null ? userId.equals(that.userId) : that.userId == null;
    }

    @Override
    public int hashCode() {
        int result = ratingId != null ? ratingId.hashCode() : 0;
        result = 31 * result + rate;
        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RatingData ["
                + ((ratingId != null) ? "ratingId=" + ratingId + ", " : "")
                + "rate=" + rate + ", "
                + ((movieId != null) ? "movieId=" + movieId + ", " : "")
                + ((userId != null) ? "userId=" + userId : "")
                + "]";
    }
}
