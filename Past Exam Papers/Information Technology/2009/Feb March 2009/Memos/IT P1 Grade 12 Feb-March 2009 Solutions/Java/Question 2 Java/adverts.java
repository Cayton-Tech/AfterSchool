import java.util.*;

public class adverts 
{
    private String advertText;
    private String clientName;
    
    public adverts(String at, String cn) 
    {
        advertText = at;
        clientName = cn;
    }
     public String getClientName()
    {
        return clientName;
    }
    
    public String toString () 
    {
        String tmp = "";
        tmp += "Client: "+ clientName + "\t\t" + "Word Count: " + countWords() + "\t";
       
        
        if (isLowPolluter()) 
        {
            tmp = "Discount";
        }
        else
        {
            tmp += "No Discount";
        }
      
        tmp += "\t R" + advertCost (); 
        return tmp;
    }
    
    public boolean isLowPolluter ()
    {
      if (advertText.indexOf("LowPolluter") == -1) 
      {
          return false;
      }     
      else
      {
          return true;
      }
    }
    
    public int countWords () 
    {
       int noFullWords = 0;
       int noHalfWords = 0;
       String curWord = "";
       Scanner sc = new Scanner(advertText);
       //advertText += " ";
       String[] words = advertText.split(" ");
       for ( int i = 0; i < words.length; i++) 
       {
           if (! words[i].equalsIgnoreCase("LowPolluter")) 
           {
             if (words[i].length() < 5) 
             {
                 noHalfWords++;
             }
             else
             {
                 noFullWords++;
             } /* end of if length < 5 */
             
           } /* end of if LowPolluter */
       } /* end of while loop */
       // now we check & round half the half words and add it to full word count
       
     
       noFullWords += Math.round(noHalfWords / 2.0);
      
       
       return noFullWords;
    }
    public String getAdvert()
    {
        return advertText;
    }  
    
    public double advertCost () 
    {
       if (isLowPolluter ()) 
       {
         return countWords() * 0.25;    
       } 
       else
       {
         return countWords () * 0.5;  
       }
    }
    
   
    
}
