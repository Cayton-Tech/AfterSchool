import java.io.*;
import java.sql.*;

    public class testNewsPaper
   
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         NewsPaper DB = new NewsPaper();
         System.out.println("\f");
         System.out.println();
         
         char choice = ' '; 
         do
         {         
            System.out.println("        MENU");
            System.out.println();
            System.out.println("    A - Display all the clients");
            System.out.println("    B - Display all the Advertisements");
            System.out.println("    C - Advertisements per category per month");
            System.out.println("    D - Short and long Advertisements");
            System.out.println("    E - Update Advertisements");
            System.out.println("    F - Advertisements not paid for");
            System.out.println("    G - Calculate costs of Advertisements");
            System.out.println("    H - Count Clients with cellphones");
            System.out.println("    Q - QUIT");
            System.out.println(" ");
            System.out.print("        Your choice_ ");
           
            
            choice = inKb.readLine().toUpperCase().charAt(0);;
            
            
            switch(choice)
            {
               case 'A':
                  {
                     DB.displayAllClientsQuery();
                     break;
                  }
               case 'B':
                  {
                     DB.displayAllAdvertsQuery();
                     break;
                  }
               case 'C':
                  {
                     DB.selectCatMonthQuery();
                     break;
                  } 
               case 'D':
                  {
                     DB.selectShortLongAdverts();
                     break;
                  
                  } 
               
               case 'E':
                  {
                     DB.updateAdverts();
                     break;
                  
                  }     
               case 'F':
                  {
                    DB.selectNotPaidAdverts();
                    break;
                  
                  } 
               case 'G':
                  {
                    DB.calcAdvertCost();
                     break;
                  
                  }     
              case 'H':
                  {
                   DB.countCellPhones();
                     break;
                  
                  }     
            
            }
         }
         while (choice != 'Q' );    
      
         DB.disconnect();
         System.out.println("Done");     
      }
   }