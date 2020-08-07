package co.edu.usta.hotel.controllers;

import co.edu.usta.hotel.repositories.RoomsDB;
import co.edu.usta.hotel.entities.*;

import java.util.List;

public class RoomController {

    private final RoomsDB roomsDB;

    public RoomController() {
        roomsDB = new RoomsDB();
    }

    public boolean addRoom(Floor floor, Type type , State state, String name, float price) {
        Room room = new Room(floor, type, state, name, price);
        return roomsDB.add(room);
    }

    public boolean updateRoom(int id, Floor floor, Type type , State state, String name, float price) {
        Room room = new Room(id, floor, type, state, name, price);
        return roomsDB.update(room);
    }

    public Room getOneRoom(String name){
        return roomsDB.getOne(name);
    }

    public List<Room> showRooms(){
        return roomsDB.show();
    }

    public boolean deleteRoom(int id){
        Room room = new Room(id);
        return roomsDB.delete(room);
    }

    public Room getByNameRoom(String name){
        return roomsDB.getByName(name);
    }
}
