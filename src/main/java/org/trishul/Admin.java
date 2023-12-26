package org.trishul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
    List<User> users;
    List<Building> buildings;

    List<Booking> bookings;

    public Admin(){
        users = new ArrayList<>();
        buildings = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addBuilding(Building building){
        buildings.add(building);
        System.out.println("Added Building Successfully "+building.getBuildingName());
    }

    public void deleteBuilding(Building building){
        buildings.remove(building);
        System.out.println("Deleted Building Successfully "+building.getBuildingName());
    }

    public void addBooking(Booking bk){
        bookings.add(bk);
    }

    public void removeBooking(Booking bk){
        bookings.remove(bk);
    }

    public void listBookings(){
        for(Booking book: bookings){
            System.out.println(book);
        }
    }

    public void getAvailableRooms(){
        Map<ConferenceRoom, List<Integer>> availableRooms = new HashMap<>();
        for(Building building: buildings) {
            for (Floor floor : building.floors) {
                for (ConferenceRoom room : floor.getConferenceRooms()) {
                    if (room.availableSlots.size() > 0) {
                        System.out.println("Conference Room: "+room.getName() + " has following free slots");
                        System.out.println(room.availableSlots);
                    }
                }
            }
        }
    }
}
