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
public class BorrowBookController {
    public static void BorrowBook(String bookName, String username, String submitionDate){
        
        Date date = new Date();
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/Y");
        String currentDate = dateFor.format(date);
        new model.BorrowBook().BorrowingBook(bookName, username, submitionDate, currentDate);
   }
}
