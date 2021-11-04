package com.bookingflights.entities.flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Flight {
   private int id;
    private long date;
  private int  freePlaces;
  private PlaceDestination placeDestination;
    public Flight( ) {

    }

    public Flight(int id, String date, int freePlaces, PlaceDestination placeDestination) {
        this.id = id;
        this.date = parseDate(date);
        this.freePlaces = freePlaces;
        this.placeDestination = placeDestination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public PlaceDestination getPlaceDestination() {
        return placeDestination;
    }

    public void setPlaceDestination(PlaceDestination placeDestination) {
        this.placeDestination = placeDestination;
    }
    public String formatDate(long date) {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String parsingDate = ft.format(date);
        return parsingDate;

    }
    public long parseDate(String date) {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date parsingDate;
        try {
            parsingDate = ft.parse(date);
            return parsingDate.getTime();
        } catch (ParseException e) {
            System.out.println("Unsmoothed with " + ft);
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Flight{ place destination='" + placeDestination+ "', dispatch date =" + formatDate(date) + "free places=" + freePlaces +  "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id && date == flight.date && freePlaces == flight.freePlaces && placeDestination == flight.placeDestination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, freePlaces, placeDestination);
    }
}
