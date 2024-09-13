import java.util.Scanner;   
import java.io.*;
import javax.swing.*;

public class TestSMSCompetition 
{
   static String[] entries = new String[20];
   static int counter = 0;
 
  public static void main(String[] args) throws Exception
   {
   		entries[0] = "082 345 4571:Exercise";
   		entries[1] = "082543 2341:Exercise";
   		entries[2] = "082 234 1241:EXERCISE";
   		entries[3] = "0821239876:Eat";
   		entries[4] = "083123 6123:Sleep";
   		entries[5] = "083 452 4353:EXERCISE";
   		entries[6] = "0831009844:Sleep";
   		entries[7] = "083 104 2333:Exercise";
   		entries[8] = "076 239 6966:Sleep";
   		entries[9] = "076986 4533:EAT";
   		entries[10] = "076 365 4272:Exercise";
   		entries[11] = "076563 2642:Exercise";
   		entries[12] = "084 884 1244:EXERCISE";
   		entries[13] = "0841239867:Sleep";
   		entries[14] = "084123 6444:Exercise";
   		entries[15] = "084 1156 434:Exercise";
   		entries[16] = "079 1229 844:Eat";
   		entries[17] = "079 456 2331:Exercise";
   		entries[18] = "079 239 7971:EXERCISE";
   		entries[19] = "079986 6622:EAT";
	  
  		BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
			char ch = ' ';
			while (ch != 'Q')
			{
			
				System.out.println();
				System.out.println("              Menu");
				System.out.println(" ");
				System.out.println("       A - Extract Possible Winners");
				System.out.println("       B - Select and Display Winners"); 
				System.out.println("       C - Save Winners"); 
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
					
				} // switch
				
			} // while   		
   }
  } 
    
  