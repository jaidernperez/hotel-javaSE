package co.edu.usta.hotel.repositories;

import co.edu.usta.hotel.config.ConnectionDB;
import co.edu.usta.hotel.entities.Floor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FloorDB extends ConnectionDB {

    private PreparedStatement preparedStatement;

    public FloorDB() {
    }

    public List<Floor> show() {
        try {
            return tryToShow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Floor getByName(String name){
        try {
            return tryToGetByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Floor tryToGetByName(String name) throws SQLException {
        String sql = "select ID_PISO from PISO where NOMBRE = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();
        return getObjectByResultSet(resultSet);
    }

    private List<Floor> tryToShow() throws SQLException {
        String sql = "select ID_PISO, NOMBRE from PISO;";

        preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToList(resultSet);
    }

    private List<Floor> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Floor> rows = new ArrayList<>();

        while (resultSet.next()) {
            Floor floor = new Floor();

            floor.setId(resultSet.getInt("ID_PISO"));
            floor.setName(resultSet.getString("NOMBRE"));
            rows.add(floor);
        }
        return rows;
    }

    private Floor getObjectByResultSet(ResultSet resultSet) throws SQLException {
        Floor floor = new Floor();

        resultSet.next();
        floor.setId(resultSet.getInt("ID_PISO"));

        return floor;
    }
}


