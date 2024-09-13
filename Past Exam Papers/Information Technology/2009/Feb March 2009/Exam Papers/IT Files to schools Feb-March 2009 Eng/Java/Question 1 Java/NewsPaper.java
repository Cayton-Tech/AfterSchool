
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
         
           // String filename = inKb.readLine();
            String filename = "C:/NewsPaperDB.mdb";
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
    
      public void A ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sql = .....
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
      } 
   
 
   public void B ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sql = ....
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%5s%15s%15s%15s%10s%20s%20s","AdvertID","Date Placed","Weeks Running","Num of words", "Paid", "Category","Client Name" );  
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
                     
            System.out.printf("%-12s%-17s%-15s%-15s%-16s%-16s%-20s",id,sDate,weeks,numberW,sPaid,sCat,sName);
            System.out.println();         
         } 
         System.out.println(" ");  
         stmt.close ();
      } 
   
 
      public void C ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
       
         
         String sql = ....
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
      } 
   
     
 
      public void D ()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sql = ....
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
      }
 
     public void E() throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
      
             
         String sql = ...
                        
         int numRows = stmt.executeUpdate (sql);
         
         sql = ...
         
       
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
      }
      
   
    public void selectNotPaidAdverts()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         String sLetters = JOptionPane.showInputDialog("Enter a letter of the alphabet ");
      
         String sql = .......;
                      
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
      } 
   
   
 
    
      public void G()throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
           
         String sql = 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%5s%15s%15s%15s%8s","AdvertId","Date Placed","No. of Words","Week Running", "Cost");  
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
      }
     
      public void H()throws SQLException
      {
          System.out.println("\f");
          System.out.println();
          
          Statement stmt = conn.createStatement (); 
      
          String sql = ....
                      
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
      }
   
  
  
       public void disconnect () throws SQLException
      {
      
         conn.close ();
      }
   
   }
    
    