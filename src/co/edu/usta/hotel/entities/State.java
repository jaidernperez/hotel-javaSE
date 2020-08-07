package co.edu.usta.hotel.entities;

public class State {

    private int id;
    private  String name;

    public State() {
    }

    public State(int id) {
        this.id = id;
    }

    public State(String name) {
        this.name = name;
    }

    public State(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
