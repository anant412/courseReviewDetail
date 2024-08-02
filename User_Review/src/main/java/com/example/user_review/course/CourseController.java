package com.example.user_review.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	CourseService courseServ;
	
	@GetMapping("/getAllCourse")
	public List<Course> getAllCourse() {
		return courseServ.getAllCourse();
	}
	@GetMapping("/getCourseById/{courseId}")
	public Course getCourseById(@PathVariable Long courseId) {
		return courseServ.getCourseById(courseId);
	}
	@PostMapping("/course")
	public Course saveCourse(@RequestBody Course course) {
		return courseServ.saveCourse(course);
	}
	

}
