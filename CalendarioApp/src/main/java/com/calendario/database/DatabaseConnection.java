package com.calendario.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/calendario_db";
            String user = "root";
            String password = "password";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}