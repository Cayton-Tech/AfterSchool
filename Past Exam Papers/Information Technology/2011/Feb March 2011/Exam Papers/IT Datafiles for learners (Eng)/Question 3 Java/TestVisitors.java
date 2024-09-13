 

   import java.util.Scanner;   
   import java.io.*;
   import javax.swing.*;

    public class TestVisitors 
   {
      static String[] arrLearners = new String[20];
     
       public static void main(String[] args) throws Exception
      {
         arrLearners[0] = "Susan Thompson,Maths:77";
         arrLearners[1] = "Eric Ntumba,IT:89";
         arrLearners[2] = "Sean Franklin,Accounting:70";
         arrLearners[3] = "Mohammed Naidoo,Maths:68";
         arrLearners[4] = "Rowan Huntley,IT:77";
         arrLearners[5] = "Elizabeth Xaba,Economics:77";
         arrLearners[6] = "Sue Daniels,IT:69";
         arrLearners[7] = "Zane Shameez,Maths:90";
         arrLearners[8] = "Mpho Anderson,Science:81";
         arrLearners[9] = "Bryan Smith,IT:75";
         arrLearners[10]=  "Christopher Khumalo,Accounting:78";
         arrLearners[11] = "Camilla Johnson,Science:88";
         arrLearners[12] = "Taryn Peterson,Science:70";
         arrLearners[13] = "Jack Nelson,Maths:68";
         arrLearners[14] = "Joe Zimmerman,Science:76";
         arrLearners[15] = "Gregory Thompson,IT:87";
         arrLearners[16] = "Dwane Franklin,IT:89";
         arrLearners[17] = "Sean Franklin,Accounting:70";
         arrLearners[18] = "Mohammed Naidoo,Maths:68";
         arrLearners[19] = "Cindy Mokoena,IT:70";
      
       
         Scanner input = new Scanner(System.in);
         
       
         char ch = ' ';
         while (ch != 'Q')
         {
            
            System.out.println();
            System.out.println("           MENU");
            System.out.println(" ");
            System.out.println("       A - Option A");
            System.out.println("       B - Option B"); 
            System.out.println(" ");
            System.out.println("       Q - QUIT");
            System.out.println(" ");
            System.out.print("       Your Choice? :");
            
             
            ch = input.nextLine().toUpperCase().charAt(0);
         		
            switch (ch)
            {
               case 'A':
                  {                   
                     break;
                  }
                
               case 'B':
                  {
                     break; 
                  }                
                        
               case 'Q':
                  {
                     System.exit(0);
                  } // case
                    
            } // switch
                
         } // while          
      }
   
   
   
   }
