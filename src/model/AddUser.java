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
public class AddUser {
    Statement stmt;
   
    public void User(String firstName, String lastName, String mobNO, String nic, String email, String userType, String password){
        try{
            stmt = DBConnection.getStatementConnection();
            String adminId = null;
            stmt.executeUpdate("INSERT INTO userlogin (firstName, lastName, mobNo, nic, email, typeOfUser, password, adminId) VALUES ('"+firstName+"','"+lastName+"','"+mobNO+"','"+nic+"','"+email+"','"+userType+"', '"+password+"', '"+adminId+"')");
            
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Successfully Added!!!");
        }
        catch (Exception es){
            es.printStackTrace();
        }
    }
}
