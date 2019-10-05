package com.wagdynavas.wnratingdataservice.model;


import java.util.Arrays;
import java.util.List;

public class UserRating {

    private List<RatingData> userRating;

    public UserRating(List<RatingData> userRating) {
        this.userRating = userRating;
    }

    public UserRating() {
    }

    public List<RatingData> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<RatingData> userRating) {
        this.userRating = userRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRating that = (UserRating) o;

        return userRating != null ? userRating.equals(that.userRating) : that.userRating == null;
    }

    @Override
    public int hashCode() {
        return userRating != null ? userRating.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UserRating ["
                + ((userRating != null) ? "ratingData=" + Arrays.toString(userRating.toArray()) : "")
                + "]";
    }
}
