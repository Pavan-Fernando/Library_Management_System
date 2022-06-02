/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pavan lenovoPC
 */
public class DBUpdate {
    
    Statement stmt;
    
    public void Admin (String adminId, String uName){
        try{
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("UPDATE userlogin SET adminId = '"+adminId+"' WHERE firstName = '"+uName+"'");
            
            System.out.println("Successfully Added!!!");
        }
        catch (Exception es){
            es.printStackTrace();
        }
    }
    
    public void BookDetailsDelete(String bkName){      
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM bookdetails WHERE bookName = '"+bkName+"'");
            
        }
        catch (Exception es){
            es.printStackTrace();
        }
    }
    
    public void BookDetailsUpdate(String bookName, String bookISBN, String authorName, String category, String copies){
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE bookdetails SET bookName = '"+bookName+"', bookISBN = '"+bookISBN+"', authorName = '"+authorName+"', category = '"+category+"', copies = '"+copies+"' WHERE bookName = '"+bookName+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated!!!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void UserDetailsUpdate(String firstName, String lastName, String mobNO, String nic, String email, String realUname){
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE userlogin SET firstName = '"+firstName+"', lastName = '"+lastName+"', mobNo = '"+mobNO+"', nic = '"+nic+"', email = '"+email+"' WHERE firstName= '"+realUname+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated!!!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void AdminDetailsUpdate(String firstName, String lastName, String adminNo, String mobNO, String nic, String email, String realAdmin){
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE userlogin SET firstName = '"+firstName+"', lastName = '"+lastName+"', mobNo = '"+mobNO+"', nic = '"+nic+"', email = '"+email+"' WHERE firstName= '"+realAdmin+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated!!!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
