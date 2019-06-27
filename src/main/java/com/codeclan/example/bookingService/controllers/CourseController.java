package com.codeclan.example.bookingService.controllers;


import com.codeclan.example.bookingService.models.Course;
import com.codeclan.example.bookingService.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {


    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/date/{date}")
    public List<Course> getCoursesForRating(@PathVariable int rating) {
        return courseRepository.getCoursesForRating(rating);
    }


}
