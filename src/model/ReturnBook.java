/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pavan lenovoPC
 */
public class ReturnBook {
    public void ReturningBook(String bookName, String username,String feedback, String currentDate){
    
        Connection conn;
        
         try{
            conn = DBConnection.getConnection();
            String query = "INSERT INTO handedoverbooksdetails (bookName, username, userFeedback, handedOverDate) VALUES(?, ?, ?, ?)" ;
            PreparedStatement prpd = conn.prepareStatement(query);
 
            prpd.setString(1, bookName);
            prpd.setString(2, username);
            prpd.setString(3, feedback);
            prpd.setString(4, currentDate);
            prpd.execute();
                        
            JOptionPane.showMessageDialog(null, "Book has been Handed Over", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Successfully Returned!!!");
           
        }
        catch (Exception e){
            e.printStackTrace();
        }
    } 
}
