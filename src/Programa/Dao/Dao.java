/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Everton
 */
public class Dao {
    Connection con = null;

    public Connection getConnection() throws Exception {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/TbHospitalCel?user=Hospital&password= "
                    + "&useTimezone=true&serverTimezone=UTC");

        } catch (SQLException ex) {
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return con;
    }
    public static void main(String[] args) throws Exception {
        new Dao().getConnection();
    }
}
