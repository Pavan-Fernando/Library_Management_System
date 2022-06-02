/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Pavan lenovoPC
 */
public class DBSearch {
    Statement stmt;
    ResultSet result = null;
    Connection conn;
    String query;
    
    public ResultSet searchLogin(String username){
        
        try{
            stmt = DBConnection.getStatementConnection();
            String uname = username;
            
            result = stmt.executeQuery("SELECT * FROM userlogin WHERE firstName = '" + uname + "'");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet searchBook(String bkName){
        try{
            conn = DBConnection.getConnection();
           query = "SELECT * FROM bookdetails WHERE bookName = '" + bkName + "'";
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet borrowBook(String bkName){
        try{
            conn = DBConnection.getConnection();
            query = "SELECT * FROM borrowbooksdetails WHERE bookName = '" + bkName + "'";
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet handedOverBook(String bkName){
        try{
            conn = DBConnection.getConnection();
            query = "SELECT * FROM handedoverbooksdetails WHERE bookName = '" + bkName + "'";
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public ResultSet BookList (){
        try {
            conn = DBConnection.getConnection();
            query =  "SELECT * FROM bookdetails";
            
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    public ResultSet BorrowedBookList (){
        try {
            conn = DBConnection.getConnection();
            query =  "SELECT * FROM borrowbooksdetails";
            
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    public ResultSet HandedOverBookList (){
        try {
            conn = DBConnection.getConnection();
            query =  "SELECT * FROM handedoverbooksdetails";
            
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    public ResultSet UserDetails(){
        try {
            conn = DBConnection.getConnection();
            query =  "SELECT * FROM userlogin";
            
            PreparedStatement prpd = conn.prepareStatement(query);
            result = prpd.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
   
}
