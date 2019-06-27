package com.codeclan.example.bookingService.repositories.CourseRepository;

import com.codeclan.example.bookingService.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesForRating(int rating);

    List<Course> getAllCoursesForCustomer(Long id);

}
