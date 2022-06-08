package com.ug14.rumahsakit;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    private final String url = "jdbc:sql://localhost/rumahsakit";
    private final String user = "root";
    private final String password = "";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }



}


