/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;




/**
 *
 * @author Pavan lenovoPC
 */
public class BookController {
   public static void Book (String bookName, String bookISBN, String authorName, String category, String copies, byte[] photo){
       
       new model.AddNewBook().Book(bookName, bookISBN, authorName, category, copies, photo);
//       JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
   }
   public static void BookDelete(String bkName){
       new model.DBUpdate().BookDetailsDelete(bkName);
   }
   
   public static void BookDetailsUpdate(String bookName, String bookISBN, String authorName, String category, String copies){
       new model.DBUpdate().BookDetailsUpdate(bookName, bookISBN, authorName, category, copies);
       
   }
}
