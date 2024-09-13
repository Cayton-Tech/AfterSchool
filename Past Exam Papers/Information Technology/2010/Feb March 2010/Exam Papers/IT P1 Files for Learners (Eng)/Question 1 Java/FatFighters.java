   import java.sql.*;
   import java.io.*;
   import javax.swing.JOptionPane;
   
   public class FatFighters
   {
      Connection conn;
             
      public FatFighters ()
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
         
            //conn = DriverManager.getConnection ("jdbc:odbc:BandB.mdb");
            
            //System.out.print("Type in the exact location of your database (FOR EXAMPLE - C:/TEST/Diseases.mdb)");   
            //BufferedReader inKb = new BufferedReader (new InputStreamReader (System.in));
            //String filename = inKb.readLine();
            
            String filename = "FatFightersDB.mdb";
          
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database += filename.trim () + ";DriverID=22;READONLY=true}"; 
            conn = DriverManager.getConnection (database, "", "");
         
            System.out.println ("Connection to database successfully established");
         
         }
         catch (Exception e)
         {
            System.out.println ("Unable to connect to the database");
         }
         
      } //end connect
    
      public void all (String sql) throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
        
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-6s%-27s%-10s%-10s%-12s%-10s","ID","Name","S_Weight", "G_Weight","EntryDate", "Balance");  
         System.out.println();
         System.out.println("======================================================================");  
         
         while (rs.next ())
         {
            String sId = rs.getString ("PersonID");
            String sName = rs.getString ("Name");
            String sInitial = rs.getString ("S_Weight");
            String sGoal = rs.getString ("G_Weight");
            String sEntryDate = rs.getString("EntryDate");
            sEntryDate = sEntryDate.substring(0,10);
            //String sBal = rs.getString("Balance");
            double dBal = Double.parseDouble(rs.getString("Balance"));
          	dBal = Math.round(dBal * 100) / 100.0;
            System.out.printf("%-6s%-27s%-10s%-10s%-12s %-10s",sId ,sName,sInitial, sGoal,sEntryDate, dBal);
            System.out.println();        
         }
          
         System.out.println(" ");
         rs.close();  
         stmt.close ();
      } 
   
      public void weightDiff (String sql)throws SQLException
      {
         Statement stmt = conn.createStatement (); 
         
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-6s%-27s%-10s%-10s%-10s","ID","Name","S_Weight", "G_Weight", "KgsToLose");  
         System.out.println();
         System.out.println("=============================================================");  
         while (rs.next ())
         {
            String sId = rs.getString ("PersonID");
            String sName = rs.getString ("Name");
            String sInitial = rs.getString ("S_Weight");
            String sGoal = rs.getString ("G_Weight");
            String sKgs = rs.getString ("KgsToLose");

          //int kgs = (int)Double.parseDouble(sKgs);
           
          
            System.out.printf("%-6s%-27s%-10s%-10s%-10s",sId ,sName,sInitial, sGoal, sKgs);
            System.out.println();        
         } 
         System.out.println(" "); 
         rs.close(); 
         stmt.close ();
      } 
   
      public void overdue (String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 

         int rows = stmt.executeUpdate (sql);
         
         System.out.println(rows + " records deleted");
          
         stmt.close ();
      } 
        
      public void lowest(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 
      
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-6s%-14s","ID","MinWeight");  
         System.out.println();
         System.out.printf("================"); 
         System.out.println(); 
         while (rs.next ())
         {           
            String sID = rs.getString ("PersonID");
            double dWeight = Double.parseDouble(rs.getString("MinWeight"));
            int Weight = (int)Math.round(dWeight);
                   
            System.out.printf("%-6s%-14s",sID, Weight);
           	System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      } 
                        	
  	  public void history(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 

         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-6s%-27s%-10s%-8s%-14s","ID","Name", "G_Weight", "Weight","WeighDate"); 
         System.out.println();
         System.out.println("============================================================");  
         while (rs.next ())
         {
           
            String sId = rs.getString ("PersonID");
            String sName = rs.getString ("Name");
            String sGoal = rs.getString ("G_Weight");
            double dWeight = Double.parseDouble(rs.getString("Weight"));
            int Weight = (int)Math.round(dWeight);
           
            String sWeighDate = rs.getString("WeighDate");
            sWeighDate = sWeighDate.substring(0,10);
          
            System.out.printf("%-6s%-27s%-10s%-8s%-14s",sId,sName, sGoal, Weight,sWeighDate);
            System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      }
      public void adjust(String sql)throws SQLException
      {
         System.out.println();
         Statement stmt = conn.createStatement (); 

         int rows = stmt.executeUpdate (sql);
         
         System.out.println(rows + " records updated");         
          
         sql = "SELECT * FROM tblWeighin";
          
         ResultSet rs = stmt.executeQuery (sql);
         System.out.printf("%-10s%-15s%-14s","PersonID","WeighDate", "Weight");  
         System.out.println();
         System.out.printf("==============================="); 
         System.out.println(); 
         while (rs.next ())
         {           
            String sID = rs.getString ("PersonID");
            String sWeighDate = rs.getString("WeighDate");
            sWeighDate = sWeighDate.substring(0,10);
            String sWeight = rs.getString ("Weight");
          
            System.out.printf("%-10s%-15s%-14s",sID, sWeighDate, sWeight);
           	System.out.println();        
         } 
         System.out.println(" ");  
         stmt.close ();
      }

    public void disconnect () throws SQLException
    {
    
        conn.close ();
    }
   
   }
       
  
