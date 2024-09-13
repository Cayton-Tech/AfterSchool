import java.io.*;
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

   BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
   char ch = ' ';
   System.out.println("\f");
   while (ch != 'Q')
     {
       System.out.println("              Menu");
       System.out.println(" ");
       System.out.println("       A - Convert");
       System.out.println("       B - Display Duplicates");
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
                      case 'Q':
                    {
                       System.exit(0);
                    } // case
                    
                 }//switch
 
                }  // while 
                
        } // main
 
 
}  // class
    
            
