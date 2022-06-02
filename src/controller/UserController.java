/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.AdminHome;
import view.AdminId;



/**
 *
 * @author Pavan lenovoPC
 */
public class UserController {
    public static void User(String firstName, String lastName, String mobNO, String nic, String email,String userType, String password){
        
        new model.AddUser().User(firstName, lastName, mobNO, nic, email, userType, password); 
    }
    
    public static void Admin (String adminId, String uName){
        new model.DBUpdate().Admin(adminId, uName);
        
        AdminId.getFrames()[0].dispose();
        new AdminHome().setVisible(true);
    }
    public static void UserDetailsUpdate(String firstName, String lastName, String mobNO, String nic, String email, String realUname){
        new model.DBUpdate().UserDetailsUpdate(firstName, lastName, mobNO, nic, email, realUname);
    }
    
    public static void AdminDetailsUpdate(String firstName, String lastName, String adminNo, String mobNO, String nic, String email, String realAdmin){
        new model.DBUpdate().AdminDetailsUpdate(firstName, lastName, adminNo, mobNO, nic, email, realAdmin);
    }
}
