package com.codeclan.example.bookingService.components;

import com.codeclan.example.bookingService.models.Booking;
import com.codeclan.example.bookingService.models.Course;
import com.codeclan.example.bookingService.models.Customer;
import com.codeclan.example.bookingService.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingService.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingService.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("JavaScript", "North Berwick", 4);
        Course course2 = new Course("JavaScript", "North Berwick", 4);
        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Sarah", "North Berwick", 25);
        Customer customer2 = new Customer("Sarah", "North Berwick", 25);
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("07-10-2018", course1, customer1);
        Booking booking2 = new Booking("07-10-2018", course2, customer2);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);

    }
}
