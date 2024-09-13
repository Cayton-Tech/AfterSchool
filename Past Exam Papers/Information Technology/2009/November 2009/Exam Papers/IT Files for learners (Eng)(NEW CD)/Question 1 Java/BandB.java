  
   import java.sql.*;
   import java.io.*;
   import javax.swing.JOptionPane;
   import java.util.Scanner;
   
    public class BandB
   {
      Connection conn;
               
   
      public BandB ()
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
                     
            String filename = "BandB.mdb";
          
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
         
            System.out.println ("Connection to BandB database successfully established");
         
         }
             catch (Exception e)
            {
               System.out.println ("Unable to connect to the database");
            }
      } //end connect
    
    
      public void list (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-10s%-8s%-12s%-12s%-15s%-8s%-12s","ClientNo", "Title", "Surname","FName", "IDNumber", "SA", "Nationality");        
         System.out.println();
         System.out.println("=======================================================================================");   
         
            while (rs.next ())
            {
            String clientNo = rs.getString ("ClientNo");
            String title = rs.getString ("Title");
            String surname = rs.getString ("Surname");
            String name = rs.getString ("FName");
            String id = rs.getString ("IDNumber");
            String sa = rs.getString ("SA");
            String SA = "";
            if (sa.equals("1"))
              SA = "True";
            else
              SA = "False";
            String nationality = rs.getString ("Nationality");
            
            System.out.printf("%-10s%-8s%-12s%-12s%-15s%-8s%-12s",clientNo, title,surname,name,id,SA,nationality);
           System.out.println();   
       
         } 
         System.out.println(" ");  
         stmt.close ();
      } 
   //============================================================================================================
       public void mrFerreira (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
        
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("Total Due");  
         System.out.println();
         System.out.println("===================");  
         while (rs.next ())
         {
            
           String total = rs.getString ("TotalDue");
           System.out.printf("R%-10s", (total ) );
           System.out.println();
                    
         } 
         System.out.println(" ");  
         stmt.close ();
      } //select
   
      
      public void English(String sql) throws SQLException
      {
        Statement stmt = conn.createStatement (); 
         
		stmt.executeUpdate(sql);
         
        System.out.println (" Deleted ");
 
        stmt.close(); 
      }

    
      public void Cost (String sql)throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
               
                                                                             
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-25s%-17s%-10s","Date","Category","Cost");  
         System.out.println();
         System.out.println("================================================");  
        
         while (rs.next ())
         {
            String date = rs.getString ("Date");
            String sDate = date.substring(0,10);
            String category = rs.getString ("Category");
            String cost = rs.getString ("Cost");
                
           
            System.out.printf("%-25s%-17sR%-10s",sDate,category, cost);
            System.out.println();
                    
         } 
         System.out.println(" ");  
         stmt.close ();
      }
      
   
    public void discount (String sql) throws SQLException           
    {
  
        Statement stmt = conn.createStatement ();

         int numRows = stmt.executeUpdate (sql);
          
         sql = "SELECT *  FROM tblOrders";
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-10s%-10s%-20s%-20s%-10s","OrderNo", "ClientNo", "Date","Category", "Selling Price");        
         System.out.println();
         System.out.println("=======================================================================================");   
         
            while (rs.next ())
            {
            String OrderNo = rs.getString ("OrderNo");
            String ClientNo = rs.getString ("ClientNo");
            String date = rs.getString ("Date");
            String sDate = date.substring(0,10);
            String category = rs.getString ("Category");
            double sellingPrice = Double.parseDouble(rs.getString ("SellingPrice"));
                       
            System.out.printf("%-10s%-10s%-20s%-20sR%-10s",OrderNo, ClientNo,sDate,category,sellingPrice);
            System.out.println();
        }
            System.out.println();   
       

        System.out.println (" Records updated");

        stmt.close ();
    }
   
      public void faltemeyer (String sql)throws SQLException
      {
         System.out.println("\f");
         System.out.println();
         
         Statement stmt = conn.createStatement (); 
         
         stmt.executeUpdate (sql);
         
         System.out.println("Record Inserted"); 
         
         System.out.println(" ");  
         stmt.close ();
      } 
  
   
   public void disconnect () throws SQLException
      {
      
         conn.close ();
      }
   
 
 
 
}

