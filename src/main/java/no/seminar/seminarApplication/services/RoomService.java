package no.seminar.seminarApplication.services;

import no.seminar.seminarApplication.entities.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class RoomService {

    private ArrayList<Room> rooms = new ArrayList<>(Arrays.asList(
            new Room("L421"),
            new Room("R165")
    ));

    public RoomService() {
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
}
