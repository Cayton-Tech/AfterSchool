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
									sql = "SELECT * FROM tblClients ORDER BY Surname, FName"; // <--- SQL Code for Option A goes here 
									DB.list(sql);
									break;
							}
							case 'B':
							{
									sql = "SELECT ROUND(Sum (SellingPrice), 2) AS TotalDue FROM tblOrders WHERE ClientNo = 1"; // <--- SQL Code for Option B goes here
									DB.mrFerreira(sql);
									break;
							}
							case 'C':
							{
									sql = "DELETE FROM tblClients WHERE Nationality = 'English' "; // <--- SQL Code for Option C goes here
									DB.English(sql);
									break;
							}  
							case 'D':
							{
									sql = "SELECT Date, Category, SellingPrice, SellingPrice - ((SellingPrice/125)*25) AS Cost FROM tblOrders WHERE Clientno = 1"; // <--- SQL Code for Option D goes here
									DB.Cost(sql);
									break;
							}	
							case 'E':
							{
							 		sql = "UPDATE tblOrders SET SellingPrice = (SellingPrice - 5) WHERE SellingPrice >= 30"; // <--- SQL Code for Option E goes here
							 		DB.discount(sql);
									break;
							}  
							case 'F':
							{                    	
									sql = "INSERT INTO tblClients (Surname, FName, IDNumber, SA,"+
                       "Nationality) VALUES ('Faltemeyer', 'Harald', " +
                       "'7407185683074', false, 'Swedish')"; // <--- SQL Code for Option F goes here
									DB.faltemeyer(sql);
									break;  
							}
						}        
			 		}while (choice != 'Q');  
		
		 		DB.disconnect();
		 		System.out.println("Done");  
			}
	 }