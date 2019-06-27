package com.codeclan.example.bookingService.repositories.BookingRepository;

import com.codeclan.example.bookingService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom  {

}
