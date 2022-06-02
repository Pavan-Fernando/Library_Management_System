/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pavan lenovoPC
 */
public class DBConnection {
    static Connection con;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
      
        try{
            String url = "jdbc:mysql://localhost:3306/oopfinalproject";
            con = DriverManager.getConnection(url,"root","");
            
            stat = con.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return stat;  
    }
     public static Connection getConnection()throws Exception{
     
         String url = "jdbc:mysql://localhost:3306/oopfinalproject";
         con = DriverManager.getConnection(url,"root","");
           
        return con;  
    }
    public static void closeCon()throws SQLException{
        con.close();
    }
}
