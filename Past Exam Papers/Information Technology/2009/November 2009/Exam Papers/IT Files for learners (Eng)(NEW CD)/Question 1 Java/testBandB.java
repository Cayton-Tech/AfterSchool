 import java.io.*;
 import java.sql.*;

		public class testBandB	 
		{
			public static void main (String[] args) throws SQLException,IOException
			{
				BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
			
				BandB DB = new BandB();
				System.out.println("\f");
				
				char choice = ' '; 
				do
				{         
					System.out.println("       MENU");
					System.out.println();
	          		System.out.println("    A - List");
            		System.out.println("    B - Mr Ferreira");
            		System.out.println("    C - English");
            		System.out.println("    D - Cost");
            		System.out.println("    E - Discount");
            		System.out.println("    F - Faltemeyer");
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
																		
									DB.list(sql); // This statement passes SQL to display method as parameter
									break;
							}
							case 'B':
							{
									sql = ""; // <--- SQL Code for Option B goes here
									DB.mrFerreira(sql);  // This statement passes SQL to display method as parameter
									break;
							}
							case 'C':
							{
									sql = ""; // <--- SQL Code for Option C goes here
									DB.English(sql);  // This statement passes SQL to display method as parameter
									break;
							}  
							case 'D':
							{
									sql = ""; // <--- SQL Code for Option D goes here
									DB.Cost(sql);  // This statement passes SQL to display method as parameter
									break;
							}	
							case 'E':
							{
							 		sql = ""; // <--- SQL Code for Option E goes here
							 		DB.discount(sql);  // This statement passes SQL to display method as parameter
									break;
							}  
							case 'F':
							{                    	
									sql = ""; // <--- SQL Code for Option F goes here
									DB.faltemeyer(sql);  // This statement passes SQL to display method as parameter
									break;  
							}
						}        
			 		}while (choice != 'Q');  
		
		 		DB.disconnect();
		 		System.out.println("Done");  
			}
	 }