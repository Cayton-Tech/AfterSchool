import java.io.*;
    public class testAdverts
   {
   
       public static void main (String [] args) throws Exception
      {
       
          
         BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         char ch = ' ';
         System.out.println("\f");
         while (ch != 'Q')
         {
            System.out.println("              Menu");
            System.out.println(" ");
            System.out.println("       A - ");
            System.out.println("       B - ");
            System.out.println("       C - ");
            System.out.println(" ");
            System.out.println("       Q - QUIT");
            System.out.println(" ");
            System.out.print("       Your choice? :");
            ch = inKb.readLine().toUpperCase().charAt(0);
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
               case 'C':
                  {
                    
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