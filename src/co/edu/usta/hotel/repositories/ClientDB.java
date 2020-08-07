package co.edu.usta.hotel.repositories;

import co.edu.usta.hotel.config.ConnectionDB;
import co.edu.usta.hotel.entities.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDB extends ConnectionDB {

    private PreparedStatement preparedStatement;

    public ClientDB() {
    }

    public boolean add(Client client) {
        try {
            return tryToAdd(client);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Client client) {
        try {
            return tryToUpdate(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Client getOne(String ic) {
        try {
            return tryToGetOne(ic);
        } catch (Exception e) {
            return null;
        }
    }

    public Client getByName(String name){
        try {
            return tryToGetByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean delete(Client client) {
        try {
            return tryToDelete(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Client> show() {
        try {
            return tryToShow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Client tryToGetByName(String name) throws SQLException {
        String sql = "select ID_CLIENTE, NOMBRES, APELLIDOS, CEDULA, CORREO, TELEFONO " +
                "from CLIENTE " +
                "where NOMBRES = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToObject(resultSet);
    }

    private boolean tryToAdd(Client client) throws SQLException {
        String sql = "INSERT INTO CLIENTE (NOMBRES, APELLIDOS, CEDULA, CORREO, TELEFONO) VALUES (?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sql);

        setParameters(client);
        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private boolean tryToUpdate(Client client) throws SQLException {
        String sql = "UPDATE CLIENTE " +
                "SET NOMBRES= ?, " +
                "    APELLIDOS= ?, " +
                "    CEDULA= ?, " +
                "    CORREO= ?, " +
                "    TELEFONO= ? " +
                "WHERE ID_CLIENTE = ?;";
        preparedStatement = connection.prepareStatement(sql);

        setParameters(client);
        preparedStatement.setInt(6, client.getId());

        return preparedStatement.executeUpdate() == Statement.CLOSE_CURRENT_RESULT;
    }

    private Client tryToGetOne(String ic) throws SQLException {
        String sql = "select c.ID_CLIENTE, c.NOMBRES, c.APELLIDOS, c.CEDULA, c.CORREO, c.TELEFONO from CLIENTE c where c.CEDULA=?;";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ic);

        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSetToObject(resultSet);
    }

    private boolean tryToDelete(Client client) throws SQLException {
        String sql = "delete from CLIENTE where ID_CLIENTE = ?;";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, client.getId());

        return preparedStatement.executeUpdate() == Statement.CLOSE_ALL_RESULTS;
    }

    private List<Client> tryToShow() throws SQLException {
        String sql = "select c.ID_CLIENTE, c.NOMBRES, c.APELLIDOS, c.CEDULA, c.CORREO, c.TELEFONO from CLIENTE c;";

        preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSetToList(resultSet);
    }

    private List<Client> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Client> rows = new ArrayList<>();

        while (resultSet.next()) {
            Client client = new Client();

            client.setId(resultSet.getInt("ID_CLIENTE"));
            client.setNames(resultSet.getString("NOMBRES"));
            client.setSurnames(resultSet.getString("APELLIDOS"));
            client.setDni(resultSet.getString("CEDULA"));
            client.setEmail(resultSet.getString("CORREO"));
            client.setPhone(resultSet.getString("TELEFONO"));
            rows.add(client);
        }
        return rows;
    }

    private Client resultSetToObject(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {

            Client client = new Client();

            client.setId(resultSet.getInt("ID_CLIENTE"));
            client.setNames(resultSet.getString("NOMBRES"));
            client.setSurnames(resultSet.getString("APELLIDOS"));
            client.setDni(resultSet.getString("CEDULA"));
            client.setEmail(resultSet.getString("CORREO"));
            client.setPhone(resultSet.getString("TELEFONO"));
            return client;
        }
        return null;
    }

    private void setParameters(Client client) throws SQLException {
        preparedStatement.setString(1, client.getNames());
        preparedStatement.setString(2, client.getSurnames());
        preparedStatement.setString(3, client.getDni());
        preparedStatement.setString(4, client.getEmail());
        preparedStatement.setString(5, client.getPhone());
    }
}


