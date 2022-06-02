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
public class BorrowBook {
    
    Connection conn;
    
    public void BorrowingBook(String bookName, String username, String submitionDate, String currentDate){
        try{
            conn = DBConnection.getConnection();
            String query = "INSERT INTO borrowbooksdetails (bookName, username, deadline, borrowedDate) VALUES(?, ?, ?, ?)" ;
            PreparedStatement prpd = conn.prepareStatement(query);
 
            prpd.setString(1, bookName);
            prpd.setString(2, username);
            prpd.setString(3, submitionDate);
            prpd.setString(4, currentDate);
            prpd.execute();
                        
            JOptionPane.showMessageDialog(null, "Book has been Borrowed", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Successfully Borrowed!!!");
           
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
