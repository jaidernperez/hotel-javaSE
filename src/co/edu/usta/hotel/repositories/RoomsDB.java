package co.edu.usta.hotel.repositories;

import co.edu.usta.hotel.config.ConnectionDB;
import co.edu.usta.hotel.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomsDB extends ConnectionDB {

    private static PreparedStatement preparedStatement;

    public RoomsDB() {
    }

    public boolean add(Room room) {
        try {
            return tryToAdd(room);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Room room) {
        try {
            return tryToUpdate(room);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Room getOne(String name) {
        try {
            return tryToGetOne(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Room getByName(String name){
        try {
            return tryToGetByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean delete(Room room) {
        try {
            return tryToDelete(room);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Room> show() {
        try {
            return tryToShow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Room tryToGetByName(String name) throws SQLException {
        String sql = "select h.ID_HABITACION, p.NOMBRE as PISO, th.NOMBRE as TIPO, eh.NOMBRE as ESTADO, h.NOMBRE as NOMBRE, h.PRECIO " +
                "from HABITACION h " +
                "         inner join ESTADO_HABITACION eh on h.ID_ESTADO = eh.ID_ESTADO " +
                "         inner join PISO p on h.ID_PISO = p.ID_PISO " +
                "         inner join TIPO_HABITACION th on h.ID_TIPO = th.ID_TIPO " +
                "where h.NOMBRE = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToObject(resultSet);
    }

    private boolean tryToAdd(Room room) throws SQLException {
        String sql = "INSERT into HABITACION (ID_PISO, ID_TIPO, ID_ESTADO, PRECIO, NOMBRE) values (?, ?, ?, ?, ?);";
        preparedStatement = connection.prepareStatement(sql);

        parametersRoom(room);
        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private boolean tryToUpdate(Room room) throws SQLException {
        String sql = "UPDATE HABITACION set ID_PISO=?, ID_TIPO=?, ID_ESTADO=?, PRECIO=?, NOMBRE=? where ID_HABITACION = ?;";
        preparedStatement = connection.prepareStatement(sql);

        parametersRoom(room);
        preparedStatement.setInt(6, room.getId());

        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private Room tryToGetOne(String name) throws SQLException {
        String sql = "select h.ID_HABITACION, p.NOMBRE as PISO, th.NOMBRE as TIPO, eh.NOMBRE as ESTADO, h.NOMBRE as NOMBRE, h.PRECIO " +
                "from HABITACION h " +
                "         inner join ESTADO_HABITACION eh on h.ID_ESTADO = eh.ID_ESTADO " +
                "         inner join PISO p on h.ID_PISO = p.ID_PISO " +
                "         inner join TIPO_HABITACION th on h.ID_TIPO = th.ID_TIPO " +
                "where h.NOMBRE=?;";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSetToObject(resultSet);
    }

    private boolean tryToDelete(Room room) throws SQLException {
        String sql = "delete from HABITACION where ID_HABITACION = ?;";
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, room.getId());

        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private List<Room> tryToShow() throws SQLException {
        String sql = "select h.ID_HABITACION, p.NOMBRE as PISO, th.NOMBRE as TIPO, eh.NOMBRE as ESTADO, h.NOMBRE as NOMBRE, h.PRECIO " +
                "       from HABITACION h" +
                "         inner join ESTADO_HABITACION eh on h.ID_ESTADO = eh.ID_ESTADO " +
                "         inner join PISO p on h.ID_PISO = p.ID_PISO " +
                "         inner join TIPO_HABITACION th on h.ID_TIPO = th.ID_TIPO " +
                "order by h.ID_PISO;";

        preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToList(resultSet);
    }

    private List<Room> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Room> rows = new ArrayList<>();
        while (resultSet.next()) {
            Room room = new Room();
            Floor floor = new Floor(resultSet.getString("PISO"));
            Type type = new Type(resultSet.getString("TIPO"));
            State state = new State(resultSet.getString("ESTADO"));

            room.setId(resultSet.getInt("ID_HABITACION"));
            room.setFloor(floor);
            room.setType(type);
            room.setState(state);
            room.setName(resultSet.getString("NOMBRE"));
            room.setPrice(resultSet.getFloat("PRECIO"));
            rows.add(room);
        }
        return rows;
    }

    private Room resultSetToObject(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            Room room = new Room();
            Floor floor = new Floor(resultSet.getString("PISO"));
            Type type = new Type(resultSet.getString("TIPO"));
            State state = new State(resultSet.getString("ESTADO"));

            room.setId(resultSet.getInt("ID_HABITACION"));
            room.setName(resultSet.getString("NOMBRE"));
            room.setPrice(resultSet.getInt("PRECIO"));
            room.setFloor(floor);
            room.setType(type);
            room.setState(state);
            return room;
        }
        return null;
    }

    private static void parametersRoom(Room room) throws SQLException {
        preparedStatement.setInt(1, room.getFloor().getId());
        preparedStatement.setInt(2, room.getType().getId());
        preparedStatement.setInt(3, room.getState().getId());
        preparedStatement.setFloat(4, room.getPrice());
        preparedStatement.setString(5, room.getName());
    }
}
