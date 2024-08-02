package com.example.user_review.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepo;
	
	public List<Course> getAllCourse() {
		return courseRepo.findAll();
	}
	
	public Course getCourseById(Long courseId) {
		return courseRepo.findById(courseId).orElse(null);
	}
	
	public Course saveCourse(Course course) {
		return courseRepo.save(course);
	}

}
