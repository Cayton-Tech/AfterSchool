
   import java.sql.*;
   import java.io.*;
   import javax.swing.JOptionPane;
   import java.util.Scanner;
  
    public class NewsPaper
   {
      Connection conn;
               
   
       public NewsPaper ()
      {
      //load the driver
         try
         {
            Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println ("Driver successfully loaded");
         }
             catch (ClassNotFoundException c)
            {
               System.out.println ("Unable to load database driver");
            }
      
      
      //connect to the database
         try
         {
         
            //conn = DriverManager.getConnection ("jdbc:odbc:litter.mdb");
         	
            System.out.print("Type in the exact location of your database (FOR EXAMPLE - C:/TEST/Newspapers.mdb)");	
            BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
         
           String filename = inKb.readLine();
          //  String filename = "C:/NewsPaperDB.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
         
            System.out.println ("Connection to NewsPaper database successfully established");
         
         }
             catch (Exception e)
            {
               System.out.println ("Unable to connect to the database");
            }
      } //end connect
    
      public void displayAllClientsQuery ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sql = "SELECT * FROM ClientsTb ORDER BY ClientName" ;
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-10s%-27s%-20s%-15s","ClientID","ClientName","TelNum","Suburb");  
         System.out.println();  
         System.out.println();
         while (rs.next ())
         {
            String id = rs.getString ("ClientID");
            String sName = rs.getString ("ClientName");
            String sTel = rs.getString ("TelNum");
            String sSuburb = rs.getString ("Suburb");
                    
            System.out.printf("%-10s%-27s%-20s%-15s",id,sName,sTel,sSuburb);
            System.out.println();         
         } 
         System.out.println(" ");  
         stmt.close ();
      } //select All 
   
 
   public void displayAllAdvertsQuery ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sql = "SELECT  AdvertID, DatePlaced, WeeksRunning, NumWords, Paid,Category, ClientName " +
                          "FROM AdvertsTb, ClientsTb " +
                          "WHERE AdvertsTB.ClientID = ClientsTB.ClientID";
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%5s%15s%15s%15s%5s%14s%18s","AdvertID","Date Placed","Weeks Running","Num of words", "Paid", "Category","Client Name" );  
         System.out.println();  
         System.out.println();
         while (rs.next ())
         {
            String id = rs.getString ("AdvertID");
            String sDate = rs.getString ("DatePlaced");
            sDate = sDate.substring(0,10);
            String weeks = rs.getString("WeeksRunning");
            String numberW = rs.getString ("NumWords");
            String sPaid = rs.getString ("Paid");
            if (sPaid.equals("1"))
               sPaid = "True";
            else sPaid = "False";               
            String sCat = rs.getString ("Category");
            String sName = rs.getString ("ClientName");
                     
            System.out.printf("%-12s%-17s%-15s%-10s%-10s%-15s%-15s",id,sDate,weeks,numberW,sPaid,sCat,sName);
            System.out.println();         
         } 
         System.out.println(" ");  
         stmt.close ();
      } //select All
   
 
      public void selectCatMonthQuery ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String numMonth = JOptionPane.showInputDialog("Enter the number of the month ");
      
         String cat = JOptionPane.showInputDialog("Enter the category ");
         
         String sql = "SELECT  AdvertID, DatePlaced, WeeksRunning FROM AdvertsTb WHERE Category = '" + cat + "' AND MONTH(DatePlaced) = '" + numMonth + "'   "; 
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%5s%15s%15s","AdvertID","Date Placed","Weeks Running");  
         System.out.println(); 
         System.out.println(); 
         while (rs.next ())
         {
            String id = rs.getString ("AdvertID");
            String sDate = rs.getString ("DatePlaced");
            sDate = sDate.substring(0,10);
            String weeks = rs.getString ("WeeksRunning");
           
            System.out.printf("%5s%17s%10s",id,sDate,weeks);
            System.out.println();
                    
         } 
         System.out.println(" ");  
         stmt.close ();
      }// Select Gauteng 
   
     
 
      public void selectShortLongAdverts ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sql = "SELECT AdvertID, NumWords AS [Number of Words], ClientName AS [Client Name] "+
                         "FROM AdvertsTb, ClientsTb "+
                         "WHERE AdvertsTB.ClientID = ClientsTB.ClientID AND (NumWords > 30 OR NumWords < 15)" ; 
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-20s%-20s%-15s","AdvertID","Number of Words","Client Name");  
         System.out.println(); 
         System.out.println(); 
         while (rs.next ())
         {
           
            String id = rs.getString ("AdvertID");
            String numberW = rs.getString ("Number of Words");
            String name = rs.getString ("Client Name");
                      
            System.out.printf("%-20s%-20s%-15s",id,numberW,name);
            System.out.println();       
         } 
         System.out.println(" ");  
         stmt.close ();
      } // Select short and long adverts
 
     public void updateAdverts() throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
      
         String sAdvert = JOptionPane.showInputDialog("Enter the ID of the advertisement ");
      
         String number = JOptionPane.showInputDialog("Enter the number of words to be added ");
      
         String sql = "UPDATE AdvertsTb SET numWords = numWords + " +  number +  " WHERE AdvertID = '" + sAdvert + "'";
                        
         int numRows = stmt.executeUpdate (sql);
         
         sql = "SELECT AdvertID, numWords AS Words FROM AdvertsTb"; 
         
       
         ResultSet rs = stmt.executeQuery (sql);
         
        System.out.printf("%-15s%-20s","AdvertID","Number of Words");  
        System.out.println(); 
        System.out.println(); 
        while (rs.next ())
         {
            String id = rs.getString ("AdvertID");
            String numberW = rs.getString ("Words");
                                  
            System.out.printf("%-15s%-20s",id,numberW);
            System.out.println();       
         }
         System.out.println();
        
         stmt.close(); 
      }// update
      
   
    public void selectNotPaidAdverts()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sLetters = JOptionPane.showInputDialog("Enter a letter of the alphabet ");
      
         String sql = "SELECT AdvertID, Category, ClientName AS [Name of Client], Paid AS [Has Paid] FROM ClientsTb, AdvertsTb WHERE ClientsTb.ClientId =  AdvertsTb.ClientId AND AdvertsTb.Category like '" + sLetters + "%'  AND AdvertsTb.Paid = 0";
                      
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-28s\n","Advertisements not paid for"); 
         System.out.printf("%-10s%-15s%-20s%-20s","AdvertID", "Category", "Name of Client", "Has Paid");  
         System.out.println();  
         System.out.println();
         while (rs.next ())
         {
           
             String id = rs.getString ("AdvertID");
             String sCat = rs.getString ("Category");     
             String sName = rs.getString ("Name of Client");
             String sPaid = rs.getString ("Has Paid");
             if (sPaid.equals("1"))
               sPaid = "True";
             else sPaid = "False";               
                            
            System.out.printf("%-10s%-15s%-20s%-20s",id,sCat,sName,sPaid);
            System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      } // Not paid
   
 
    
      public void calcAdvertCost()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
           
         String sql = "SELECT  AdvertID, DatePlaced, NumWords, WeeksRunning, NumWords * WeeksRunning * 0.5 AS [Cost] FROM AdvertsTb WHERE DatePlaced > #16/11/2008#" ;
                    
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%5s%15s%15s%15s%8s","AdvertID","Date Placed","No. of Words","Weeks Running", "Cost");  
         System.out.println();  
         System.out.println();
         while (rs.next ())
         {
           
            String id = rs.getString ("AdvertID");
            String date = rs.getString ("DatePlaced");
            date = date.substring(0,10);
            String words = rs.getString ("NumWords");
            String weeks = rs.getString ("WeeksRunning");
            double cost = Double.parseDouble(rs.getString("Cost"));
            
          
            System.out.printf("%5s%17s%10s%15s%10s%6.2f",id,date,words,weeks,"R",cost);
            System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      } // calCost per advert
     
      public void countCellPhones()throws SQLException
      {
          System.out.println("\f");
          System.out.println();
          
          Statement stmt = conn.createStatement (); 
      
          String sql = "SELECT Count(*)AS Total FROM ClientsTb WHERE [TelNum] Like '0%'" ;
                      
          ResultSet rs = stmt.executeQuery(sql);   
          System.out.println();  
          System.out.println();
          while (rs.next ())
         {
          String num = rs.getString ("Total");
        
          System.out.println("Number of clients with cellphone numbers: " + num);     
        } 
         System.out.println();  
         System.out.println();
         stmt.close ();
      } // delete
   
  
  
       public void disconnect () throws SQLException
      {
      
         conn.close ();
      }
   
   }
    
    