package com.bookingflights.flight;

public enum PlaceDestination {
    NEW_YORK("New York"),
    LONDON("London"),
    BARCELONA("Barcelona"),
    ADANA("Adana"),
    VILNIUS("Vilnius");

    private final String name;

    PlaceDestination(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }

}
