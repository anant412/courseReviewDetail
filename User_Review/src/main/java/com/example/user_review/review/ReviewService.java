package com.example.user_review.review;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepo;
	
	public List<Review> getAllReview() {
		return reviewRepo.findAll();
	}
	
	public Review getReviewById(Long reviewId) {
		return reviewRepo.findById(reviewId).orElse(null);
	}
	
	public Review saveReview(Review review) {
		return reviewRepo.save(review);
	}
	
	public double getTotalRatingForCourse(Long reviewId) {
		//return reviewRepo.findById(reviewId);
		Optional<Review> reviews = reviewRepo.findById(reviewId);
		return reviews.stream().mapToInt(Review::getRating).average().getAsDouble();
	}

}
