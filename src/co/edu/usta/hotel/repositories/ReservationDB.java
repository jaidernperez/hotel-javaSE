package co.edu.usta.hotel.repositories;

import co.edu.usta.hotel.config.ConnectionDB;
import co.edu.usta.hotel.entities.Client;
import co.edu.usta.hotel.entities.Reservation;
import co.edu.usta.hotel.entities.Room;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationDB extends ConnectionDB {

    private PreparedStatement preparedStatement;

    public ReservationDB() {
    }

    public boolean add(Reservation reservation) {
        try {
            return tryToAdd(reservation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Reservation reservation) {
        try {
            return tryToUpdate(reservation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Reservation getOne(int id) {
        try {
            return tryToGetOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean delete(Reservation reservation) {
        try {
            return tryToDelete(reservation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Reservation> show() {
        try {
            return tryToShow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean tryToAdd(Reservation reservation) throws SQLException {
        String sql = "insert into RESERVA (ID_HABITACION, ID_CLIENTE, FECHA_INICIO, FECHA_SALIDA, ESTADO) " +
                "values (?, ?, ?, ?, ?);";


        preparedStatement = connection.prepareStatement(sql);
        parametersReservation(reservation);
        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private boolean tryToUpdate(Reservation reservation) throws SQLException {
        String sql = "UPDATE RESERVA " +
                "set ID_CLIENTE    = ?, " +
                "    ID_HABITACION = ?, " +
                "    FECHA_INICIO  = ?, " +
                "    FECHA_SALIDA  = ?, " +
                "    ESTADO= ? " +
                "where ID_RESERVA = ?;";
        preparedStatement = connection.prepareStatement(sql);
        parametersReservation(reservation);
        preparedStatement.setInt(6, reservation.getId());

        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private Reservation tryToGetOne(int id) throws SQLException {
        String sql = "select ID_RESERVA, h.NOMBRE as HABITACION, c.NOMBRES as CLIENTE, FECHA_INICIO, FECHA_SALIDA, ESTADO " +
                "from RESERVA r" +
                "         inner join CLIENTE c on r.ID_CLIENTE = c.ID_CLIENTE " +
                "         inner join HABITACION h on r.ID_HABITACION = h.ID_HABITACION " +
                "where ID_RESERVA = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToObject(resultSet);
    }

    private boolean tryToDelete(Reservation reservation) throws SQLException {
        String sql = "delete from RESERVA where ID_RESERVA = ?;";

        preparedStatement.setInt(1, reservation.getId());
        preparedStatement = connection.prepareStatement(sql);
        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private List<Reservation> tryToShow() throws SQLException {
        String sql = "select ID_RESERVA, h.NOMBRE as HABITACION, c.NOMBRES as CLIENTE, FECHA_INICIO, FECHA_SALIDA, ESTADO " +
                "from RESERVA r " +
                "         inner join CLIENTE c on r.ID_CLIENTE = c.ID_CLIENTE " +
                "         inner join HABITACION h on r.ID_HABITACION = h.ID_HABITACION " +
                "order by ID_RESERVA;";

        preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToList(resultSet);
    }

    private List<Reservation> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Reservation> rows = new ArrayList<>();
        while (resultSet.next()) {
            Reservation reservation = new Reservation();
            Room room = new Room(resultSet.getString("HABITACION"));
            Client client = new Client(resultSet.getString("CLIENTE"));

            reservation.setId(resultSet.getInt("ID_RESERVA"));
            reservation.setRoom(room);
            reservation.setClient(client);
            reservation.setStartDate(resultSet.getDate("FECHA_INICIO"));
            reservation.setFinalDate(resultSet.getDate("FECHA_SALIDA"));
            reservation.setState(resultSet.getBoolean("ESTADO"));
            rows.add(reservation);
        }
        return rows;
    }

    private Reservation resultSetToObject(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            Reservation reservation = new Reservation();
            Client client = new Client(resultSet.getString("CLIENTE"));
            Room room = new Room(resultSet.getString("HABITACION"));

            reservation.setId(resultSet.getInt("ID_RESERVA"));
            reservation.setClient(client);
            reservation.setRoom(room);
            reservation.setStartDate(resultSet.getDate("FECHA_INICIO"));
            reservation.setFinalDate(resultSet.getDate("FECHA_SALIDA"));
            reservation.setState(resultSet.getBoolean("ESTADO"));
            return reservation;
        }
        return null;
    }

    private void parametersReservation(Reservation reservation) throws SQLException {
        preparedStatement.setInt(1, reservation.getRoom().getId());
        preparedStatement.setInt(2, reservation.getClient().getId());
        preparedStatement.setDate(3, reservation.getStartDate());
        preparedStatement.setDate(4, reservation.getFinalDate());
        preparedStatement.setBoolean(5, reservation.isState());
    }
}
