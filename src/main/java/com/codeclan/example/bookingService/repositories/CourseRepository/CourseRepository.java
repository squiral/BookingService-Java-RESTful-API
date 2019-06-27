package com.codeclan.example.bookingService.repositories.CourseRepository;

import com.codeclan.example.bookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getCoursesForRating(int rating);
}
