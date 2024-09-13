import java.util.Scanner;   
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class TestMeals
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
		char ch = ' ';
		while (ch != 'Q')
		{
		
			System.out.println();
			System.out.println("              Menu");
			System.out.println(" ");
			System.out.println("       A - Daily Report");
			System.out.println("       B - Meals Without Fats"); 
			System.out.println("       C - Best and Worst Meals"); 
			System.out.println(" ");
			System.out.println("       Q - QUIT");
			System.out.println(" ");
			System.out.print("       Your choice? : ");
		
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
		
	} // main
	
} // class