package br.com.exemploJdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection con;
    
	public static Connection getConnection(String driverName, String DB_URL, String USER, String PASS) {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
    
}
