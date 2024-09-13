

import java.util.Random;
import java.util.Scanner;
public class testCharityXXXX
{
public static void main(String [] args)
{
   String [] arrCharity = {"A", "C", "R", "S", "W"};
   String [][] arr = new String [5][5];
   
// initialise array
for (int r = 0; r<5;r++)
{
  for (int c = 0; c<5; c++)
  {
      arr[r][c] = "";
  }    
}

//CharityXXXX  charity = new CharityXXXX();
CharityXXXX [] arrCharities = new CharityXXXX[5];

Random randomNumbers = new Random();

for (int r = 0; r<4;r++)
{
  for (int c = 0; c<4; c++)
  {
       int value = randomNumbers.nextInt(5);
       int percentage = randomNumbers.nextInt(10)+6;
       String letter = arrCharity[value];         
 
       arr[r][c] = letter + percentage;
      
    }
}
// display 
System.out.println("\f");
System.out.println("Grid with random values");
 
for (int r = 0; r<4;r++)
{
  for (int c = 0; c<4; c++)
  {
      System.out.print(arr[r][c] + "\t");
  }    
    System.out.println("");
}
System.out.println(" ");
System.out.println("Amounts received per charity");
System.out.println(" ");
System.out.println("      Total       Public   Government   Charity");
   
for (int k = 0; k < 5; k++)
{
  
  arrCharities[k] = new CharityXXXX();
  String letter = arrCharity[k];   
  arrCharities[k].calcAmounts(k,arr);
  String charityName = arrCharities[k].getName();

  double gov = arrCharities[k].getEarnings();
  
  double publicDon = arrCharities[k].getContribution();
  double total = arrCharities[k].getTotal();
  
  System.out.printf("R%10.2f%sR%10.2f%sR%10.2f%-3s%-50s\n",total,"  ",publicDon,"  ",gov,"  ",charityName);
}
 
}

}   
   

  
