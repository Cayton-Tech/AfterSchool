
import java.util.Random;
public class CharityXXXX
{
 
  private String cName;
  private String cLetter;
  private double earnings;
  private double total;
  private int contribution;
  

public void setLetterName(int value)
{
 switch (value)
      {
        case  0:cLetter = "A";
            cName = "Aids Africa";  
              break;
        case  1: cLetter = "C";
            cName = "CHOC";           
            break;
        case  2:   cLetter = "R";
            cName = "Red Cross";   
            break;
             
        case  3 : cLetter = "S";
                cName = "CANSA";
              break;
        case  4 : cLetter = "W";
            cName = "Battered Women & Children";
            break;
              
            }
           
        }
        
public String getName()
{
 return cName;
}
 
public void calcAmounts(int value, String [][] arr)
{
 total = 0; 
 setLetterName(value);
 contribution = 0;
 earnings = 0;
 for (int r = 0; r<4;r++)
 {
  for (int c = 0; c<4; c++)
  {
      String let = arr[r][c].substring(0,1);
      
      int val = arr[r][c].length();
   
      int percentage = Integer.parseInt(arr[r][c].substring(1,val));
       
      if (let.equals(cLetter))
      {
          double gov = Math.round(50000 * percentage/100.0);
          contribution = contribution + 50000 ;
          earnings  = earnings + gov;
        }   
        
    }    
  }   
 total = earnings + contribution; 
}

public double getEarnings()
{
  return earnings;
}

public double getTotal()
{
  return total;
}

public double getContribution()
{
  return contribution;
}
  
}
  
    