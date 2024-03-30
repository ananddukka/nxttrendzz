package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.*;

import java.util.ArrayList;

public interface ReviewRepository {
    ArrayList<Review> getReviews();

    Product getReviewById(int reviewId);

    Product addReview(Review review);

    Product updateReview(int reviewId, Review review);

    void deleteReview(int reviewId);

    Product getReviewProduct(int reviewId);

}