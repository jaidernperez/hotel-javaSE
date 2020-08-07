package co.edu.usta.hotel.entities;

import java.sql.Date;

public class Reservation {

    private int id;
    private Client client;
    private Room room;
    private Date startDate;
    private Date finalDate;
    private boolean state;

    public Reservation() {
    }

    public Reservation(int id, Client client, Room room, Date startDate, Date finalDate, boolean state) {
        this.id = id;
        this.client = client;
        this.room = room;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.state = state;
    }

    public Reservation(Client client, Room room, Date startDate, Date finalDate, boolean state) {
        this.client = client;
        this.room = room;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.state = state;
    }

    public Reservation(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", client=" + client +
                ", room=" + room +
                ", startDate=" + startDate +
                ", finalDate=" + finalDate +
                ", state=" + state +
                '}';
    }
}



