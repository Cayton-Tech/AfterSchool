
import java.io.*;
import java.util.Scanner;
public class testExtraItem
   {
   
    public static void main (String [] args) throws Exception
      {
         Scanner input = new Scanner(System.in);
         // OR BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
         char ch = ' ';
         System.out.println("\f");
         while (ch != 'Q')
         {
            System.out.println("           MENU");
            System.out.println(" ");
            System.out.println("       A - List Items ");
            System.out.println(" ");
            System.out.println("       Q - QUIT");
            System.out.println(" ");
            System.out.print("       Your choice? :");
            
            ch = input.nextLine().toUpperCase().charAt(0);
            // OR ch = input.readLine().toUpperCase().charAt(0);
            
            switch (ch)
            {
               case 'A':
                  {
                     
                      
                    }
                     break;
                  
               case 'Q':
 
                 {
  
                     System.exit(0);
 
                    } // case
  
                    
            }//switch
 
        }  // while 
                
      
        
             
    }
 
                
   }

