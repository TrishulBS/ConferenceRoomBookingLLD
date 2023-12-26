package org.trishul;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    String floorName;
    List<ConferenceRoom> conferenceRooms;

    public Floor(String name){
        this.floorName = name;
        conferenceRooms = new ArrayList<>();
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public List<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addConferenceRoom(ConferenceRoom cf) {
        this.conferenceRooms.add(cf);
        System.out.println("Conference room added successfully " +cf.getName());
    }

    public void deleteConferenceRoom(ConferenceRoom cf){
        this.conferenceRooms.remove(cf);
        System.out.println("Conference room deleted successfully " +cf.getName());
    }
}
