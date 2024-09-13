public class ExtraItemXXXX

 {
 
   private String guestNum;
   private String itemType;
   private double cost;
 
  
 
   public ExtraItemXXXX(String GNum, String IType, double Cost)
   {
     guestNum= GNum;
     itemType = IType;
     cost = Cost;
     
   }
 
   public String getGuestNum()
   {
      return guestNum;
   } 

   public double calculateProfit()
   {
     return cost * 25/100.0 ;
   }
   
   public double calculatePrice()
   {
     return cost + calculateProfit() ;
   }

   public String toString()
   {
      String result = itemType + "\t\t R" + cost + "\t\t R" + Math.round(calculateProfit()*100) / 100.0 + "\t\t R" + Math.round(calculatePrice()*100) / 100.0 ;
      return result;
   }

}