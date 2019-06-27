package com.codeclan.example.bookingService.repositories.BookingRepository;

import com.codeclan.example.bookingService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
