
import java.util.Random;
public class testCharity
{
    public static void main(String[] args)				
    {
        String [][] arrGoldRush = new String[6][6]; 		
  

  Charity goldRush = new Charity();
        String [] arrCharities = {"A", "C", "R", "S", "W"};
        String [] arrNames = {"Aids Africa", "CHOC", "Red Cross", "CANSA", 
"Battered Woman & Children"};
               								

        goldRush.initialiseArray(arrGoldRush);			

        goldRush.assignValues(arrGoldRush); 	

        System.out.println("\f ");  
  											 

        // Process and Display array
  System.out.println("Grid with random values ");    
        for (int r = 0; r<6;r++)
        {
           for (int c = 0; c<6; c++)   
          {
            System.out.print(arrGoldRush[r][c] + "\t");
          }    
          System.out.println(" ");
          
        }
System.out.println(" ");
System.out.println("Amounts received per charity");
System.out.println(" ");
System.out.println("Total         Public       Government      Charity");
        
      String letter = "";
      for (int num = 0; num < 5; num++) // for each charity
        {
         letter = arrCharities[num];  	
         String charityName = arrNames[num];
         double total = 0; 
         double publicDon = 0; 		
         double gov = 0; 		
         for (int r = 0; r < 4; r++)
         {						
         for (int c = 0; c < 4; c++)
          {
              String let = arrGoldRush[r][c].substring(0,1);
              int val = arrGoldRush[r][c].length();
              int percentage = Integer.parseInt(arrGoldRush[r][c].substring(1,val)); 
              if (let.equals(letter)) 
              {
               double govContribution = 50000 * percentage/100.0; 
               publicDon = publicDon + 50000 ; 
               gov = gov + govContribution; 
              }   
            }
          }
          total = publicDon + gov; 
          System.out.printf("R%-8.2f\tR%-8.2f\tR%-8.2f\t%-45s\n",total,publicDon,gov,charityName); 
      }
    }
}											 

class Charity
{
 Charity()
  {
    }
   String [][] initialiseArray( String [][] arrCharity )
   {
      for (int r = 0; r < 6; r++)
        for (int c = 0; c < 6; c++)
          arrCharity[r][c] = " ";
        
       return arrCharity; 
        
    }												

  String [][] assignValues(String [][] arrCharity)
    {
       Random rand = new Random();
       for (int r = 0; r < 4; r++)
         {						
         for (int c = 0; c< 4; c++)
          {
              int letNumber = rand.nextInt(5)+1; 
              String letter = "";
              switch (letNumber)
              {
                  case 1: letter = "C";
                            break;
                  case 2: letter = "A";
                            break;
                  case 3: letter = "R";		
                            break;
                  case 4: letter = "S";
                            break;   
                  case 5: letter = "W";
                            break;
               }            
              int percentage = rand.nextInt(10) + 6; 
              arrCharity[r][c] = letter + percentage; 
            }
        }
      
        return arrCharity;
    }
}						
