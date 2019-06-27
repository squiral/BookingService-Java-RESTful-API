package com.codeclan.example.bookingService.repositories.BookingRepository;

import com.codeclan.example.bookingService.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getAllBookingsOnDate(String date);
}
