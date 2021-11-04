package com.bookingflights.dao;

import com.bookingflights.entities.booking.Booking;

import java.util.ArrayList;
import java.util.List;

public class CollectionBookingDao implements BookingDao {
  private final List<Booking> bookingList = new ArrayList<>();

  @Override
  public List<Booking> getAllBookings() {
    return this.bookingList;
  }

  @Override
  public Booking getBookingId(int id) {
    if (id >= 0 && id < bookingList.size()) {
      return this.bookingList.get(id);
    } else {
      return null;
    }
  }

  @Override
  public Booking cancelBooking(int id) {
    if (id >= 0 && id < bookingList.size()) {
      return this.bookingList.remove(id);
    } else {
      return null;
    }
  }

  @Override
  public Booking saveBooking(Booking booking) {
    int index = this.bookingList.indexOf(booking);
    if (this.bookingList.contains(booking)) {
      this.bookingList.set(index, booking);
    } else {
      this.bookingList.add(booking);
    }
    return booking;
  }
}

