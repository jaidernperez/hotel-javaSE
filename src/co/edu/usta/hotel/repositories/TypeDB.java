package co.edu.usta.hotel.repositories;

import co.edu.usta.hotel.config.ConnectionDB;
import co.edu.usta.hotel.entities.Type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeDB extends ConnectionDB {

    private PreparedStatement preparedStatement;

    public TypeDB() {
    }

    public List<Type> show() {
        try {
            return tryToShow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Type getByName(String name){
        try {
            return tryToGetByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Type tryToGetByName(String name) throws SQLException {
        String sql = "select ID_TIPO from TIPO_HABITACION where NOMBRE = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();
        return getObjectByResultSet(resultSet);
    }

    private List<Type> tryToShow() throws SQLException {
        String sql = "select ID_TIPO, NOMBRE from TIPO_HABITACION;";

        preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToList(resultSet);
    }

    private List<Type> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Type> rows = new ArrayList<>();

        while (resultSet.next()) {
            Type type = new Type();

            type.setId(resultSet.getInt("ID_TIPO"));
            type.setName(resultSet.getString("NOMBRE"));
            rows.add(type);
        }
        return rows;
    }

    private Type getObjectByResultSet(ResultSet resultSet) throws SQLException {
        Type type = new Type();

        resultSet.next();
        type.setId(resultSet.getInt("ID_TIPO"));

        return type;
    }
}


