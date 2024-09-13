 import java.io.*;
 import java.sql.*;
 import java.util.Scanner;

public class TestFF
{
  public static void main (String[] args) throws SQLException,IOException
  {
     BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
  
     FatFighters DB = new FatFighters();
     System.out.println();
     
     char choice = ' '; 
     do
     {         
        System.out.println("       MENU");
        System.out.println();
        System.out.println("    A - All Members");
        System.out.println("    B - Weight Differences");
        System.out.println("    C - Overdue Accounts");
        System.out.println("    D - Lowest Weight");
        System.out.println("    E - Weigh History");
        System.out.println("    F - Adjust Weights");
        System.out.println();
        System.out.println("    Q - QUIT");
        System.out.println(" ");
        System.out.print("    Your Choice? ");
        choice = inKb.readLine().toUpperCase().charAt(0);
        System.out.println(" ");
        String sql = "";
        switch(choice)
        {
            case 'A':
            {
            	sql = ""; // <--- SQL Code for Option A goes here 
											
                DB.all(sql);// This statement passes SQL as parameter
                break;
            }
            case 'B':
            {
                sql = "";// <--- SQL Code for Option B goes here 
											 
                DB.weightDiff(sql);// This statement passes SQL as parameter
                break;
            }
            case 'C':
            {
                sql = ""; // <--- SQL Code for Option C goes here 
											
                DB.overdue(sql);// This statement passes SQL as parameter
                break;
            }  
        
        	case 'D':
        	{
             	sql = ""; // <--- SQL Code for Option D goes here 
											
             	DB.lowest(sql);// This statement passes SQL as parameter
                break;
            }  
        	case 'E':
        	{	
        	    sql = ""; // <--- SQL Code for Option E goes here 
											
            	DB.history(sql);// This statement passes SQL as parameter
                break;  
        	}
        	case 'F':
        	{
                sql = ""; // <--- SQL Code for Option F goes here 
											
                DB.adjust(sql);// This statement passes SQL as parameter
                break;
            }   
      	}        
  	 }while (choice != 'Q');  
  	
  	 DB.disconnect();
  	 System.out.println("Done");  
  }
}