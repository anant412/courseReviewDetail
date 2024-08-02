package com.example.user_review.review;

import com.example.user_review.course.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	private Integer rating;
	private String comment;
	
	@ManyToOne
	@JoinColumn(name= "course_id")
	private Course course;

	public Review(Long reviewId, Integer rating, String comment, Course course) {
		super(); 
		this.reviewId = reviewId;
		this.rating = rating;
		this.comment = comment;
		this.course = course;
	}

	public Review() {
		super();
	}

	public Long getId() {
		return reviewId;
	}

	public void setId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Review [id=" + reviewId + ", rating=" + rating + ", comment=" + comment + ", course=" + course + "]";
	}
	
	

}
