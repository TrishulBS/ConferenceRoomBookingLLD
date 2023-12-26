package org.trishul;

import java.time.LocalDate;
import java.util.Date;

public class Booking {
    private User owner;
    private ConferenceRoom roomBooked;
    private int startTime;
    private int endTime;

    public Booking(User owner, ConferenceRoom roomBooked, int startTime, int endTime){
        this.owner = owner;
        this.roomBooked = roomBooked;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public ConferenceRoom getRoomBooked() {
        return roomBooked;
    }

    public void setRoomBooked(ConferenceRoom roomBooked) {
        this.roomBooked = roomBooked;
    }


    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "owner=" + owner +
                ", roomBooked=" + roomBooked +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public void CancelBooking(){
        this.roomBooked.cancelBooking(this);
    }


}
