package org.trishul;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<Booking> bookings;

    public User(String name){
        this.name = name;
        bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
}
