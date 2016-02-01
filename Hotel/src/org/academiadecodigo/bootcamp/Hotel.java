package org.academiadecodigo.bootcamp;

import java.util.Arrays;

/**
 * Created by ferrao on 29/01/16.
 */
public class Hotel {

    private String name;
    private Room[] rooms;

    public Hotel(String name, int numRooms) {
        this.name = name;
        rooms = new Room[numRooms];
    }

    /**
     * @return roomNumber if available or -1 if no rooms are available
     */
    public int checkIn() {

        for (int i = 0; i < rooms.length ; i++) {

            if (rooms[i] == null) {
                rooms[i] = new Room();
            }

            if (rooms[i].isAvailable()) {
                rooms[i].setAvailable(false);
                return i;
            }

        }

        return -1;
    }

    public void checkOut(int roomId) {
        if (rooms[roomId] != null) {
            rooms[roomId].setAvailable(true);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms.length +
                '}';
    }
}
