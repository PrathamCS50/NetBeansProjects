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
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ **user_database** ?useSSL=false&allowPublicKeyRetrieval=true", 
                    "**user_root**", "**user_password**");
            st = c.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
