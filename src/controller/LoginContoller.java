/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBSearch;
import view.AdminHome;
import view.AdminId;
import view.Home;
import view.Login;

/**
 *
 * @author Pavan lenovoPC
 */
public class LoginContoller {
   public static void login (String username, String password){
       try {
           String usName = null;
           String pass = null;
           String userType = null;
           String adId = null;
           
           ResultSet result = new DBSearch().searchLogin(username);
           
           while (result.next()){
               usName = result.getString("firstName");
               pass = result.getString("password");
               userType = result.getString("typeOfUser");
               adId = result.getString("adminId");
           }
           if (usName != null && pass != null){
               if(pass.equals(password)){
                   System.out.println("Login Successfull");
                   
                   Login.getFrames()[0].dispose();
//                   new Home().setVisible(true);
                   if ("User".equals(userType)){
                       new Home().setVisible(true);
                   }
                   else if ("Admin".equals(userType)){
                       
                       if (!"null".equals(adId)){
                           new AdminHome().setVisible(true);
                       }
                       else {
                           new AdminId().setVisible(true);
                       }  
                   }
               }
               else{
                   JOptionPane.showMessageDialog(null, "Please check the credentials","ERROR",JOptionPane.ERROR_MESSAGE);
               }
               DBConnection.closeCon();
           }
       }
       catch (Exception e){
           Logger.getLogger(LoginContoller.class.getName()).log(Level.SEVERE, null, e);
       }
   } 
}
