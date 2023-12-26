package org.trishul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConferenceRoom {

    String name;
    String roomNumber;
    Building building;
    Floor floor;
    List<Booking> bookedSlots;

    List<Integer> availableSlots;

    public ConferenceRoom(String name, String roomNumber, Building building, Floor floor){
        this.name = name;
        this.building = building;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.bookedSlots = new ArrayList<>();
        availableSlots = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public List<Booking> getBookedSlots() {
        return bookedSlots;
    }

    public void setBookedSlots(List<Booking> bookedSlots) {
        this.bookedSlots = bookedSlots;
    }

    public List<Integer> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<Integer> availableSlots) {
        this.availableSlots = availableSlots;
    }

    public Booking bookTheRoom(int start, int end, User user){
        boolean possible = true;
        List<Integer> arr = new ArrayList<>();
        for(int i = start; i<= end; i++){
            arr.add(i);
        }
        for(int i: arr){
            if(availableSlots.contains(i) == false){
                possible = false;
                break;
            }
        }

        if(possible){
            Booking booking = new Booking(user, this, start, end);
            user.addBooking(booking);
            bookedSlots.add(booking);
            List<Integer> updatedAvailableSlots = new ArrayList<>(availableSlots);
            for (Integer i : arr) {
                updatedAvailableSlots.remove(i); // Remove elements from the new list
            }

            availableSlots = updatedAvailableSlots;
            System.out.println("Booking made for the user " + user.getName() + " at "+  this.name + " from " + start + " to " + end);
            return booking;
        }
        else{
            System.out.println("Conference room  is not available for the given date and time");
            return null;
        }
    }

    public void cancelBooking(Booking booking){
        if(bookedSlots.contains(booking)){
            for(int i = booking.getStartTime(); i<=booking.getEndTime(); i++){
                availableSlots.add(i);
            }
            System.out.println("Booking cancelled successfully");
        }
        else{
            System.out.println("Cannot find the booking");
        }
    }
}
