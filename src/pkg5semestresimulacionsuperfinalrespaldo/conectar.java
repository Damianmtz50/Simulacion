/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5semestresimulacionsuperfinalrespaldo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import javax.swing.JOptionPane;

    
   
    
   
public class conectar {
    Connection conn=null;
    public static Connection conexion(){
    try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KN12MFT\\SQLEXPRESS:1433;databaseName=SIMULACION","sa","sa");
    JOptionPane.showMessageDialog(null,"conexion estabilizada");
return conn;

    }
    catch(Exception e){
        
    System.out.println(e.getMessage());
}
return null;
}

   
}

