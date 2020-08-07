package co.edu.usta.hotel.controllers;

import co.edu.usta.hotel.repositories.ReservationDB;
import co.edu.usta.hotel.entities.Client;
import co.edu.usta.hotel.entities.Reservation;
import co.edu.usta.hotel.entities.Room;

import java.sql.Date;
import java.util.List;

public class ReservationController {

    private final ReservationDB reservationDB;

    public ReservationController() {
        reservationDB = new ReservationDB();
    }

    public boolean addReservation(int idClient, int idRoom, Date startDate, Date finalDate, boolean state) {
        Client client = new Client(idClient);
        Room room = new Room(idRoom);

        Reservation reservation = new Reservation(client, room, startDate, finalDate, state);
        return reservationDB.add(reservation);
    }

    public boolean updateReservation(int id, int idClient, int idRoom, Date startDate, Date finalDate, boolean state) {
        Client client = new Client(idClient);
        Room room = new Room(idRoom);

        Reservation reservation = new Reservation(id, client, room, startDate, finalDate, state);
        return reservationDB.update(reservation);
    }

    public Reservation getOneReservation(int id){
        return reservationDB.getOne(id);
    }

    public boolean deleteReservation(int id) {
        Reservation reservation = new Reservation(id);
        return reservationDB.delete(reservation);
    }

    public List<Reservation> showReservation(){
        return reservationDB.show();
    }
}
