package co.edu.usta.hotel.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    protected Connection connection;

    public ConnectionDB() {
        connectToDB();
    }

    private void connectToDB() {
        try {
            tryToConnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void tryToConnect() throws SQLException {
        if (connection == null) {
            String URL = "jdbc:" + ParametersDB.DRIVER + "://" + ParametersDB.HOST + ":" + ParametersDB.PORT + "/" +
                    ParametersDB.DB_NAME;
            URL+= "?useSSL=false";

            connection = DriverManager.getConnection(URL, ParametersDB.USER_NAME, ParametersDB.PASSWORD);
            System.out.println("Connected with data base successfully");
        }
    }
}
