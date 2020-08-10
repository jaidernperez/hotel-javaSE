package co.edu.usta.hotel.entities;

public class Room {

    private int id;
    private Floor floor;
    private Type type;
    private State state;
    private String name;
    private float price;

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(Floor floor, Type type, State state, String name, float price) {
        this.floor = floor;
        this.type = type;
        this.state = state;
        this.name = name;
        this.price = price;
    }

    public Room(int id, Floor floor, Type type, State state, String name, float price) {
        this.id = id;
        this.floor = floor;
        this.type = type;
        this.state = state;
        this.name = name;
        this.price = price;
    }

    public Room(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", floor=" + floor.getName() +
                ", type=" + type.getName() +
                ", state=" + state.getName() +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
