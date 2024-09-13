import javax.swing.*;
import java.io.*;
import java.util.*;

public class TestCity
{
	public static String degreeJobs[] = {"Doctor", "Programmer", "Architect", "Teacher", "Lawyer", "Engineer"};
	public static String diplomaJobs[] = {"Secretary", "Mechanic", "Electrician", "Beautician", "Nurse", "Plumber"};
	
	public static String jobCategory(String job)
	{
		String jobType = "Error";
		
		for(int i = 0; i < 6; i++)
		{
			if (degreeJobs[i].equals(job))
			{
		  		jobType = "Degree";
			}
			else if (diplomaJobs[i].equals(job))
			{
				jobType = "Diploma";
			}			
		}
		
		return jobType;	
	}
	

	public static void main(String args[]) throws Exception
	{		
		BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
		char ch = ' ';
		while (ch != 'Q')
		{
		
			System.out.println();
			System.out.println("           MENU");
			System.out.println(" ");
			System.out.println("       A - Option A"); 
			System.out.println("       B - Option B"); 
			System.out.println(" ");
			System.out.println("       Q - QUIT");
			System.out.println(" ");
			System.out.print("       Your Choice? :");
		
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
				
			} // switch
			
		} // while
		
	} // main
	
} // class