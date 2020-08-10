package co.edu.usta.hotel.controllers;

import co.edu.usta.hotel.repositories.StateDB;
import co.edu.usta.hotel.entities.State;

import java.util.List;

public class StateController {

    private final StateDB stateDB;

    public StateController() {
        stateDB = new StateDB();
    }

    public List<State> showStates(){
        return stateDB.show();
    }

    public State getStateByName(String name){
        return stateDB.getByName(name);
    }
}
