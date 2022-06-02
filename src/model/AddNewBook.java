/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pavan lenovoPC
 */
public class AddNewBook {
    Statement stmt;
    Connection conn;
    
    public void Book(String bookName, String bookISBN, String authorName, String category, String copies, byte[] photo){
        try{
            conn = DBConnection.getConnection();
            String query = "INSERT INTO bookdetails (bookName, bookISBN, authorName, category, copies, image) VALUES(?, ?, ?, ?, ?, ?)" ;
            PreparedStatement prpd = conn.prepareStatement(query);
            
                prpd.setString(1, bookName);
                prpd.setString(2, bookISBN);
                prpd.setString(3, authorName);
                prpd.setString(4, category);
                prpd.setString(5, copies);
                prpd.setBytes(6, photo);
                
                prpd.execute();
                JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Successfully Added!!!");
           
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
