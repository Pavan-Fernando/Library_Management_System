/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pavan lenovoPC
 */
public class ReturnBook {
    
    public static void returnBook(String bookName, String username,String feedback){
        Date date = new Date();
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/Y");
        String currentDate = dateFor.format(date);
        
        new model.ReturnBook().ReturningBook(bookName, username, feedback, currentDate);
   }
}
