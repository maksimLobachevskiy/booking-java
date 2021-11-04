package com.bookingflights.entities.booking;

import com.bookingflights.entities.flight.Flight;
import com.bookingflights.entities.user.User;

import java.util.Objects;

public class Booking {
  private User user;
  private Flight flight;
  private int seats;

  public Booking() {
  }

  public Booking(User user, Flight flight, int seats) {
    this.user = user;
    this.flight = flight;
    this.seats = seats;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Booking myBooking))
      return false;
    return (user.hashCode() == myBooking.getUser().hashCode());
  }


  @Override
  public int hashCode() {
    return this.user.hashCode();
  }

}
