package org.trishul;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to conference room management!");

        Admin admin = new Admin();

        User user1 = new User("Trishul");
        User user2 = new User("Virat");

        admin.addUser(user1);
        admin.addUser(user2);

        Building building1 = new Building("Tower1");
        Building building2 = new Building("Tower2");

        admin.addBuilding(building1);
        admin.addBuilding(building2);

        Floor f11 = new Floor("Floor1 in Tower 1");
        Floor f12 = new Floor("Floor2 in Tower 1");
        Floor f21 = new Floor("Floor1 in Tower 2");

        building1.addFloor(f11);
        building1.addFloor(f12);
        building2.addFloor(f21);

        ConferenceRoom c111 = new ConferenceRoom("CR1 in B1 F1", "F11", building1, f11);
        ConferenceRoom c212 = new ConferenceRoom("CR2 in B1 F2", "F21", building1, f12);

        ConferenceRoom c121 = new ConferenceRoom("CR1 in B2 F1", "F11", building2, f21);
        ConferenceRoom c222 = new ConferenceRoom("CR2 in B2 F1", "F12", building2, f21);

        f11.addConferenceRoom(c111);
        f12.addConferenceRoom(c212);
        f21.addConferenceRoom(c121);
        f21.addConferenceRoom(c222);

        Booking one = c111.bookTheRoom(10, 12, user1);
        admin.addBooking(one);
        Booking two = c111.bookTheRoom(13, 14, user2);
        admin.addBooking(two);
        c111.cancelBooking(two);
        admin.removeBooking(two);

        admin.getAvailableRooms();
        admin.listBookings();


    }
}