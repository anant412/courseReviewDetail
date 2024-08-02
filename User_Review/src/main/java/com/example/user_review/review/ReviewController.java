package com.example.user_review.review;

import java.util.List;
import java.util.OptionalDouble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;;
@RestController
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	@GetMapping("/getAllReview")
	public List<Review> getAllReview() {
		return reviewService.getAllReview();
	}
	@GetMapping("/getReviewById/{reviewId}")
	public Review getReviewById(@PathVariable Long reviewId) {
		return reviewService.getReviewById(reviewId);
	}
	@PostMapping("/saveReview")
	public Review saveReview(@RequestBody Review review) {
		return reviewService.saveReview(review);
	}
	
//	@GetMapping("/rating")
//	public List<Review> getTotalRatingForCourse(Long reviewId) {
//		return reviewService.getTotalRatingForCourse(reviewId);
//	}

}
