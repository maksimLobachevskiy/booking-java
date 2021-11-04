package com.bookingflights.dao;

import com.bookingflights.entities.booking.Booking;

import java.util.List;

public interface BookingDao {
  List<Booking> getAllBookings();

  Booking getBookingId(int id);

  Booking cancelBooking(int id);

  Booking saveBooking(Booking booking);
}
