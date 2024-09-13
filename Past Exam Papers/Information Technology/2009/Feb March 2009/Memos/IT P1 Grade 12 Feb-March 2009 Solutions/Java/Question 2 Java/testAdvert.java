import java.io.*;
    public class testAdvert
   {
   
       public static void main (String [] args) throws Exception
      {
        adverts [] arrAdverts = new adverts [100];
        int adCount = 0;
        File inputFile = new File ("Advertisements.txt");
        FileReader in = new FileReader (inputFile);
        BufferedReader inF = new BufferedReader (in);
      
        String line = inF.readLine ();
        while (line != null)
         {              
            String[] part = line.split("#");
            String adText = part[0];
            String cName = part[1];
            arrAdverts[adCount] = new adverts(adText,cName); 
            adCount++;    
            line = inF.readLine ();
         }
         inF.close ();  
         
          
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         char ch = ' ';
         System.out.println("\f");
         while (ch != 'Q')
         {
            System.out.println("              Menu");
            System.out.println(" ");
            System.out.println("       A - List Advert Information");
            System.out.println("       B - Summarised Income Data");
            System.out.println("       C - Look up a client");
            System.out.println(" ");
            System.out.println("       Q - QUIT");
            System.out.println(" ");
            System.out.print("       Your choice? :");
            ch = inKb.readLine().toUpperCase().charAt(0);
            switch (ch)
            {
               case 'A':
                  {
                      System.out.println("\f");
                      System.out.println("Information on Advertisements");
                      System.out.println(" ");
                      for (int ind = 0; ind < adCount; ind++ ) 
                      {
                          System.out.println(arrAdverts[ind].toString() );
            
                      }
                     System.out.println("\n\n\n");
                     break;
                  }
               case 'B':
                  {
                    System.out.println("\f");
                    System.out.println("Summary of income");
                    int halfTotal = 0;
                    int fullTotal = 0;
                    double totFullPrice = 0;
                    double totHalfPrice = 0;
                    for (int ind = 0; ind < adCount; ind ++) 
                    {
                        if (arrAdverts[ind].isLowPolluter()) 
                        {
                            totHalfPrice += arrAdverts[ind].advertCost();
                            halfTotal ++; 
                        }
                        else
                        {
                            totFullPrice += arrAdverts[ind].advertCost();
                            fullTotal ++;
                        }
                    }
                    int total = halfTotal + fullTotal;
                    double totCost = totFullPrice + totHalfPrice;
                    System.out.println (total + " advertisements in total worth R " + totCost);
                    System.out.println (halfTotal + " half-priced advertisements in total worth R " + totHalfPrice);
                    System.out.println (fullTotal + " full-priced advertisements in total worth R " + totFullPrice);
                     System.out.println("\n\n\n");
                    break;
                  } 
               case 'C':
                  {
                     System.out.println("\f");
                     System.out.print("Enter the name of the client to look up: "); 
                     String clientName = inKb.readLine();
                     System.out.println("\f");
                     boolean found = false;
                     
                     System.out.println("Result of the search: ");
                     for (int ind = 0; ind < adCount; ind++ ) 
                     {
                         String cName = arrAdverts[ind].getClientName();
                         if (cName.equalsIgnoreCase(clientName)) 
                         {            
                             found = true;
                             System.out.println(arrAdverts[ind].toString());
                         }
                        }
                        if (!(found)) 
                        {
                            System.out.println(clientName + " was not found. ");
                        }
                        System.out.println("\n\n\n");
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