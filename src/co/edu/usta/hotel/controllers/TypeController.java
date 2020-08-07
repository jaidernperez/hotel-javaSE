package co.edu.usta.hotel.controllers;

import co.edu.usta.hotel.repositories.TypeDB;
import co.edu.usta.hotel.entities.Type;

import java.util.List;

public class TypeController {

    private final TypeDB typeDB;

    public TypeController() {
        typeDB = new TypeDB();
    }

    public List<Type> showTypes(){
        return typeDB.show();
    }

    public Type getTypeByName(String name){
        return typeDB.getByName(name);
    }
}
