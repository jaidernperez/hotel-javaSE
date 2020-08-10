package co.edu.usta.hotel.controllers;

import co.edu.usta.hotel.repositories.FloorDB;
import co.edu.usta.hotel.entities.Floor;

import java.util.List;

public class FloorController {

    private final FloorDB floorDB;

    public FloorController() {
        floorDB = new FloorDB();
    }

    public List<Floor> showFloors(){
        return floorDB.show();
    }

    public Floor getFloorByName(String name){
        return floorDB.getByName(name);
    }
}
