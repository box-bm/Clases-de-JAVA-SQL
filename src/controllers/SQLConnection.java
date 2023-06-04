package controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {

    private Connection connection = null;

    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/seguros");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }
        System.out.println("Opened database successfully");
    }

    public void close() {
        try {
            if (connection != null){
                connection.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
