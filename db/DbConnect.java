/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author prath
 */
public class DbConnect {

    public static Connection c;
    public static Statement st;

    static {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb?useSSL=false&allowPublicKeyRetrieval=true", 
                    "root", "1234567890");
            st = c.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
