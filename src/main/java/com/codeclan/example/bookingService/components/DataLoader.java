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

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Course course1 = new Course("JavaScript", "North Berwick", 4);
        Course course2 = new Course("Java", "Gullane", 3);
        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Sarah", "North Berwick", 25);
        Customer customer2 = new Customer("Kirsty", "North Berwick", 32);
        Customer customer3 = new Customer("Liam", "Gullane", 43);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("07-10-2018", course1, customer1);
        Booking booking2 = new Booking("15-06-2018", course2, customer2);
        Booking booking3 = new Booking("15-06-2018", course1, customer3);
        Booking booking4 = new Booking("09-04-2019", course2, customer3);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);

    }
}
