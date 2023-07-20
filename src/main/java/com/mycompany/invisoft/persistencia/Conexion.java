package com.mycompany.invisoft.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    public Connection getConnection(){
            try {
                String bdinvisoft = "jdbc:mysql://localhost:3306/bdinvisoft?serverTimezone=UTC";
                con = DriverManager.getConnection(bdinvisoft,"root","");
            } catch (Exception e) {
            }
            return null;
    }
}