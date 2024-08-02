package com.example.user_review.course;

import java.util.List;

import com.example.user_review.review.Review;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String title;
	
	@OneToMany(mappedBy = "course" , cascade = CascadeType.ALL)
	private List<Review> reviews;

	public Course(Long courseId, String title, List<Review> reviews) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.reviews = reviews;
	}

	public Course() {
		super();
	}

	
	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Course [id=" + courseId + ", title=" + title + ", reviews=" + reviews + "]";
	}
	
	
 	

	
	

}
