/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;

public class connection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "198197Long!";
    private static final String CONN_STRING = 
            "jdbc:mysql://localhost:3306/art_gallery?useSSL=false&useTimezone=true&serverTimezone=UTC";
    public static connection c;
    public static Connection conn;
    
    
    private connection(){
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("connected");
        } catch(SQLException e) {
            System.err.println(e);
        }
    }
    
    public static connection getInstance(){
        if(c == null) {
            c = new connection();
        }
         return c;       

    }
     

}