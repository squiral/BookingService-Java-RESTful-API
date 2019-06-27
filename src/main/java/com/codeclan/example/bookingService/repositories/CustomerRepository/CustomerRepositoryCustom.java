package com.codeclan.example.bookingService.repositories.CustomerRepository;

import com.codeclan.example.bookingService.models.Course;
import com.codeclan.example.bookingService.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getAllCustomersForCourse(Long id);
}
