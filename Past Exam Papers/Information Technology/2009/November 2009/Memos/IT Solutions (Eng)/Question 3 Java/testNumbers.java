
import java.util.Scanner;
// OR import java.io.*; for BufferedReader
public class testNumbers
{
  public static void main(String [] args) throws Exception
  {
      int max = 20;

      String [] arrPhoneNos  = new String [max];
    
  arrPhoneNos [0] = "086NewHill";
  arrPhoneNos [1] = "086DialBar";
  arrPhoneNos [2] = "086BayView";
  arrPhoneNos [3] = "086KyaSand";
  arrPhoneNos [4] = "086SowetoN";
  arrPhoneNos [5] = "086CasaSol";
  arrPhoneNos [6] = "086TheHavn";
  arrPhoneNos [7] = "086GetFood";
  arrPhoneNos [8] = "086ThaiPlc";
  arrPhoneNos [9] = "086Cleaner";
  arrPhoneNos [10] = "086CasaRok";
  arrPhoneNos [11] = "086RixTaxi";
  arrPhoneNos [12] = "086AirTime";
  arrPhoneNos [13] = "086DialBed";
  arrPhoneNos [14] = "086DialCar";
  arrPhoneNos [15] = "086DialHlp";
  arrPhoneNos [16] = "086KyaRosa";
  arrPhoneNos [17] = "086BaySand";
  arrPhoneNos [18] = "086Cater4U";
  arrPhoneNos [19] = "0861to1Air";
  int count = 20;
  Scanner input = new Scanner(System.in);
   // OR BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
   char ch = ' ';
   System.out.println("\f");
   while (ch != 'Q')
     {
       System.out.println("           MENU");
       System.out.println(" ");
       System.out.println("       A - Convert");
       System.out.println("       B - Duplicates");
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
                 System.out.println("Original number Converted number");
                 for (int ind = 0; ind < count; ind++)
                 {
                     PhoneNumber number = new PhoneNumber(arrPhoneNos[ind]);
                     System.out.print(arrPhoneNos[ind] + "\t");
                     arrPhoneNos[ind] = number.Convert (arrPhoneNos[ind]);
                     System.out.println(arrPhoneNos[ind]);
                    }  
                    break;
                }
             case 'B':
             {
                    
                    System.out.println("\nDuplicates");
                    int duplicates = findDuplicates(arrPhoneNos);
                                     
                    if (duplicates ==0)
                        System.out.println("No duplicates were found");
                    else
                        System.out.println("The number of duplicates : " + duplicates);    
                                          
                    break;
                    }
                      case 'Q':
                    {
                       System.exit(0);
                    } // case
                    
                 }//switch
 
                }  // while 
                
        } // main
 
 public static int findDuplicates(String [] arrPhoneNos)
 {
     
      int duplicates = 0;
      boolean found;
      int ind2;
      for ( int ind = 0; ind < 20; ind++)
      {                   
            ind2 = ind + 1;
            found = false;
            while (ind2 < 20 && !(found))
            {
              if (arrPhoneNos[ind].equals(arrPhoneNos[ind2]))
                {          
                      found = true; 
                      System.out.println(arrPhoneNos[ind]);
                      duplicates++;
                }
             else
               ind2++;
             } // while
          }  // for 
     return duplicates;    // OR display duplicates with if in this method 
   }                       //make this a void method 
}  // class
    
            
