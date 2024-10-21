package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class Connections {
    private final static String URL="jdbc:mysql://localhost:3306/foodorder";
    private final static String USERNAME="root";
    private final static String PASSWORD="Lokesh@96";

    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successfull");
            Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return con;
        } catch (Exception e) {
            System.out.println("Class not Found / Connection not established");
        }
        return null;
    }
}
