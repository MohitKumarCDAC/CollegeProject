/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collegeinfo;
import java.sql.*;
import javax.swing.*;

public class clgconnection {
    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    static void connect()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohit","mohitkumar");
            stmt=con.createStatement();
            JOptionPane.showMessageDialog(null, "connection success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection error");
        }
    }
    
}
