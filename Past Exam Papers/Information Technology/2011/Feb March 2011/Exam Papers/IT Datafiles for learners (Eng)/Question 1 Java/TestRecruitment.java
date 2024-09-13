   import java.io.*;
   import java.sql.*;
   import javax.swing.*;
   import java.util.Scanner;

    public class TestRecruitment
   {
       public static void main (String[] args) throws SQLException,IOException
      {
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
      
         Recruitment DB = new Recruitment();
         System.out.println();
      
         char choice = ' '; 
         do
         {         
            System.out.println("      MENU");
            System.out.println();
            System.out.println("    Option A");
            System.out.println("    Option B");
            System.out.println("    Option C");
            System.out.println("    Option D");
            System.out.println("    Option E");
            System.out.println("    Option F");
            System.out.println("    Option G");
            System.out.println();
            System.out.println("    Q - QUIT");
            System.out.println(" ");
            System.out.print("    Your Choice? ");
            choice = inKb.readLine().toUpperCase().charAt(0);
            System.out.println(" ");
            String sql = "";
            switch(choice)
            {
               case 'A':
                  {
                     sql = ""; // <--- SQL Code for Option A goes here 
                  					
                     DB.A(sql); 
                     break;
                  }
               case 'B':
                  {
                     sql = "";// <--- SQL Code for Option B goes here 
                  					 
                     DB.B(sql); 
                     break;
                  }
               case 'C':
                  {
                     sql = ""; // <--- SQL Code for Option C goes here 
                  					
                     DB.C(sql);  
                     break;
                  }  
               
               
               case 'D':
                  {
                     sql = ""; // <--- SQL Code for Option D goes here 
                  					
                     DB.D(sql);                      
                     break;
                  }  
               
               case 'E':
                  {	
                     Scanner kb = new Scanner (System.in);
                     System.out.println();
                                      
                     sql = ""; // <--- SQL Code for Option E goes here 
                  					
                     DB.E(sql);                   	
                     break;  
                  }
               case 'F':
                  {
                     sql = ""; // <--- SQL Code for Option F goes here 
                  					
                     DB.F(sql); 
                  	
                     break;
                  } 
               
               case 'G':
                  {
                     Scanner kb = new Scanner (System.in); 
                    
                  
                                       
                     sql = "";// <--- SQL Code for Option F goes here 
                  					
                     DB.G(sql); 
                     break;
                  }   
            
            }        
         }while (choice != 'Q');  
      
         DB.disconnect();
         System.out.println("Done");  
      }
   }