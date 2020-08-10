package co.edu.usta.hotel.entities;

public class Floor {

    private int id;
    private  String name;

    public Floor() {
    }

    public Floor(int id) {
        this.id = id;
    }

    public Floor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Floor(String name) {
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
