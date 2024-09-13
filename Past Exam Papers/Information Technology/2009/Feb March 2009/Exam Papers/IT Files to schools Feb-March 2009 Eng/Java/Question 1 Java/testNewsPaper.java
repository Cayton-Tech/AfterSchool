import java.io.*;
import java.sql.*;

    public class testNewsPaper
   
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
        
         System.out.println("\f");
         System.out.println();
         
         char choice = ' '; 
         do
         {         
            System.out.println("        MENU");
            System.out.println();
            System.out.println("    A - ");
            System.out.println("    B - ");
            System.out.println("    C - ");
            System.out.println("    D - ");
            System.out.println("    E - ");
            System.out.println("    F - ");
            System.out.println("    G - ");
            System.out.println("    H - ");
            System.out.println("    Q - QUIT");
            System.out.println(" ");
            System.out.print("        Your choice_ ");
           
            
            choice = inKb.readLine().toUpperCase().charAt(0);;
            
            
            switch(choice)
            {
               case 'A':
                  {
                   //  DB.A();
                     break;
                  }
               case 'B':
                  {
                   //  DB.B();
                     break;
                  }
               case 'C':
                  {
                   //  DB.C();
                     break;
                  } 
               case 'D':
                  {
                  //   DB.D();
                     break;
                  
                  } 
               
               case 'E':
                  {
                  //   DB.E();
                     break;
                  
                  }     
               case 'F':
                  {
                  //  DB.F();
                    break;
                  
                  } 
               case 'G':
                  {
                 //   DB.G();
                     break;
                  
                  }     
              case 'H':
                  {
                 //  DB.H();
                     break;
                  
                  }     
            
            }
         }
         while (choice != 'Q' );    
      
      //   DB.disconnect();
         System.out.println("Done");     
      }
   }