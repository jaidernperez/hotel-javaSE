package co.edu.usta.hotel.repositories;

import co.edu.usta.hotel.config.ConnectionDB;
import co.edu.usta.hotel.entities.State;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StateDB extends ConnectionDB {

    private PreparedStatement preparedStatement;

    public StateDB() {
    }

    public List<State> show() {
        try {
            return tryToShow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public State getByName(String name){
        try {
            return tryToGetByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private State tryToGetByName(String name) throws SQLException {
        String sql = "select ID_ESTADO from ESTADO_HABITACION where NOMBRE = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();
        return getObjectByResultSet(resultSet);
    }

    private List<State> tryToShow() throws SQLException {
        String sql = "select ID_ESTADO, NOMBRE from ESTADO_HABITACION;";

        preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToList(resultSet);
    }

    private List<State> resultSetToList(ResultSet resultSet) throws SQLException {
        List<State> rows = new ArrayList<>();

        while (resultSet.next()) {
            State state = new State();

            state.setId(resultSet.getInt("ID_ESTADO"));
            state.setName(resultSet.getString("NOMBRE"));
            rows.add(state);
        }
        return rows;
    }

    private State getObjectByResultSet(ResultSet resultSet) throws SQLException {
        State state = new State();

        resultSet.next();
        state.setId(resultSet.getInt("ID_ESTADO"));

        return state;
    }
}


