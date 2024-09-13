
import java.io.*;
import java.util.Scanner;
public class testExtraItemXXXX
   {
   
    public static void main (String [] args) throws Exception
      {
        ExtraItemXXXX [] arrItems = new ExtraItemXXXX [100];
        int count = 0;
        File inputFile = new File ("Extras.txt");
        if (inputFile.exists())
        {
          FileReader in = new FileReader (inputFile);
          BufferedReader inF = new BufferedReader (in);
      
          String line = inF.readLine ();
          while (line != null)
          {              
            String[] part = line.split("#");
            String guestNumber = part[0];
            String itemType = part[2];
            double cost = Double.parseDouble(part[3]);
            arrItems[count] = new ExtraItemXXXX(guestNumber, itemType,cost); 
            count++;    
            line = inF.readLine ();
         }
         inF.close ();  
        }
         else
       {
            System.out.println("File does not exist"); 
            System.exit(0); 
        }
        Scanner input = new Scanner(System.in);
        // OR BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         char ch = ' ';
         System.out.println("\f");
         while (ch != 'Q')
         {
            System.out.println("              Menu");
            System.out.println(" ");
            System.out.println("       A - List Items");
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
                      double totalAmount = 0;
                      System.out.println("\f");
                      System.out.print("Enter the number of the guest: "); 
                       String number = input.nextLine();
                      // OR String number = input.readLine();
                      System.out.println("\f");
                      System.out.println("Information on extra items for guest number " + number);
                      System.out.println(" ");
                      System.out.println("Item type        Cost            Profit          Price");
                      for (int k = 0; k < count; k++ ) 
                      {
                          if (arrItems[k].getGuestNum().equals(number))
                          {
                          totalAmount = totalAmount + arrItems[k].calculatePrice();
                          System.out.println(arrItems[k].toString() );
                          }
            
                      }
                     System.out.println("");
                     if (totalAmount == 0)
                       {
                         System.out.println("No extra items found for guest number " + number);
                        }
                      else
                      {
                        System.out.printf("%sR%4.2f\n","The total amount due is ",totalAmount);
                        System.out.println("\n\n\n");
                    }
                     break;
                  }
                        
                 case 'Q':
 
                 {
  
                     System.exit(0);
 
                    } // case
  
                    
            }//switch
 
          }  // while 
          
    }
 
                
   }

