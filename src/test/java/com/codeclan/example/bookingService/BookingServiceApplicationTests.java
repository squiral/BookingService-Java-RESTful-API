package com.codeclan.example.bookingService;

import com.codeclan.example.bookingService.models.Booking;
import com.codeclan.example.bookingService.models.Course;
import com.codeclan.example.bookingService.models.Customer;
import com.codeclan.example.bookingService.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingService.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingService.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingServiceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetAllCourses(){
		List<Course> found = courseRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCustomers(){
		List<Customer> found = customerRepository.findAll();
		assertEquals(3, found.size());
	}

	@Test
	public void canGetAllBookings(){
		List<Booking> found = bookingRepository.findAll();
		assertEquals(4, found.size());
	}

	@Test
	public void canFindCoursesByRating() {
		List<Course> found = courseRepository.getCoursesForRating(4);
		assertEquals(1, found.size());
		assertEquals("JavaScript", found.get(0).getName());

	}

	@Test
	public void canFindCustomersByCourse() {
		List<Customer> found = customerRepository.getAllCustomersForCourse(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCoursesForCustomer() {
		List<Course> found = courseRepository.getAllCoursesForCustomer(3L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllBookingsForDate() {
		List<Booking> found = bookingRepository.getAllBookingsOnDate("15-06-2018");
		assertEquals(2, found.size());
	}

}
